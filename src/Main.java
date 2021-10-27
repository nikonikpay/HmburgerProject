import java.util.zip.Deflater;

public class Main {

    public static void main(String[] args) {

        Hamburger newHamburger = new Hamburger(" Manhattan burger"," Double meat ", " On a nice bread", 13.0);

        double price = newHamburger.itemizeHamburger();

        System.out.println(newHamburger.itemizeHamburger());

        newHamburger.addHamburgerAddition1(" kire khar " , 10);

        System.out.println(newHamburger.itemizeHamburger());
        newHamburger.addHamburgerAddition2("Kire Gav ",32);
        System.out.println(newHamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(" No meat ", 10);
        System.out.println(healthyBurger.itemizeHamburger());

        healthyBurger.addHealthyAddition1(" Kire khare Giahi", 15);
        System.out.println(healthyBurger.itemizeHamburger());


        DeluxBurger deluxBurger = new DeluxBurger();
        System.out.println(deluxBurger.itemizeHamburger());

        deluxBurger.addHamburgerAddition1("kire khar" ,13);
        System.out.println(deluxBurger.itemizeHamburger());
    }
}
