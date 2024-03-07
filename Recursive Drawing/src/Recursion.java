import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Recursion extends JPanel implements ActionListener{
	
	/* this method should recursive draw concentric rings */
	public void concentricCircles(Graphics g, int width, int x, int y) {
		 
		//base0case trivial case - no work to do
		if(width == 0) {
			return; //do nada
		}else {
			
			//partial "work" done by each method is to draw ONE circle
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			//the recursive call will have the next method call draw the next circle!
			//then it does it over and over
			concentricCircles(g, width - 4, x + 2, y + 2);
			
		}
		
		
	}	
	
	public void squares(Graphics g, int width, int x, int y) {
		//add the additional parameters (arguments) so that you can call
		//on the method recursively
		if(width == 0) {
			return;
		}else {
			
			//focus on 1 quadrant - get the shape for top-left quadrant
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.fillRect(x, y, width, width);
			
			//the recursive call will have the next method call draw the next circle!
			//then it does it over and over
			
			
			//squares that draw down ----
			//remember it'll be relative positioning!
			
			
			//squares that draw to the right
			
			//to the left!
			
			//upper-left diag
			
		}
		
		
	}
	
	
	
	
	public void clover(Graphics g, int width, int x, int y) { //What additional variables will you need to draw the shape?
		
		//no work needed - base case
		if(width == 0) {
			return;
		}else {
			
			//focus on 1 quadrant - get the shape for top-left quadrant
			int red = (int)(Math.random()*256);
			int green = (int)(Math.random()*256);
			int blue = (int)(Math.random()*256);
			g.setColor(new Color(red, green, blue));
			g.drawOval(x, y, width, width);
			
			//the recursive call will have the next method call draw the next circle!
			//then it does it over and over
			clover(g, width - 5, x + 5, y + 5);
			
		}
		
		
	}
	


	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 2000, 2000);
		//this.concentricCircles(g, 200, 50, 50);
		this.clover(g, 200, 50, 50);
		this.clover(g,  200,  50, 50);
		this.clover(g,  200,  50, 50);
		this.clover(g,  200,  50, 50);
		this.squares(g,  200,  600, 400);
		
	} //my code should go above this bracket unless I know about classes
	
	public static void main(String[] arg) {
		
		// line of code to create a MethodPractice object
		Recursion m = new Recursion();
	
	}// end of main method body 
	
	
	//constructor for the class
	//kind of looks like a method but no return type!!!
	public Recursion() {
		JFrame f = new JFrame("Recursive Methods");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 		f.setSize(1920,1080);
 		//want to use the animation timer?
 		t.start();
		f.add(this);
		f.setVisible(true);
		
	}
	Timer t = new Timer(200, this);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repaint();
	}

}//last curly - do not delete