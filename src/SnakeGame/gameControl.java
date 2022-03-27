package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

public class gameControl extends JPanel implements ActionListener {

	Timer t1 = new Timer(1, this);

	int x1 = 300, x2 = 280, x3 = 260, x4 = 240, x5 = 220;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillOval(x1, 40, 20, 20);
		g.fillOval(x2, 40, 20, 20);
		g.fillOval(x3, 40, 20, 20);
		g.fillOval(x4, 40, 20, 20);
		g.fillOval(x5, 40, 20, 20);
		t1.start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (x1 < 0 || x1 > this.getWidth() + 20) {
			x1 = 0;
		}
		if (x2 < 0 || x2 > this.getWidth() + 20) {
			x2 = 0;
		}
		if (x3 < 0 || x3 > this.getWidth() + 20) {
			x3 = 0;
		}
		if (x4 < 0 || x4 > this.getWidth() + 20) {
			x4 = 0;
		}
		if (x5 < 0 || x5 > this.getWidth() + 20) {
			x5 = 0;
		}
		x1 += 5;
		x2 += 5;
		x3 += 5;
		x4 += 5;
		x5 += 5;
		repaint();
	}
}