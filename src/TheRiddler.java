import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		JOptionPane.showMessageDialog(null,
				"I am gonna ask you 5 riddles. If you get them right you will get a point.Your goal is to get 5 points. Make sure the answers are capitalized. GOOD LUCK!");
		String answer1 = JOptionPane.showInputDialog("I am often running. You need me,but I don't need you.What am I?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by
		// one
		if (answer1 == "Water") {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score = 1;
		} else {
			JOptionPane.showMessageDialog(null, "WRONGGGGG!");
		}
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
		String answer2 = JOptionPane.showInputDialog(
				"I can only exist when you are here. Where you never were, I can never be. What am I?");
		// 2. Make a pop up to show the score.
		if (answer2 == "Reflection") {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score = 2;
		} else {
			JOptionPane.showMessageDialog(null, "WRONNGG SORRY BETTER LUCK NEXT TIME");
		}
		String answer3 = JOptionPane.showInputDialog(
				"I’m always there, some distance away. Somewhere between land or sea and sky I lay. You may move towards me, yet distant I stay.");
		if (answer3 == "Horizon") {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score = 3;
		} else {
			JOptionPane.showMessageDialog(null, "WRONNGG SORRY BETTER LUCK NEXT TIME");
		}
		String answer4 = JOptionPane
				.showInputDialog("My rings are not of gold, but I get more as I get old. What am I?");
		if (answer4 == "A tree") {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score = 4;
		} else {
			JOptionPane.showMessageDialog(null, "WRONNGG SORRY BETTER LUCK NEXT TIME");
		}
		String answer5 = JOptionPane.showInputDialog("What has a heart that doesn’t beat?");
		if (answer5 == "Articoke") {
			JOptionPane.showMessageDialog(null, "CORRECT!");
			score = 5;
		} else {
			JOptionPane.showMessageDialog(null, "WRONNGG SORRY BETTER LUCK NEXT TIME");
		}
		JOptionPane.showMessageDialog(null, "You have " + score + "points");
	}
}
