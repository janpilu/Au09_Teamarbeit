package Au09;
/** 
 * Klasse Model zuständig für die boolean Werte
 * 
 * 
 * @author Simon Appel 
 * @version 2016-11-24
 */


public class Model {
	private boolean[][] check;
	/** 
	 * Das ist der Konstruktor der Klasse Model.
	 * Setzt alle boolean Werte auf false.
	 * 
	 */
	
	public Model(){
		this.check = new boolean[7][7];
	   	for(int i = 0; i < 7; i++){
    		for(int j = 0; j < 7;++j){
    			this.check[i][j] = false;
    		}
	   	}
	}
	
	/** 
	 * Die Methode check nimmt zwei Werte und setzt den boolean check dementsprechend auf true oder false.
	 * 
	 * @param i Erster Wert
	 * @param j Zweiter Wert
	 */
	public void checken(int i, int j){
		if(check[i][j] == true){
			check[i][j] = false;
			System.out.println("wird false");
		}else{
			check[i][j] = true;
			System.out.println("wird true");
		}
	}

	/**
	 * Die Methode setCheck setzt einen boolean Wert 
	 * 
	 * @param check der Wert der gesetzt wird
	 */
	public void setCheck(boolean[][] check) {
		this.check = check;
	}
	
	/**
	 * Die Methode getOneChecken returnt einen boolean Wert der durch die Parameter ausgewählt wird 
	 * 
	 * @param i Erster Wert
	 * @param j Zweiter Wert
	 */
	public boolean getOneChecken(int i, int j){
		return this.check[i][j];
	}
	
	/*
	public void changeColor(){
		if(this.v.check==true){	//schwarz ist
			this.v.		//einfarben gelb
		}else{
			this.v.		//schwarz setzten
		}
	}
	 */
}