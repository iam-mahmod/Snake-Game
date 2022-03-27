package SnakeGame;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class newFrame implements MouseListener {
	JFrame frm = new JFrame();
	JLabel l1 = new JLabel("SNAKE GAME");
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	JButton b1 = new JButton("PLAY");
	JButton b2 = new JButton("EXIT");
	JLabel l2 = new JLabel("Credit : Mahmoud DELLO");
	gameControl n = new gameControl();

	newFrame() {

		frm.setTitle("Game");
		frm.setVisible(true);
		frm.setResizable(true);
		frm.setSize(1200, 900);
		frm.setLocation(360, 90);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		p1.setBackground(Color.black);
		p2.setBackground(Color.red);
		frm.setLayout(new GridLayout(1, 1));
		p1.setLayout(null);
		frm.add(p1);
		l1.setForeground(Color.white);
		l1.setBounds(320, 100, 784, 100);
		l1.setFont(new Font(null, Font.CENTER_BASELINE, 80));
		p1.add(l1);

		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
		b1.setFocusable(false);
		b1.setFont(new Font(null, Font.CENTER_BASELINE, 80));
		b1.setBounds(450, 500, 300, 100);
		p1.add(b1);

		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b1.setFocusable(false);
		b2.setFocusable(false);
		b2.setFont(new Font(null, Font.CENTER_BASELINE, 80));
		b2.setBounds(450, 650, 300, 100);
		p1.add(b2);

		l2.setForeground(Color.red);
		l2.setBounds(20, 800, 300, 50);
		l2.setFont(new Font("MV Boli", Font.CENTER_BASELINE, 15));
		p1.add(l2);
		b1.addMouseListener(this);
		b2.addMouseListener(this);
		p1.addMouseListener(this);

		p2.setBounds(320, 300, 540, 100);
		p2.setBackground(Color.red);
		p2.setLayout(null);
		n.setBackground(Color.black);
		n.setLayout(null);
		n.setBounds(320, 300, 540, 100);
		p1.add(n);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == b1) {
			gamePanel s = new gamePanel();
			s.setVisible(true);
			frm.dispose();
			n.t1.stop();
			s.startGame();
		}
		if (e.getSource() == b2) {
			n.t1.stop();
			frm.dispose();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource() == b1) {
			b1.setBackground(Color.green);
			b1.setForeground(Color.white);

		} else if (e.getSource() == b2) {
			b2.setBackground(Color.red);
			b2.setForeground(Color.white);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		b2.setBackground(Color.white);
		b2.setForeground(Color.black);
		b1.setBackground(Color.white);
		b1.setForeground(Color.black);
	}

}
