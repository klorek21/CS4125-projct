sub = input("Bronze, Gold or Platinium?: ")
discountYN = input("Do you already subscribe to us? (Y/N): ")

class Subscriptions:

    # instance attribute
    def __init__(self, subscription):
        self.subscription = subscription

# instantiate the Subscriptions class
bronze = Subscriptions(10)
gold = Subscriptions(20)
platinium = Subscriptions(30)

#Discount decorator
def get_Discount(func):
   def inner(subscription_amount):
      print("Applying 10% discount")
      return func(subscription_amount - (subscription_amount * 10) / 100)
   return inner

@get_Discount
def CouponApply(subscription_amount):
    return int(subscription_amount)

if (sub == "Bronze" and discountYN == "N"):
    print("Bronze is going to be", bronze.subscription, "euro")

if (sub == "Gold" and discountYN == "N"):
    print("Gold is going to be", gold.subscription, "euro")

if (sub == "Platinium" and discountYN == "N"):
    print("Platinium is going to be", platinium.subscription, "euro")

if (sub == "Bronze" and discountYN == "Y"):
    print("Bronze is going to be", CouponApply(bronze.subscription), "euro")

if (sub == "Gold" and discountYN == "Y"):
    print("Gold is going to be", CouponApply(gold.subscription), "euro")

if (sub == "Platinium" and discountYN == "Y"):
    print("Platinium is going to be", CouponApply(platinium.subscription), "euro")
