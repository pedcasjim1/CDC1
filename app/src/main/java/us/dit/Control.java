package us.dit;


//hola esto es un comentario para estudiar
public class Control {
   public static void main(String[] args) {
    	int var1=2221;
    	int var2=234;        
    	//int var1=2233333333333333333333333;
    	//int var2=22333333333333335        
        int resultado = operacion(var1,var2);        
        System.out.println(us.dit.Validador.validar(resultado));       
        }
       
   public static int operacion(int a, int b) 
        //return a/b;
        return a+b;
   }   
  
}
