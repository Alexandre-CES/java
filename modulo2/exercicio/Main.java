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

    SimpleDateFormat formato = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy");
    Date dataRetirada = formato.parse("Wed May 08 23:37:21 BRT 2024");
    Date dataDevolucao = formato.parse("Wed May 08 23:37:21 BRT 2024");

    Emprestimo emprestimo = new Emprestimo(livro, usuario, dataRetirada, dataDevolucao);

    

  }
}
