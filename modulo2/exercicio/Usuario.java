public class Usuario{
  private Int idade;
  private Emprestimo[] historicoEmprestimos;
  
  public Usuario(String nome, Int idade){
    this.setNome(nome);
    this.idade = idade;
  }
 
  public Int getIdade(){
    return this.idade;
  } 
  
  public Emprestimos[] getHistoricoEmprestimos(){
    return this.historicoEmprestimos;
  }
}
