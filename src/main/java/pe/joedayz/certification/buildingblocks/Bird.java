package pe.joedayz.certification.buildingblocks;

public class Bird {

    {
        // Se ejecuta antes del constructor y en primer lugar
        System.out.println("Larson");
    }

    public static void main(String[] args) {
        {
            System.out.println("Feathered Friends");
            //Bird bird = new Bird();
        }
    }

    {
        // Se ejecuta antes del constructor y en segundo lugar
        System.out.println("Snowy");
    }
}

/*
{
  Se llaman bloques de inicialización de instancia
        }
*/