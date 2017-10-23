import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionDemo {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        boolean continueInput = true;
        int a, b, resultat;

        do {

            try{
                System.out.println("Indtast A");
            a = i.nextInt();
            System.out.println("Indtast B");
            b = i.nextInt();
            resultat = a + b;
            System.out.println("A + B er " + resultat);
            }
            catch (InputMismatchException ex) {
                System.out.println("Ta' dig sammen, og indtast rigtige heltal, for dalen da. Prøv igen!");
                
            }


        } while (continueInput);
    }

}
