package home.lazzer.roazzer;

import java.awt.Graphics;

import javax.swing.JComponent;

public class Car extends JComponent {
	private static final long serialVersionUID = -7319693902308258910L;
	public Map map;
	int width = 50;
	int height = 50;
	int x;
	int y;
	public void paint(Graphics g) {
		g.drawRect(x, y, width, height);
	}
	public void initPosition() {
		x=(map.width/2)- (width/2);
		y=((map.height-height)-1);
	}
}
