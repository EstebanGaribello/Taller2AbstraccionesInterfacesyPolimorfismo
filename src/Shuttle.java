/**
 *
 * @author Esteban Garibello Ortega
 * Se crea la clase lanzadera
 * Con las variables Peso de carga y carga
 *
 * */


public class Shuttle extends Ship implements ISchedulable{
    private double loadWeight;
    private String load;

    /**
     *
     * Se crean los constructores y metdos de la clase que la carga fue soltada y la sobreescritura de metodos
     *
     * */


    Shuttle() {
        this.loadWeight = loadWeight;
        this.load = load;
    }

    public void dropLoad() {
        System.out.println("the load is released: " + this.load);
    }

    @Override
    public String toString() {
        return "I am the Shuttle: " + "whit the load: " + this.load + " and I have a load weight of: " + this.loadWeight;
    }

    public static void main(String[] args) {
       Shuttle myShuttler = new Shuttle();
        System.out.println(myShuttler);
        myShuttler.dropLoad();
    }

    public void takeOff() {
        System.out.println("Take Off");
    }

    public void exploit() {
        System.out.println("exploit");
    }

    @Override
    public void schedule(String toOrbit) {

    }
}
