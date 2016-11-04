
/**
 * Write a description of class CalendarioBasico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoIvan
{

   // instance variables - replace the example below with your own
    private int dia;
    
    private int mes;
    
    private int año;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasicoIvan()
    {
        // initialise instance variables
        dia = 01;
        mes = 01;
        año = 01;
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void fijarFecha(int d, int m, int a)
    {
     
        dia= d;
        mes= m;
        año= a;
        String.format("%02d",dia);
        String.format("%02d",mes);
        String.format("%02d",año);
    }
       
    public void avanzarFecha(){
        if (dia < 30){
            dia = dia +1;
        }
            
         else if (mes < 12){
                  mes = mes +1;
              }
        else{
            año = año +1;
        }  
      }
    
    public String mostrarFecha(){
       String Fecha = String.format("%02d",dia) + "-" + String.format("%02d",mes) + "-" + String.format("%02d",año);
       return Fecha;
    }
}

