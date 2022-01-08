package arrays;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	Robot robot0 = new Robot();
	Robot robot1 = new Robot();
	Random random = new Random();
	public 	double originX = 450;
	public 	double originY = 300;
	
	public double angle = 0;
	
	public int r = 150;
	
	public int x = (int) Math.round(originX + r * Math.sin(angle));
	
	public int y = (int) Math.round(originY + r * Math.cos(angle));
	
	public int rob0 = 1;
	public int rob1 = 1;
	public int rand0 = 0;
	public int rand1 = 0;
	
	public void robot0(int random0) {
		for(int i=0; i<random0; i++) {
			
			angle = angle + Math.toRadians(5);
			
			x = (int) Math.round(originX + r * Math.sin(angle));
			
			y = (int) Math.round(originY + r * Math.cos(angle));
		
			robot0.moveTo(x, y);
			rob0++;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void robot1(int random1) {
		for(int i=0; i<random1; i++) {
			
			angle = angle + Math.toRadians(5);
			
			x = (int) Math.round(originX + r * Math.sin(angle));
			
			y = (int) Math.round(originY + r * Math.cos(angle));
			
			robot1.moveTo(x, y);
			rob1++;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void combo() {
		while(rob0<36 && rob1<36) {
			rand0 = random.nextInt(3);
			rand1 = random.nextInt(3);
			robot0(rand0);
			robot1(rand1);
			
		}
		if(rob0>rob1) {
			System.out.println("rob 0 is the winner");
		}else {
			System.out.println("rob 1 is the winner");
		}
	}
	public void run() {
		combo();
	}
				
}