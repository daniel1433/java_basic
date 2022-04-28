import javax.swing.*;
import java.awt.event.*;

public class Formulario5 extends JFrame implements ActionListener{
  private JLabel label;
  private JButton btn;
  private JButton btn1;
  private JButton btn2;


  public Formulario5(){
    setLayout(null);
    label = new JLabel("En espera....");
    label.setBounds(10, 50, 300, 50);
    btn = new JButton("1");
    btn.setBounds(10, 200, 80, 50);
    btn1 = new JButton("2");
    btn1.setBounds(120, 200, 80, 50);
    btn2 = new JButton("3");
    btn2.setBounds(230, 200, 80, 50);
    add(label);
    add(btn);
    add(btn1);
    add(btn2);
    btn.addActionListener(this);
    btn1.addActionListener(this);
    btn2.addActionListener(this);

 }

  public void actionPerformed(ActionEvent e){
    if(e.getSource() == btn){
      label.setText(("Has presionado "+1));
    }
    if(e.getSource() == btn1){
      label.setText(("Has presionado "+2));
    }
    if(e.getSource() == btn2){
      label.setText(("Has presionado "+3));
    }
 }

  public static void main(String args[]){
    Formulario5 frm = new Formulario5();
    frm.setBounds(0,0, 350,350);
    frm.setLocationRelativeTo(null);
    frm.setVisible(true);
    frm.setResizable(false);
 }
}