package com.bridgelabz.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner scanner =new Scanner(System.in);
	static char[] board=new char[10];
	static char playerSign;
	static char computerSign;
	
	public static void assignSpace() {
		for(int index=1;index<board.length;index++)
			board[index]=' ';
	}
	
	public static void assignSigns() {
		System.out.println("Enter Player move");
		playerSign=scanner.next().toUpperCase().charAt(0);
		computerSign=playerSign=='X'?'O':'X';
	}
	
	public static void showBoard() {
		for(int index=1;index<board.length;index++) {
			if(board[index]==' ')
				System.out.print("_ ");
			else 
				System.out.println(board[index]);
			
			if(index%3==0)
				System.out.println();
				
		}
	}
	public static void playerInput() {
		System.out.println("Enter desired location(1-9");
		int location=scanner.nextInt();
	}

	public static void main(String[] args) {
		assignSpace();
		assignSigns();
		showBoard();

	}

}
