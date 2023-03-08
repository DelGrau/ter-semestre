/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

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
        nome = sc.nextLine();
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
            case 'L', 'l' -> System.out.println("Sexo.: Loud");
            case 'S', 's' -> System.out.println("Sexo.: Sim");
            default -> System.out.println("Sexo.: Programador");
        }
    }
}
