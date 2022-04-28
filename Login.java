import java.util.Scanner;

public class Login{
  static final String USER = "jd";
  static final String PASSWORD = "12345x";
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);

   System.out.println("Por favor ingrese su usuario: ");
   String userEnter = in.nextLine();
   System.out.println("Por favor ingrese su contraseña: ");
   String passwordEnter = in.nextLine();   
   System.out.println("");	
   if(USER.equals(userEnter) && PASSWORD.equals(passwordEnter)){
     System.out.println("Bienvenido...!");	
   }else{
     System.out.println("Usuario o contraseña incorrectos");	
   }

 }
}