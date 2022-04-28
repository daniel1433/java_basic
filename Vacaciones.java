import java.util.Scanner;

public class Vacaciones{
  public static void main(String args[]){
  Scanner in = new Scanner(System.in);

  String  nombre = "";
  int antiguedad = 0, clave = 0;
  System.out.println("*******************************************************");
  System.out.println("*Bienvenido al sistema vacacional de Coca-Cola Company*");
  System.out.println("*******************************************************");
  System.out.println("");
  System.out.println("");
  System.out.println("Por favor digite su nombre: ");
  nombre = in.nextLine();	
  System.out.println("");
  System.out.println("Ingrese 1 si pertenece a atención al cliente, 2 si pertenece a logistica y 3 si pertenece a Gerencia");
  System.out.println("¿Cual es la clave de su departamento?");
  clave = in.nextInt();
  System.out.println("");
  System.out.println("Por favor ingrese la cantidad de años trabajados");
  antiguedad = in.nextInt();
  System.out.println("");
  System.out.println("*****************************************************************************************");
  if(clave == 1){
    if(antiguedad <= 1){
       System.out.println(nombre+"clave 1, tiene "+antiguedad+" años de servicio Merece 6 dias de vacaciones");	
    }else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println(nombre+"clave 1, tiene "+antiguedad+" años de servicio Merece 14 dias de vacaciones");	
    }else if(antiguedad >= 7){
       System.out.println(nombre+"clave 1, tiene "+antiguedad+" años de servicio Merece 20 dias de vacaciones");	
    }else {
       System.out.println("Usted no tiene derecho a vacaciones");	
    }
  }else if(clave == 2){
    if(antiguedad <= 1){
       System.out.println(nombre+"clave 2, tiene "+antiguedad+" años de servicio Merece 7 dias de vacaciones");	
    }else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println(nombre+"clave 2, tiene "+antiguedad+" años de servicio Merece 15 dias de vacaciones");	
    }else if(antiguedad >= 7){
       System.out.println(nombre+"clave 2, tiene "+antiguedad+" años de servicio Merece 22 dias de vacaciones");	
    }else {
       System.out.println("Usted no tiene derecho a vacaciones");	
    }
  }else if(clave == 3){
    if(antiguedad <= 1){
       System.out.println(nombre+"clave 3, tiene "+antiguedad+" años de servicio Merece 10 dias de vacaciones");	
    }else if(antiguedad >= 2 && antiguedad <= 6){
       System.out.println(nombre+"clave 3, tiene "+antiguedad+" años de servicio Merece 20 dias de vacaciones");	
    }else if(antiguedad >= 7){
       System.out.println(nombre+"clave 3, tiene "+antiguedad+" años de servicio Merece 30 dias de vacaciones");	
    }else {
       System.out.println("Usted no tiene derecho a vacaciones");	
    }
  }else{
    System.out.println("La clave ingresada no existe");	
  }
  System.out.println("******************************************************************************************");
 }
}