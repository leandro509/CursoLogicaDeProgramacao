public class Matriz {

    public static void main(String[] args) {

        // [][] Matriz
        // [] Array
        // Matriz - Linhas e Colunas
        // Primeiro Indice e as linhas
        // Segundo Indice e as Colunas
        // Cada linha da matriz e um Array
        // Se tiver 8 linhas e 8 Arrays
        int[][] numeros = new int[3][4];

        // Populando a matriz
        // Percorre as linhas
        for (int linha = 0; linha < 3; linha++) {

            for (int colunas = 0; colunas < 4; colunas++) {

                // Estou colando o valor 5 em cada item da Matriz
                numeros[linha][colunas] = 5;

            }

        }

        // Populando a matriz
        // Percorre as linhas
        for (int linha = 0; linha < 3; linha++) {
            for (int colunas = 0; colunas < 4; colunas++) {
                // Estou colando o valor 5 em cada item da Matriz
                System.out.print(numeros[linha][colunas] + " ");
            }

            System.out.println("");
        }

        // ----------------------------------------
        int linhas = 3;
        int coluna = 4;

        String[][] matrizLetras = new String[linhas][coluna];
        String[] array_1 = { "A", "B", "C", "D" };
        String[] array_2 = { "E", "F", "G", "H" };
        String[] array_3 = { "I", "J", "K", "L" };

        matrizLetras[0] = array_1;
        matrizLetras[1] = array_2;
        matrizLetras[2] = array_3;

         System.out.println("");

        // Populando a matriz
        // Percorre as linhas
        for (int linha = 0; linha < linhas; linha++) {
            for (int colunas = 0; colunas < coluna; colunas++) {
                
                System.out.print(matrizLetras[linha][colunas] + " ");
            }
            System.out.println("");
        }

    }

}