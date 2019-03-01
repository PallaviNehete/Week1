/**
 * created by: Pallavi Nehete.
 * Date: 22/02/2019.
 * Purpose: Program to play a Tic-Tac-Toe Game.
 */

package com.bridgelabz.functional;
import com.bridgelabz.utility.TicTacToeUtility;
import com.bridgelabz.utility.Utility;
public class TicTacToe 
{
	Utility utility = new Utility();
	boolean flag = true;
	public static void main(String[] args) 
	{
		TicTacToeUtility ticTacToe = new TicTacToeUtility();
		System.out.println("\t***** WELCOME TO TIC_TAC_TOE GAME *****\n");
		ticTacToe.play();
	}
}

