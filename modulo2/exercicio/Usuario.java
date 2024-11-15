public class Usuario{
  private int idade;
  private Emprestimo[] historicoEmprestimos;

  //constructor
  public Usuario(String nome, Int idade){
    super(nome);
    this.idade = idade;
  }
 
  //getters
  public Int getIdade(){
    return this.idade;
  } 
  
  public Emprestimos[] getHistoricoEmprestimos(){
    return this.historicoEmprestimos;
  }
}
