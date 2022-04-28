import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;

class Calculadora extends JFrame implements ActionListener{
  private JLabel result;
  private Box box;
  private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta, btnDivision, btnMultip, btnPorc, btnDelete, btnResult, btnC, btnCE, btnP, btnX;
  private int incH = 55;
  private int incV = 55;
  private int size = 50;
  private double n1 = 0;
  private double n2 = 0;
  private String operation = "";
  private boolean cleanLabel = false;
  private boolean isDouble = false;



  public Calculadora(){
    setLayout(null);
    result = new JLabel("0");
    result.setHorizontalAlignment(SwingConstants.RIGHT);
    result.setBackground( Color.RED );
    result.setBounds(-30, 10, 300, 50);
    add(result);

   // Fila 1

    btn1 = new JButton("1");
    btn1.setBounds((1*incH), (1*incV), size, size);
    add(btn1);
    btn1.addActionListener(this);

    btn2 = new JButton("2");
    btn2.setBounds((2*incH), (1*incV), size, size);
    add(btn2);
    btn2.addActionListener(this);

    btn3 = new JButton("3");
    btn3.setBounds((3*incH), (1*incV), size, size);
    add(btn3);
    btn3.addActionListener(this);

    btnC = new JButton("C");
    btnC.setBounds((4*incH), (1*incV), size, size);
    add(btnC);
    btnC.addActionListener(this);

   // Fila 2 

    btn4 = new JButton("4");
    btn4.setBounds((1*incH), (2*incV), size, size);
    add(btn4);
    btn4.addActionListener(this);

    btn5 = new JButton("5");
    btn5.setBounds((2*incH), (2*incV), size, size);
    add(btn5);
    btn5.addActionListener(this);

    btn6 = new JButton("6");
    btn6.setBounds((3*incH), (2*incV), size, size);
    add(btn6);
    btn6.addActionListener(this);

    btnCE= new JButton("CE");
    btnCE.setBounds((4*incH), (2*incV), size, size);
    add(btnCE);
    btnCE.addActionListener(this);

    // Fila 3

    btn7 = new JButton("7");
    btn7.setBounds((1*incH), (3*incV), size, size);
    add(btn7);
    btn7.addActionListener(this);

    btn8 = new JButton("8");
    btn8.setBounds((2*incH), (3*incV), size, size);
    add(btn8);
    btn8.addActionListener(this);

    btn9 = new JButton("9");
    btn9.setBounds((3*incH), (3*incV), size, size);
    add(btn9);
    btn9.addActionListener(this);

    btnDelete = new JButton("<-");
    btnDelete.setBounds((4*incH), (3*incV), size, size);
    add(btnDelete);
    btnDelete.addActionListener(this);

    // FILA 4

    btnSuma = new JButton("+");
    btnSuma.setBounds((1*incH), (4*incV), size, size);
    add(btnSuma);
    btnSuma.addActionListener(this);

    btn0 = new JButton("0");
    btn0.setBounds((2*incH), (4*incV), size, size);
    add(btn0);
    btn0.addActionListener(this);

    btnResta = new JButton("-");
    btnResta.setBounds((3*incH), (4*incV), size, size);
    add(btnResta);
    btnResta.addActionListener(this);

    btnP = new JButton(".");
    btnP.setBounds((4*incH), (4*incV), size, size);
    add(btnP);
    btnP.addActionListener(this);

   // Fila 5
    btnMultip = new JButton("*");
    btnMultip.setBounds((1*incH), (5*incV), size, size);
    add(btnMultip);
    btnMultip.addActionListener(this);

    btnDivision = new JButton("/");
    btnDivision.setBounds((2*incH), (5*incV), size, size);
    add(btnDivision);
    btnDivision.addActionListener(this);

    btnPorc = new JButton("%");
    btnPorc.setBounds((3*incH), (5*incV), size, size);
    add(btnPorc);
    btnPorc.addActionListener(this);

    btnResult = new JButton("=");
    btnResult.setBounds((4*incH), (5*incV), size, size);
    add(btnResult);
    btnResult.addActionListener(this);

    btnX= new JButton("X");
    btnX.setBackground(Color.RED);
    btnX.setBounds((1*incH), (6*incV), 4*size+(4*4), size);
    add(btnX);
    btnX.addActionListener(this);


 }    

 public void actionPerformed(ActionEvent e){
    String res = result.getText();
    if(e.getSource() == btn0){
	addNum(result.getText(),0);
    }
    if(e.getSource() == btn1){
	addNum(result.getText(),1);
    }
    if(e.getSource() == btn2){
	addNum(result.getText(),2);
    }
    if(e.getSource() == btn3){
	addNum(result.getText(),3);
    }
    if(e.getSource() == btn4){
	addNum(result.getText(),4);
    }
    if(e.getSource() == btn5){
	addNum(result.getText(),5);
    }
    if(e.getSource() == btn6){
	addNum(result.getText(),6);
    }
    if(e.getSource() == btn7){
	addNum(result.getText(),7);
    }
    if(e.getSource() == btn8){
	addNum(result.getText(),8);
    }
    if(e.getSource() == btn9){
	addNum(result.getText(),9);
    }

    if(e.getSource() == btnP){
      if(res == ""){
        result.setText("0.");
      }else{
        result.setText(res+".");
      }
    }

   if(e.getSource() == btnCE){
      result.setText("");     
      operation = "";
      n1 = 0;
      n2 = 0;
   }

   if(e.getSource() == btnPorc){
       operation = "%";
       result.setText("");
   }

   if(e.getSource() == btnMultip){
       operation = "*";
       cleanLabel = true;
   }

   if(e.getSource() == btnDivision){
       operation = "/";
       cleanLabel = true;
   }

   if(e.getSource() == btnResta){
       operation = "-";
       cleanLabel = true;
   }

   if(e.getSource() == btnSuma){
       operation = "+";
       cleanLabel = true;
   }

  if(e.getSource() == btnResult){
       n1 = exeOperation();
       n2 = 0;
       operation = "";
       result.setText(""+n1);     
  }
  if(e.getSource() == btnDelete){
   String value = result.getText();
   if(operation != ""){
     result.setText(value.substring(0,value.length()-1));
     if(result.getText() == ""){
       n2 = 0;
     }else{
       n2 = Double.parseDouble(result.getText());
     }
   }else{
     result.setText(value.substring(0,value.length()-1));
     if(result.getText() == ""){
       n1 = 0;
     }else{
       n1 = Double.parseDouble(result.getText());
     }   
   }
  }

  if(e.getSource() == btnC){
    result.setText("");
    if(operation != ""){
      n2 = 0;
    }else{
      n1 = 0; 
    }
  }

  if(e.getSource() == btnX){
    System.exit(0);
  }
 }

  public void addNum(String res, int newValue){
   System.out.println("Test "+operation+" - "+res+" - "+newValue);
   if (res == "0" || res == "0.0") {
      res = "";
   }  

   if(cleanLabel == true){
     result.setText("");   
     res = ""+newValue;
     cleanLabel=false;
   }else{
     res+= newValue;
   }

   System.out.println("Test result "+operation+" - "+res+" - "+newValue);
   if(operation != ""){
        n2 = Double.parseDouble(res);
        result.setText(""+res);
   }else{
        n1 = Double.parseDouble(res);
        result.setText(""+res);
   }
  }


  public double exeOperation(){
   switch(operation){
    case "+":
      return suma();
    case "-":
      return resta();
    case "*":
      return multuplica();
    case "/":
      return divide();
    case "%":
       n1 = porcentaje();
       n2 = 0;
       operation = "";
       result.setText(""+n1);     
      return 0;
    default:
      return n1;
  }
 }



  public double suma(){
   return n1+n2;
 }

  public double resta(){
   return n1-n2;
 }

  public double multuplica(){
   return n1*n2;
 }

  public double divide(){
   return n1/n2;
 }

 public double porcentaje(){
   if(n1 == 0){
     return n1;
   }else{
     return n1/100;
   }

 }

 public static void main(String args[]){
    Calculadora frm = new Calculadora();
    frm.setBounds(0,0,350,460);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
 }
}