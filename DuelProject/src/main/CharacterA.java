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
	
	public void setStartingHP(int hp){
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp) {
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
	
	public void hit(Dueler d) {
		if(d instanceof Duel) {
			hp=hp - 10;
		}
		
	}
}
