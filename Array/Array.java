
public class Array {

    public static void main(String[] args) {

        int n1, n2, n3, n4, n5;

        n1 = 10;
        n2 = 18;
        n3 = 31;
        n4 = 45;
        n5 = 52;

        System.out.println("Exemplo com variaveis");
        System.out.println("Numero 1: " + n1);
        System.out.println("Numero 2: " + n2);
        System.out.println("Numero 3: " + n3);
        System.out.println("Numero 4: " + n4);
        System.out.println("Numero 5: " + n5);

        /*
         * Array e semelhante a criacao de varias variaveis ele faz a mesma coisa /
         * funcao.
         * 
         * [] - siginifica que estou criando um array
         * new - Significa que vou instaciar da classe inteiro
         */

        int[] numeros = new int[5];

        numeros[0] = 19;
        numeros[1] = 25;
        numeros[2] = 39;
        numeros[3] = 43;
        numeros[4] = 90;

        System.out.println("\nImprimindo o array\n\n");
        System.out.println("Posicao 0: " + numeros[0]);
        System.out.println("Posicao 1: " + numeros[1]);
        System.out.println("Posicao 2: " + numeros[2]);
        System.out.println("Posicao 3: " + numeros[3]);
        System.out.println("Posicao 4: " + numeros[4]);

        // ---------------------------------------------------

        // Criando o array de letras e preenchendo os itens
        // direto dentro do array
        String[] letras = { "A", "B", "C", "D", "E" };
        System.out.println("\nImprimindo o array de Letras\n\n");
        System.out.println("Posicao 0: " + letras[0]);
        System.out.println("Posicao 1: " + letras[1]);
        System.out.println("Posicao 2: " + letras[2]);
        System.out.println("Posicao 3: " + letras[3]);
        System.out.println("Posicao 4: " + letras[4]);

        
        // ---------------------------------------------------

        // Criando o array de letras e preenchendo os itens
        // direto dentro do array
        String[] animais = { "Ave", "Macaco", "Girafa", "Cachorro" };
       
        //for - para
        for(int  i = 0; i < 4;i++){

            System.out.println("Animal posicao " + i + " : " +  animais[i]);

        }

       
       
       

    }

}