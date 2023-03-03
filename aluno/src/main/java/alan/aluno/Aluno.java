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
        
        System.out.print("Nome: ");
        nome = sc.next();
        System.out.print("Sexo: ");
        sexo = sc.next().charAt(0);
        
        getNameAndSex(nome, sexo);
    }
    
    private static void getNameAndSex (String nome, char sexo) {
        System.out.println("\nAluno: " + nome);
        switch (sexo) {
            case 'M', 'm' -> System.out.println("Sexo.: Masculino");
            case 'F', 'f' -> System.out.println("Sexo.: Feminino");
            case 'G', 'g' -> System.out.println("Sexo.: Gremista");
            case 'L', 'l' -> System.out.println("Sexo.: Louco");
            default -> System.out.println("Sexo.: Programador");
        }
    }
}
