package q04;

import java.text.DecimalFormat;

public class CreditCard {
	
	private String Customer;
	private String bank;
	private String account;
	private int limit;
	protected double balance;
	
	public CreditCard(String cust, String bk, String acnt, int lim, double initialBal)
	{
		this.Customer = cust;
		this.bank = bk;
		this.account = acnt;
		this.limit = lim;
		this.balance = initialBal;
	}
	
	public CreditCard(String cust, String bk, String acnt, int lim)
	{
		this(cust,bk,acnt,lim,0);
	}
	
	
	public String getCustomer()
	{
		return this.Customer;
	}
	
	public String getBank()
	{
		return this.bank;
	}
	
	public String getAccount()
	{
		return this.account;
	}
	
	public int getLimit()
	{
		return this.limit;
	}
	
	public double getBalance()
	{
		return this.balance;
	}

	public boolean charge(double price)
	{
		if(this.getBalance() + price > this.getLimit())
		{
			return false;
		}
		
		else
		{
			this.balance += price;
			return true;
		}
	}
	
	public void makePayment(double ammount)
	{
		this.balance -= ammount;
	}
	
	public static void printSummary(CreditCard card)
	{
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Customer = " + card.Customer + "\n" + "Bank = "+ card.bank + "\n" + "Account = "+ card.account + "\n" + "Balance = "+ df.format(card.balance) + "\n" +"Limit = " +card.limit);
	}
	
	
	
}
