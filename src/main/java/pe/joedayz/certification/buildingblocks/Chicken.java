package pe.joedayz.certification.buildingblocks;

public class Chicken {

    int numEggs = 12;
    String name;



    public Chicken(int numEggs, String name) {
        this.numEggs = numEggs;
        this.name = name;
    }

    public Chicken(String myName, int varEggs) {
        this.numEggs = varEggs;
        this.name = myName;
    }

    public static void main(String[] args) {
        //cuando ya tienes constructores, no te da el constructor por defecto
        Chicken pollito = new Chicken(15, "Pio");
    }
}
