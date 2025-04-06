import java.util.Scanner;
import calculadora.CalculadoraInicio;
import calculadora.Circuference;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circuference calcCircuAndMass = new Circuference();
        CalculadoraInicio Calculadora = new CalculadoraInicio();
        short escolhaUsuario;
            System.out.println("" +
                    "### Utilitarios ###" +
                    "(1) Calculadora Matemática" +
                    "(2) IMC" +
                    "(3) ???" +
                    "(4) ???");
            escolhaUsuario = scanner.nextShort();
            if(escolhaUsuario == 1){
                CalculadoraInicio.calcIniciar(); // chamando a classe calcIniciar()
            } else if (escolhaUsuario == 2) {
                System.out.println("imc n ta pronto n, Luan n quer trabalhar");
            } else if (escolhaUsuario == 3) {
                Circuference.circuIniciar();
            }

    }
}