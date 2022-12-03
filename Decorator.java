interface Discount {
    
}

class DiscountImpl implements Discount {

    @Override
    public String decorate() {
        return "Applying Discount to your meal......";
    }
}

abstract class discDecorator implements Discount {
    private Discount disc;

     //standard constructors
    @Override
    public String decorate() {
        return disc.decorate();
   }
}

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