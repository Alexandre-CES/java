class Usuario extends Pessoa {
    private String matricula;
    
    public void setMatricula(String matricula){
      this.matricula = matricula;
    }
    
    public String getMatricula(){
      return this.matricula;
    }

    void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + getMatricula());
        System.out.println("Pais: " + getPais());
    }
}
