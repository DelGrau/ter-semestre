/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alan.somav2;

import java.util.Scanner;

/**
 *
 * @author AlanH
 */
public class SomaV2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        int n, soma=0;
        
        System.out.print("Informe quantos números você quer somar: ");
        n = sc.nextInt();
        
        int arr[] = new int [n];
        
        System.out.printf("Informe os %d numeros:\n", n);
        
        for(int i=0; i<n; i++) {
            System.out.printf("\tInforme o %dº numero: ", i+1);
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
            soma+=(arr[i]);
        }
        
        System.out.println("Soma = "+soma);
    }
}
