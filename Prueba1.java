public class Prueba1{
 public static void main(String args[]){
   System.out.println("Primer ejercicio");
   for(int i = 1; i <= 10; i++){
     if(i == 10){
       System.out.print(i);
     }else {
       System.out.print(i+",");
     }
  }
   System.out.println("");   
   System.out.println("Segundo ejercicio");
   int total = 100;
   for(int i = 1; i <= 5; i++ ){
     if(i== 5){
       System.out.print(i+","+(total-i));
     }else{
       System.out.print(i+","+(total-i)+",");
     }
   }

   System.out.println("");   
   System.out.println("Tercer ejercicio");
   int n = 0;
   int x = 1;
   for(int i = 0; i <= 7; i++ ){
     if(i== 0){
       System.out.print(n+","+x);
     }
     if(i%2 == 0){
      n = n+x;
      System.out.print(","+n);
     }else{
      x = n+x;
      System.out.print(","+x);
     }
   }   

   byte xx = 25;
   char ww = 25;
 }
}