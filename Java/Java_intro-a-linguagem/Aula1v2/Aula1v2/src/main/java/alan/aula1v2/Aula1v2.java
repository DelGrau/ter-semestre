/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alan.aula1v2;

import java.util.Scanner;

/**
 *
 * @author AlanH
 */
public class Aula1v2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double base, altura;
        
        System.out.print("Base (em cm) ....: ");
        base = sc.nextDouble();
        System.out.print("Altura (em cm) ..: ");
        altura = sc.nextDouble();
        
        System.out.print(  "Area do Triangulo: ");
        System.out.println(calculaAreaTriangulo(base, altura) + " cm.");
        System.out.print(  "Area do Triangulo: ");
        System.out.println((calculaAreaTriangulo(base, altura)/100) + " m.");
        
        if (calculaAreaTriangulo(base, altura) > 10) {
            System.out.println ("Hello, world!");
        } else {
            System.out.println("...");
        }
    }
    
    private static double calculaAreaTriangulo (double base, double altura) {
        double area = ((base * altura) / 2);
        return area;
    }
}
