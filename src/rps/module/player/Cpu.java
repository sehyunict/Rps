package rps.module.player;

public class Cpu implements Player {

	private String name;
	private static int SEQUENCE = 1;
	
	
	public Cpu(){
		
		this.name = "CPU" + Cpu.SEQUENCE;
		Cpu.SEQUENCE++;
		
	}
	
	
	@Override
	public String getName() {
		
		return this.name;
		
	}

}
