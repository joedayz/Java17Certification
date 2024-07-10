package pe.joedayz.certification.buildingblocks;

public class Tim {
    private String name = "jose";

    {
        System.out.println("1");
    }

    public Tim() {
        name = "tim";
        System.out.println("2");
    }

    public static void main(String[] args) {
        Tim tim = new Tim();
        System.out.println("4");
    }


    {
        System.out.println("3");
    }
}
