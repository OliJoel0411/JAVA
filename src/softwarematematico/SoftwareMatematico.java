package softwarematematico;
import java.util.Scanner;
/**
 * @author Oliver
 */
public class SoftwareMatematico {

    public static void main(String[] args) {
        
        /*
        Haciendo prueba de commit
        ...
        
        */
        
        
        // Lectura de datos
        Scanner tc = new Scanner(System.in);
        // editando
        // Variables
        int opc = 0;
        String opc1 = "",opc2 = "", opc3 = "", opc4 = "", opc5 = "";
        
        // Software Matemático
        System.out.println("Software Matematico");
        System.out.println("*****BIENVENIDO*****");
        System.out.println(" ");
        
        // inicio de sesión
        System.out.println("¿Desea iniciar sesion?");
        System.out.println("s : si");
        System.out.println("n : no");
        opc1 = tc.next();
        if(opc1.equals("s")){
            // tipos de usuarios 
            do{
        System.out.println("Tipo de inicio de sesion");
        System.out.println("1. Administrador");
        System.out.println("2. Usuario");
        opc = tc.nextInt();
        
        switch(opc){
            // Menu de opciones
            case 1:
                System.out.println("BIENVENIDO...ADMINISTRADOR");
                System.out.println("Ingrese su nombre de Usuario");
                opc2 = tc.next();
                // nombre de usuario "ADMIN"
                System.out.println("Ingrese su contrasenia");
                opc3 = tc.next();
                // contraseña "ADMIN"
                if(opc2.equals("ADMIN") && opc3.equals("ADMIN")){
                    System.out.println("Sesion iniciada correctamente!");  
                    System.exit(0);
                }
                break;
            case 2:
                System.out.println("BIENVENIDO...ADMINISTRADOR");
                System.out.println("Ingrese su nombre de Usuario");
                opc4 = tc.next();
                // nombre de usuario "USER"
                System.out.println("Ingrese su contrasenia");
                opc5 = tc.next();
                // contraseña "USER"
                if(opc4.equals("USER") && opc5.equals("USER")){
                    System.out.println("Sesion iniciada correctamente!"); 
                    System.exit(0);
                }
                break;
            default:
                System.out.println("Opcion incorrecta, ingrese una opcion valida");
            
            }
            }while(opc != 1 || opc!= 2);
        }else if(opc1.equals("n")){
            System.out.println("Bye...");
        }else {
            System.out.println("La opcion que ingreso es incorrecta :(");
        }
    }
    
    
}
