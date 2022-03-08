package rps.module;

import java.util.ArrayList;
import java.util.List;

import rps.module.util.Console;

public class Manager <E> {

	private List<E> items;
	
	public Manager() {
		
		this.items = new ArrayList<>();
		
	}
	
	public Manager add( E item ) {
		
		this.items.add( item );
		return this;
		
	}

	public void print() {
		
		Console.clear();
		System.out.println( "게임에 참여중인 플레이어 목록" );
		List<String> playerNames = this.items.stream()
			.map( player -> player.getName() )
			.collect( Collectors.toList() );
		System.out.println( "[ " + String.join( ", ", playerNames ) + " ]" );
		
	}
	
}
