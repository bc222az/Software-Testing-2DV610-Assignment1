package game;

import static org.junit.Assert.*;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.util.Scanner;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.Any;

import static org.mockito.Mockito.*;
public class GameStarterTests {
	
	@Mock 
	GameRules mockGameRules;
	@Before
	public void setup(){
		MockitoAnnotations.initMocks(this);
	}
	@Test
	public void startGameTest(){
		GameStarter gameStarter = new GameStarter(){
			public void runGame(){
				
			}
		};
		gameStarter.setGameRules(mockGameRules);
		when(mockGameRules.chooseGameOption()).thenReturn(GameOption.TWOPLAYER);
		gameStarter.startGame();
		assertNotNull(gameStarter.gameBoard);
		assertNotNull(gameStarter.player1);
		assertNotNull(gameStarter.player2);
		assertNotNull(gameStarter.gameRules);
		assertSame(gameStarter.player1, gameStarter.playerStarted);
		assertSame(gameStarter.player1, gameStarter.playerTurn);
		verify(mockGameRules,times(1)).chooseGameOption();
		assertEquals(GameOption.TWOPLAYER, gameStarter.gameOption);
	}
	
	@Test
	public void runGameTest(){
		GameStarter gameStarter = new GameStarter(){
			public void playTurn(){
				
			}
		};
		gameStarter.gameBoard = new GameBoard();
		gameStarter.setGameRules(mockGameRules);
		gameStarter.runGame();
		when(mockGameRules.checkWinner(gameStarter.gameBoard.boardArray)).thenReturn(false).thenReturn(false);
		when(mockGameRules.checkTie(gameStarter.gameBoard.boardArray)).thenReturn(false).thenReturn(true);
		verify(mockGameRules,times(2)).checkWinner(gameStarter.gameBoard.boardArray);
		verify(mockGameRules,times(2)).checkWinner(gameStarter.gameBoard.boardArray);
	}
}
