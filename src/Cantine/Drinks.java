package Cantine;

public class Drinks implements CashRegister {

    @Override
    public void itemNO() {
        System.out.println(" DC01142 ");
    }

    @Override
    public void price() {
        System.out.println(" $ 2.00 ");
    }
}
