package ch08;

public class RobotEx {
	public static void action(Robot r) {
		if(r instanceof DanceRobot)((DanceRobot) r).dance();
		else if(r instanceof SingingRobot)((SingingRobot) r).singing();
		else if(r instanceof DrawRobot) { // 이것이 원래형식이고 위에 두개는 줄여쓴것이다.
			DrawRobot dr =(DrawRobot) r;
			dr.draw();
	}
		}
	public static void main(String[] args) {
		Robot[] robots = new Robot[3];
		robots[0] = new DanceRobot();
		robots[1] = new SingingRobot();
		robots[2] = new DrawRobot();
		
		for(Robot robot : robots) {
			action(robot);
		}
	}

}
