import java.util.Scanner;
public class ArrayExe01 {
    public static void main(String[] args) {

        int menorNumero = 0;
        int maiorNumero = 0;
        int numeroDoMeio = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite 3 numeros: ");
        
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        int numero3 = scan.nextInt();


        int[] numeros = new int[3];
        
        numeros[0] = numero1;
        numeros[1] = numero2;
        numeros[2] = numero3;
        
        
        

            for(int i  = 0; i  < numeros.length; i++) {

                System.out.println("numero : " + numeros[i]);

               

                if(numero1 < numero2 && numero1 < numero3){

                    menorNumero = numero1;

                }
                
                 if(numero2 < numero1 && numero2 < numero3) {

                    menorNumero = numero2;

                }
                
                if(numero3 < numero1 && numero3 < numero2) {
                    
                    menorNumero = numero3;
                                 
                }

                if(numero1 > numero2 && numero1 > numero3){
                    maiorNumero = numero1;
                }
                                
                 if(numero2 > numero1 && numero2 > numero3) {
                    maiorNumero = numero2;
                }
                                
                if(numero3 > numero1 && numero3 > numero2) {
                    
                    maiorNumero = numero3;
                                 
                }

                if(numero1 < maiorNumero && numero1 > menorNumero){
                    numeroDoMeio = numero1;
                }
                                
                 if(numero2 < maiorNumero && numero2 > menorNumero) {
                    numeroDoMeio = numero2;
                }
                                
                if(numero3 < maiorNumero && numero3 > menorNumero) {
                    
                    numeroDoMeio = numero3;
                                 
                }





               

               

               

               

               

               

               

               

               

               

               

               

               
               
               
               

               
               
               

               
               

               
               
            



            }

           

            System.out.println("------------------------------------------");

            System.out.println("numero: " + menorNumero);
            System.out.println("numero: " + numeroDoMeio);
            System.out.println("numero: " + maiorNumero);
    
            

        
        scan.close();

    }
}
