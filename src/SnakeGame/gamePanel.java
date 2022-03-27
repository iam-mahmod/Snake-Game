package SnakeGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;
 
public class gamePanel extends JPanel implements ActionListener,KeyListener{
	static final int SW = 1200;//SCREEN_WHIDT
    static final int SH=700;//SCREEN_HEIGDT
    static final int US=16;//UNIT_SIZE
    static final int GU=(SW*SH)/US;//Game_Unit
    int delay=80;
    final int x[]=new int [GU];
    final int y[]=new int [GU];
    int BP=5;//BODY_PARTS
    int aE,aX,aY;
    char d='R';//DIRECTION
    boolean r=false;//running
    Timer t;//timer
    Random R;//random
    JFrame frm=new JFrame("Game");
    JPanel p1=new JPanel();
    JPanel p2=new JPanel();
    JLabel l1=new JLabel("SCORE");
    JLabel l2=new JLabel("EASY");
    JLabel l3=new JLabel("NORMAL");
    JLabel l4=new JLabel("HARD");
    JLabel l5=new JLabel("SUPER");
    JLabel l6=new JLabel("HOME");
    JLabel l7=new JLabel("EXIT");
    JLabel l8=new JLabel("PAUSE");
    JLabel l9=new JLabel("RESUME");

    
    gamePanel(){
        frm.setVisible(true);
        frm.setResizable(false);
        frm.setSize(SW, SH);
        frm.setLocation(360, 90);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        l1.setForeground(Color.white);
        l1.setLayout(null);
        l1.setFont(new Font("MV Boli",Font.BOLD,20));
        l1.setBounds(1000, 10, 150, 20);
        
        l2.setForeground(Color.white);
        l2.setLayout(null);
        l2.setFont(new Font("MV Boli",Font.BOLD,20));
        l2.setBounds(1000, 200, 150, 20);
        
        l3.setForeground(Color.white);
        l3.setLayout(null);
        l3.setFont(new Font("MV Boli",Font.BOLD,20));
        l3.setBounds(1000, 240, 150, 20);
        
        l4.setForeground(Color.white);
        l4.setLayout(null);
        l4.setFont(new Font("MV Boli",Font.BOLD,20));
        l4.setBounds(1000, 280, 150, 20);
        
        l5.setForeground(Color.white);
        l5.setLayout(null);
        l5.setFont(new Font("MV Boli",Font.BOLD,20));
        l5.setBounds(1000, 320, 150, 20);
        
        l6.setForeground(Color.white);
        l6.setLayout(null);
        l6.setFont(new Font("MV Boli",Font.BOLD,20));
        l6.setBounds(1000, 600, 150, 20);
        
        l7.setForeground(Color.white);
        l7.setLayout(null);
        l7.setFont(new Font("MV Boli",Font.BOLD,20));
        l7.setBounds(1000, 650, 150, 20);
        
        l8.setForeground(Color.white);
        l8.setLayout(null);
        l8.setFont(new Font("MV Boli",Font.BOLD,20));
        l8.setBounds(1000, 450, 150, 20);
        
        l9.setForeground(Color.white);
        l9.setLayout(null);
        l9.setFont(new Font("MV Boli",Font.BOLD,20));
        l9.setBounds(1000, 500, 150, 20);
        
        R=new Random();
        this.setPreferredSize(new Dimension(1100,688));
        this.setBackground(Color.DARK_GRAY);
        this.setFocusable(true);
        this.addKeyListener(this);
        this.add(l2); this.add(l3); this.add(l4); this.add(l1);
        this.add(l5); this.add(l6); this.add(l7); this.add(l8); this.add(l9);
        frm.add(this);
        frm.pack();
        frm.setLocationRelativeTo(null);
        
        l2.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l2){
                    frm.dispose();
                    gamePanel p1=new gamePanel();
                    p1.setFocusable(true);
                    p1.frm.setVisible(true);
                    p1.delay=80;
                    p1.startGame();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l2){
                    l2.setForeground(Color.yellow);
                }
            }
            
            @Override
            public void mouseExited(MouseEvent e) {
            l2.setForeground(Color.white);
            }
        });
        
        l3.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l3){
                    frm.dispose();
                    gamePanel p2 = new gamePanel();
                    p2.setFocusable(true);
                    p2.frm.setVisible(true);
                    p2.delay = 60;
                    p2.startGame();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l3){
                    l3.setForeground(Color.green);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l3.setForeground(Color.white);
            }
        });
        
        l4.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l4){
                    frm.dispose();
                    gamePanel p3 = new gamePanel();
                    p3.setFocusable(true);
                    p3.frm.setVisible(true);
                    p3.delay = 40;
                    p3.startGame();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l4){
                    l4.setForeground(Color.orange);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l4.setForeground(Color.white);
            }
        });
        
        l5.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l5){
                    frm.dispose();
                    gamePanel p4 = new gamePanel();
                    p4.setFocusable(true);
                    p4.frm.setVisible(true);
                    p4.delay = 20;
                    p4.startGame();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l5){
                    l5.setForeground(Color.red);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l5.setForeground(Color.white);
            }
        });
        
        l6.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l6){
                    frm.dispose();
                    newFrame d = new newFrame();
					d.frm.setVisible(true);
                    t.stop();
                    
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l6){
                    l6.setForeground(Color.green);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l6.setForeground(Color.white);
            }
        });
        
        l7.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l7){
                    frm.dispose();
                    t.stop();
                    gameControl m1=new gameControl();
                    m1.t1.stop();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l7){
                    l7.setForeground(Color.red);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l7.setForeground(Color.white);
            }
        });
        
        l8.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l8){
                    t.stop();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l8){
                    l8.setForeground(Color.red);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l8.setForeground(Color.white);
            }
        });
        
        l9.addMouseListener(new MouseListener(){
            public void mouseClicked(MouseEvent e){
                if(e.getSource()==l9){
                    t.start();
                }
            }
            @Override
            public void mousePressed(MouseEvent e) {}

            @Override
            public void mouseReleased(MouseEvent e) {}

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.getSource()==l9){
                    l9.setForeground(Color.green);
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
            l9.setForeground(Color.white);
            }
        });
        
    }
    public void startGame(){
        new_a();
        r = true;
        t = new Timer(delay,this);
        t.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); 
        draw(g);
    }
    public void draw(Graphics g){
    if(r){
        g.setColor(Color.black);
        g.fillRect(0, 0, 992, 688);
        g.setColor(Color.red);
        g.fillOval(aX, aY, US, US);

            for(int i=0 ; i<BP ; i++){

                if(i==0){

                    g.setColor(Color.red);
                    g.fillOval(x[i], y[i], US, US);
                }
                else{

                    g.setColor(Color.red);
                    g.fillOval(x[i], y[i], US, US);
                }
            }
                g.setColor(Color.white);
                g.setFont(new Font("MV Boli",Font.BOLD,20));
                g.drawString(""+aE, 1000, 60);
        }
        else{gameOver(g);}
    }
    
    public void new_a(){
    aX = R.nextInt((int)(976/US))*US;
    aY = R.nextInt((int)(672/US))*US;
    }
    
    public void move(){
        for(int i=BP;i>0;i--){
            x[i] = x[i-1];
            y[i] = y[i-1];
        }
        switch(d){
            case 'U':y[0] = y[0]-US;break;
            case 'D':y[0] = y[0]+US;break;
            case 'L':x[0] = x[0]-US;break;
            case 'R':x[0] = x[0]+US;break;
        }
    }
    public void check_a(){
    if(x[0]==aX && y[0]==aY){
        BP++;
        aE++;
        new_a();
 }
    }
    public void checkCollision(){
    
        for(int i=BP ; i>0 ; i--){
            if((x[0]==x[i])&&(y[0]==y[i])){ r = false; }
        }
        if(x[0]<0){x[0]=976;}
        if(x[0]>976){x[0]=0;}
        if(y[0]<0){y[0]=672;}
        if(y[0]>672){ y[0]=0;}
        if(!r){t.stop();}
     }
    public void gameOver(Graphics g){
        g.setColor(Color.black);
        g.fillRect(0, 0, 992, 688);
        g.setColor(Color.red);
        g.setFont(new Font("MV Boli",Font.BOLD,75));
        g.drawString("GAME OVER", 250, 300);
        g.setColor(Color.WHITE);
        g.setFont(new Font("MV Boli",Font.BOLD,40));
        g.drawString("SCORE : "+aE, 10, 40);
        g.setColor(Color.BLACK);
        g.setFont(new Font("InkFree",Font.BOLD,20));
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
         if(r){
            move();
            check_a();
            checkCollision();
        }
        repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){case KeyEvent.VK_LEFT: if(d !='R'){d = 'L';} break; }
            switch(e.getKeyCode()){ case KeyEvent.VK_RIGHT: if(d !='L'){ d = 'R'; } break;}    
            switch(e.getKeyCode()){ case KeyEvent.VK_UP: if(d !='D'){d = 'U';} break;}
            switch(e.getKeyCode()){ case KeyEvent.VK_DOWN: if(d !='U'){d = 'D';} break;}  
    }

    @Override
    public void keyReleased(KeyEvent e) {}
}

