package Au09;
/** 
 * Klasse Model.
 * 
 * 
 * @author Simon Appel 
 * @version 2016-11-17
 */


public class Model {
	private boolean[][] check;
	
	
	public Model(){
		this.check = new boolean[5][5];
	   	for(int i = 0; i < 5; i++){
    		for(int j = 0; j < 5;++j){
    			this.check[i][j] = false;
    		}
	   	}
	}

	public void checken(int i, int j){
		if(check[i][j] == true){
			check[i][j] = false;
			System.out.println("wird false");
		}else{
			check[i][j] = true;
			System.out.println("wird true");
		}
	}
		
	public boolean getOneChecken(int i, int j){
		return this.check[i][j];
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
