public class DoWhileExemplo {
    public static void main(String [] args) {
        /* 
        int contador = 1;


        //faca
        //executa o codigo pelo menos 1 vez, e depois ele testa a condicao 
         do {

            System.out.println("Numero: " + contador);

            contador++;

         }while(contador <= 10);  
        */

        /* 
        //Conta de 10 a 1
        int contador = 10;
        //faca
        //executa o codigo pelo menos 1 vez, e depois ele testa a condicao 
         do {
            System.out.println("Numero: " + contador);
            contador--;
         }while(contador >= 1);  
        */

        //Conta do 0 a 100 de 5 em 5
        int contador = 0;
        //faca
        //executa o codigo pelo menos 1 vez, e depois ele testa a condicao 
         do {
            System.out.println("Numero: " + contador);
            contador += 5;
         }while(contador <= 100);  
    }

}