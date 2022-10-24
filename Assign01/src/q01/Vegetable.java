package q01;

public class Vegetable extends Food {
	
	public static final double VEG_PROTEIN_CAL= 0.35;
	public static final double VEG_FAT_CAL = 0.15;
	public static final double VEG_CARBO_CAL = 0.50;
	
	private double protein;
	private double fat;
	private double carbo;
	private String name;
	
	public Vegetable (String name)
	{
		this.name = name;
	}
	
	public Vegetable (String name, double protein, double fat, double carbo)
	{

		this.name = name; this.protein = protein; this.fat = fat; this.carbo = carbo;
		double totalCals = this.protein * this.VEG_PROTEIN_CAL; 
		totalCals += this.fat * this.VEG_FAT_CAL;
		totalCals += this.carbo + this.VEG_CARBO_CAL;
		setCalories(totalCals);
		
	}
	
	public void printName()
	{
		System.out.println(this.name);
	}
	
	
	@Override
	public double percentProtein() {return this.protein / getCalories();};
	@Override
	public double percentFat() {return this.fat / this.getCalories();};
	@Override
	public double percentCarbohydrates() {return this.carbo / this.getCalories();};
	
	
	

}
