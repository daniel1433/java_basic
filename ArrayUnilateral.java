import java.util.Scanner;

public class ArrayUnilateral{
  public static void main(String args[]){
  Scanner in = new Scanner(System.in);
  System.out.println("Por favor ingrese la longitud del array");
  int largeArray = in.nextInt();
  int arrayItems[] = new int[largeArray];
  for(int i = 0; i < arrayItems.length; i++){
    System.out.println("Por favor ingrese un número para la posición: "+i);
    arrayItems[i] = in.nextInt();
  }

  for(int i = 0; i < arrayItems.length; i++){
    System.out.print("["+arrayItems[i]+"] ");
  }	
 }
}