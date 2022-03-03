package rps;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import rps.module.player.Cpu;
import rps.module.player.Player;
import rps.module.player.User;
import rps.module.util.Console;

public class Rps {

	private List<Player> players;
	private Scanner scanner;
	
	public Rps() {
		
		this.scanner = new Scanner(System.in);
		this.players = new ArrayList<>();
		
		User user = new User( "사용자" );
		this.players.add( user );
		
	}
	
	private void createCpus() {
		
		System.out.println("컴퓨터를 몇 대와 게임을 할까요?");
		
		int cpuCount = 0;
		while( true ) {
			
			System.out.println("자연수를 입력해주세요. 예) 3");
			try {
				
				String cpuCountStr = scanner.nextLine();
				cpuCount = Integer.parseInt( cpuCountStr );
				
				if( cpuCount < 1 ) {
					throw new Exception("0또는 음의 정수 입니다.");
				}
				
				break;
				
			} catch (Exception e) {
				
				Console.clear();
				System.out.println("잘못 입력했습니다.");
				
			}
			
		}
		
		for( int i=0; i<cpuCount; ++i ) {
			
			this.players.add( new Cpu() );
			
		}
		
		
		
	}
	
	public void run() {
		
		this.createCpus();
		
	}

}
