import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); // cadastro de nomes
        String[] nomes = new String[2];
        System.out.print("Digite o nome do usuário 1: ");
        String nome = ler.nextLine();
        nomes[0] = nome;
        for (int i = 1; i < nomes.length; i++) {
            System.out.print("Digite o nome do usuário " + (i + 1) + ": ");
            nomes[i] = ler.nextLine();

            System.out.println("Nomes cadastrados:");
            for (String n : nomes) {
                System.out.println(n);
            }
            ler.close();
        }
    }
}