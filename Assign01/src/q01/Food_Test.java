package q01;

public class Food_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vegetable mySnack1 = new Vegetable("cabbage");
		Vegetable mySnack2 = new Vegetable("cabbage", 0.5, 0.2, 0.6);
		
		System.out.printf("Total Calories: %.2f%n", mySnack2.getCalories());
		System.out.printf("Total Protein: %.2f%n", mySnack2.percentProtein());
		System.out.printf("Total fat: %.2f%n", mySnack2.percentFat());
		System.out.printf("Total carbohydrates: %.2f%n", mySnack2.percentCarbohydrates());

	}

}
