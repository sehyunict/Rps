package rps.module.util;

import java.util.List;
import java.util.stream.Collectors;

import rps.module.PlayerManager;

public class Console {

	public static void clear() {
		
		for( int i=0; i<1000; ++i ) {
			System.out.println("");
		}
		
	}
	
	public static void players( PlayerManager playerManager ) {
		
		Console.clear();
		System.out.println( "게임에 참여중인 플레이어 목록" );
//		List<String> playerNames = this.players.stream()
//			.map( player -> player.getName() )
//			.collect( Collectors.toList() );
//		System.out.println( "[ " + String.join( ", ", playerNames ) + " ]" );
		
	}
	
}
