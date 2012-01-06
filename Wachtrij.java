package gelinkteLijsten;

/**
 * Een wachtrij (queue) werkt via het 
 * first-in first-out principe; elementen worden toegevoegd 
 * aan de achterkant en worden verwijderd aan de voorkant.
 * 
 * In deze klasse implementeer je een Queue door alleen 
 * maar gebruik te maken van de opslag methode die de 
 * klasse GelinkteLijst je biedt. De Node komt niet voor in deze klasse!
 * 
 * In [Hubbard, hoofdstuk 6] wordt de Queue besproken.
 * 
 * @author Youri 
 *
 */
public class Wachtrij{
	
	GelinkteLijst lijst;
	
	public Wachtrij(){
		lijst = new GelinkteLijst();
		
	}
	
	/**
	 * Zet iets in de wachtrij
	 * aan de achterkant: FIFO
	 */
	void enqueue(Object o){
		lijst.insertLast(o); //bijvoorbeeld zo	
	}
	
	/**
	 * Haal iets van de wachtrij
	 * Aan de voorkant: FIFO
	 */
	void dequeue(){
		lijst.dequeue();
	}
	
	/**
	 * Het aantal elementen in de wachtrij
	 * @return
	 */
	int size(){
		return lijst.getSize();
	}
	
	/**
	 * Is de lijst leeg?
	 * @return
	 */
	boolean isEmpty(){
		return (lijst.getSize() == 0);
	}
	
	/**
	 * Bekijk het eerste element in de wachtrij, 
	 * maar haalt het niet er vanaf. 
	 * Note: het eerste element is als eerste toegevoegd.
	 * @return
	 */	
	Object front(){
		if(lijst.getSize() != 0){
			return lijst.front();
		}
		return new Object();
	}
	
	/**
	 * Print de wachtrij;
	 * @return
	 */
	 
	 String printWachtrij(){
		return lijst.printFirstToLast();
	}
}
