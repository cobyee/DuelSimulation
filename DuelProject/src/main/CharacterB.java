package main;

public class CharacterB implements Dueler{
	private int hp = 0;
	private boolean isloaded = false;
	private int randomnum = 0;
	private String [] mytaunt = {"I will defeat you!", "I will destroy you!", "This duel going to be the biggest regret of your life!", "Kill  yourself" };
	public CharacterB() {
		
	}
	public void taunt() {
		System.out.println(mytaunt[(int) (Math.random() * 4)]);
	}
	
	public String getName() {
		
		return "zhehao lin";
	}
	
	public void setStartingHP(int hp) {
		this.hp = hp;
	}
	
	public int getHP() {
		return hp;
	}
	
	public boolean determineIfOpponentIsFair(Dueler d, int hp ) {
		return d.getHP() == hp;
	}
	
	public int getAction(Object d) {
		if(d instanceof CharacterA) {
			return 3;
		}
		
			if(isloaded)
			{
				if(Math.random() > .5)
				{
					isloaded = false;
					return 1;
				}
				return 2;
			}
			else {
				if(Math.random() > 0.5) {
					isloaded = true;
					return 0;
				}
				else {
					return 2;
				}
				
			}
		
	}	
	
	public void hit(Object d) {
		if(d instanceof Duel ) {
			hp=hp - 10;
		}
		
		
	}
	
	
}
