package q04;

public class AnnualFeeCreditCard extends CreditCard {
	
	private double apr = 0.2;
	
	
	public AnnualFeeCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate)
	{
		super(cust,bk, acnt ,lim , initialBal);
		this.apr =rate;
		
	}
	
	public AnnualFeeCreditCard(String cust, String bk, String acnt, int lim, double rate)
	{
		super(cust,bk,acnt,lim,0);
		this.apr=rate;
		
	}
	
	
	@Override
	public boolean charge (double price)
	{
		
		if(this.getBalance() + price > this.getLimit())
		{
			this.balance += 10;
			return false;
			
		}
		else
		{
			this.balance += price;
			return true;
		}
	}
	
	public void processMonth()
	{
		
			double monthlyFactor = Math.pow(1 + this.apr, 1.0/12);
			balance *= monthlyFactor;
			
			
	}
	
	
	

}
