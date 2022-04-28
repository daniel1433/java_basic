public class Bucle{
  public static void main(String args[]){
  System.out.println("For");  
  for(int i = 0; i <= 5; i++){
   System.out.print(i+", ");
  }

  System.out.println("");  
  System.out.println("While");  
  int n = 0;
  while(n <10){
    System.out.print(n+", ");
    n++;
  }

  System.out.println("");   
  System.out.println("Do While");  
  int p = 1000;
  do{
   System.out.print(p+", ");
   p-=100;
  }while(p >= 0);
 }
}