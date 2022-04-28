public class Promedio{
  public static void main(String args[]){
  int math = 8;
  int biog = 8;
  int quim = 8;
  int promedio = 0;

  promedio = (math+biog+quim)/3;
  if(promedio >= 6){
    System.out.println("El alumno aprobo en: "+promedio);
  }else{
    System.out.println("El alumno reprobo en: "+promedio);
  }
 }
}