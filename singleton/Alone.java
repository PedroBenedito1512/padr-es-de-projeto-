package singleton;
public class Alone {
    private static Alone instance;
    private int tamanho;
    private String raca;
    private String nome;
    private Double peso; 
    private int idade;
    private String cor_pelo;

    protected Alone(int t, String r, String n, double p, int i, String cp){
        this.tamanho =t ;
        this.raca =r;
        this.nome =n;
        this.peso =p; 
        this.idade =i;
        this.cor_pelo = cp;

    }

    public static Alone instance(int t, String r, String n, double p, int i, String cp){


        if(instance ==null){
            instance= new Alone(t , r, n ,p , i ,cp);
        }    
        return instance;
    }


    public String getCor_pelo() {
        return cor_pelo;
    }
    public static Alone getInstance() {
        return instance;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public Double getPeso() {
        return peso;
    }
    public String getRaca() {
        return raca;
    }
    public int getTamanho() {
        return tamanho;
    }
}

