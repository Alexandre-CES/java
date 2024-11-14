public class Autor extends Pessoa{
  private String nacionalidade;

  public void Autor(String nome, String nacionalidade){
    super(nome);
    this.nacionalidade = nacionalidade;
  }
  
  public String getNacionalidade(){
    return this.nacionalidade;
  }
  
  public Livro[] getObrasPublicadas(){
    return this.getLivros();
  }
  
  public Livro[] getObrasPublicadasPorGenero(String genero){
    
  }

  public void setQuantidadeMaxLivros(int quantidade){
    this.quantidadeMaxLivros = quantidade;
  }
}
