package towerDefense;

<<<<<<< HEAD
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {
	public static JFrame frame = new JFrame("Tower Defense");
	public static int width, height;
	
	public static void createWindow() {
		Window.width = Toolkit.getDefaultToolkit().getScreenSize().width;
		Window.height = Toolkit.getDefaultToolkit().getScreenSize().height;

		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		TowerMain towermain = new TowerMain();
		frame.add(towermain);
		GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
		gd.setFullScreenWindow(frame);
		frame.setVisible(true);
		
	}
	
=======
import javax.swing.JFrame;

public class Window extends JFrame{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Window(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//end program on close
		this.setExtendedState(MAXIMIZED_BOTH);//full screen
		this.setVisible(true);
		this.setName("Tower Defense Game");//what will we call it?
		this.setResizable(false);
		this.setEnabled(true);
		//this.getContentPane() is the panel everything is on
		//put a panel for buttons and stuff and a panel for the map on there. We can also layer panels, too.
	}

	public void repaint(){//called on refresh
		
	}
>>>>>>> a05b423cd5c37f1cd38f0c58b42fe74659492f2e
}
