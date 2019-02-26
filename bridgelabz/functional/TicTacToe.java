/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: Program to play a Tic-Tac-Toe Game.
 */

package com.bridgelabz.functional;
import java.util.Random;
import com.bridgelabz.utility.Utility;
public class TicTacToe 
{
	Utility utility = new Utility();
	Random rd = new Random(3);
	final String Board[][] = new String [3][3];
	boolean flag = true;
	String check = "";
	static TicTacToe t = new TicTacToe();
	public static void main(String[] args) 
	{
		System.out.println("\t***** WELCOME TO TIC_TAC_TOE GAME *****\n");
		t.play();
	}
	public void play()
	{
		t.setBoard();
		t.displayBoard();
		do 
		{
			t.player();
			t.displayWinner();
			t.gameTie();
			t.computer();
			t.displayWinner();
			t.gameTie();
		}while(check!= "no");
	}
	public void setBoard()
	{
		Board[0][0] = "1";
		Board[0][1] = "2";
		Board[0][2] = "3";
		Board[1][0] = "4";
		Board[1][1] = "5";
		Board[1][2] = "6";
		Board[2][0] = "7";
		Board[2][1] = "8";
		Board[2][2] = "9";
	}
	public void displayBoard()
	{
		System.out.println(Board[0][0]+" | "+Board[0][1]+" | "+Board[0][2]);
		System.out.println("----------");
		System.out.println(Board[1][0]+" | "+Board[1][1]+" | "+Board[1][2]);
		System.out.println("----------");
		System.out.println(Board[2][0]+" | "+Board[2][1]+" | "+Board[2][2]);
	}

	public boolean displayWinner()
	{
		if((Board[0][0] == "X" && Board[0][1] == "X" && Board[0][2] == "X") ||
				(Board[1][0] == "X" && Board[1][1] == "X" && Board[1][2] == "X") ||
				(Board[2][0] == "X" && Board[2][1] == "X" && Board[2][2] == "X") ||
				(Board[0][0] == "X" && Board[1][0] == "X" && Board[2][0] == "X") ||
				(Board[0][1] == "X" && Board[1][1] == "X" && Board[2][1] == "X") ||
				(Board[0][2] == "X" && Board[1][2] == "X" && Board[2][2] == "X") ||
				(Board[0][0] == "X" && Board[1][1] == "X" && Board[2][2] == "X") ||
				(Board[2][0] == "X" && Board[1][1] == "X" && Board[0][2] == "X"))
		{
			System.out.println("\nWell Played\nComputer win...");
			System.out.println("\n*Do you want to play Again?");
			System.out.println("(Type yes if you want to play)");
			check = utility.inputString();
			if(check!= "no")
			{
				play();
			}
			return false;
		}
		else if((Board[0][0] == "O" && Board[0][1] == "O" && Board[0][2] == "O") ||
				(Board[1][0] == "O" && Board[1][1] == "O" && Board[1][2] == "O") ||
				(Board[2][0] == "O" && Board[2][1] == "O" && Board[2][2] == "O") ||
				(Board[0][0] == "O" && Board[1][0] == "O" && Board[2][0] == "O") ||
				(Board[0][1] == "O" && Board[1][1] == "O" && Board[2][1] == "O") ||
				(Board[0][2] == "O" && Board[1][2] == "O" && Board[2][2] == "O") ||
				(Board[0][0] == "O" && Board[1][1] == "O" && Board[2][2] == "O") ||
				(Board[2][0] == "O" && Board[1][1] == "O" && Board[0][2] == "O"))
		{
			System.out.println("\nWell Played\nCongratulations...You win...");
			System.out.println("\n*Do you want to play Again?");
			System.out.println("(Type yes if you want to play)");
			check= utility.inputString();
			if(check!= "no")
			{
				play();
			}
			return false;
		}
		return true;
	}
	public void gameTie()
	{
		if(!displayWinner())
		{
			System.out.println("Game Tie...");
			System.out.println("*Do you want to play Again?");
			System.out.println("Type yes if you want to play otherwise no");
			check= utility.inputString();
			if(check!= "no")
			{
				play();
			}
		}
	}
	public void player()
	{
		System.out.println("\nYour Turn");
		System.out.println("Enter X and Y Positions:");
		int x = utility.inputInteger();
		int y = utility.inputInteger();
		System.out.println("You choose "+x+" and "+y+" Positions");
		if(x>=0 && y<3)
		{
			if((Board[x][y]!="X") && (Board[x][y]!="O"))
			{
				Board[x][y]="O";
				t.displayBoard();
				t.displayWinner();
			}
			else
			{
				System.out.println("Position "+x+" and "+y+" is Occupied... (try again)");
				player();
			}
		}
		else
		{
			System.out.println("*Invalid Positions\t(try again)");
			player();
		}
	}
	public void computer()
	{
		System.out.println("\nComputer Turn");
		//int x=(int) ((Math.random()*((2-0)+1)));
		//int y=(int) ((Math.random()*((2-0)+1)));
		int x = rd.nextInt(3);
		int y = rd.nextInt(3);
		System.out.println("Computers Position "+x+" , "+y);
		if((Board[x][y]!="X") && (Board[x][y]!="O"))
		{
			Board[x][y]="X";
			t.displayBoard();
			t.displayWinner();
		}
		else
		{
			System.out.println("Position "+x+" and "+y+" is Occupied...");
			computer();
		}
	}
}

