// Criar uma Classe distinguindo 5 atributos de um animal e depois criar uma Classe para cadastrar 5 animais;

package tersemestre.classesdeanimais;

/**
 *
 * @author Alan.Henrique
 */
public class ClassesDeAnimais {

    public static void main(String[] args) {
        TestaClasses macaco = new TestaClasses( "Ze", "Macaco", (float) 35.2, 'M', 'M');
        TestaClasses monke = new TestaClasses( "Chimp", "Macaco", (float) 40.7, 'M', 'G');
        
        System.out.println(macaco.getPeso());
        System.out.println(monke.getNome());
    }
}
