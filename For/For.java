public class For {
    public static void main(String[]args) {

        /*
         *  Só usamos o for quando soubermos quantas usar esse comando
         * int contador = 1 Configura a Variável para servir de contador
         * Contador <= 10 Condição para continuar a condição
         * contador++ - Incremento até o contador atingir o resultado esperado
         * Inicialização - Controle - Incremento
         *  
         * for(int contador = 1; contador <=10; contador++) {
         System.out.println("Número: " + contador);
            }
         */

        //for - para
        /* 
        for(int contador = 10; contador >= 1; contador--) {

            System.out.println("Número: " + contador);
        }
        */

        for(int contador = 2; contador <= 10; contador+=2) {
            System.out.println("Número: " + contador);
        }
        
        //contador++
        //contador = contador + 1
        //contador+=1
        
    }
}