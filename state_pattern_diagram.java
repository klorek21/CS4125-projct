//##########################################################################################################################################
// Java program to demonstrate working of
// State Design Pattern
import Decoratorvb;

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

//##########################################################################################################################################

interface Subscriptions
{
	public void user(SubscriptionState ctx);
}

class Bronze implements Subscriptions
{
	@Override
	public void user(SubscriptionState ctx)
	{
		System.out.println("Bronze Member");
	}

}

class Silver implements Subscriptions
{
	@Override
	public void user(SubscriptionState ctx)
	{
		System.out.println("Silver Memeber");
	}

}

class Gold implements Subscriptions
{
	@Override
	public void user(SubscriptionState ctx)
	{
		System.out.println("Gold Memeber");
	}

}

class SubscriptionState
{
	private Subscriptions userState;

	public SubscriptionState()
	{
		userState = new Bronze();
	}

	public void setState(Subscriptions state)
	{
		userState = state;
	}

	public void user()
	{
		userState.user(this);
	}
}

//##########################################################################################################################################

class BronzeDiscount implements Subscriptions{

    public static void main(String args[])
    {
        SubscriptionState stateContext = new SubscriptionState();
        stateContext.setState(new Bronze());
		stateContext.user();

        double  dis,amount,mealprice,s;

        mealprice= 20;
        dis=10;  // 10 mean 10%

        System.out.println("the original price of the meal is €"+mealprice);
        System.out.println("discount rate= %"+dis);

        s=100-dis;

        amount= (s*mealprice)/100;
        System.out.println("amount after discount= €"+amount);

        
    }

}



class SilverDiscount implements Subscriptions{

    public static void main(String args[])
    {

        SubscriptionState stateContext = new SubscriptionState();
        stateContext.setState(new Silver());
		stateContext.user();

        double  dis,amount,mealprice,s;

        mealprice= 20;
        dis=20;  // 20 mean 20%

        System.out.println("the original price of the meal is €"+mealprice);
        System.out.println("discount rate= %"+dis);

        s=100-dis;

        amount= (s*mealprice)/100;
        System.out.println("amount after discount= €"+amount);
    }

}


class GoldDiscount {

    public static void main(String args[])
    {

        SubscriptionState stateContext = new SubscriptionState();
        stateContext.setState(new Gold());
		stateContext.user();

        double  dis,amount,mealprice,s;

        mealprice= 20;
        dis=30;  // 30 mean 30%

        System.out.println("the original price of the meal is €"+mealprice);
        System.out.println("discount rate= %"+dis);

        s=100-dis;

        amount= (s*mealprice)/100;
        System.out.println("amount after discount= €"+amount);

    }

}

//public interface Discount {
  //  String decorate();
//}

//public class DiscountImpl implements Discount {

  //  @Override
    //public String decorate() {
      //  return "Applying Discount to your meal......";
    //}
//}

//public abstract class discDecorator implements Discount {
  //  private Discount disc;

    // standard constructors
    //@Override
    //public String decorate() {
    //    return disc.decorate();
   // }
//}

//##########################################################################################################################################
class state_pattern_diagram
{
	public static void main(String[] args)
	{
		SubscriptionState stateContext = new SubscriptionState();
		stateContext.user();
		stateContext.user();
		stateContext.setState(new Silver());
		stateContext.user();
		stateContext.user();
		stateContext.setState(new Gold());
		stateContext.user();
		stateContext.user();	
		
		
	}
}