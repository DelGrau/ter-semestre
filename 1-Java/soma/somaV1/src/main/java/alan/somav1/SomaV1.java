/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alan.somav1;

import java.util.Scanner;

/**
 *
 * @author AlanH
 */
public class SomaV1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        int num, num1;
        
        System.out.print("Insert 1st number: ");
        num  = sc.nextInt();
        System.out.print("Insert 2nd number: ");
        num1 = sc.nextInt();
        
        System.out.println(  "\nResultados:");
        System.out.printf("\n%d + %d = %6d", num, num1,(num+num1));
        System.out.printf("\n%d - %d = %6d", num, num1,(num-num1));    
        System.out.printf("\n%d x %d = %6d", num, num1,(num*num1));
        System.out.printf("\n%d : %d = %6d (divisão inteira)", num, num1,(num/num1));
        System.out.printf("\n%d : %d = %6.2f (divisão exata)\n\n", num, num1,((double)num/(double)num1));
        
        for(num = 0; num <=num1; num++){
            if (num < num1){
                System.out.printf("\t %d < %d\n", num, num1);
            } else {
                System.out.printf("\t %d = %d\n", num, num1);
            }
        }
    }
}
