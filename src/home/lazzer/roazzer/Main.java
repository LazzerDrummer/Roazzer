package home.lazzer.roazzer;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.Timer;

public class Main {

	public static void main(String[] args) {
		JFrame window = new JFrame("ROAZZZZZZZER");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Map myCanvas = new Map(new Road(),new Car());
		window.getContentPane().add(myCanvas, BorderLayout.CENTER);
		window.pack();
		window.setVisible(true);
		Timer timer = new Timer(25, myCanvas);
		timer.start();
		
	    
	}
}
