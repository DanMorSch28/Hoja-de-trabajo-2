/*
 * Daniel Morales 15526
 */

 public class Character {
	private String character;
	private Character next;
	
	public Character(String character){
		this.character = character;
	}
	
	public Character getNext() {
		return next;
	}
	public void setNext(Character next) {
		this.next = next;
	}
	
	public String getCharacter() {
		return character;
	}
	
	public void setCharacter(String character) {
		this.character = character;
	}

}
