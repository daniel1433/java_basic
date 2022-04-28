import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Home extends JFrame implements ActionListener{
 private JMenuBar mb;
 private JMenu menuOptions, menuCalculate, menuAbout, menuBanckgroundColor;
 private JMenuItem myCalcule, miRed, miBlack, miPurlple, miCreated, miExit, miNew;
 private JLabel lbLogo, lbWelcome, lbTitle, lbName, lbPather, lbMother, lbDepartament, lbAld, lbResult, 
	    lbFooter;
 private JTextField txtNameWorker, txtFatherWorker, txtMotherWorker;
 private JComboBox cbxDepartament, cbxOld;
 private JScrollPane scllPane1;
 private JTextArea txtaResult;



 public Home(){
  setLayout(null);
  setTitle("Pantalla Principal");
  getContentPane().setBackground(new Color(255,0,0));


  mb = new JMenuBar();
  mb.setBackground(new Color(255,0,0));
  setJMenuBar(mb);

  menuOptions = new JMenu("Opciones");
  menuOptions.setBackground(new Color(255));
  menuOptions.setFont(new Font("Andale Mono", 1, 14));
  menuOptions.setForeground(new Color(255, 255, 255));
  mb.add(menuOptions);

  menuBanckgroundColor = new JMenu("Color de fondo");
  menuBanckgroundColor .setFont(new Font("Andale Mono", 1, 14));
  menuBanckgroundColor .setForeground(new Color(255,0,0));
  menuOptions.add(menuBanckgroundColor);


  miRed = new JMenuItem("Rojo");
  miRed.setFont(new Font("Andale Mono", 1, 14));
  miRed.setForeground(new Color(255,0,0));
  menuBanckgroundColor.add(miRed);
  miRed.addActionListener(this);

  miBlack = new JMenuItem("Negro");
  miBlack.setFont(new Font("Andale Mono", 1, 14));
  miBlack.setForeground(new Color(255,0,0));
  menuBanckgroundColor.add(miBlack);
  miBlack.addActionListener(this);

  miPurlple = new JMenuItem("Morado");
  miPurlple .setFont(new Font("Andale Mono", 1, 14));
  miPurlple .setForeground(new Color(255,0,0));
  menuBanckgroundColor.add(miPurlple);
  miPurlple.addActionListener(this);

  miNew = new JMenuItem("Nuevo");
  miNew.setFont(new Font("Andale Mono", 1, 14));
  miNew.setForeground(new Color(255,0,0));
  menuOptions.add(miNew);
  miNew.addActionListener(this);

  miExit = new JMenuItem("Salir");
  miExit.setFont(new Font("Andale Mono", 1, 14));
  miExit.setForeground(new Color(255,0,0));
  menuOptions.add(miExit);
  miExit.addActionListener(this);


  menuCalculate = new JMenu("Calcular");
  menuCalculate.setBackground(new Color(255,0,0));
  menuCalculate.setFont(new Font("Andale Mono", 1, 14));
  menuCalculate.setForeground(new Color(255, 255, 255));
  mb.add(menuCalculate);
  
  myCalcule =  new JMenuItem("Vacaciones");
  myCalcule.setFont(new Font("Andale Mono", 1, 14));
  myCalcule.setForeground(new Color(255,0,0)); 
  menuCalculate.add(myCalcule);
  myCalcule.addActionListener(this);


  menuAbout = new JMenu("Acerca de");
  menuAbout.setBackground(new Color(255, 0, 0));
  menuAbout.setFont(new Font("Andale Mono", 1, 14));
  menuAbout.setForeground(new Color(255, 255, 255));
  mb.add(menuAbout);  

  miCreated = new JMenuItem("El creador");
  miCreated.setFont(new Font("Andale Mono", 1, 14));
  miCreated.setForeground(new Color(255,0,0));
  menuAbout.add(miCreated);
  miCreated.addActionListener(this);


ImageIcon image = new ImageIcon("images/logo-coca.png");
lbLogo = new JLabel(image);
lbLogo.setBounds(5,5,250,100);
add(lbLogo);

lbWelcome = new JLabel("Bienvenido");
lbWelcome.setBounds(280, 30, 300, 50);
lbWelcome.setFont(new Font("Andale Mono", 1, 32));
lbWelcome.setForeground(new Color(255, 255, 255));
add(lbWelcome);

lbTitle = new JLabel("Datos del trabajo para el cálculo de vacaciones");
lbTitle.setBounds(45, 140, 900, 25);
lbTitle.setFont(new Font("Andale Mono", 1, 32));
lbTitle.setForeground(new Color(255, 255, 255));
add(lbTitle);


//, lbTitle, lbName, lbPather, lbMother, lbDepartament, lbAld, lbResult

 }


public void actionPerformed(ActionEvent e){
	if(e.getSource() == miRed) {
       getContentPane().setBackground(new Color(255,0,0));
    }
	if(e.getSource() == miBlack) {
       getContentPane().setBackground(new Color(0,0,0));

    }
	if(e.getSource() == miPurlple) {
       getContentPane().setBackground(new Color(150,0,190));

    }
	if(e.getSource() == miExit) {
       System.exit(0);
    }
	if(e.getSource() == myCalcule) {
    }
	if(e.getSource() == miNew) {
    }
	if(e.getSource() == miCreated) {
    }


}


  public static void main(String args[]){
	Home home = new Home();
  	home.setBounds(0,0, 1200, 600);
     home.setLocationRelativeTo(null);
	home.setResizable(false);
     home.setVisible(true);
 }

}