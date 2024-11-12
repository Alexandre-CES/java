public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setIdade(150); // Tentando definir uma idade invalida

        System.out.println("Idade da pessoa: " + pessoa.getIdade()); // A idade não foi alterada devido à validação
    }
}

