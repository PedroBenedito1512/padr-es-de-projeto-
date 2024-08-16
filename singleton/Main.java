package singleton;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //primeira instancia atribuindo valores ao alone = macaco
        int tamanho;
        String raca = "orangutangu";
        String nome = "flavio";
        Double peso = 300.0; 
        int idade = 19;
        String cor_pelo = "marrom";
        Scanner in = new Scanner(System.in);
        System.out.println("tamanho do monkey");
        tamanho = in.nextInt();
        Alone macaco = Alone.instance(tamanho, raca, nome, peso, idade, cor_pelo);
        System.out.println(" o macaco "+ macaco.getNome()+ " tamanho "+macaco.getTamanho() );
        //conclusão primeira instacia 

        // tentativa de segunda instancia e atribuição de valores para alones
        Alone macaco2 = Alone.instance(10, "llll", "llll", 10.2, 10, "lll");
        System.out.println(macaco2.getNome());
        in.close();
        // teste mostrou que na primeira ele atribuiu  valores que foram armazenados, porém na segunda foi constatado
        // que os valores so podem ser instanciados uma unica vez, isso acontece por ser uma construtor  protegida 
        // o medoto instance só permite e instanciação de uma classe uma unica vez, seguindo o esperado de singleton.
    }
}
