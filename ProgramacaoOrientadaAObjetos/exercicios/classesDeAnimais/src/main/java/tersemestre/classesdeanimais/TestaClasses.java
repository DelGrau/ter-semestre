// Criar uma Classe distinguindo 5 atributos de um animal e depois criar uma Classe para cadastrar 5 animais;

package tersemestre.classesdeanimais;

/**
 *
 * @author Alan.Henrique
 */
public class TestaClasses {
    private String nome;
    private String raca;
    private float peso;
    private char sexo; // M ou F
    private char porte; // P, M ou G
    
    public TestaClasses(String name, String race, float weight, char sex, char port){
        nome = name;
        raca = race;
        peso = weight;
        sexo = sex;
        porte = port;
    } 
    
    public void latir(){
        if(porte == 'G' || porte == 'g'){
            System.out.println("Woof, Woof!");
        else if(porte == 'M' || porte == 'm'){
            System.out.println("Ruf, Ruf!"); 
        } else {
            System.out.println("Yeet, Yeet!");
        }
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRaca(){
        return this.raca;
    }
    
    public float getPeso(){
        return this.peso;
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public char getPorte(){
        return this.porte;
    }
}
