package rpg.character.enemies;

import rpg.attributes.character.enemy.AttributesEnemy;
import rpg.character.Character;

public abstract class Enemy extends Character {
	
	public Enemy(EnumEnemy enemy) {
		this.enemy = enemy;
	}
	
	EnumEnemy enemy;
	AttributesEnemy attributes;
	
}
