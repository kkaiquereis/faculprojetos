public class pessoa {
    int idade;
    String nome;
    String email;
    int telefone;


    void idadePermetida (int idade) {
        this.idade = idade;
        if (idade >= 18) {
            System.out.println("Idade permitida");
        } else {
            System.out.println("Idade não permitida");
        }
    }

    void nomePessoa (String nome) {
        this.nome = nome;
        System.out.println("Nome: " + nome);
    }

}
