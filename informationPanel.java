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
public class infornationPanel extends Panel {
    
    Label k,j,m;
    
    public infornationPanel(){
        
        GridLayout g=new GridLayout(3,3,9,2);
        setLayout(g);
        
      
        
         k=new Label("USERNAME", Label.CENTER);
         k.setForeground(Color.WHITE);
         TextField a =new TextField(15);
        Panel p=new Panel();
        p.setLayout(g);
        p.add(k);
        p.add(a);
        add(p);
        
         j=new Label("PASSWORD",Label.CENTER);
         j.setForeground(Color.WHITE);
         TextField b =new TextField(15);
         char q;
         q=222                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  ;
         b.setEchoChar(q);
        Panel p1=new Panel();
        p.setLayout(g);
        p.add(j);
        p.add(b);
        add(p1);
        
         m=new Label("EMAIL",Label.CENTER);
         m.setForeground(Color.WHITE);
         TextField c =new TextField(15);
        Panel p2=new Panel();
        p.setLayout(g);
        p.add(m);
        p.add(c);
        add(p2);
        
       
    }
}
