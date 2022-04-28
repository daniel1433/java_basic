import javax.swing.*;

public class Formulario3 extends JFrame{
  private JLabel label;
  private JLabel label2;
  public Formulario3(){
    setLayout(null);
    label = new JLabel("Prueba de mi label");
    label2 = new JLabel("Version 1.0");
    label.setBounds(10,20, 300,30);
    label2.setBounds(100,400, 100,30);
    add(label);
    add(label2);
 }

  public static void main(String args[]){
    Formulario3 frm = new Formulario3();
    frm.setBounds(0,0, 300,500);
    frm.setLocationRelativeTo(null);
    frm.setVisible(true);
    frm.setResizable(false);
 }
}