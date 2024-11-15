public class Autor extends Pessoa{
  private String nacionalidade;

  //constructor
  public void Autor(String nome, String nacionalidade){
    super(nome);
    this.nacionalidade = nacionalidade;
  }
  
  //getters
  public String getNacionalidade(){
    return this.nacionalidade;
  }
  
  public Livro[] getObrasPublicadas(){
    return this.getLivros();
  }
  
  public Livro[] getObrasPublicadasPorGenero(String genero){
    
  }
}
