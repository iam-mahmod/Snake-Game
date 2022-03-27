package SnakeGame;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class loadingScreen extends JFrame {

	JLabel label;
	JProgressBar bar;

	loadingScreen() {
		bar = new JProgressBar();
		bar.setBounds(69, 81, 350, 30);
		bar.setStringPainted(true);
		bar.setFont(new Font(null, Font.ITALIC, 20));
		bar.setForeground(Color.green);
		bar.setBackground(Color.BLACK);

		label = new JLabel();
		label.setLayout(null);
		label.setBounds(89, 41, 350, 50);
		label.setText("WELCOME TO OUR PROJECT");
		label.setFont(new Font("MV Boli", Font.ITALIC, 20));
		label.setForeground(Color.RED);
		label.setBackground(Color.GREEN);

		this.setLayout(null);
		this.setSize(500, 150);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.add(label);
		this.add(bar);
		this.getContentPane().setBackground(Color.black);
		this.setVisible(true);
		fill();

	}

	public void fill() {
		int counter = 0;
		while (counter <= 100) {
			bar.setValue(counter);
			if (counter >= 25) {
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			counter++;
		}
		bar.setString("Done :)");
		label.setFont(new Font("MV Boli", Font.ITALIC, 30));
		label.setText("Opening Snake Game");
		label.setForeground(Color.GREEN);
		try {
			Thread.sleep(1500);
			new newFrame();
			this.dispose();
		} catch (InterruptedException e) {
		}
	}
}