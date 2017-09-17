package main;

public class CharacterB implements Dueler{
	private int hp;
	public CharacterB() {
		
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
	
	public int getAction(Dueler d) {
		if(d instanceof CharacterA) {
			return 3;
		}
		else {
			return (int) (Math.random() * 3);
		}
	}	
	
	public void (Dueler d) {
		if(d instanceof Duel ) {
			
		}else {
			
		}
		
		
	}
}
