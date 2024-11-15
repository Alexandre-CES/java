/* *classe feita para ser herdada por Usuario e Autor
  
  suas propriedades serão privadas e seus métodos serão protegidos*/
  
protected class Pessoa{
  private String nome;
  private Livro[] livros;
  private int quantidadeMaxLivros;
  
  //getters
  protected String getNome(){
    return this.nome;
  }
  
  protected String[] getLivros(){
    return this.livros;
  }
  
  protected int getQuantidadeMaxLivros(){
    return this.quantidadeMaxLivros;
  }

  //setters
  protected void setLivros(Livro[] livros){
    this.livros = livros;
  }
  
  protected void setQuantidadeMaxLivros(int quantidade){
    this.quantidadeMaxLivros = quantidade;
  }

}
