
/**
 * clase cliente para la creacion de un nuevo cliente
 * 
 * @author (Marco Ibañez Antolin) 
 * @version (13/3/2015)
 */
public class Cliente
{
    //atributo para el numero de cliente
    private int numeroCliente;
    //atributo siguiente cliente en la cola para pedir
    private Cliente siguienteEnLaCola;
    //bocadillos vendidos en la tienda
    private int numeroDeBocadillos;
    //constante para evaluar el numero de cliente
    public static int numeroClienteActual=1;
    /**
     * Constructor de objetos de la clase cliente
     * @param numero de bocadillos que pide el cliente actual
     */
    public Cliente(int numeroBocadillos)
    {
        numeroCliente=numeroClienteActual;
        siguienteEnLaCola = new Cliente( numeroDeBocadillos());
        numeroDeBocadillos=numeroBocadillos;
    }

    /**
     * 
     * metodo para saber quien es el siguiente cliente en pedir
     *  @return siguiente cliente en la cola
     * 
     */
    public Cliente SiguienteEnLaCola()
    {
        return siguienteEnLaCola;
        
    }
    
    /**
     * metodo para saber el numero de bocadillos comprados
     * return@ numero de bocadillos comprados por el cliente
     */
    public int numeroDeBocadillos()
    {
        return numeroDeBocadillos;
    }
    
    /**
     * metodo para saber el numero del cliente
     * @return numero del cliente actual 
     */
    public int numeroCliente()
    {
        return numeroCliente;
    }
    
    /**
     * metodo para devolver los datos del cliente
     */
    public String toString()
    {
        return ("Cliente " + numeroCliente() + " :" + numeroDeBocadillos()+" bocadillo/s ");
    }
}


