import java.util.Scanner;

public class ValidString{
  public static void main(String args[]){
  String name1 = "";
  String name2 = "";
  Scanner in = new Scanner(System.in);

  System.out.println("Ingrese el primer nombre a comparar");
  name1 = in.nextLine();
  System.out.println("Ingrese el segundo nombre a comparar");
  name2 = in.nextLine();

  if(name1.toLowerCase().equals(name2.toLowerCase())){
    System.out.println("Los nombres "+name1+" y "+name2+", son iguales");
  }else{
    System.out.println("Los nombres "+name1+" y "+name2+", son diferente");
  }
 }
}