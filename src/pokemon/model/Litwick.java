package pokemon.model;

public class Litwick extends Pokemon implements Ghost
{
	public Litwick()
	{
		super("Litwick", 607);
	
		setup();
	}
	
	public Litwick(String name)
	{
		super(name, 607);
		
		setup();
	}
	
	public Litwick(int number, String name)
	{
		super(name, number);
		
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(420);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.42);
		this.setHealthPoints(666);
	}
	
	public boolean doesFloat()
	{
		return false;
	}
	
	public boolean transparent()
	{
		return true;
	}
	
	public int howBig(int size)
	{
		int volume = 2;
		
		return volume;
	}
}
