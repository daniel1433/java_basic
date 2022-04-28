import javax.swing.*;
import javax.swing.event.*; 

public class FrmCheckBox extends JFrame implements ChangeListener{
  private JCheckBox check1, check2, check3, check4;

  public FrmCheckBox(){
     setLayout(null);
     check1 = new JCheckBox("Ingles");
     check1.setBounds(10, 5, 100, 50);
     check1.addChangeListener(this);
     add(check1);

     check2 = new JCheckBox("Espa\u00f1ol");
     check2.setBounds(10, 55, 100, 50);
     check2.addChangeListener(this);
     add(check2);

     check3 = new JCheckBox("Aleman");
     check3.setBounds(10, 110, 100, 50);
     check3.addChangeListener(this);
     add(check3);

     check4 = new JCheckBox("Frances");
     check4.setBounds(10, 165, 100, 50);
     check4.addChangeListener(this);
     add(check4);
     
  }


  public void stateChanged(ChangeEvent e){
    String code = ""; 
    String init = "";
    if(check1.isSelected() == true){
	code+= init+check1.getText(); 
        if(init == ""){
         init+="-";
        }
    }
    if(check2.isSelected() == true){
	code+= init+check2.getText();   
        if(init == ""){
         init+="-";
        }
    }
    if(check3.isSelected() == true){
	code+= init+check3.getText(); 
        if(init == ""){
         init+="-";
        }
    }
    if(check4.isSelected() == true){
	code+= init+check4.getText();
        if(init == ""){
         init+="-";
        }
    }
    setTitle(code);

 }

  public static void main(String args[]){
    FrmCheckBox frm = new FrmCheckBox();
    frm.setBounds(0,0, 400,400);
    frm.setVisible(true);
    frm.setLocationRelativeTo(null);
    frm.setResizable(false);
 }
}