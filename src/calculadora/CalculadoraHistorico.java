package calculadora;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraHistorico {
    private static ArrayList<String> historico = new ArrayList<>();

    public static void adicionar(String escolhaUsuarioOperacao, int primeiroNumero, int segundoNumero, int resultado){
        historico.add(primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
    }

    public static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Não há historico...");
        } else {
            for (String i : historico) {
                System.out.println(historico);
            }
        }
    }
    public static void limparHistorico(){
            historico.clear();
            System.out.println("Historico Limpo...");
        }
}
