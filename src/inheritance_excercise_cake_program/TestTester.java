package inheritance_excercise_cake_program;
/*
1)create a superclass called Cake that has two fields:flavor and price,
and a constructor that accepts the flavour.Getter and setter methods should be created for the fields.
2)create a BirthdayCake class which inherits from Cake and has a field called candles.
It's constructor should set the flavour.Include getter and setter method.
3)Create a WeddingCake class which inherits from Cake and has a field calles tiers.It's constructor
should set the flavour.Include getter and setter method.
4)create a TasteTester class to test out your inheritance by printing the flavor and price of each of these
types of cakes.

https://testautomationu.applitools.com/java-programming-course/
*/

public class TestTester {                   //TasteTester which will test out your inheritance.
    public static void main(String[] args){
        Cake cake = new Cake("chocolate");
        cake.setPrice(29.99);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(49.95);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setFlavor("pina colada");
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
    }

}
/*
The first one is going to be a superclass called Cake and it will have two fields,
flavor and price. Go ahead and make getter and setter methods for both of these fields.

Next create a BirthdayCake class which will inherit from the Cake class and
 it has a field of its own called candles. Go ahead and include the getter and setter method for candles.

And then create a third class called WeddingCake which also inherits from Cake and
has a field called tiers and you'll include a getter and setter method for this.

And then finally, a class called TasteTester which will test out your inheritance.
 */

