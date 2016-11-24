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
    
    
    
    
    /** 
	 * Das ist der Konstruktor der Klasse View.
	 * holt sich model und controller und ruft am Anfang super() auf
	 * 
	 * @param m Das Model
	 * @param c Der Controller
	 */
    public View(Model m, Controller c){
        super();
        
        
        
        this.button = new JButton[7][7];

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < 7; j++){
            	button[i][j] = new JButton();
        		button[i][j].setBackground(Color.yellow);;
        		button[i][j].addActionListener(c);
            	this.add(button[i][j]);
            }
        }
        this.m = m;
        this.c = c;

//        this.d = new drawPanel(m, c);
       
        
        this.setLayout(new GridLayout(0,7));
        this.button[0][0].setVisible(false);
        this.button[0][1].setVisible(false);
        this.button[0][2].setVisible(false);
        this.button[0][3].setVisible(false);
        this.button[0][4].setVisible(false);
        this.button[0][5].setVisible(false);
        this.button[0][6].setVisible(false);
        
        this.button[1][0].setVisible(false);
        this.button[2][0].setVisible(false);
        this.button[3][0].setVisible(false);
        this.button[4][0].setVisible(false);
        this.button[5][0].setVisible(false);
        this.button[6][0].setVisible(false);
        
        this.button[1][6].setVisible(false);
        this.button[2][6].setVisible(false);
        this.button[3][6].setVisible(false);
        this.button[4][6].setVisible(false);
        this.button[5][6].setVisible(false);
        this.button[6][6].setVisible(false);
        
        this.button[6][1].setVisible(false);
        this.button[6][2].setVisible(false);
        this.button[6][3].setVisible(false);
        this.button[6][4].setVisible(false);
        this.button[6][5].setVisible(false);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        this.setTitle("Lights-Out");

        this.setSize(400, 400);

        for(int i = 0; i <= (int)(Math.random()*(8 - 4)+ 4);i++){
    		int x = (int)(Math.random()*(6 - 1)+ 1);
    		int y = (int)(Math.random()*(6 - 1)+ 1);
        	if(this.m.getOneChecken(x,y) == false){
        		this.button[x][y].setBackground(Color.black);;
        		this.m.checken(x, y);
        		System.out.println("Checken");
        		System.out.println();
        		
        	}
        }
        this.setVisible(true);
    }

    
    
    /** 
	 * Die Methode compare "bekommt" einen button und �ndert dementsprechend die Hintergrundfarbe
	 * 
	 * @param b Der JButton
	 */

    public void compare(JButton b){
    	for(int i = 0; i < button.length; i++){
    		for(int j = 0; j < button[i].length;++j){
    			if(button[i][j] == b){
    				if(this.m.getOneChecken(i, j) == true){
    					if(this.button[i][j].getBackground() == Color.black){ button[i][j].setBackground(Color.yellow); }else{ button[i][j].setBackground(Color.black); }
    					if(this.button[i-1][j].getBackground() == Color.black){ button[i-1][j].setBackground(Color.yellow); }else{ button[i-1][j].setBackground(Color.black); }
    					if(this.button[i][j-1].getBackground() == Color.black){ button[i][j-1].setBackground(Color.yellow); }else{ button[i][j-1].setBackground(Color.black); }
    					if(this.button[i][j+1].getBackground() == Color.black){ button[i][j+1].setBackground(Color.yellow); }else{ button[i][j+1].setBackground(Color.black); }
    					if(this.button[i+1][j].getBackground() == Color.black){ button[i+1][j].setBackground(Color.yellow); }else{ button[i+1][j].setBackground(Color.black); }
    					this.m.checken(i,j);
    					this.m.checken(i-1,j);
    					this.m.checken(i,j-1);
    					this.m.checken(i,j+1);
    					this.m.checken(i+1, j);
    				}else{
    					if(this.button[i][j].getBackground() == Color.black){ button[i][j].setBackground(Color.yellow); }else{ button[i][j].setBackground(Color.black); }
    					if(this.button[i-1][j].getBackground() == Color.black){ button[i-1][j].setBackground(Color.yellow); }else{ button[i-1][j].setBackground(Color.black); }
    					if(this.button[i][j-1].getBackground() == Color.black){ button[i][j-1].setBackground(Color.yellow); }else{ button[i][j-1].setBackground(Color.black); }
    					if(this.button[i][j+1].getBackground() == Color.black){ button[i][j+1].setBackground(Color.yellow); }else{ button[i][j+1].setBackground(Color.black); }
    					if(this.button[i+1][j].getBackground() == Color.black){ button[i+1][j].setBackground(Color.yellow); }else{ button[i+1][j].setBackground(Color.black); }
    					this.m.checken(i,j);
    					this.m.checken(i-1,j);
    					this.m.checken(i,j-1);
    					this.m.checken(i,j+1);
    					this.m.checken(i+1,j);	   					
    				}
    			}
    		}
    	}
		
		geloest();
    }

	/**
	 * Die Methode getButton() returnt alle button
	 * 
	 * @return button der Button
	 */
	public JButton[][] getButton() {
		return button;
	}
	
	/**
	 * Die Methode setButton setzt einen Button
	 * 
	 * @param button der buttond er gesetzt wird
	 */
	public void setButton(JButton[][] button) {
		this.button = button;
	}
	/**
	 * Die Methode getOneButton returnt einen bestimmten button abh�ngig der parameter
	 * 
	 * @param i Erste Wert
	 * @param j Zweite Wert
	 * @return button[i][j] der bestimmte Button
	 */
	public JButton getOneButton(int i, int j) {
		return button[i][j];
	}
	/**
	 * Die Methode geloest() gibt eine Geloest Meldung aus.
	 * 
	 * 
	 */
	public void geloest(){
    	if(this.button[1][1].getBackground() == Color.black && this.button[1][2].getBackground() == Color.black && this.button[1][3].getBackground() == Color.black && this.button[1][4].getBackground() == Color.black && this.button[1][5].getBackground() == Color.black && this.button[2][1].getBackground() == Color.black && this.button[2][2].getBackground() == Color.black && this.button[2][3].getBackground() == Color.black && this.button[2][4].getBackground() == Color.black && this.button[2][5].getBackground() == Color.black && this.button[3][1].getBackground() == Color.black && this.button[3][2].getBackground() == Color.black && this.button[3][3].getBackground() == Color.black && this.button[3][4].getBackground() == Color.black && this.button[3][5].getBackground() == Color.black && this.button[4][1].getBackground() == Color.black && this.button[4][2].getBackground() == Color.black && this.button[4][3].getBackground() == Color.black && this.button[4][4].getBackground() == Color.black && this.button[4][5].getBackground() == Color.black && this.button[5][1].getBackground() == Color.black && this.button[5][2].getBackground() == Color.black && this.button[5][3].getBackground() == Color.black && this.button[5][4].getBackground() == Color.black && this.button[5][5].getBackground() == Color.black) 
    	{
    		System.out.println("geloest");
    		JOptionPane.showMessageDialog(null, "Geloest am been! Krah Krah");	
    	}
	}
}