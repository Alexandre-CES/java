import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    
    Teste teste = new Teste();

    String[] stringArray = new String[]{"a","b","c"};
    teste.setListaTeste(stringArray);

    String[] lista = teste.getListaTeste();

    System.out.printIn(Arrays.toString(lista));
  }
}