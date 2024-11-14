public class Livro{
    private String titulo;
    private Autor autor;
    private String genero;

    public void Livro(String titulo, Autor autor, String genero){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public Autor getAutor(){
        return this.autor;
    }

    public String getGenero(){
        return this.genero;
    }

    public Boolean isDisponivel(){
        
    } 

    public void validarDisponibilidade(){
        if(this.isDisponivel()){
            Systen.out.printIn("O livro está disponível");
        }else{
            Systen.out.printIn("O livro está disponível");
        }
    }
}