package com.bridgelabz.tictactoe;

public class TicTacToeGame {
	
	public static void assignSpace(char[] board) {
		for(int index=1;index<=board.length;index++)
			board[index]=' ';
		
	}

	public static void main(String[] args) {
		char[] board=new char[10];
		assignSpace(board);

	}

}
