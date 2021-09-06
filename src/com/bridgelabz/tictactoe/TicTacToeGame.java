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
		checkSpace(location);
	}
	public static boolean checkSpace(int index) {
		if(board[index]==' ')
			return true;
		else
			return false;
	}
	
	public static char toss() {
		if(Math.random()<0.5)
			return 'X'	;
		else
			return 'O';
				
	}
	
	public static boolean checkWinner(char player) {
		if(board[1]==player && board[2]==player && board[3]==player)
			return true;
		if(board[4]==player && board[5]==player && board[6]==player)
			return true;
		if(board[7]==player && board[8]==player && board[9]==player)
			return true;
		if(board[1]==player && board[4]==player && board[7]==player)
			return true;
		if(board[2]==player && board[5]==player && board[8]==player)
			return true;
		if(board[3]==player && board[6]==player && board[9]==player)
			return true;
		if(board[1]==player && board[5]==player && board[9]==player)
			return true;
		if(board[3]==player && board[5]==player && board[7]==player)
			return true;
		return false;
		
	}
	public static boolean boardFull() {
		for(int index=1;index<10;index++)
			if(board[index]!='X'||board[index]!='O')
				return false;
		return true;
	}
	
	public static boolean checkIfWin(int index) {
		switch(index) {
		case 1: if(board[2]==computerSign && board[3]==computerSign || board[4]==computerSign && board[7]==computerSign || board[5]==computerSign && board[9]==computerSign)
				return true;
				break;
		case 2: if(board[1]==computerSign && board[3]==computerSign || board[5]==computerSign && board[8]==computerSign )
				return true;
				break;
		case 3: if(board[1]==computerSign && board[2]==computerSign || board[6]==computerSign && board[9]==computerSign || board[5]==computerSign && board[7]==computerSign)
				return true;
				break;
		case 4: if(board[1]==computerSign && board[7]==computerSign || board[5]==computerSign && board[6]==computerSign )
				return true;
				break;
		case 5: if(board[1]==computerSign && board[9]==computerSign || board[2]==computerSign && board[8]==computerSign || board[3]==computerSign && board[7]==computerSign
				|| board[6]==computerSign && board[4]==computerSign)
				return true;
				break;
		case 6: if(board[3]==computerSign && board[9]==computerSign || board[4]==computerSign && board[5]==computerSign )
				return true;
				break;
		case 7: if(board[1]==computerSign && board[4]==computerSign || board[5]==computerSign && board[3]==computerSign || board[8]==computerSign && board[9]==computerSign)
				return true;
				break;
		case 8: if(board[2]==computerSign && board[5]==computerSign || board[7]==computerSign && board[9]==computerSign )
				return true;
				break;
		case 9: if(board[3]==computerSign && board[6]==computerSign || board[1]==computerSign && board[5]==computerSign || board[7]==computerSign && board[8]==computerSign)
				return true;
				break;
		
		}
		return false;
	}
	
	public static void computerMove() {
		int flagPlay=0;
		for(int index=1;index<10;index++) {
			if(checkIfWin(index)) {
				board[index]=computerSign;	
				flagPlay=1;
			}
		}
		if(flagPlay==0) {
			
		}
		
	}

	public static void main(String[] args) {
		assignSpace();
		assignSigns();
		showBoard();
	}

}
