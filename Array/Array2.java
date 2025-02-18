import java.util.Arrays;

public class Array2 {
    public static void main(String[] args) {

        // final e uma constante / fixo que pode ser utilizado em diversas partes
        final int tamanho = 3;

        int[] precos = new int[tamanho];

        precos[0] = 18;
        precos[1] = 45;
        precos[2] = 90;

        System.out.println("Imprimindo Array Precos");

        // length - Atributo do Array que vai retorna o tamanho do Array
        for (int posicao = 0; posicao < precos.length; posicao++) {

            System.out.println("Preco: " + posicao + " : " + precos[posicao]);

        }

        // -------------------------------------------------------------------

        String[] letras = { "A", "B", "C", "D", "E", "F", "G", "H" };

        System.out.println("\n\n>>>>  For Array Letras <<<<<<");

        // For utlilizado como uma opcao para ler itens do Array
        for (String l : letras) {

            System.out.println(l);
        }

        // -------------------------------------------------------------------
        int[] numeros = { 18, 22, 37, 44, 55, 67, 78, 86, 91, 150 };

        System.out.println("\n\n>>>>  For Array Numeros  <<<<<<");
        // For utlilizado como uma opcao para ler itens do Array
        for (int linha : numeros) {

            System.out.println(linha);
        }

        // --------------------------------------------------------------------

        // fill - Preenche o array com um valor pre-determinado
        Arrays.fill(numeros, 5);

        System.out.println("\n\n>>>>  For Array fill  <<<<<<");
        // For utlilizado como uma opcao para ler itens do Array

        for (int linha : numeros) {
            System.out.println(linha);
        }

        // --------------------------------------------------------------------

        // fill - Preenche o array com um valor pre-determinado
        Arrays.fill(letras, "W");
        System.out.println("\n\n>>>>  For Array Letras fill  <<<<<<");
        // For utlilizado como uma opcao para ler itens do Array
        for (String linha : letras) {
            System.out.println(linha);
        }


    }

}
