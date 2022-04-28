import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unchecked")
public class BotonRGB extends JFrame implements ActionListener{
  private JLabel label1, label2, label3;
  private JComboBox combo1, combo2, combo3; 
  private JButton btn;

  public BotonRGB(){
   setLayout(null);
   label1 = new JLabel("Rojo: ");
   label1.setBounds(15, 10, 130, 50);
   add(label1);

   label2 = new JLabel("Verde: ");
   label2.setBounds(15, 70, 130, 50);
   add(label2);

   label3 = new JLabel("Azul: ");
   label3.setBounds(15, 130, 130, 50);
   add(label3);

   combo1 = new JComboBox();
   combo1.setBounds(160, 10, 130, 50);
   addItemsToCombo(combo1);
   add(combo1);

   combo2 = new JComboBox();
   combo2.setBounds(160, 70, 130, 50);
   addItemsToCombo(combo2);
   add(combo2);

   combo3 = new JComboBox();
   combo3.setBounds(160, 130, 130, 50);
   addItemsToCombo(combo3);
   add(combo3);

   btn = new JButton("Colorear");
   btn.setBounds(15, 190, 120, 40);
   add(btn);

  btn.addActionListener(this);

 }

  public void addItemsToCombo(JComboBox combo){
    for(int i = 0; i < 256; i++){
     combo.addItem(String.valueOf(i));
   }
  }

  public void actionPerformed(ActionEvent e){
   if(e.getSource() == btn){
     System.out.println("Botoneado!!");
     System.out.println(""+combo1.getSelectedItem()+" "+combo2.getSelectedItem()+" "+combo3.getSelectedItem());

     int red = Integer.parseInt(combo1.getSelectedItem().toString());
     int green = Integer.parseInt(combo1.getSelectedItem().toString());
     int blue = Integer.parseInt(combo1.getSelectedItem().toString());

     Color color1 = new Color(red,green,blue);
     btn.setBackground(color1);
  }
 }

  public static void main(String[] args){
    BotonRGB form = new BotonRGB();
    form.setBounds(0,0, 330, 300);
    form.setLocationRelativeTo(null);
    form.setVisible(true);
 }

}