package freudenthaler;
/** Date: 20.9.2016
 * @author Armin
 *	Version 1.0
 */

import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import Freudenthaler.Model;
import Freudenthaler.View;
public class Controller implements ActionListener, KeyListener, MouseListener{
	//Attribute
	public Model m;
    public View v;
    //Konstruktor
    public Controller(){
        this.m = new Model();
        this.v = new View(this.m, this);
    }
 
}