package pe.joedayz.certification.buildingblocks;

public class Egg {


    public Egg() {
        number = 5;
    }

    public static void main(String[] args) {
        Egg egg = new Egg();
        System.out.println(egg.number);
    }

    { number =45;}

    private int number = 3;


}
