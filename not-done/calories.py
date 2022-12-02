class Food: #Values in grams
    def __init__(self, name, carbs, protein, fat):
        self.name = name
        self.carbs = carbs
        self.protein = protein
        self.fat = fat

    def calories(self):
        return (self.carbs * 4) + (self.protein * 4) + (self.fat * 9)

class Recipe:
    def __init__(self, name, ingredients):
        self.name = name
        self.ingredients = ingredients

    def calories(self):
        total = 0
        for fooditem in self.ingredients:
            total += fooditem.calories()
        return total

    def __str__(self):
        return  self.name

#Foods
Milk = Food('Milk', 12.3, 8.5, 4.7)
CocoaPowder = Food('Cocoa Powder', 3, 1, 0.5)
Rice = Food('Rice', 45, 4.3, 0.4)
Bean = Food('Beans', 40, 15, 0.9)

#Recipes
ChocolateMilk = Recipe('Chocolate Milk ', ([Milk, CocoaPowder]))
BasicMeal = Recipe('Rice and Beans ', ([Rice, Bean]))


print (str(ChocolateMilk.name) + str(ChocolateMilk.calories()))
print (str(BasicMeal.name) + str(BasicMeal.calories()))
