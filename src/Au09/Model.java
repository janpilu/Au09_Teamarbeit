package Au09;
/** 
 * Klasse Model.
 * 
 * 
 * @author Simon Appel 
 * @version 2016-11-17
 */


public class Model {
	private boolean[] check;
	
	
	public Model(){
		this.check = new boolean[25];
	}

	public void checken(int i){
		check[i] = true;
		System.out.println("Boolean");
	}
		
	/*
	public void changeColor(){
		if(this.v.check==true){	//schwarz ist
			this.v.		//einf�rben gelb
		}else{
			this.v.		//schwarz setzten
		}
	}
*/
}
