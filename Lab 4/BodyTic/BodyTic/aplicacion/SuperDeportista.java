package aplicacion;


/**
 * Write a description of class SuperDeportista here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SuperDeportista extends Deportista implements EnSalon
{
        private Salon salon;   
	protected String palabras;
        protected int paso;
    /**
     * Constructor for objects of class SuperDeportista
     */
    public SuperDeportista(Salon salon,String nombre,int posicionx, int posiciony)
    {
        super(salon,nombre,posicionx,posiciony);
    }
    
    private void puedeMover(char direccion) {
        super.puedeMover2(direccion);
    }

}
