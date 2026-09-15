import java.util.Scanner;

public class Projetocadastro {

    public static void main(String[] args) {

        try (Scanner text = new Scanner(System.in)) {
            String[] nomes = new String[2];// arrays para armazenar os nomes dos usuários
            
            System.out.println("Cadastro de nomes");
            
            for (int i = 0; i < nomes.length; i++) {
                System.out.print("Digite o nome do usuário " + (i + 1) + ": ");
                nomes[i] = text.nextLine();
            }
            
            System.out.println("Nomes cadastrados:");
            for (String n : nomes) {
                System.out.println(n);
            }
            
            
            System.out.println("Digite o nome do usuário que deseja buscar: ");
            String nomeBusca = text.nextLine();
            String encontrado = null;
            for (String p : nomes) {
                if (p.equalsIgnoreCase(nomeBusca)) {
                    encontrado = p;
                    break;
                }
            }
            
            if (encontrado != null) {
                System.out.println("Usuário encontrado: " + encontrado);
            } else {
                System.out.println("Usuário não encontrado.");
            }
        } // arrays para armazenar os nomes dos usuários




    }
}