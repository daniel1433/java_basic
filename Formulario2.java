import javax.swing.*;

public class Formulario2 extends JFrame{
  private JLabel label;

  public Formulario2(){
    setLayout(null); // Inhabilita el posicionamiento por defecto
    label = new JLabel("Mi texto xd");
    label.setBounds(100,150, 100,300);
    add(label);
 }

  public static void main(String args[]){

    Formulario2 frm = new Formulario2();
    frm.setBounds(0,0,400,500);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    frm.setResizable(false);
 }

}