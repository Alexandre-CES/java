public class Autor extends Pessoa{
  private String nacionalidade;
  
  public String getNacionalidade(){
    return this.nacionalidade;
  }
  
  public String[] getObrasPublicadas(){
    return this.getLivros();
  }
  
  public String[] getObrasPublicadasPorGenero(String genero){
    
  }
}
