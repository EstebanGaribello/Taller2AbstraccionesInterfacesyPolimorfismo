/**
 *
 * @author Esteban Garibello Ortega
 *Se crea la clase Tripulada se declara la variable capacidad
 *
 * */



public class Manned extends Ship implements ISchedulable {
    private int capacity;

    /**
     *
     * Se crea el metodo mantenimiento y se implementa la interfaz orbitar
     *
     * */



    public String keep (String target){
      return "maintenance :" + target;
    }

    public static void main(String[] args) {
        Manned marte = new Manned();
        System.out.println(marte.keep("maintenance of the ships"));
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
