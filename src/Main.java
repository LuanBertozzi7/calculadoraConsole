import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short escolhaUsuario;
            System.out.println("" +
                    "### Calculadora ###" +
                    "(1) Calculadora Matemática" +
                    "(2) IMC" +
                    "(3) ???" +
                    "(4) ???");
            escolhaUsuario = scanner.nextShort();
            if(escolhaUsuario == 1){
                // vamo chamar a classe calculadora
            }
    }
}