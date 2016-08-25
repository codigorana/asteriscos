/*
 * Vacaciones1 - FIGURAS con ASTERISCOS
 */
package asteriscos;

import java.util.Scanner;

/**
 * @author MCarmen (Wonder Woman)
 */
 //Hola a todos//
public class Asteriscos {

    public static void main(String[] args) {
        
        int impar;
        //Se utiliza la clase Scanner para capturar datos del teclado.
        Scanner sc = new Scanner(System.in);  
        //Validación de la entrada:
        try {
            System.out.print("Introduce un número impar: ");
            
            //Forma de capturar datos de teclado con Scanner.
            impar = sc.nextInt();
            
            if(impar%2!=0){
                
                //Llamamos al método dibujaFigura pasando el entero capturado como argumento.
                dibujaFigura(impar);
                
            }else{
                System.out.print("NO has introducido un número impar válido");
            }
        
        } catch (Exception e) {
            System.out.println("ERROR: no has introducido un número entero válido");
        }
    }
    
    //Método dibujaFigura al cual se le pasa el número impar introducido como argumento.
    static void dibujaFigura(int impar){
        
        //Variable constante que se usará para dibujar:
        final char asterisco = '*';
        
        //Primer bucle (con dos bucles for anidados):
        for (int i = 0; i < (impar/2)+1; i++) {
            //Con cada iteración se hace un salto de línea:
            System.out.print("\n");
            //Se utilizan dos bucles for para dibujar la figura:
            for (int j = 0; j <(impar/2)-i; j++) {                      
                System.out.print(" ");           
            }
            for (int j = 0; j < 2*i+1; j++){
                System.out.print(asterisco);
            }
        }
        // Segundo bucle. Segunda mitad de la figura:
        for (int i = (impar/2-1); i >=0; i--) {
            System.out.print("\n");
            for (int j = 0; j < (impar/2)-i; j++) {                      
                System.out.print(" ");           
            }
            for (int j = 0; j < 2*i+1; j++){
                System.out.print(asterisco);
            }
        }
        System.out.print("\n"); 
    }
  
}
