public class DeluxBurger extends Hamburger {

    public DeluxBurger() {
        super("Deluxe Burger ", " With Sausage ", "On white Bread " , 38);
        super.addHamburgerAddition1("Chips", 3);
        super.addHamburgerAddition2(" Cola ", 2.50);
    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(" You can not add addition to deluxe");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(" You can not add addition to deluxe");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(" You can not add addition to deluxe");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(" You can not add addition to deluxe");
    }
}
