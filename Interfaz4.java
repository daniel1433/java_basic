import javax.swing.*;
import java.awt.event.*;
@SuppressWarnings("unchecked")
public class Interfaz4 extends JFrame implements ItemListener{
  private JComboBox cbo1;
 
  public Interfaz4(){
    setLayout(null);
    cbo1 = new JComboBox();
    cbo1.setBounds(5, 10, 100, 30);
    add(cbo1);
    cbo1.addItem("Rojo");
    cbo1.addItem("Verde");
    cbo1.addItem("Amarillo");
    cbo1.addItem("Negro");
    cbo1.addItem("Azul");

    cbo1.addItemListener(this);
 }

  public void itemStateChanged(ItemEvent e){
   if(e.getSource() == cbo1){
   //System.out.println(cbo1.getSelectedItem().toString());
     setTitle(cbo1.getSelectedItem().toString());
  }
 }
 
  public static void main(String[] args){
    Interfaz4 form = new Interfaz4();
    form.setBounds(0,0, 250, 150);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
    //form.setResizable(false);
 }
}
