package calculadora;


import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;

import java.util.Scanner;
import java.util.ArrayList;

public class CalculadoraHistorico {

    private static ArrayList<String> historico = new ArrayList<>();
    static Gson gson = new Gson(); // json
    static String json = gson.toJson(historico);

    public static void adicionar(String escolhaUsuarioOperacao, int primeiroNumero, int segundoNumero, int resultado){
        historico.add(primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
    }

    public static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Não há historico...");
        } else { // metodo para acessar todo o historico do array, usando um for-each
            for (String i : historico) {
                System.out.println(historico);
            }
        }
    }
    public static void limparHistorico(){
            historico.clear();
            System.out.println("Historico Limpo...");
        }

    public static void salvarArquivoJson() {
    try (FileWriter writer = new FileWriter("historico.json")){
        writer.write(json);
        System.out.println(".json salvo");
    } catch (IOException e){
        e.printStackTrace();
        }
    }
}
