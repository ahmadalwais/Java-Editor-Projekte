import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.ArrayList; 
import javax.swing.*;

/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 07.05.2022
 * @author 
 */

public class Anmelde extends JFrame {
  // Anfang Attribute
  private JLabel lLogin = new JLabel();
  private JLabel lName = new JLabel();
  private JTextField jName = new JTextField();
  private JLabel lUsername = new JLabel();
  private JLabel lEMail = new JLabel();
  private JLabel lPassword = new JLabel();
  private JLabel lPasswordwiederholen = new JLabel();
  private JTextField jUsername = new JTextField();
  private JTextField jEmail = new JTextField();
  private JButton bSpeichern1 = new JButton();
  private JButton bSuchen = new JButton();
  private JButton bLoeschen = new JButton();
  private JPasswordField jPassword1 = new JPasswordField();
  private JPasswordField jPassword2 = new JPasswordField();
  // Ende Attribute
  
  public Anmelde() { 
    // Frame-Initialisierung
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 449; 
    int frameHeight = 443;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("Anmelde");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    // Anfang Komponenten
    
    lLogin.setBounds(7, 10, 414, 60);
    lLogin.setText("Login");
    lLogin.setFont(new Font("Dialog", Font.BOLD, 24));
    cp.add(lLogin);
    lName.setBounds(6, 87, 160, 40);
    lName.setText("Name :");
    cp.add(lName);
    jName.setBounds(175, 87, 250, 40);
    cp.add(jName);
    lUsername.setBounds(6, 127, 160, 40);
    lUsername.setText("Username :");
    cp.add(lUsername);
    lEMail.setBounds(6, 167, 160, 40);
    lEMail.setText("E-Mail :");
    cp.add(lEMail);
    lPassword.setBounds(6, 207, 160, 40);
    lPassword.setText("Password :");
    cp.add(lPassword);
    lPasswordwiederholen.setBounds(6, 247, 160, 40);
    lPasswordwiederholen.setText("Password wiederholen :");
    cp.add(lPasswordwiederholen);
    jUsername.setBounds(175, 127, 250, 40);
    cp.add(jUsername);
    jEmail.setBounds(175, 167, 250, 40);
    cp.add(jEmail);
    bSpeichern1.setBounds(6, 300, 160, 40);
    bSpeichern1.setText("Speichern");
    bSpeichern1.setMargin(new Insets(2, 2, 2, 2));
    bSpeichern1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSpeichern1_ActionPerformed(evt);
      }
    });
    cp.add(bSpeichern1);
    bSuchen.setBounds(6, 348, 160, 40);
    bSuchen.setText("Suchen");
    bSuchen.setMargin(new Insets(2, 2, 2, 2));
    bSuchen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bSuchen_ActionPerformed(evt);
      }
    });
    cp.add(bSuchen);
    bLoeschen.setBounds(174, 300, 250, 40);
    bLoeschen.setText("Löschen");
    bLoeschen.setMargin(new Insets(2, 2, 2, 2));
    bLoeschen.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bLoeschen_ActionPerformed(evt);
      }
    });
    cp.add(bLoeschen);
    jPassword1.setBounds(175, 207, 250, 40);
    cp.add(jPassword1);
    jPassword2.setBounds(175, 247, 250, 40);
    cp.add(jPassword2);
    // Ende Komponenten
    
    setVisible(true);
  } // end of public Anmelde
  
  // Anfang Methoden
  
  public static void main(String[] args) {
    new Anmelde();
  } // end of main
  ArrayList<User> UserList = new ArrayList<>();
  User UserClass = new User();
  int x =1;//Password Zählvariable für Versuche
  public void bSpeichern1_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    if (jPassword1.getPassword().length == 0) {
      JOptionPane.showMessageDialog(null, "Bitte einen Password mindestens 8 z eingeben!");
    }else if (!String.valueOf(jPassword1.getPassword()).equals(String.valueOf(jPassword2.getPassword()))) {
               JOptionPane.showMessageDialog(null, "Passwort falsch. Neuer Versuch!");

     }
    else {
      UserList.add(new User(jName.getText(), jUsername.getText(), jEmail.getText(), jPassword1.getPassword().toString()));
    }
  } // end of bSpeichern1_ActionPerformed

  public void bSuchen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    //JOptionPane.showMessageDialog(null, UserList.get(0).getName());
    jPassword1.setEchoChar((char)0);
  } // end of bSuchen_ActionPerformed

  public void bLoeschen_ActionPerformed(ActionEvent evt) {
    // TODO hier Quelltext einfügen
    int i = 0;
    String del = jName.getText();
    
    for (i = 0; i < UserList.size() ; i++) {
      while (UserList.get(i).getName().equals(del)) { 
        JOptionPane.showMessageDialog(null, "DONE!!!!");
      } // end of while
    } // end of for
    
  } // end of bLoeschen_ActionPerformed

  // Ende Methoden
} // end of class Anmelde
