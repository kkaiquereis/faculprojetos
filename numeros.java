import java.util.Scanner;

public class numeros {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("qual tipo de operação: ");
        String operacao = ler.nextLine();

        
        switch (operacao) {
            case "adicao":
                System.out.println("Digite o primeiro número: ");
                int num1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                int num2 = ler.nextInt();
                int resultado = num1 + num2;
                System.out.println("O resultado da adição é: " + resultado);
                break;

            case "subtracao":
                System.out.println("Digite o primeiro número: ");
                int nums1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                int nums2 = ler.nextInt();
                resultado = nums1 - nums2;
                System.out.println("O resultado da subtração é: " + resultado);
                break;

            case "multiplicacao":
                System.out.println("Digite o primeiro número: ");
                int numm1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                int numm2 = ler.nextInt();
                resultado = numm1 * numm2;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;

            case "divisao":
                System.out.println("Digite o primeiro número: ");
                int numd1 = ler.nextInt();
                System.out.println("Digite o segundo número: ");
                int numd2 = ler.nextInt();
                if (numd2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    double resultadoDivisao = (double) numd1 / numd2;
                    System.out.println("O resultado da divisão é: " + resultadoDivisao);
                }
                break;

            default:
                System.out.println("Operação inválida.");
        }

        }
    }