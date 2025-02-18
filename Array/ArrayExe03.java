
public class ArrayExe03 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 4, 5, 6, 4, 20, 6, 3, 2, 17};

        
         //Contador comeca a partir da posicao 1 do array - i + 1
         //Assim compara  a posicao 0 no contador i com todos  os itens do array a partir da primeira posicao
         //O segundo for vai comparar  a posicao do primeiro for com todos os itens do Arrays atraves do segundo for;
        for(int i = 0; i < numeros.length - 1; i++) {

            
            for(int j = i + 1; j  < numeros.length; j++) {
            //Compara se a posicao 0 e igual  a posicao 1 && se a posicao  0 e diferente da posicao 1; 
                if((numeros[i] == numeros[j]) && ( i != j))
                System.out.println("Item duplicado: " + numeros[j]);

            }

        }

       







    } 
}
