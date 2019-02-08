
/**
 * @author ECI, 2017
 *
 */
public class Velocidad{

    public static final double MAXERROR = 0.00000000000001;
    
    private double longitud;
    private Angulo angulo;
    
    /**
     * Constructor de la velocidad, en componentes polares
     * @param l longitud de la velocidad
     * @param a angulo de la velocidad
     */
    public Velocidad (double l, Angulo a) {
    }

    /**
     * Retorna el componente horizontal
     * @return componente horizontal de la velocidad
     */
    public double componenteH() {
        return 0.0;
    }

    /**
     * Retorna el componente vertical de la velocidad
     * @return componente vertical de la velocidad
     */
    public double componenteV() {
        return 0.0;
    }


    /**
     * Retorna el angulo de la velocidad
     * @return angulo de la velocidad
     */
    public Angulo angulo () {
        return null;
    }


    /**
     * Retorna la longitud de la velocidad
     * @return la longitud del origen al velocidad
     */
    public double longitud() {
        return 0.0;
    }
    

    
    /**
     * Compara este velocidad con otro. Serán iguales si la distancia entre ellos es menor que MAXERROR
     * @param v el velocidad a comparar con este
     */
    private boolean equals (Velocidad v) {
        return false;
    }

    /** 
     * Compara si este velocidad es igual al parametro (debe ser tambien un velocidad)
     * (Es el método que usa JUnit)
     */
    @Override
    public boolean equals (Object o) {
            return false;
    }
    

    /**
     * Rota el velocidad el angulo dado, con respecto al origen. 
     * Es decir que el angulo resultante, es la suma del angulo dado con el angulo inicial de la velocidad, 
     * y la distancia es la misma.
     */
    public void rote(Angulo a) {
    }

    public  void sume(Velocidad v){
    }
    
    public void reste(Velocidad v){
    }
    
    public void escalar(int operando){
    }    
    
    public void vectorial(Velocidad v){
    }
    
    //Adicione los métodos que requiera
    
    /** 
     * Retorna una cadena que describe a este velocidad (en componentes polares)
     */
    @Override
    public String toString () {
          String s = "";
          return s;
    }

}
