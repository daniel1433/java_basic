import javax.swing.*;

public class Formulario1 extends JFrame {
  private JLabel label;

  public Formulario1(){
   setLayout(null);  // Inhabilita el posicionamiento automatico de la ventana
 }

  public static void main(String args[]){
    Formulario1 frm = new Formulario1();
    frm.setBounds(0,0,400,500);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null); // Centra la pantalla
    frm.setResizable(false); // Ventana no tiene permiso de modificar tamaño
 }
}  