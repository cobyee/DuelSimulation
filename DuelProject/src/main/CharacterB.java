package main;

public class CharacterB implements Dueler{
	private int hp;
	public characterB() {
		
	}
	public void taunt() {
		System.out.println("I will defeat you!");
	}
	
	public String getName() {
		
		return "zhehao lin";
	}
	
	public void setStartingHp(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp ) {
		return d.getHP() == hp;
	}
	
	public int getAction(Object caller) {
		if(caller instanceof CharacterA) {
			return 3;
		}
		else {
			
			
		}
	}
}
