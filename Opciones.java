import java.util.Scanner;

public class Opciones{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   String operacion = "";
   int num1 = 0, num2 = 0, resultado = 0;
   
   System.out.println("Ingrese el tipo de operación a realizar");
   operacion = in.nextLine();
   System.out.println("Ingrese el primer número");
   num1 = in.nextInt();
   System.out.println("Ingrese el sgundo número");
   num2 = in.nextInt();

   switch(operacion){
    case "+":
     resultado = num1+num2;
    break;
    case "-":
     resultado = num1-num2;
    break;
    case "*":
     resultado = num1*num2;
    break;
    case "/":
     resultado = num1/num2;
    break;
    default:
         System.out.println("Operación no definida");
     break;
  }

   System.out.println("El resultado es: "+resultado);
 }
}