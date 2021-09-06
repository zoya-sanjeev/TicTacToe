package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner =new Scanner(System.in);
	static char[] board=new char[10];
	
	public static void assignSpace() {
		for(int index=1;index<=board.length;index++)
			board[index]=' ';
	}
	
	public static void playerInput() {
		System.out.println("Enter Player move");
		char playerMove=scanner.next().charAt(0);
	}

	public static void main(String[] args) {
		assignSpace();
		playerInput();

	}

}
