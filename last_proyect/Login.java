import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


// @SuppressWarnings("unchecked")
class Login extends JFrame implements ActionListener{
 private JTextField txtLogin;
 private JLabel imageLabel, slogan, userLabel, copyRihgt;
 private JButton btn;

 public Login(){
  setLayout(null);
  setTitle("Bienvenido");
  getContentPane().setBackground(new Color(255,0,0));
  setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

  ImageIcon image = new ImageIcon("images/logo-coca.png");
  imageLabel = new JLabel(image);
  imageLabel.setBounds(25, 15, 300, 150);
  add(imageLabel);
 
  slogan = new JLabel("Sistema de Control Vacacional");
  slogan.setBounds(35,135, 300, 30);
  slogan.setFont(new Font("Andale Mono", 3, 18));
  slogan.setForeground(new Color(255,255,255));
  add(slogan);

  userLabel = new JLabel("Ingrese su nombre");
  userLabel.setBounds(45,212, 200, 30);
  userLabel.setForeground(new Color(255, 255, 255));
  add(userLabel);

  txtLogin = new JTextField();
  txtLogin.setBounds(45, 240, 255, 25);
  txtLogin.setBackground( new Color(255,255, 255));
  txtLogin.setFont(new Font("Andale Mono", 2, 14));
  txtLogin.setForeground(new Color(255,0,0));
  add(txtLogin);

  btn =  new JButton("Ingresar");
  btn.setBounds(125, 280,100,30);
  btn.setBackground(new Color(255,255,255));
  btn.setFont(new Font("Andale Mono", 1, 14));
  btn.setForeground(new Color(255, 0, 0));
  btn.addActionListener(this);
  add(btn);


  
  copyRihgt = new JLabel("©2017 The Coca-Cola Company");
  copyRihgt.setBounds(85, 375, 300, 30);
  copyRihgt.setForeground(new Color(255,255,255));
  add(copyRihgt);

 }


public void actionPerformed(ActionEvent e){
 
 if(e.getSource() == btn){
  System.out.println("Ingresando ando");
 }

}



 public static void main(String[] args){
	Login login = new Login();
     login.setBounds(0,0, 350, 450);
	login.setVisible(true);
   	login.setResizable(false);
     login.setLocationRelativeTo(null);
 }

}