package gelinkteLijsten;

/**
 * In deze opdracht verken je het generieke karakter van de gelinkte datastructuur.
 * Daarvoor programmeer je eerst de klasse 'GelinkteLijst'. Deze klasse is abstract.
 * De Klasses Stapel en Wachtrij implementeren de GelinkteLijst. 
 * 
 * - Zorg dat je criteria opstelt (zoals we in les 2 gedaan hebben) en beschrijf 
 *   dit in de javadoc bij elke methode.
 * - Aan de hand van de criteria controleer je of de opdracht correct werkt.
 * - Implementeer tot slot de klasse App. Deze is bedoeld om de werking van 
 *   verschillende klassses te demonstreren.
 * 
 * @author youritjang
 *
 */

public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Stapel stapel = new Stapel();
		for(int i = 1; i <= 6; i++){
			stapel.push(i);
			System.out.println("stapel.push("+i+")");
			System.out.println("stapel.front(): "+stapel.front());			
		}
		
		System.out.println(stapel.printStack());
		for(int i = 1; i <= 6; i++){
			System.out.println("stapel.pop(): "+stapel.pop());
			if(!stapel.isEmpty()){ 
				System.out.println(stapel.printStack());
			}else{
				System.out.println("De stack is leeg.\n");
			}
		}
		
		Wachtrij wachtrij = new Wachtrij();
		
		for(int i = 1; i <= 6; i++){
			wachtrij.enqueue(i);
			System.out.println("wachtrij.enqueue("+i+")");
			System.out.println("wachtrij.front(): "+wachtrij.front());
			System.out.println(wachtrij.printWachtrij()+"\n");
		}
		System.out.println("\n"+wachtrij.printWachtrij());
		
		for(int i = 1; i <= 6; i++){
			
			wachtrij.dequeue();
			if(!wachtrij.isEmpty()){
				System.out.println("wachtrij.dequeue();");
				System.out.println(wachtrij.printWachtrij()+"\n");
			}else{
				System.out.println("wachtrij.dequeue();");
				System.out.println("De wachtrij is leeg.");
			}
		}
		
		
		
		/**
		GelinkteLijst linkedList = new GelinkteLijst();
		
		for(int i=1;i<=6;i++){
			linkedList.insertFirst(i);
		}
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		for(int i=1;i<=6;i++){
			linkedList.remove(i);
		}
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		/**
		linkedList.remove(1);
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		linkedList.insertLast(1);
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		linkedList.insertFirst(7);
		linkedList.insertFirst(9);
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		linkedList.insertAfter(8, 9);
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		linkedList.insertBefore(5.5, 5);
		System.out.println(linkedList.printLastToFirst());
		System.out.println(linkedList.printFirstToLast()+"\n");
		System.out.println(linkedList.getSize());
		*/
	}
}
