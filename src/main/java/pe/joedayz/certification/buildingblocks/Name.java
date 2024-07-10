package pe.joedayz.certification.buildingblocks;

public class Name {

    String first = "Amadeo";
    String last = "Diaz";
    String fullName = first + " " +  last; //cuidado con el orden de invocació de fullName



    public static void main(String[] args) {
        Name name = new Name();
        System.out.println(name.fullName);
    }

}
