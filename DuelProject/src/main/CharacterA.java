package main;

public class CharacterA implements Dueler {
	
	private int hp;
	
	public void taunt() {
		System.out.println("You're dead meat.");
	}
	
	public String getName() {
		return "Coby Yee";
	}
	
	public void setStartingHp(int hp){
		this.hp = hp;
	}
	
	public int getHp() {
		return hp;
	}
}
