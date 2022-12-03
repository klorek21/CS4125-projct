
// Create an interface
// Interface named Meal
public interface Meal {

   // Method inside interface
   void createMeal();
}

// Create concrete classes implementing the same interface

// Class 1 is implementing the Meat interface
// Concrete Class
// Meat.java
public class Meat implements Meal {

   // Overriding the method
   @Override
   public void createMeal() {
   
      // Print statement to execute when
      // createMeal() method of this class is called
      // later on in the main() method
      System.out.println("Inside Meat::createMeal() method.");
   }
}


// Class 2 is implementing the Vegetable interface
// Concrete class
// Vegetables.java
public class Vegetables implements Meal {

   // Overriding the method
   @Override
   public void createMeal() {
   
	  // Display message
      System.out.println("Inside Vegetables::createMeal() method.");
   }
}


// Class 3 is implementing the Carbs interface
// Concrete class
// Carbs.java
public class Carbs implements Meal {

   // Overriding the method
   @Override
   public void createMeal() {
   
	  // Display message
      System.out.println("Inside Carbs::createMeal() method.");
   }
}


// Class 4
// MealFactory.java
// Create a Factory to generate object of concrete class based on given information
public class MealFactory {
	
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
// Use the Factory to get object of concrete class by passing an information such as type
public class FactoryPatternDemo {

   public static void main(String[] args) {
      MealFactory mealFactory = new MealFactory();

      // Get an object of Carbs and call its createMeal method.
      Meal meal1 = mealFactory.getMeal("CARBS");

	  // Call 1
      // Call createMeal method of Carbs
      // 1st Meal
      meal1.createMeal();
	  
      // Get an object of Meat and call its createMeal method.
      Meal meal2 = mealFactory.getMeal("MEAT");
	
	  // Call 2
      // Call createMeal method of MEAT
      // 2nd Meal
      meal2.createMeal();

      // Get an object of Vegetables and call its createMeal method.
      Meal meal3 = mealFactory.getMeal("VEGETABLES");

	  // Call 3
      // Call createMeal method of vegetables
      // 3rd Meal
      meal3.createMeal();
   }
}
