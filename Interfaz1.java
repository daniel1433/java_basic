import javax.swing.*;

public class Interfaz1 extends JFrame{
 private JTextField txtField1;
 private JTextArea txtArea1;
 private JScrollPane scrollPane1;
 
 public Interfaz1(){
  setLayout(null);
  txtField1 = new JTextField();
  txtField1.setBounds(10,10, 200, 30);
  add(txtField1);
  
  txtArea1 = new JTextArea();
  scrollPane1 = new JScrollPane(txtArea1);

  scrollPane1.setBounds(10, 50, 400, 300);
  add(scrollPane1);
 }

 public static void main(String args[]){
  Interfaz1 form1 = new Interfaz1();
  form1.setBounds(0,0,540,400);
  form1.setVisible(true);
  form1.setLocationRelativeTo(null);
  form1.setResizable(false);
 }
  
}