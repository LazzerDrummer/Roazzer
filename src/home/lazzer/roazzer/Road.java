package home.lazzer.roazzer;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;

public class Road extends JComponent implements ActionListener {
	private static final long serialVersionUID = 7684382000314660093L;
	
	int width=1500;
	int height=900;
	int roadWidth = 200;
	int lineHeight=15;
	int time=0;
	public void paint(Graphics g) {
		int b[] = TerrainData.borders;
		int border = (width-roadWidth)/2;
	    for(int i=0;i<height/lineHeight;i++)
	    {
	    	int x1 = b[(i+time)%b.length]+border;
	    	int x2 = b[(i+1+time)%b.length]+border;
			g.drawLine(x1,height-i*lineHeight,x1,height-(i+1)*lineHeight);
		    g.drawLine(x1+roadWidth,height-i*lineHeight,x1+roadWidth,height-(i+1)*lineHeight);
		    g.drawLine(x1,height-(i+1)*lineHeight ,x2,height-(i+1)*lineHeight);
		    g.drawLine(x1+roadWidth,height-(i+1)*lineHeight,x2+roadWidth,height-(i+1)*lineHeight);
	    }
	}
	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(width, height);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		time++;
		repaint();
	}
}