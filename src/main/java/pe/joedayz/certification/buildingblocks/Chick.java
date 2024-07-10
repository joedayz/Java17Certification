package pe.joedayz.certification.buildingblocks;

public class Chick {


    public Chick() {
        System.out.println("In constructor");
    }

    public void Chick(){  //NO es un constructor
        System.out.println("In method");
    }

    public static void main(String[] args) {
        Chick chick = new Chick();
    }
}
