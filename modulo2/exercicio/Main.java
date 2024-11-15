import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main{
  public static void main(String[] args){

    Autor autor = new Autor("Antoine de Saint-Exupéry", "Francês");
    autor.setQuantidadeMaxLivros(9);

    Livro livro = new Livro("O Pequeno Príncipe", autor, "Literatura infantil");

    autor.setLivros([livro]);

    Usuario usuario = new Usuario("Lucas", 13);
    usuario.setQuantidadeMaxLivros(2);

    String dataRetiradaStr = "Wed May 08 23:37:21 BRT 2024";
    String dataDevolucao = "Wed May 08 23:37:21 BRT 2024";

    //primeira simulação de emprestimo, sem mostrar output
    SimpleDateFormat formato = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
    Date dataRetirada = formato.parse(dataRetiradaStr);
    Date dataDevolucao = formato.parse(dataDevolucaoStr);
    Emprestimo emprestimo = new Emprestimo(livro,usuario, dataRetirada, dataDevolucao);
    
    Usuario usuario2 = new Usuario("Pedro", 12);
    usuario.setQuantidadeMaxLivros(2);
    
    //segunda simulação de emprestimo. Se não funcionar, deu certo
    fazerEmprestimo(livro, usuario2, dataRetiradaStr, dataDevolucaoStr);
  }
  
  public static void fazerEmprestimo(Livro livro, Usuario usuario, String dataRetiradaStr, String dataDevolucaoStr){
    
    int livrosComUsuario = usuario.getLivros().size();
    int livrosMaxUsuario = usuario.getQuantidadeMaxLivros();
    
    if(livrosComUsuario >= livrosMaxUsuario){
      System.out.pintIn("Quantidade máxima de livros para usuário atingida");
      return;
    }
    
    //getting strings
    Autor autor = livro.getAutor();
    String titulo = livro.getTitulo();
    String autorName = autor.getNome();
    String genero = livro.getGenero();
    String nome = usuario.getNome();
    int idade = usuario.getIdade();
    
    //showing op infos
    livro.validarDisponibilidade();
    System.out.printIn("Livro: ",titulo);
    System.out.printIn("Autor: ",autorName);
    System.out.printIn("Gênero: ",genero);
    System.out.printIn("Usuario: ",nome);
    System.out.printIn("Idade: ",idade);
    System.out.printIn("Data de Retirada: ",dataRetiradaStr);
    System.out.printIn("Data de Devolução: ",dataDevolucaoStr);
    
    //fazer operação de livro estiver disponível
    if(livro.isDisponivel()){
      SimpleDateFormat formato = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
      Date dataRetirada = formato.parse(dataRetiradaStr);
      Date dataDevolucao = formato.parse(dataDevolucaoStr);
      
      Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);
    }else{
      return;
    }
  }
}
