/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package metodosclasses;

/**
 *
 * @author kleut
 */
public class Metodos {

    public static void main(String[] args) {
        //faz a chamada do método e executa a instrução que tem dentro
        mensagem();
        
        //Faz dos itens para o método
        instrucoes("Estude e treine bastante!");
        instrucoes("Assim você aprende JAVA!");
        
        //Faz a passagem de 4 notas e calcula a média
        //Aqui passamos valores do tipo double
        media(10, 8.5, 9, 6.5);
        
        //Sobrecarga de métodos
        //Podemos criar mais de um método com o mesmo nome 
        //mas eles devem ter tipos diferentes para serem aceitos 
        //aqui passamos valores do tipo int 
        media(10, 8, 9, 6);
        
        int resultado;
        resultado = soma(5, 9);
        
        System.out.println("Resultado da soma : " + resultado);
        
        System.out.println("Resultado : " + somaNumeros(5, 10, 20));
    }

    /*
        public - tenho acesso a esse método fora da classe 
        Se o método main é static ou outros métodos também terão que ser static 
    */
    
    public static void media(double nota1, double nota2, double nota3, double nota4) {
    
        double media;
        
        media = (nota1 + nota2 + nota3 + nota4) /4;
        
        System.out.println("Media final com Double: " + media);
        
    }
    
     public static void media(int nota1, int nota2, int nota3, int nota4) {
    
        double media;
        
        media = (nota1 + nota2 + nota3 + nota4) /4;
        
        System.out.println("Media final com Int: " + media);
        
    }
     
     //Criamos uma lista de parâmetros do tipo inteiro  
    public static int somaNumeros(int ... numeros) {
    
        int resultado = 0;
        
        for(int posicao = 0; posicao < numeros.length; posicao++) {
        
            resultado = resultado + numeros[posicao];   
            
        }
        
        return resultado;
        
    }
     
    public static int soma(int valor1, int valor2) {
    
        int resultado = valor1 + valor2;
    
        //return - retorna o resultado da operação
        return resultado;   
    }    
    /*
        Métodos é uma função que programamos para a classe main 
        ele é o método principal
        
        Como criar um método?
        Indicador de acesso - public static 
        Tipo de retorno - void / nada
        Nome - main
        Conjunto de parâmetros desse método - String[] args
     */

    //Indicador de acesso - public static 
    //Tipo de retorno - void / nada
    //Nome - mensagem 
    public static void mensagem() {

        System.out.println("Boa noite, estou aprendendo sobre métodos! ");

    }
    
    //Nesse caso criamos o método com um parâmetro de entrada 
    //String texto - recebe o texto que vem do método main e exibe na tela com o auxilio do nosso System.out.println
    public static void instrucoes(String texto) {
    
        System.out.println(texto);
        
    }

}