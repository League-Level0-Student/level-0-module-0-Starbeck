package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class robotGraffiti {
	public static void main(String[] args) {
		Robot k1b0 = new Robot();
		k1b0.setSpeed(100);
		k1b0.penDown();
		k1b0.move(100);
		k1b0.turn(180);
		k1b0.move(50);
		k1b0.turn(-90);
		k1b0.move(50);
		k1b0.turn(90);
		k1b0.move(50);
		k1b0.turn(180);
		k1b0.move(100);
		k1b0.hide();
	}

}
