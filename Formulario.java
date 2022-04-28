import javax.swing.*;

public class Formulario extends JFrame{
  private JLabel label1; 

  public Formulario(){
    setLayout(null);
    label1 = new JLabel("Esto es una prueba de interfaz");
    // x, y, ancho y alto
    label1.setBounds(10,20,200,300);
    add(label1);
  }

  public static void main(String args[]){
   Formulario form = new Formulario();   
   form.setBounds(0,0, 400,300);
   form.setVisible(true);
   form.setLocationRelativeTo(null);
 }
}