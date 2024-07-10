package pe.joedayz.certification.buildingblocks;

public class Swan {

    //variables de instancia o propiedades de la clase
    boolean hasEggs;
    Empleado empleado;
    String name;
    int numberEggs = -2_000_000_000;
    byte b = 127;
    short s = 32767;
    long l = 123324343L;
    char c = 'c';
    double salario = 5000.00;
    float f = 5000.00f;

    int x = 1______0;

    public static void main(String[] args) {
        Swan mother = new Swan();
        //mother.numberEggs = 1;
        System.out.println(mother.numberEggs); //0

        System.out.println(mother.hasEggs); //false

        System.out.println(mother.name); //null

        System.out.println(mother.empleado); //null

        System.out.println(mother.x);
    }
}
