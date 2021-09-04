/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login;
import java.awt.*;
/**
 *
 * @author Mr. Daniel
 */
public class Login extends Frame{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame f=new Frame("Login Page");
        f.setBackground(Color.DARK_GRAY);
      f.setBounds(40,23,400,300);
      f.setResizable(false);
      f.show();
      
      Label l=new Label("LOGIN YOUR DETAILS" );
      l.setFont(new Font("Courier", Font.BOLD, 20));
      l.setForeground(Color.WHITE);
      
      Panel p=new Panel();
      p.add(l);
      
      f.add(BorderLayout.NORTH, p);
      
       Button a=new Button("Log in");
       Panel t=new Panel();
       t.add(a);
       f.add(BorderLayout.SOUTH, t);
       
     
      
      infornationPanel ip=new infornationPanel();
      f.add(BorderLayout.EAST, ip);
      
      
    
    }
}
