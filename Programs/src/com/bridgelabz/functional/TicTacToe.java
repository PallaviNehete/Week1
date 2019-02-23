/*	Cross Game or Tic-Tac-Toe Game 
	Desc -> Write a Program to play a Cross Game or Tic-Tac-Toe Game. Player 1 is the Computer and the Player 2 is the user. Player 1 take Random Cell that is the Column and Row. 
	I/P -> Take User Input for the Cell i.e. Col and Row to Mark the ‘X’
	Logic -> The User or the Computer can only take the unoccupied cell. The Game is played till either wins or till draw...
	O/P -> Print the Col and the Cell after every step.
	Hint -> The Hints is provided in the Logic. Use Functions for the Logic…	*/

package com.bridgelabz.functional;
import java.util.Random;
import com.bridgelabz.utility.Utility;
public class TicTacToe 
{
	Utility u=new Utility();
	Random rd= new Random(3);
	private static final String Board[][] = new String [3][3];
	static boolean flag=true;
	static String check="";
	static TicTacToe t=new TicTacToe();
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
		}while(check!="no");
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

		if((Board[0][0]=="X" && Board[0][1]=="X" && Board[0][2] == "X") ||
				(Board[1][0]=="X" && Board[1][1]=="X" && Board[1][2] == "X") ||
				(Board[2][0]=="X" && Board[2][1]=="X" && Board[2][2] == "X") ||
				(Board[0][0]=="X" && Board[1][0]=="X" && Board[2][0] == "X") ||
				(Board[0][1]=="X" && Board[1][1]=="X" && Board[2][1] == "X") ||
				(Board[0][2]=="X" && Board[1][2]=="X" && Board[2][2] == "X") ||
				(Board[0][0]=="X" && Board[1][1]=="X" && Board[2][2] == "X") ||
				(Board[2][0]=="X" && Board[1][1]=="X" && Board[0][2] == "X"))
		{
			System.out.println("\nWell Played\nYou win...");
			System.out.println("\n*Do you want to play Again?");
			System.out.println("(Type yes if you want to play)");
			check= u.inputString();
			if(check!="no")
			{
				play();
			}
			return false;
		}
		else if((Board[0][0]=="O" && Board[0][1]=="O" && Board[0][2] == "O") ||
				(Board[1][0]=="O" && Board[1][1]=="O" && Board[1][2] == "O") ||
				(Board[2][0]=="O" && Board[2][1]=="O" && Board[2][2] == "O") ||
				(Board[0][0]=="O" && Board[1][0]=="O" && Board[2][0] == "O") ||
				(Board[0][1]=="O" && Board[1][1]=="O" && Board[2][1] == "O") ||
				(Board[0][2]=="O" && Board[1][2]=="O" && Board[2][2] == "O") ||
				(Board[0][0]=="O" && Board[1][1]=="O" && Board[2][2] == "O") ||
				(Board[2][0]=="O" && Board[1][1]=="O" && Board[0][2] == "O"))
		{
			System.out.println("\nWell Played\nComputer wins...");
			System.out.println("\n*Do you want to play Again?");
			System.out.println("(Type yes if you want to play)");
			check= u.inputString();
			if(check!="no")
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
			check= u.inputString();
			if(check!="no")
			{
				play();
			}
		}
	}
	public void player()
	{
		System.out.println("\nYour Turn");
		System.out.println("Enter X and Y Positions:");
		int x= u.inputInteger();
		int y= u.inputInteger();
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
		int x= rd.nextInt(3);
		int y= rd.nextInt(3);
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

