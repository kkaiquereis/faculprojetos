
import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            String resposta = "sim";
    
            
            while (resposta.equalsIgnoreCase("sim")) {
                
                System.out.println("Nome da atividade que deseja adicionar:");
                String atividadeAdicionada = ler.nextLine();
                
                System.out.println("Qual a dificuldade da atividade? (1) Fácil (2) Médio (3) Difícil");
                int dificuldade = ler.nextInt();
                
                while (dificuldade < 1 || dificuldade > 3) {
                    System.out.println("Dificuldade inválida, por favor escolha novamente.");
                    dificuldade = ler.nextInt();
                }
                ler.nextLine(); // limpa a quebra de linha deixada pelo nextInt()
                
                if (dificuldade == 1) {
                    System.out.println("A atividade " + atividadeAdicionada + " foi adicionada com dificuldade fácil.");
                } else if (dificuldade == 2) {
                    System.out.println("A atividade " + atividadeAdicionada + " foi adicionada com dificuldade média.");
                } else {
                    System.out.println("A atividade " + atividadeAdicionada + " foi adicionada com dificuldade difícil.");
                }
                
                System.out.println("Deseja adicionar mais uma atividade? (sim/não)");
                resposta = ler.nextLine();
            }
            
            System.out.println("Ok, não será adicionado mais atividades.");
        }
    }
}