/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alan.areacirculo;

import java.util.Scanner;

/**
 *
 * @author lucia
 */
public class AreaCirculo {

    public static final double PI = 3.14;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Insira o Raio em cm..: ");
        double raio = sc.nextDouble();
        double area = calcAreaCirculo(raio);
        
        System.out.printf("\nArea do Circulo em cm: %,.0f",area);
        System.out.printf("\nArea do Circulo em m.: %,.2f",(area/100));
    }
    
    public static double calcAreaCirculo(double raio) {
        return (raio*raio)*PI;
    }
}
