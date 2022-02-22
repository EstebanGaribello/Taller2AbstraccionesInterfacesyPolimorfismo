/**
 *
 * @author Esteban Garibello Ortega
 * se crea la clase no tripulada
 *
 * */



public class Unmanned extends Ship implements ISchedulable {

    /**
     *
     * se crean los constructores y los metodos estudiar los planetas, despegar y explotar.
     *
     * */


    public String study(String target) {
        return "studying : " + target;
    }

    public static void main(String[] args) {
        Unmanned alacazan = new Unmanned();

        System.out.println(alacazan.study("the planets"));
    }

    public void takeOff() {
        System.out.println("take off");
    }

    public void exploit() {
        System.out.println("exploit");
    }

    @Override
    public void schedule(String toOrbit) {

    }
}
