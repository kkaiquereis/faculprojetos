
import java.util.ArrayList;
import java.util.Scanner;

public class Estoque {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            ArrayList<String> nomesProdutos = new ArrayList<>();
            ArrayList<Integer> quantidadeProdutosUnidades = new ArrayList<>();
            ArrayList<Integer> quantidadeProdutosCaixas = new ArrayList<>();
            ArrayList<Double> precoProdutos = new ArrayList<>();
            boolean continuar = true;


            System.out.println("Ola, Seja bem-vindo.");

            while (continuar) {
                System.out.println("\nO que deseja fazer?");
                System.out.println("1 - Adicionar produtos");
                System.out.println("2 - Listar produtos");
                System.out.println("3 - Modificar quantidade");
                System.out.println("4 - Modificar valor");
                System.out.println("5 - vender produto");
                System.out.println("6 - quantidade total no estoque");
                System.out.println("7 - valor total do estoque");
                System.out.println("8 - produtos em falta");
                System.out.println("9 - Sair");
                System.out.print("Escolha: ");

                String opcao = ler.nextLine();

                switch (opcao) {
                    case "1" -> {
                        System.out.print("Digite um produto: ");
                        String nomeProduto = ler.nextLine();
                        nomesProdutos.add(nomeProduto);
                        System.out.println("Produto adicionado  com sucesso!");
                        System.out.println("Digite a quantidade do produto");
                        int quantidadeProduto = ler.nextInt();
                        ler.nextLine();// limpa o buffer
                        System.out.println("Quantidade adicionada!");
                        System.out.println("Digite o valor do produto");
                        Double valorProduto = ler.nextDouble();
                        precoProdutos.add(valorProduto);
                        ler.nextLine();// limpa o buffer
                        System.out.println("valor add com sucesso!");

                        quantidadeProdutosUnidades.add(quantidadeProduto);
                    }
                
                    case "2" -> { // arrumar essa porra 
                        if (nomesProdutos.isEmpty()) {
                            System.out.println("Não há produtos no estoque.");
                        } else {
                            for (int i = 0; i < nomesProdutos.size(); i++) {
                                System.out.println("- " + nomesProdutos.get(i) + "("+ quantidadeProdutosUnidades.get(i) + ")" + "(" + precoProdutos.get(i) + ")");
                            }
                        }
                    }
                    case "3" -> {
                        if (nomesProdutos.isEmpty()) {
                            System.out.println("Não há produtos para modificar.");
                        } else {
                            System.out.print("Índice (0 a " + (nomesProdutos.size() - 1) + "): ");
                            int indice = ler.nextInt();
                            ler.nextLine();
                            if (indice >= 0 && indice < nomesProdutos.size()) {
                                System.out.print("Nova quantidade: ");
                                quantidadeProdutosUnidades.set(indice, ler.nextInt());
                                System.out.println("Produto modificada!");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    
                    } case "4" -> {
                        if (nomesProdutos.isEmpty()) {
                            System.out.println("Não há produtos para modificar.");
                        } else {
                            System.out.print("Índice (0 a " + (nomesProdutos    .size() - 1) + "): ");
                            int indice = ler.nextInt();
                            ler.nextLine();
                            if (indice >= 0 && indice < nomesProdutos.size()) {
                                System.out.print("Novo valor: ");
                                precoProdutos.set (indice, ler.nextDouble());
                                ler.nextLine();
                                System.out.println("valor modificado!");
                            } else {
                                System.out.println("Índice inválido.");
                            }
                        }
                    
                    }
                    case "5" -> {
                        if (quantidadeProdutosUnidades.isEmpty()) {
                            System.out.println("Não há protutos cadastrados.");
                        } else {
                            System.out.print("Número do produto a vender: ");
                            int escolha = ler.nextInt();
                            ler.nextLine();
                            if (escolha >= 1 && escolha <= quantidadeProdutosUnidades.size()) {
                                quantidadeProdutosUnidades.set(escolha - 1, 0);
                                System.out.println("Produto vendido!");
                            } else {
                                System.out.println("Número inválido.");
                            }
                        }
                    }
                    case "6"-> {                  
                       int total = 0;
                        for (int i = 0; i < quantidadeProdutosUnidades.size(); i++) {
                         total += quantidadeProdutosUnidades.get(i);
                          }
                           System.out.println("Quantidade total em estoque: " + total);
                    }
                    case "7" -> {
                        double totalValor = 0;
                        for (int i = 0; i < quantidadeProdutosUnidades.size(); i++) {
                            totalValor += quantidadeProdutosUnidades.get(i) * precoProdutos.get(i);
                        }
                        System.out.println("Valor total do estoque: R$ " + totalValor);
                    }
                    case "8" -> {
                        relatorioProdutos(nomesProdutos, quantidadeProdutosUnidades  , precoProdutos, quantidadeProdutosCaixas);
                    }
                    case "9" -> {
                        continuar = false;
                        System.out.println("Encerrando o programa.");
                    }

                    default -> System.out.println("Opção inválida, tente novamente.");
                }
            }
        }
    }

        static void relatorioProdutos( // relatorios dos produtos em falta
            ArrayList<String> nomesProdutos, ArrayList<Integer> quantidadeProdutosUnidades, ArrayList<Double> precoProdutos, ArrayList<Integer> quantidadeProdutosCaixas) {
            System.out.println("Produtos em falta:");
            for (int i = 0; i < nomesProdutos.size(); i++) {
                if (quantidadeProdutosUnidades.get(i) <= 5) {
                    System.out.println("- " + nomesProdutos.get(i) + " (em falta)");
                } else if (quantidadeProdutosUnidades.get(i) == 0) {
                    System.out.println("- " + nomesProdutos.get(i) + " (em falta em unidades)");
                }
            }
        }
    }