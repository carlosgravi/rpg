package rpg.character.enemies;

public class EnemyFactory {
		
	public static final Enemy returnNewEnemy(EnumEnemy typeEnemy) {
		
		Enemy regress = null;  
		switch (typeEnemy) {
		
		case GUNSMITH:
			regress = new Gunsmith();
			break;
			
		case ALCHEMIST:
			regress = new Alchemist();
			break;
			
		case LEADER:
			regress = new Leader();
			break;
			
		default:
			System.out.println("Escolha um inimigo correto");
			break;
	}
	return regress;	
		
	}
		
}
