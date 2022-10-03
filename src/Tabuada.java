import java.util.Locale;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bem-vindo a minha Calculadora de Tabuada.");
        System.out.println("Digite o numero para ver a tabuada:");

        while (true) {
            numero = teclado.nextInt();
            System.out.println("A Tabuada de " + numero + " é:");
            for (int x = 1; x < 11; x++) {
                System.out.println(numero + "x" + x + "=" + numero * x);
            }
            System.out.println("#######FIM#######");
            System.out.println("");
            System.out.println("Digite outro número para ver a tabuada, ou zero para sair:");
            if (numero == 0) break;
        }
        System.out.println("O numero digitado foi: " + numero);
        System.out.println("Saindo...");

    }
}
