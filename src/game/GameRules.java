package game;

public class GameRules {
	
	public boolean canPlay(BoardState[] boardArray,int boardPosition){
		if(checkWinner(boardArray)){
			return false;
		}
		if(boardArray[boardPosition] == BoardState.EMPTY){
			return true;
		}
		return false;
	}
	public boolean checkWinner(BoardState[] boardArray){
		if(isBoardStateSame(boardArray[0], boardArray[1], boardArray[2])
		|| isBoardStateSame(boardArray[3], boardArray[4], boardArray[5])
		|| isBoardStateSame(boardArray[6], boardArray[7], boardArray[8])
		|| isBoardStateSame(boardArray[0], boardArray[3], boardArray[6])
		|| isBoardStateSame(boardArray[1], boardArray[4], boardArray[5])
		|| isBoardStateSame(boardArray[2], boardArray[5], boardArray[8])
		|| isBoardStateSame(boardArray[0], boardArray[4], boardArray[8])
		|| isBoardStateSame(boardArray[2], boardArray[4], boardArray[6])){
			return true;
		}
		return false;
	}
	public void isBoardStateSame(BoardState bs1,BoardState bs2, BoardState bs3){
		
	}
	public boolean checkTie(BoardState[] boardArray){
		return false;
	}
	public int convertInputToBoardPosition(String input){
		return 0;
	}
	public boolean legalInput(String input){
		return false;
	}
}
