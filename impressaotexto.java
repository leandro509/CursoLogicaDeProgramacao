public class impressaotexto {
    //pasta do projeto java -> impressao texto

    //todo projeto java é um CLASSE
    //o nome da classe é o mesmo nome do arquivo
    //public - Publico
    //class - Classe

    //Precisamos criar um método
    //static - Estático
    //void - Retorno / Vazio
    //main nome do método ele é o principal
    //String - Texto Array
    //args - Nome do Array
    public static  void main(String[] args) {
    //System.out - é o objeto de saída padrão 
    //print - Imprimir
    //\n é um caracter de escape que faz a quebra de linha 
        System.out.print("ola mundo\n");
        //ln posiciona o curso para a linha debaixo
        System.out.println("Texto simples ");
        System.out.println("Texto simples 2");
        /*
         * f - Formatted, formato que permite fazer impressao de texto personalizada 
         * %s - String / Texto
         * %d - Inteiro
         * %f - Float
         * %b - boleano TRUE ou FAlSE
         */
        System.out.printf("%s", "Nome: Ana Paula\n");
        System.out.printf("%s idade: %d", "Ana Paula", 30);

        //%n - No printf indica uma quebra de linha
        System.out.printf("%n%nNome: %s %nIdade: %d", "Ana Paula", 30);

        //variavel - Espaço para armazenamento temporário
        int numero1 = 5;
        int numero2 = 10;

        System.out.printf("\n\nSoma dos numeros: %d", (numero1 + numero2));
        
    } 
}   
    

