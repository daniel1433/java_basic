import javax.swing.*;

public class PruebaTextArea extends JFrame{
 private JTextField textfield1;
 private JTextArea textarea1;

 public PruebaTextArea(){
  setLayout(null);
  textfield1 = new JTextField();
  textfield1.setBounds(10,10,200,30);
  add(textfield1);
  textarea1 = new JTextArea();
  textarea1.setBounds(10, 50, 400, 300);
  add(textarea1);
 }


 public static void main(String args[]){
   PruebaTextArea form = new PruebaTextArea();
   form.setBounds(0,0,540,400);
   form.setLocationRelativeTo(null);
   form.setVisible(true);
   form.setResizable(false);
 }

}