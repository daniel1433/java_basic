import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

class Licence extends JFrame implements ActionListener, ChangeListener{
 private JLabel title, imgCocacola;
 private JCheckBox check1;
 private JButton btnAccp, btnN;
 private JScrollPane scrollpane1;
 private JTextArea textarea;


 public Licence(){
   setLayout(null); 
   setTitle("Licencia de uso");
   setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

   title = new JLabel("TÉRMINOS Y CONDICIONES");
   title.setBounds(215, 5, 200, 30);
   title.setForeground(new Color(0,0,0));
   add(title);
   
   textarea = new JTextArea();
   textarea.setFont(new Font("Andale Mono", 0, 9));
   textarea.setText("\n\n          T&Eacute;RMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCI&Oacute;N SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GR&Aacute;FICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");

   scrollpane1 = new JScrollPane(textarea);
   scrollpane1.setBounds(10, 40, 575, 200);

   add(scrollpane1);

   check1 =  new JCheckBox("Yo Acepto");
   check1.setBounds(10, 250, 300, 30);
   check1.addChangeListener(this);
   add(check1);

   btnAccp = new JButton("Continuar");
   btnAccp.setBounds(10, 290, 100, 30);
   btnAccp.setEnabled(false);
   btnAccp.addActionListener(this);
   add(btnAccp);

   btnN =  new JButton("No Acepto");
   btnN.setBounds(120, 290, 100, 30);
   btnN.addActionListener(this);
   add(btnN);

   
   ImageIcon image= new ImageIcon("images/coca-cola.png");
   imgCocacola = new JLabel(image);
   imgCocacola.setBounds(315, 135, 300, 300);
   add(imgCocacola);
 }


 public void actionPerformed(ActionEvent e){
	if(e.getSource() == btnN){
	 System.exit(0);
  }
}

 public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
	 System.out.println("Sucede");
      btnAccp.setEnabled(true);
   }else{
        btnAccp.setEnabled(false);
      }
	

}

 public static void main(String[] args){
   Licence licence = new Licence();
   licence.setBounds(0, 0, 640, 420);
   licence.setVisible(true);
   licence.setLocationRelativeTo(null);

 }

}