package presentation;


//polymorphism means many forms

class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }

}

class Robin extends Bird{
    public void sing() {
        System.out.println("twiddleeeedlee");
    }
}

class Pelican extends Bird{
    public void sing() {
        System.out.println("MINE");
    }
}



public class PolymorphicMethods {

    public static void main(String[] args) {
        //creating a new object
        Bird b = new Bird();
        //calling the sing method.
        b.sing();
        //create a robin object and it will inherit the methods from Bird class because of "extends"
        Robin a = new Robin();
        a.sing();
        Pelican p = new Pelican();
        p.sing();
    }





}
