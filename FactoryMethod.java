
// Interface named Meal
interface Meal {

   // Method inside interface
   void createMeal();
}


// Class 1
// Class 1 will be implementing the Meat interface
// Meat.java
class Meat implements Meal {

   // Overriding the method
   @Override
   public void createMeal() {
   
      // Print statement to execute when
      // createMeal() method of this class is called
      // later on in the main() method
      System.out.println("Inside Meat::createMeal() method.");
   }
}


// Class 2
// Abstract class
// Vegetables.java
class Vegetables implements Meal {

   // Overriding the method
   @Override
   public void createMeal() {
   
	  // Display message
      System.out.println("Inside Vegetables::createMeal() method.");
   }
}


// Class 3
// Concrete class extending the abstract class
// Carbs.java
class Carbs implements Meal {

   // Overriding the method
   @Override
   public void createMeal() {
   
	  // Display message
      System.out.println("Inside Carbs::createMeal() method.");
   }
}


// Class 4
// MealFactory.java
class MealFactory {
	
   // Use getMeal method to get object of type meal 
   public Meal getMeal(String mealType){
      if(mealType == null){
         return null;
      }		
      if(mealType.equalsIgnoreCase("CARBS")){
         return new Carbs();
         
      } else if(mealType.equalsIgnoreCase("MEAT")){
         return new Meat();
         
      } else if(mealType.equalsIgnoreCase("VEGETABLES")){
         return new Vegetables();
      }
      
      return null;
   }
}


// Class 5
// FactoryPatternDemo.java
public class FactoryMethod {

   public static void main(String[] args) {
      MealFactory mealFactory = new MealFactory();

      // Get an object of Carbs and call its draw (createMeal) method.
      Meal meal1 = mealFactory.getMeal("CARBS");

	  // Call 1
      // Call draw method of Carbs
      // 1st Meal
      meal1.createMeal();
	  
      // Get an object of Meat and call its draw (createMeal) method.
      Meal meal2 = mealFactory.getMeal("MEAT");
	
	  // Call 2
      // Call draw method of MEAT
      // 2nd Meal
      meal2.createMeal();

      // Get an object of Vegetables and call its draw (createMeal) method.
      Meal meal3 = mealFactory.getMeal("VEGETABLES");

	  // Call 3
      // Call createMeal method of vegetables
      // 3rd Meal
      meal3.createMeal();
   }
}
