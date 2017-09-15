package main;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public CharacterA(){
		
	}
	public void taunt() {
		System.out.println("You're dead meat.");
	}
	
	public String getName() {
		return "Coby Yee";
	}
	
	public void setStartingHp(int hp){
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		return d.getHP() == hp;
	}
	
	public int getAction(Object caller) {
		if(caller instanceof CharacterB) {
			return 
		}
	}
	
	public void hit(Object caller) {
		
	}
}
