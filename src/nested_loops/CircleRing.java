package nested_loops;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import org.jointheleague.graphical.robot.Robot;

public class CircleRing {
    public static void main(String[] args) throws Exception {

        // 1. Make a new Robot
    	Robot oof = new Robot();
    	oof.setX(150);
    	oof.setY(200);
    	oof.penDown();
    	oof.setSpeed(1000);
    	for (int i=0;i<360;i++) {
    		oof.move(3);
    		oof.turn(1);
    		if(i%20==0) {
    			for(int j=0;j<360;j++) {
    				oof.move(1);
    				oof.turn(1);
    			}
    		}
    	}
       //  2. Set your robot’s position to x=150 and y=200

        // 3. Put the robot's pen down

        // 4. Set the robot’s speed to 10

        // 5. Do everything below here 360 times (use i as the counter)

	        // 6. Move the robot 3 pixels

       //  7. Turn the robot 1 degree

        // 8. If the counter i is divisible by 20 (hint: use mod operator  %)..

		// 9. do steps 10 and 11 exactly 360 times (use j as the counter)

				// 10. Move the robot 1 pixel

				// 11. Turn the robot 1 degree
}
}
