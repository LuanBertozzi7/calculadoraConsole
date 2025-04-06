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
                    "\n(1) Calculadora Matemática" +
                    "\n(2) IMC" +
                    "\n(3) Circuferência" +
                    "\n(4) ???");
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