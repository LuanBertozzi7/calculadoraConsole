import java.util.Scanner;

import calculadora.CalculadoraHistorico;
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
                    "\n(1) Calculadora Matemática" +
                    "\n(2) IMC" +
                    "\n(3) Circuferência");
            escolhaUsuario = scanner.nextShort();

            if(escolhaUsuario == 1){
                CalculadoraInicio.calcIniciar(); // chamando a classe calcIniciar()
                CalculadoraHistorico.salvarArquivoJson();

            } else if (escolhaUsuario == 2) {
                // IMC

            } else if (escolhaUsuario == 3) {
                Circuference.circuIniciar();
            }

    }
}