package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		Random ran = new Random();

		// 2. create an array of 5 robots.
		Robot[] robots = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robots.length; i++) {
			robots[i] = new Robot();
			robots[i].setY(550);
			robots[i].setX(200 * i + 50);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up

		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean robotfinish = true;
		int robotwin=0;
		while (robotfinish) {
			for (int i = 0; i < robots.length; i++) {
				robots[i].setY(robots[i].getY() - ran.nextInt(50));
				if (robots[i].getY() < 51) {
					robotwin=i;
					robotfinish = false;
					break;
				}
			}
		}
		JOptionPane.showMessageDialog(null, "robot "+robotwin+" has won");
		robots[robotwin].sparkle();
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
