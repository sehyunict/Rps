package rps.module.player;

public class User implements Player {

	private String name;
	
	public User( String name ){
		
		this.name = name;
		
	}
	
	@Override
	public String getName() {
		
		return this.name;
		
	}

}
