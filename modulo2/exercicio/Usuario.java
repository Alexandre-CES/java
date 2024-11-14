public class Usuario{
  private int idade;
  private Emprestimo[] historicoEmprestimos;
  
  public Usuario(String nome, Int idade){
    super(nome);
    this.idade = idade;
  }
 
  public Int getIdade(){
    return this.idade;
  } 
  
  public Emprestimos[] getHistoricoEmprestimos(){
    return this.historicoEmprestimos;
  }
}
