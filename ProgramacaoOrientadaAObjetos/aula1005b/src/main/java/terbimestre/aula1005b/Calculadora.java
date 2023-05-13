/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package terbimestre.aula1005b;

/**
 *
 * @author Alan H
 */
public class Calculadora {
    public Calculadora(){
    }
    
    public int somar(int a, int b) {
        return a+b;
    }
    
    public double somar(double a, double b) {
        return a+b;
    }
    
    public int somar(int numeros[]) {
        int total = 0;
        for(int i = 0; i<numeros.length; i++){
            total += numeros[i];
        }
        return total;
    }
}

/* suponhamos que temos a classe calculadora com os seguintes
somar(int a, int b) - retorna a soma de dois inteiros
somar(double a, double b) - retorna a soma de dois números de ponto flutuante
somar(int numeros) - retorna a soma dos elementos de um array de inteiros

Crie um programa Java que utilize a classe calculadora e teste os três métodos acima, verificando se os resultados estão corretos.
Dicas:
Você pode utilizar o método Arrays.stream(numeros).sum() para somar os elementos do arry de inteiros
Você pode utilizar a classe java.util.Arrays para criar um array de inteiros com valores predefinidos
Teste a soma de números inteiros, de números de ponto flutuante e de um spray de inteiros
*/