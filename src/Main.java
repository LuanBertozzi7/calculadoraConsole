import java.util.Scanner;
import calculadora.CalculadoraInicio;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraInicio Calculadora = new CalculadoraInicio();
        short escolhaUsuario;
            System.out.println("" +
                    "### Calculadora ###" +
                    "(1) Calculadora Matemática" +
                    "(2) IMC" +
                    "(3) ???" +
                    "(4) ???");
            escolhaUsuario = scanner.nextShort();
            if(escolhaUsuario == 1){
                CalculadoraInicio.calcIniciar(); // chamando a classe calcIniciar()
            }
    }
}