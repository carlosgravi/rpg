package rpg.character;

import rpg.character.enemies.EnumEnemy;

public abstract class Character {
	
	private String name;
	private EnumEnemy typeEnemy;
	private int pointLife;
	private int level;	
	
	public Character() {
		
	}
	
	public abstract void attack();
	public abstract void defend();
	public abstract void useMagic();	
	
}
