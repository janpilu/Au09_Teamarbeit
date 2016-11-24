package Au09;
/** 
 * Klasse Controller die alles steuert.  
 * 
 * 
 * @author Jan Langela 
 * @version 2016-11-24
 */
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Controller implements ActionListener{
	//Attribute
	private Model m;
    private View v;
    /** 
	 * Das ist der Konstruktor der Klasse Controller.
	 * erstellt eine neues Model und View Object
	 * 
	 */
    public Controller(){
        this.m = new Model();
        this.v = new View(this.m, this);
    }
    
    /** 
	 * actionPerformed zum Erkennen eines Ereignisses
	 * 
	 *@param e das Actionevent
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
        System.out.println("Klicken");
        this.v.compare((JButton)e.getSource());
	}
}