public class ArrayExe04 {
    public static void main(String[] args) {

        String[] animais = {"leao", "vaca", "cavalo", "zebra", "tigre","cobra"};

        String[] animais2 = {"vaca", "touro", "peixe", "cobra", "ornitorrinco", "zebra"};

        for(int i = 0; i < animais.length; i++) {

            for(int j = 0; j < animais2.length; j++) {

                if(animais[i].equals(animais2[j])) {

                    System.out.println("Animais repetidos: " + animais[i]);

                }

            }

        }
 
    }
}
