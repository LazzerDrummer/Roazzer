package home.lazzer.roazzer;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.KeyStroke;

public class Map extends JComponent  implements ActionListener{
	private static final long serialVersionUID = -2084597859725054693L;
	Road road;
	Car car;
	int time=0;
	int width=1500;
	int height=900;
	Action rightAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e) {
            car.x+=10;
        }
    };
    Action leftAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e) {
            car.x-=10;
        }
    };
    Action upAction = new AbstractAction(){
        public void actionPerformed(ActionEvent e) {
            car.y-=10;
        }
    };
	public Map(Road road, Car car) {
		super();
		this.road = road;
		this.car = car;
		this.road.map = this;
		this.car.map = this;
		car.initPosition();
		InputMap inputMap = getInputMap(JPanel.WHEN_IN_FOCUSED_WINDOW);
	    ActionMap actionMap = getActionMap();

	    inputMap.put(KeyStroke.getKeyStroke("RIGHT"), "rightAction");
	    actionMap.put("rightAction", rightAction);
	    inputMap.put(KeyStroke.getKeyStroke("LEFT"), "leftAction");
	    actionMap.put("leftAction", leftAction);
	    inputMap.put(KeyStroke.getKeyStroke("UP"), "upAction");
	    actionMap.put("uptAction", upAction);
		
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
