package Cantine;

public class RegisterKeeper {
    private CashRegister sandwish;
    private CashRegister warmmeal;
    private CashRegister drink;

    public RegisterKeeper(){
        sandwish= new Sandwiches();
        warmmeal=new WarmMeals();
        drink=new Drinks();
    }
    public void sandwichSale(){
        sandwish.itemNO();
        sandwish.price();
    }
    public void warmMealSale(){
        warmmeal.itemNO();
        warmmeal.price();
    }
    public void drinkSale(){
        drink.itemNO();
        drink.price();
    }
}

