/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package alan.aluno;

import java.util.Scanner;

/**
 *
 * @author AlanH
 */
public class Aluno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        char sexo;
        
        System.out.println("Nome: ");
        nome = sc.next();
        System.out.println("Sexo: ");
        sexo = sc.next().charAt(0);
        getNameAndSex(nome, sexo);
    }
    
    private static void getNameAndSex (String nome, char sexo) {
        System.out.println("Aluno: " + nome);
        System.out.println("Sexo.: " + sexo);
    }
}
