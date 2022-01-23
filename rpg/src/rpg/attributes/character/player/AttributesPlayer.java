package rpg.attributes.character.player;

import rpg.attributes.character.AttributesCharacter;

public class AttributesPlayer extends AttributesCharacter {
	
	private int level;
	private int expCurrent;
	private int expNextLevel;
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public int getExpCurrent() {
		return expCurrent;
	}
	
	public void setExpCurrent(int expCurrent) {
		this.expCurrent = expCurrent;
	}
	
	public int getExpNextLevel() {
		return expNextLevel;
	}
	
	public void setExpNextLevel(int expNextLevel) {
		this.expNextLevel = expNextLevel;
	}
	
}
