import java.util.Scanner;

public class MatrizDynamic{
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Por favor ingrese la cantidad de filas la matriz: ");
    int rows = in.nextInt();
    System.out.println("Por favor ingrese la cantidad de columnas la matriz: ");
    int columns = in.nextInt();
    int matriz[][] = new int[rows][columns];
    int count = 1;

    for(int  i = 0; i < rows ; i++ ){
      for(int n = 0; n < columns; n++){
        matriz[i][n] = count;
        count++;
        System.out.println("["+matriz[i][n]+"]");
     }
     System.out.print("["+matriz[i][n]+"]");
    }    
 }
}
