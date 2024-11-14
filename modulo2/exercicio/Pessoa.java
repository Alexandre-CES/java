protected class Pessoa{
  private String nome;
  private Livro[] livros;
  private int quantidadeMaxLivros;
  
  protected String getNome(){
    return this.nome;
  }
  
  protected String[] getLivros(){
    return this.livros;
  }

  protected void setLivros(Livro[] livros){
    this.livros = livros;
  }

}
