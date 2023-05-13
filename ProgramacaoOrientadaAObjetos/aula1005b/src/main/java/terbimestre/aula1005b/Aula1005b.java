package terbimestre.aula1005b;

import java.util.Arrays;
/**
 *
 * @author Alan H
 */
public class Aula1005b {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        int[] arrayValores = {12,32,54,6,8,89,64,64,6};
        String arrValores;
        
        System.out.println("Somar dois Inteiros: 33 + 77 = 110");
        System.out.println("Somar dois Inteiros com a Calculadora: " + calc.somar(33,77) + "\n");

        System.out.println("Soma de dois Números Reais: 33,33 + 111,1 = 144,43");
        System.out.println("Soma de dois Numeros Reais com a Calculadora: " + calc.somar(33.33, 111.1) + "\n");
        
        System.out.println("Elementos do Array:");
        arrValores = "{";
        for(int i = 0; i<arrayValores.length; i++){
            if (i!=arrayValores.length - 1){
                arrValores += arrayValores[i] + ", ";
                  
            } else {
                arrValores += arrayValores[i] + "}";
            }
        }
        System.out.println(arrValores);
        
        System.out.println("Soma do Array de Valores: " + Arrays.stream(arrayValores).sum());
        System.out.println("Soma da Calculadora: " + calc.somar(arrayValores));
    }
}

/*
suponhamos que temos a classe calculadora com os seguintes
somar(int a, int b) - retorna a soma de dois inteiros
somar(double a, double b) - retorna a soma de dois números de ponto flutuante
somar(int numeros) - retorna a soma dos elementos de um array de inteiros

Crie um programa Java que utilize a classe calculadora e teste os três métodos acima, verificando se os resultados estão corretos.
Dicas:
Você pode utilizar o método Arrays.stream(numeros).sum() para somar os elementos do arry de inteiros
Você pode utilizar a classe java.util.Arrays para criar um array de inteiros com valores predefinidos
Teste a soma de números inteiros, de números de ponto flutuante e de um spray de inteiros
*/