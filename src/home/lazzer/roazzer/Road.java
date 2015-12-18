package home.lazzer.roazzer;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Road extends JComponent {
	private static final long serialVersionUID = 7684382000314660093L;
	
	int width=300;
	int height=500;
	int roadWidth = 150;
	int lineHeight=15;
	public void paint(Graphics g) {
		int [] b = {1,2,4,6,12,24,48,24,12,6,4,2,1,7,6,5,4,3,2,1};
		int border = (width-roadWidth)/2;
	    for(int i=0;i<b.length-1;i++)
	    {
	    	int x1 = b[i]+border;
	    	int x2 = b[i+1]+border;
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

}