package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score=0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String answer= JOptionPane.showInputDialog("What runs all around a backyard, yet never moves?");

		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if (answer.equals("fence")) {
			JOptionPane.showInputDialog("correct!");
			JOptionPane.showInputDialog(score=score+1);
		}

		// 5. Otherwise, say "wrong" and tell them the answer
		else {JOptionPane.showInputDialog("Wrong. The answer was a fence.");}

		// 6. Add some more riddles
		String answertwo= JOptionPane.showInputDialog("What tastes better than it smells?");
		if (answertwo.equals("tongue")) {
			JOptionPane.showInputDialog("correct!");
			score=score+1;
			
		}
		else {JOptionPane.showInputDialog("Incorrect. The answer was a tongue.");
	}


		

		// 2. Make a pop up to show the score.
		JOptionPane.showInputDialog(score);
	
      }}


