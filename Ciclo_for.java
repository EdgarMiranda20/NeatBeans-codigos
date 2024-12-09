import javax.swing.JOptionPane;
public class Ciclo_for {
    public static void main(String[]args){
        int cu1,cu2,cu3,cu4,cu5,alumno;
        float promedio;
        
        
        System.out.println("Ingresa tus cinco calificaciones que tienes");
        
        for(alumno=1; alumno<=34; alumno++){
            cu1=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu primera calificación")); 
            cu2=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu segunda calificación")); 
            cu3=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu tercera calificación")); 
            cu4=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu cuarta calificación"));  
            cu5=Byte.parseByte(JOptionPane.showInputDialog("Ingresa tu quinta calificación"));
            
            promedio=(cu1+cu2+cu3+cu4+cu5)/5;
            
            System.out.println("Tu calificacion final en la materia es de:  " + promedio);
                   
        }
        
    }
    
}
