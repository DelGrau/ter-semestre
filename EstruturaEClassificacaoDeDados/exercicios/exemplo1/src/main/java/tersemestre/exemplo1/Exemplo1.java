package tersemestre.exemplo1;

/**
 *
 * @author Alan H
 */
public class Exemplo1 {

    public static void main(String[] args) {
        imprimePares(); // Exercício 1
        somaPrimos(); // Exercício 2
        fatorialDeVinte(); // Exercício 3
        arrayDeFibonacci(); // Exercício 4
    }
    
    public static void imprimePares(){
        int j = 0;
        int somaPares = 0;
        System.out.println("Exercício 1:\nSoma dos Numeros Pares entre 0 e 1000");
        for (int i = 1; i<=1000; i++){
            if (i % 2 == 0){
                 somaPares += i;
            }
        }
        System.out.println(somaPares + "\n");
    }
    
    public static void somaPrimos(){
        int somaPrimos = 0;
        for (int i = 1; i<1000; i++){
            int primo = 0;
            for (int j = 1; j <= i; j++){
                if (j%i == 0) {
                    primo++;
                }
            }
            somaPrimos += i;
        }
        System.out.println("Exercício 2:\nSoma de Todos os Números primos entre 1 e 1000");
        System.out.println(somaPrimos + "\n");
    }
    
    public static void fatorialDeVinte(){
        long fatorial = 1;
        for (int i = 20; i > 0; i--){
            fatorial *= i;
        }
        System.out.println("Exercício 3:\nFatorial de 20:");
        System.out.printf("%,d\n", fatorial);
    }
    
    public static void arrayDeFibonacci(){
        int[] fib = new int[21];
        int ant = 0, atu = 1;
        for (int i = 0; i <= 20; i++){
            fib[i] = ant+atu;
            ant = fib[i];
        }
        System.out.println("Exercício 4:\nSequencia de Fibonacci:");
        for (int i = 0; i <= 20; i++){
            System.out.print(" "+fib[i]);
        }
    }
}
