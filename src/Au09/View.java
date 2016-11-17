package Au09;
import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
/** Date: 17.11.2016
 * @author Armin
 *	Version 1.0
 */
public class View extends JFrame{
    public Model m;
    public Controller c;
    public drawPanel d;

    public JButton Button1;
    public JButton Button2;
    public JButton Button3;
    public JButton Button4;
    public JButton Button5;
    public JButton Button6;
    public JButton Button7;
    public JButton Button8;
    public JButton Button9;
    public JButton Button10;
    public JButton Button11;
    public JButton Button12;
    public JButton Button13;
    public JButton Button14;
    public JButton Button15;
    public JButton Button16;
    public JButton Button17;
    public JButton Button18;
    public JButton Button19;
    public JButton Button20;
    public JButton Button21;
    public JButton Button22;
    public JButton Button23;
    public JButton Button24;
    public JButton Button25;
    
    
    
    //Konstruktor
    public View(Model m, Controller c){
        super();
        
 
        this.m = m;
        this.c = c;

        this.d = new drawPanel(m, c);
        
        this.setLayout(new Layout());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        this.setTitle("Hangman");

        this.add();
        this.add();
        this.add();
        this.setVisible(true);
    }

    
    
    
    public class drawPanel extends JPanel{    
        public Model m;
        public Controller c;
        //Konstruktor
        public drawPanel(Model m, Controller c){
        	this.m = m;
        	this.c = c;
        }
        
    	protected void paintComponent(Graphics g){
    		super.paintComponent(g);

    
    	}
    }
    
    
    
    
    
}
