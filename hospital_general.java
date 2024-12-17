public class hospital_general {
    public static void main (String edg []){
        
        int a,b,c,d,e,dinero;
        
         
        dinero=2000000;
        System.out.println("El gobierno federal le destino a un hospital la cantidad de: $ " + dinero);
        System.out.println("................................................");
        
                 a=(2000000*20/100);
                 System.out.println("Se destino un 20% al area de pediatria lo que vendria siendo: $ " + a);
                            
                 b=(2000000*15/100);
                 System.out.println("Se destino un 15% al area de analisis clinos lo que vendria siendo: $ " + b);
                       
                 c=(2000000*40/100); 
                  System.out.println("Se destino un 40% al area de ginecologia lo que seria: $ " + c);
          
                 d=(2000000*10/100);
                   System.out.println("Se destino un 10% a los sanitarios lo que seria: $ " + d);
                           
                 e=(2000000-(a+b+c+d));               
                  System.out.println("Se destino un 15% del presupuesto total a los servicios generales lo que seria: $ " + e);           
        }
    }   

