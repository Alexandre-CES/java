public class Pessoa {
    private int idade;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida. A idade deve estar  entre 0 e 120 anos.");
        }
    }
}
