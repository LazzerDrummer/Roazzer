package home.lazzer.roazzer;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Road myCanvas = new Road();
		window.getContentPane().add(myCanvas, BorderLayout.CENTER);
		window.pack();
		window.setVisible(true);
	}

}
