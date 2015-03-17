import java.util.*;

/**
 * clase para creacion de la bocateria y atencion de los clientes
 * 
 * @author (Marco Ibañez Antolin) 
 * @version (13/3/2015)
 */
public class Bocateria
{
    //cliente en cola en la primera posicion
    private Cliente primeraPersonaEnCola;
    //facturacion de la tienda;
    private int facturacionActual;
    //hashmap con el numero de cliente despachados
    private HashMap<Integer,Cliente> clientesDespachados;
    //constante de precio de los bocadillos
    public static final int PRECIO_BOCADILLO= 5;

    /**
     * contructor de la bocateria
     */
    public Bocateria()
    {
       
       clientesDespachados=new HashMap<Integer,Cliente>();
       
    }

    /**
     * Metodo para implementar el nuevo cliente en cola de la bocateria
     * @param siguiente cliente
     * 
     */
    public void llegaNuevoClienteALaCola(int numeroDeBocadillos)
    {
        if(primeraPersonaEnCola == null)
        {
            primeraPersonaEnCola=new Cliente(numeroDeBocadillos);
        }
        else
        {
            Cliente nextClient=primeraPersonaEnCola.getSiguienteEnLaCola(numeroDeBocadillos);
        }
        
        
    }
    
    /**
     * metodo para visualizar los datos del cliente
     */
    public void visualizarDatosClientesEnCola()
    {
        
    }
    
    
}
