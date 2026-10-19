import java.util.ArrayList;

public class Teste
{
    public static void iniciarTeste(String nomeDoTeste) {
        System.out.println("O teste iniciou - " + nomeDoTeste);
    }
    
    public static void fimTeste(String nomeDoTeste) {
        System.out.println("Fim do teste - " + nomeDoTeste + ".\n");
    }
    
    public static void mensagemDoValidarTeste(String nomeDoTeste, boolean resultadoDoTeste) {
        if(resultadoDoTeste) {
            System.out.println("Okay: o teste - " +  nomeDoTeste + " passou.");
        } else {
            System.out.println("Okay: o teste - " +  nomeDoTeste + " não passou.");
        }
    }
} 