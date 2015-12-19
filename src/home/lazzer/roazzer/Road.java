package home.lazzer.roazzer;
import java.awt.Graphics;

import javax.swing.JComponent;

public class Road extends JComponent {
	private static final long serialVersionUID = 7684382000314660093L;
	public Map map;
	int roadWidth = 200;
	int lineHeight=15;
	
	public void paint(Graphics g) {
		int b[] = TerrainData.borders;
		int border = (map.width-roadWidth)/2;
	    for(int i=0;i<map.height/lineHeight;i++)
	    {
	    	int x1 = b[(i+map.time)%b.length]+border;
	    	int x2 = b[(i+1+map.time)%b.length]+border;
			g.drawLine(x1,map.height-i*lineHeight,x1,map.height-(i+1)*lineHeight);
		    g.drawLine(x1+roadWidth,map.height-i*lineHeight,x1+roadWidth,map.height-(i+1)*lineHeight);
		    g.drawLine(x1,map.height-(i+1)*lineHeight ,x2,map.height-(i+1)*lineHeight);
		    g.drawLine(x1+roadWidth,map.height-(i+1)*lineHeight,x2+roadWidth,map.height-(i+1)*lineHeight);
	    }
	}
}