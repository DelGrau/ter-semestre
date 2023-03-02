/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alan.aula1;

import java.util.Scanner;

/**
 *
 * @author AlanH
 */
public class Aula1 {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int base, altura;
        
        base = sc.nextInt();
        altura = sc.nextInt();
        
        hello();
        System.out.println(calcAreaTriangulo(base,altura));
    }
    
    private static void hello() {
        if (10>20) {
            System.out.println("ola Mundo!");
        } else {
            System.out.println("Ola Unipar!");
        }
    }
    
    private static int calcAreaTriangulo(int base, int altura){
        int area = (base * altura) / 2;
        return area;
    }
}

