package calculadora;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

public class CalculadoraHistorico {

    private static ArrayList<String> historico = new ArrayList<>();
    private static final String HISTORICOJSON = "historico.json";


    //adiciona uma operação ao arrayList de historico
    public static void adicionar(String escolhaUsuarioOperacao, int primeiroNumero, int segundoNumero, int resultado){
        historico.add(primeiroNumero + " " + escolhaUsuarioOperacao + " " + segundoNumero + " = " + resultado);
        System.out.println("Adicionado ao historico");
    }

    // percorre o arrayList historico, e mostra todo o historico
    public static void mostrarHistorico() {
        if (historico.isEmpty()) {
            System.out.println("Não há historico...");
        } else { // metodo para acessar todo o historico do array, usando um for-each
            for (String i : historico) {
                System.out.println(historico);
            }
        }
    }

    // limpa o historico
    public static void limparHistorico(){
            historico.clear();
            System.out.println("Historico Limpo...");
    }


    public static void salvarJSON(){
        Gson gson = new GsonBuilder().disableHtmlEscaping().create();
        String json = gson.toJson(historico);


        try(FileWriter writer = new FileWriter(HISTORICOJSON)) {
            writer.write(json);
            System.out.println("Histórico salvo em "+ HISTORICOJSON);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
