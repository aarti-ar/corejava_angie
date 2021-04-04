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
*/

public class WeddingCake extends Cake {         //Sub/Child Class
    private int tiers;

    public WeddingCake(){                       //Constructor created
        super("almond");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }
}
