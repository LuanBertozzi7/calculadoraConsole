package calculadora;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Circuference {
    public static void circuIniciar() {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("#.00");

        double radius = 0;
        double resultado = 0;
        String escolhaDoUsuario;
        while(true) {

            System.out.println("Selecione o calculo: ");
            System.out.println("(C) circunferência: ");
            System.out.println("(M) Massa: ");
            System.out.println("(S) Sair");

            escolhaDoUsuario = scanner.next();
            if (escolhaDoUsuario.equals("S")) {
                System.out.println("Saindo...");
                break;
            }

                switch (escolhaDoUsuario) {
                    case "C":
                        System.out.println("digite o radio para concluir o calculo");
                        radius = scanner.nextDouble();
                        resultado = 2 * Math.PI * radius;
                        System.out.println("Resultado: " + deci.format(resultado));
                        break;
                    case "M":
                        System.out.println("digite o radio para concluir o calculo");
                        radius = scanner.nextDouble();
                        resultado = 4.0 * Math.PI * radius * radius * radius / 3.0;
                        System.out.println("resultado: " + deci.format(resultado));
                        System.out.println("");
                        break;
                }
        }


    }







}
