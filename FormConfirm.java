import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class FormConfirm extends JFrame implements ChangeListener, ActionListener{
 private JCheckBox check;
 private JLabel label;
 private JButton button;
 public FormConfirm(){
   setLayout(null);
   label =  new JLabel("Acepto terminos y condiciones");
   label.setBounds(5, 10, 200, 30);
   add(label);

   check = new JCheckBox("Acepto");
   check.setBounds(5, 50, 200,30);
   check.addChangeListener(this);
   add(check);

   button = new JButton("Confirmar");
   button.addActionListener(this);
   button.setBounds(5, 90, 200, 50);
   button.setEnabled(false);
   add(button);
   
 }

 public void stateChanged(ChangeEvent e){
   if(check.isSelected() == true){
     button.setEnabled(true);
   }else{
    button.setEnabled(false);
   }
 }

 public void actionPerformed(ActionEvent e){
   if(e.getSource() == button){
    System.exit(0);
   }
 }

 public static void main(String args[]) {
   FormConfirm form = new FormConfirm();
   form.setBounds(0,0, 250, 200);
   form.setVisible(true);
   form.setLocationRelativeTo(null);
   form.setResizable(false);
 }
}