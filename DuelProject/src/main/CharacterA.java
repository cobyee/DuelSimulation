package main;

public class CharacterA implements Dueler {
	
	private int hp;
	private String [] taunts = {"You're dead meat", "This is gonna be easy", "Good luck. You're gonna need it", "Might as well quit now", "What a joke", "Give up while you still can"};
	private boolean loaded = false;
	
	public CharacterA(){
		
	}
	
	public void taunt() {
		System.out.println(taunts[(int) (Math.random() * 6)]);
	}
	
	public String getName() {
		return "Coby";
	}
	
	public void setStartingHP(int hp){
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
		if(d.getHP() == hp) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getAction(Object d) {
		if(d instanceof CharacterB) {
			return 3;
		}
		if(loaded) {
			if(Math.random() > 0.5) {
				loaded = false;
				return 1;
			}
			return 2;
		}
		else {
			if(Math.random() > 0.5) {
				loaded = true;
				return 0;
			}
			else {
				return 2;
			}
		}
	}
	
	public void hit(Object d) {
		if(d instanceof Duel) {
			hp=hp - 10;
		}
		
	}

}
