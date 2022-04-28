import javax.swing.*;
import java.awt.event.*;

public class Interfaz2 extends JFrame implements ActionListener{
 private JTextField textField1;
 private JTextArea txtArea1;
 private JScrollPane scrollPane;
 private JButton btnAdd;
 
 String texto = "";
 public  Interfaz2(){
   setLayout(null);

   textField1 = new JTextField();
   textField1.setBounds(10,10, 200,30);
   add(textField1);

   btnAdd = new JButton("Agregar"); 
   btnAdd.setBounds(250,10, 100, 30);
   add(btnAdd);
   btnAdd.addActionListener(this);

   txtArea1 = new JTextArea();  
   scrollPane = new JScrollPane(txtArea1); 
   scrollPane.setBounds(10,50,400,300);
   add(scrollPane);
 }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == btnAdd){
     texto+= textField1.getText()+"\n";
     textField1.setText("");
     txtArea1.setText(texto);
   }
 }



 public static void main(String args[]){
   Interfaz2 form = new Interfaz2();
   form.setBounds(0,0, 540,400);
   form.setVisible(true);
   form.setLocationRelativeTo(null);
   form.setResizable(false);
 }
}