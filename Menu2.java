import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Menu2 extends JFrame implements ActionListener{
  private JMenuBar menuBar;  
  private JMenu firtsMenu, secondMenu, threeMenu;
  private JMenuItem mItem1, mItem2, mItem3, mItem4, mItem5;
   


  public Menu2(){
    setLayout(null);
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);
    firtsMenu =  new JMenu("Opciones");
    menuBar.add(firtsMenu);

    secondMenu = new JMenu("Modificar tamaño");
    threeMenu = new JMenu("Modificar Color");
    firtsMenu.add(secondMenu);
    firtsMenu.add(threeMenu);

    mItem1 = new JMenuItem("Rojo");
    mItem1.addActionListener(this);
    threeMenu.add(mItem1);

    mItem2 = new JMenuItem("Verde");
    mItem2.addActionListener(this);
    threeMenu.add(mItem2);

    mItem3 = new JMenuItem("Azul");
    mItem3.addActionListener(this);
    threeMenu.add(mItem3);

    mItem4 = new JMenuItem("300 x 200");
    mItem4 .addActionListener(this);
    secondMenu.add(mItem4);


    mItem5 = new JMenuItem("640 x 480");
    mItem5.addActionListener(this);
    secondMenu.add(mItem5);
    
  }


  public void actionPerformed(ActionEvent e){
    if(e.getSource() == mItem1){
	getContentPane().setBackground(new Color(255,0,0));
    }
    if(e.getSource() == mItem2){
	getContentPane().setBackground(new Color(0, 255, 0));
    }
    if(e.getSource() == mItem3){
        getContentPane().setBackground(new Color(0,0,255));
    }
    if(e.getSource() == mItem4){
	setSize(300, 200);
    }
    if(e.getSource() == mItem5){
	setSize(640, 480);
    }
  }

  public static void main(String args[]){
    Menu2 form = new Menu2();
    form.setBounds(0,0, 300,300);
    form.setVisible(true);
    form.setResizable(false);
    form.setLocationRelativeTo(null);
    
 }
}