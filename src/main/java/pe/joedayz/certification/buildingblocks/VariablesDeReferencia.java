package pe.joedayz.certification.buildingblocks;

public class VariablesDeReferencia {

    String greeting = "Hello"; //Usando un literal
    String name = new String("World"); //Usando un objeto

    public static void main(String[] args) {
        VariablesDeReferencia reference = new VariablesDeReferencia();

        System.out.println(reference.greeting);

        System.out.println(reference.name);
    }
}
