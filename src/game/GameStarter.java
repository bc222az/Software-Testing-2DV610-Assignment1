package game;

import java.io.PrintWriter;
import java.util.Scanner;

public class GameStarter {

	public static void main(String[] args) {
		//GameStarter gameStarter = new GameStarter();
		//gameStarter.chooseGameOption();
	}
	
	public GameOption chooseGameOption() {
		return chooseGameOption(new Scanner(System.in),new PrintWriter(System.out,true));
	}
	public GameOption chooseGameOption(Scanner scanner, PrintWriter output) {
		/*output.println("GameOption \n 1. Player vs Computer \n 2. Player vs Player \n 0. Exit");
		int input;
		do{
			input = scanner.nextInt();
			switch(input){
				case 0: return GameOption.QUIT;
				case 1: return GameOption.ONEPLAYER;
				case 2: return GameOption.TWOPLAYER;
			}
			output.println("No such option try again.. \n GameOptions \n 1. Player vs Computer \n 2. Player vs Player \n 0. Exit");
		}while(input != 0 || input != 1 || input != 2);
		return null;*/
		return null;
	}
}
