package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	
	static char[] board=new char[10];
	
	public static void assignSpace() {
		for(int index=1;index<=board.length;index++)
			board[index]=' ';
		
	}

	public static void main(String[] args) {
		
		assignSpace();

	}

}
