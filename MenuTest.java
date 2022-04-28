import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuTest extends JFrame implements ActionListener{
  private JMenuBar menuBar;
  private JMenu menu1;
  private JMenuItem mItem1, mItem2, mItem3;

  public MenuTest(){
    setLayout(null);
    menuBar = new JMenuBar();
    setJMenuBar(menuBar);

    menu1 = new JMenu("Opciones");
    menuBar.add(menu1);
    
    mItem1 = new JMenuItem("Rojo");
    mItem1.addActionListener(this);
    menu1.add(mItem1);

    mItem2 = new JMenuItem("Negro");
    mItem2.addActionListener(this);
    menu1.add(mItem2);

    mItem3 = new JMenuItem("Azul");
    mItem3.addActionListener(this);
    menu1.add(mItem3);

    
  }

  public void actionPerformed(ActionEvent e){
   Container fondo = this.getContentPane();
   JButton xx = new JButton("XXXX");
   if(e.getSource() == mItem1) {
	fondo.setBackground(new Color(255,0,0));
	int counter = 0;
	int increment = 0;
	for(int i = 0; i < 10000; i++){
	   if(counter == 100){
            fondo.removeAll();
            increment++;
	    counter=0;
           }else{
	     xx.setBounds((10+increment),10, 100, 50);
	     fondo.add(xx);
           }
           counter++;
        }
   }

   if(e.getSource() == mItem2) {
        fondo.setBackground(new Color(0,0,0));
   }
   
   if(e.getSource() == mItem3) {
	fondo.setBackground(new Color(0,0,255));
   }
 }
 
  public static void main(String[] args){
    MenuTest form = new MenuTest();
    form.setBounds(0,0, 300, 300);
    form.setResizable(false);
    form.setVisible(true);
    form.setLocationRelativeTo(null);
 } 
}