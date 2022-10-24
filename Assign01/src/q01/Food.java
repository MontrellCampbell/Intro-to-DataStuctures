package q01;

public abstract class Food {
	
	private double calories;
	
	public double percentProtein() {return percentProtein();};
	public double percentFat() {return percentFat();};
	public double percentCarbohydrates() {return percentCarbohydrates();};
	
	
	protected double getCalories() {return this.calories;};
	protected double setCalories(double cal){this.calories = cal; return this.calories;};
	

}
