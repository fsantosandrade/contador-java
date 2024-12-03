import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número:");
        int paranetroUm = terminal.nextInt();
        System.out.println("Digite o segundo número:");
        int paranetroDois = terminal.nextInt();

        try {
            contar(paranetroUm, paranetroDois);
        }catch(ParametrosInvalidosException e) {
            System.err.println(e + ": O segundo parâmetro deve ser maior que o primeiro");
        }
        terminal.close();
    }

    static void contar(int parm1, int param2) throws ParametrosInvalidosException {
        if(param2 < parm1) {
            throw new ParametrosInvalidosException();
        }

        int contagem = param2 - parm1;
        for(int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número: " + (i + 1));
        }
    }
}
