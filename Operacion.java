public class Operacion{
  public static void main(String args[]){
    int operacion = 5;
    int num1 = 8;
    int num2 = 4;
    int resultado = 0;

    if(operacion == 1){
	resultado = num1+num2;
    }else if(operacion == 2){
	resultado = num1-num2;
    }else if(operacion == 3){
	resultado = num1*num2;
    }else if(operacion == 4){
	resultado = num1/num2;
    }

    if(operacion > 4 || operacion <= 0 ){
      System.out.println("La operación elegida no existe");
    }else{
      System.out.println("el resultado de la operación fue: "+resultado);
    }
  }
}