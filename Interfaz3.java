import javax.swing.*;
import java.awt.event.*;

public class Interfaz3 extends JFrame implements ActionListener{
 private JLabel value1; 
 private JTextField textField1;
 private JLabel value2;
 private JTextField textField2;
 private JLabel result;
 private JLabel resultNumber;
 private JButton btnSumar;
 private JButton btnClean;
 
 public Interfaz3(){
   setLayout(null);
   value1 = new JLabel("Valor 1");
   value1.setBounds(20, 10,80, 30);
   add(value1);

   textField1 = new JTextField();
   textField1.setBounds(115, 10, 130, 30);
   textField1.setHorizontalAlignment(SwingConstants.RIGHT);
   add(textField1);

   value2 = new JLabel("Valor 2");
   value2.setBounds(20, 50, 80, 30);
   add(value2);

   textField2 = new JTextField();
   textField2.setBounds(115, 50, 130,30);
   textField2.setHorizontalAlignment(SwingConstants.RIGHT);
   add(textField2);

   btnSumar = new JButton("Sumar");
   btnSumar.setBounds(20,130, 107, 30);
   add(btnSumar);
   btnSumar.addActionListener(this);

   btnClean = new JButton("Limpiar");
   btnClean.setBounds(136, 130, 107, 30);
   add(btnClean);
   btnClean.addActionListener(this);

   result = new JLabel("Resultado:");
   result.setBounds(20, 90, 100, 30);
   add(result);

   resultNumber = new JLabel("0");
   resultNumber.setBounds(115, 90, 130, 30);
   resultNumber.setHorizontalAlignment(SwingConstants.RIGHT);
   add(resultNumber);
 }
 
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == btnSumar){
     int n1;
     int n2;
     try{
      n1 = Integer.parseInt(textField1.getText().trim());
     }catch(Exception x){
      n1 = 0;
     }
     try{
      n2 = Integer.parseInt(textField2.getText().trim());
     }catch(Exception x){
      n2 = 0;
     }

     resultNumber.setText(""+(n1+n2));
     textField1.setText("");
     textField2.setText("");
     System.out.println("Sumando ando");
    }

   if(e.getSource() == btnClean){
     resultNumber.setText("");       
   }
  }
 

 public static void main(String[] args){
   Interfaz3 form = new Interfaz3();
   form.setBounds(0,0, 300, 230);
   form.setLocationRelativeTo(null);
   form.setVisible(true);
   form.setResizable(false);
 }
}