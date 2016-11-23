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

    private JButton[][] button;
    
    
    
    
    //Konstruktor
    public View(Model m, Controller c){
        super();
        
        
        this.button = new JButton[5][5];

        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
            	button[i][j] = new JButton();
        		button[i][j].setBackground(Color.yellow);;
        		button[i][j].addActionListener(c);
            	this.add(button[i][j]);
            }
        }
        this.m = m;
        this.c = c;

//        this.d = new drawPanel(m, c);
       
        
        this.setLayout(new GridLayout(0,5));
 
        
        
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        this.setTitle("Lights-Out");

        this.setSize(400, 400);


        this.setVisible(true);
    }

    
    
    

    public void compare(JButton b){
    	for(int i = 0; i < button.length; i++){
    		for(int j = 0; j < button[i].length;++j){
    			if(button[i][j] == b){
    				if(this.m.getOneChecken(i, j) == true){
    					button[i][j].setBackground(Color.yellow);    					
    					this.m.checken(i, j);
    				}else{
    					button[i][j].setBackground(Color.black);
    					this.m.checken(i, j);
    				}
    			}
    		}
    	}
		System.out.println("hans");
    }

	/**
	 * @return the button
	 */
	public JButton[][] getButton() {
		return button;
	}
	
	/**
	 * @param button the button to set
	 */
	public void setButton(JButton[][] button) {
		this.button = button;
	}

	public JButton getOneButton(int i, int j) {
		return button[i][j];
	}
	
    }
    
    
    
    
    

