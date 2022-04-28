import javax.swing.*;
import java.awt.event.*;

public class Formulario4 extends JFrame implements ActionListener{
  private JButton btn;

  public Formulario4(){
   setLayout(null);
   btn = new JButton("Cerrar");   
   btn.setBounds(300, 250, 100,30);
   add(btn);
   btn.addActionListener(this);
 }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == btn){
    System.exit(0);
  }
 }

  public static void main(String args[]){
    Formulario4 frm = new Formulario4();
    frm.setBounds(0,0, 500,500);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
 }
}