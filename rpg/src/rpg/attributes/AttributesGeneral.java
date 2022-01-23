package rpg.attributes;

public abstract class AttributesGeneral {
	
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getMagic() {
		return magic;
	}
	public void setMagic(int magic) {
		this.magic = magic;
	}
	public int getVelocity() {
		return velocity;
	}
	public void setVelocity(int velocity) {
		this.velocity = velocity;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	private int force;
	private int magic;
	private int velocity;
	private int defense;
	
}
