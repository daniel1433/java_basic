import javax.swing.*;
import javax.swing.event.*;

public class FormRadio extends JFrame implements ChangeListener{
  private JRadioButton radio1, radio2, radio3;
  private ButtonGroup bg;

  public FormRadio(){
   setLayout(null);
   bg = new ButtonGroup();

   radio1 = new JRadioButton("640*480");
   radio1.setBounds(5, 10, 100, 30);
   radio1.addChangeListener(this);
   add(radio1);
   bg.add(radio1);

   radio2 = new JRadioButton("800*600");
   radio2.setBounds(5, 45, 100, 30);
   radio2.addChangeListener(this);
   add(radio2);
   bg.add(radio2);

   radio3 = new JRadioButton("1024*768");
   radio3.setBounds(5, 85, 100, 30);
   radio3.addChangeListener(this);
   add(radio3);
   bg.add(radio3);

   
 }

  public void stateChanged(ChangeEvent e){
   if(radio1.isSelected() == true){
     setSize(640, 480);
  }
   if(radio2.isSelected() ==  true){
     setSize(800,600);
  }
   if(radio3.isSelected() == true){
    setSize(1024, 768);
  }
 }

  public static void main(String args[]){
   FormRadio form = new FormRadio();
   form.setBounds(0,0, 300, 250);
   form.setVisible(true);
   form.setLocationRelativeTo(null);
   form.setResizable(false);
 }
}