/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package beecrowdtriangulo1043;
import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class BeecrowdTriangulo1043 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        float A = teclado.nextFloat();
        float B = teclado.nextFloat();
        float C = teclado.nextFloat();
        
        if (A + B > C && B + C > A && A + C > B){
            float Per = (A + B + C);
            System.out.println(String.format("Perimetro = %.1f", Per));
        } else {
            float Area = ((A + B)*C/2);
            System.out.println(String.format("Area = %.1f", Area));
        }
    }
    
}
