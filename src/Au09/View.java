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

    private JButton[] button;
    
    
    
    
    //Konstruktor
    public View(Model m, Controller c){
        super();
        
        this.button = new JButton[25];

        this.m = m;
        this.c = c;

//        this.d = new drawPanel(m, c);
        
        this.setLayout(new GridLayout(0,5));
     
        for(int i = 0; i < 25; i++)
        	this.add(button[i]);
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        this.setTitle("Lights-Out");

        this.setSize(400, 400);


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
