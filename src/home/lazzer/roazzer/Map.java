package home.lazzer.roazzer;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

public class Map extends JComponent  implements ActionListener{
	private static final long serialVersionUID = -2084597859725054693L;
	Road road;
	Car car;
	
	int time=0;
	int width=1500;
	int height=900;
	
	public Map(Road road, Car car) {
		super();
		this.road = road;
		this.car = car;
		this.road.map = this;
		this.car.map = this;
		
	}
	
	@Override
	public void paint(Graphics g) {
		road.paint(g);
		car.paint(g);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		time++;
		repaint();
	}
	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(width, height);
	}
}
