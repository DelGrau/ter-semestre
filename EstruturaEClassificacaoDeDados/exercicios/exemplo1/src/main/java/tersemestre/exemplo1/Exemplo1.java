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
        arrayDeFibonacci(); // Exercício 5
        menorMaiorMedia(); // Exercício 6
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
        int[] fib = new int[20];
        int ant = 0, atu = 1;
        for (int i = 0; i < 20; i++){
            fib[i] = ant+atu;
            ant = atu;
            atu = fib[i];
        }
        System.out.println("Exercício 4:\nSequencia de Fibonacci:");
        for (int i = 0; i < 20; i++){
            System.out.print(" "+fib[i]);
        }
    }
    
    public static void arrayDeFibonacci(){
        int[] fib = new int[10];
        int ant = 0, atu = 1;
        for (int i = 0; i < 10; i++){
            fib[i] = ant+atu;
            ant = atu;
            atu = fib[i];
        }
        System.out.println("\n\nExercício 5:\nSequencia de Fibonacci:");
        for (int i = 0; i < 10; i++){
            System.out.print(fib[i]+" ");
        }
    } 
    
    public static void menorMaiorMedia(){
        int[] array = new int[10];
        int atual = 0, prox = 0, reserva = 0;
        int mediaArray = 0;
        
        System.out.println("\n\nInsira os valores do Array:");
        for (int i = 0; i < 10; i++){
            System.out.print ((i+1)+"º valor: ");
            array[i] = sc.nextInt();
        }
        
        for (int i = 0; i<10; i++){
            for (int j = 0; j<9; j++){
                if (array[j] > array[j+1]) {
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                }
            }
        }
        
        for (int i = 0; i<10; i++){
            mediaArray += array[i];
        }
        mediaArray /= 10;
        
        System.out.println("\n\nExercício 6:\nMenor, Maior e Media do vetor:");
        System.out.printf("Menor: %d\nMaior: %d\nMedia: %d", array[0], array[9], mediaArray);
    } 
}
