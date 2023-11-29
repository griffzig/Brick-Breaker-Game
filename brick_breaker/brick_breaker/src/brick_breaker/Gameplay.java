package brick_breaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// implements the different components of the game

public class Gameplay extends JPanel implements KeyListener, ActionListener {

    private boolean play = true;
    private int score = 0;
    private int totalBricks = 21;
    private Timer timer;
    private int delay = 5;
    private int player1 = 310;
    private int ballXCoord = 120;
    private int ballYCoord = 350;
    private int ballXDir = -1;
    private int ballYDir = -2;

    private Bricks map;

    // Constructor
    public Gameplay() {
        map = new Bricks (3, 7);
        addKeyListener(this);
        setFocusable(true); // set certain components on focus
        setFocusTraversalKeysEnabled(false);
        // create and start the timer at the beginning of the game
        timer = new Timer(delay, this);
        timer.start();
    }

    public void paint (Graphics g) {

        // set background color

        map.draw((Graphics2D)g);

        // set the color of the borders

        // draw the score keeper

        // create the paddle

        // create the ball

        // game terminates when no bricks are left
        if (totalBricks <= 0) {
            play = false;
            ballXDir = 0;
            ballYDir = 0;

            // player wins message

            // allow player to restart the game
        }

        if (ballYCoord > 570) {
            play = false;
            ballXDir = 0;
            ballYDir = 0;

            // game over message
            
            // allow player to restart the game
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        time.start();
        if (play) {
            // detect intersection of 2 objects
        }
    }
}