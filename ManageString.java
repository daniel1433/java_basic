import java.util.Scanner;

public class ManageString{
  public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Ingrese la cadena de texto a evaluar:");
  String word = in.nextLine();
  System.out.println("");  
  System.out.println("Largo: "+word.length());
  System.out.println("Desde:");	
  int desde = in.nextInt();
  System.out.println("Hasta:");	
  int hasta = in.nextInt();
  System.out.println("Cadena recortada: "+word.substring(desde,hasta));
 }
}