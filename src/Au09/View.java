package Au09;
import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
/** Date: 17.11.2016
 * @author Armin
 *	Version 1.0
 */
public class View extends JFrame{
    private Model m;
    private Controller c;
//    private drawPanel d;

    
    
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
        
        this.Button1 = new JButton();
        this.Button2 = new JButton();
        this.Button3 = new JButton();
        this.Button4 = new JButton();
        this.Button5 = new JButton();
        this.Button6 = new JButton();
        this.Button7 = new JButton();
        this.Button8 = new JButton();
        this.Button9 = new JButton();
        this.Button10 = new JButton();
        this.Button11 = new JButton();
        this.Button12 = new JButton();
        this.Button13 = new JButton();
        this.Button14 = new JButton();
        this.Button15 = new JButton();
        this.Button16 = new JButton();
        this.Button17 = new JButton();
        this.Button18 = new JButton();
        this.Button19 = new JButton();
        this.Button20 = new JButton();
        this.Button21 = new JButton();
        this.Button22 = new JButton();
        this.Button23 = new JButton();
        this.Button24 = new JButton();
        this.Button25 = new JButton();
        
        this.m = m;
        this.c = c;

//        this.d = new drawPanel(m, c);
        
        this.setLayout(new GridLayout(0,5));
        
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        this.setTitle("Lights-Out");

        this.setSize(400, 400);

        this.add(this.Button1);
        this.add(this.Button2);
        this.add(this.Button3);
        this.add(this.Button4);
        this.add(this.Button5);
        this.add(this.Button6);
        this.add(this.Button7);
        this.add(this.Button8);
        this.add(this.Button9);
        this.add(this.Button10);
        this.add(this.Button11);
        this.add(this.Button12);
        this.add(this.Button13);
        this.add(this.Button14);
        this.add(this.Button15);
        this.add(this.Button16);
        this.add(this.Button17);
        this.add(this.Button18);
        this.add(this.Button19);
        this.add(this.Button20);
        this.add(this.Button21);
        this.add(this.Button22);
        this.add(this.Button23);
        this.add(this.Button24);
        this.add(this.Button25);

        this.setVisible(true);
    }

    
    
    
/*    
    
    public class drawPanel extends JPanel{    
        private Model m;
        private Controller c;
        //Konstruktor
        public drawPanel(Model m, Controller c){
        	this.m = m;
        	this.c = c;
        }
        
    	protected void paintComponent(Graphics g){
    		super.paintComponent(g);

    
    	}
    }
  */  
    
    
    
    
}
