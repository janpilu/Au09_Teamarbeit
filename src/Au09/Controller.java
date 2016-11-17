package Au09;
/** 
 * Klasse Controller die alles steuert.
 * 
 * 
 * @author Simon Appel 
 * @version 2016-09-22
 */
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Controller implements ActionListener{
	//Attribute
	private Model m;
    private View v;
    //Konstruktor
    public Controller(){
        this.m = new Model();
        this.v = new View(this.m, this);
    }
    
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
 
}