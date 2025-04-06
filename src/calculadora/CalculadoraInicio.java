package calculadora;

import calculadora.CalculadoraHistorico;

import java.util.Scanner;

public class CalculadoraInicio {
    public static void calcIniciar() {
        Scanner scanner = new Scanner(System.in);


        CalculadoraHistorico historico = new CalculadoraHistorico();
        
        String escolhaUsuarioOperacao;
        int resultado = 0;
        int primeiroNumero;
        int segundoNumero;

        while(true){

            System.out.println("" +
                    "\nQual operação deseja? " +
                    "\n(+) Somar" +
                    "\n(-) Subtrair" +
                    "\n(*) Multiplicar" +
                    "\n(/) Dividir" +
                    "\n(SAIR) Sair da calculadora matemática");

                escolhaUsuarioOperacao = scanner.next();
                if(escolhaUsuarioOperacao.equals("SAIR")){
                    System.out.println("Saindo...");
                    break; // encerra o loop while
                }
            System.out.println("Escolha Dois Números:");
            System.out.println("Primeiro Número:");
            primeiroNumero = scanner.nextInt();
            System.out.println("Segundo Número");
            segundoNumero = scanner.nextInt();

                switch (escolhaUsuarioOperacao){
                    case "+":
                        resultado = primeiroNumero + segundoNumero;
                        System.out.println("Resultado: " + primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
                        break;
                    case "-":
                        resultado = primeiroNumero - segundoNumero;
                        System.out.println("Resultado: " + primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
                        break;
                    case "*":
                        resultado = primeiroNumero * segundoNumero;
                        System.out.println("Resultado: " + primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
                        break;
                    case "/":
                        resultado = primeiroNumero / segundoNumero;
                        System.out.println("Resultado: " + primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
                        break;
                    default:
                        System.out.println("operação inválida...");
                }
                
                historico.adicionar(escolhaUsuarioOperacao, primeiroNumero, segundoNumero, resultado);
                historico.mostrarHistorico();
                
        }
    }
}
