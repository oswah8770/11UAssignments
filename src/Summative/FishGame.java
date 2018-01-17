/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Summative;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author oswah8770
 */
public class FishGame extends JComponent {
    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Just Keep Swimmin'";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    // fish x, y, width, height
    int fishX = 100;
    int fishY = 300;
    int fishHeight = 100;
    int fishWidth = 100;
    int fishFoodSpeed = 7;
    
    // booleans of movement
    
    boolean right = false;
    boolean left = false;
    boolean up = false;
    boolean down = false;
    
    // speed
    int fishSpeed = 4;
    
    // obstacle variables, speed, y, x, height, width, direction
    double obstacleSpeed = 3;
    int obstacleDX = -1;
    int obstacleHeight = 60;
    int obstacleWidth = 60;
    int obstacleY = 200;
    int obstacleX = WIDTH + obstacleWidth;
    
    int obstacleX2 = WIDTH + obstacleWidth + 150;
    int obstacleY2 = 400;
    
    int obstacleX3 = WIDTH + obstacleWidth + 300;
    int obstacleY3 = 300;
    
    int obstacleX4 = WIDTH + obstacleWidth + 450;
    int obstacleY4 = 500;
    
    double distance = 0;
    
    // boolean to show game over
    boolean gameOver = false;
    
    // count score
    int scoreCounter = 0;
    int score = 0;
    
    // color of fish fin
    Color darkPink = new Color(186, 145, 146);
    
    // fin position (for animation)
    int finHeight = 50;
    
    // movement lines
    // color of line
    Color darkCyan = new Color(151, 191, 196);
    int lineX = WIDTH + 200;
    int lineY = 150;
    int lineWidth = 200;
    int lineHeight = 1;
    
    int lineX2 = WIDTH + 100;
    int lineY2 = 300;
    
    int lineX3 = WIDTH + 600;
    int lineY3 = 450;
    
    
    
    // bubble x and y points that will change
    int bubbleY = 200;
    int bubbleY2 = 450;
    int bubbleY3 = 300;
    int bubbleX = 350;
    int bubbleX2 = 650;
    int bubbleX3 = 150;
    
    // color of fish food
    Color fishFood = new Color(255, 250, 183);
    
    // coordinates and width/height of the fish food
    int fishFoodX = 400;
    int fishFoodY = 400;
    int fishFoodWidth = 25;
    int fishFoodHeight = 25;
    
    // fish food counter
    int fishFoodCounter = 0;
    
    // font
    Font biggerFont = new Font("arial", Font.BOLD, 42);

    // GAME VARIABLES END HERE   
    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public boolean hasCollided(double centerX, double centerY, int width, double fishCenterX, double fishCenterY, int fishWidth) {
        boolean hasCollided = false;
        double distance = Math.sqrt(Math.pow((centerX - fishCenterX), 2) + (Math.pow(centerY - fishCenterY, 2)));
        if ( distance < (fishWidth / 2) + (width / 2)) {
                // when hit by obstacle, end game and show game over
                hasCollided = true;
            } else {
            hasCollided = false;
        }
        return hasCollided;
    }
    
    
    public FishGame() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double buffered!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);

        // GAME DRAWING GOES HERE

        // background water
        g.setColor(Color.BLUE);
        g.fillRect(0, 0, 800, 600);

        // bubbles
        g.setColor(Color.CYAN);
        g.drawOval(bubbleX, bubbleY, 50, 50);
        g.drawOval(bubbleX2, bubbleY2, 25, 25);
        g.drawOval(bubbleX3, bubbleY3, 35, 35);
        
         // movement lines
        g.setColor(darkCyan);
        g.fillRect(lineX, lineY, lineWidth, lineHeight);
        g.fillRect(lineX2, lineY2, lineWidth, lineHeight);
        g.fillRect(lineX3, lineY3, lineWidth, lineHeight);
        
        // fish body
        g.setColor(Color.PINK);
        g.fillOval(fishX, fishY, fishWidth, fishHeight);
        
        // tail
        g.setColor(Color.PINK);
        int[] fishXpoints = {fishX - 15, fishX - 15, fishX + 20};
        int[] fishYpoints = {fishY - 0, fishY + 100, fishY + 50};
        g.fillPolygon(fishXpoints, fishYpoints, 3);

        
        // fish eyes
        g.setColor(Color.WHITE);
        g.fillOval(fishX + 55, fishY + 15, 30, 30);

        g.setColor(Color.BLACK);
        g.fillOval(fishX + 65, fishY + 20, 20, 20);
        
        // fish fins
        g.setColor(darkPink);
        g.drawArc(fishX + 50, fishY + 40, 25, finHeight, 180, 180);

        // fish food
        g.setColor(fishFood);
        
        g.fillOval(fishFoodX, fishFoodY, 25, 25);
        
        // obstacles
        g.setColor(Color.RED);
        
        // obstacle 1, 2, 3, and 4
        g.fillOval(obstacleX, obstacleY, obstacleWidth, obstacleHeight);
        g.fillOval(obstacleX2, obstacleY2, obstacleWidth, obstacleHeight);
        g.fillOval(obstacleX3, obstacleY3, obstacleWidth, obstacleHeight);
        g.fillOval(obstacleX4, obstacleY4, obstacleWidth, obstacleHeight);
        
        // score
        g.setColor(Color.GREEN);
        g.setFont(biggerFont);
        g.drawString("" + score, WIDTH - 100, 50);
        // if game is over
        if (gameOver) {
                g.drawString("GAME OVER", WIDTH / 2 - 150, HEIGHT / 2);
            }

        // fish food counter
        g.setColor(Color.ORANGE);
        g.setFont(biggerFont);
        g.drawString("" + fishFoodCounter, 100, 50);
        
       
        
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 

            // move the lines backwards make it look like fish is moving forward
            // make the lines move backwards
            lineX2 = (int)(lineX2 - obstacleSpeed) - 3;
            lineX3 = (int)(lineX3 - obstacleSpeed) - 3;
            lineX = (int)(lineX - obstacleSpeed) - 3;
            
            // reappear if they go off screen on the left
            if (lineX < lineWidth * -1) {
                lineX = WIDTH;
            }
            if (lineX2 < lineWidth * -1) {
                lineX2 = WIDTH;
            }
            if (lineX3 < lineWidth * -1) {
                lineX3 = WIDTH;
            }
            // increase score over time
            
            scoreCounter = scoreCounter + 1;
            score = (scoreCounter - (scoreCounter % 10)) / 10;
            
            
            
            // fish movement
            if (right && left == false && fishX < WIDTH - 110) {
                fishX = fishX + fishSpeed;
            } else if (left && right == false && fishX + (fishX - 40) > 0) {
                fishX = fishX - fishSpeed;
            }

            if (up && down == false && fishY > 0) {
                fishY = fishY - fishSpeed;
            } else if (down && up == false && fishY + 100 < HEIGHT) {
                fishY = fishY + fishSpeed;
            }

            // animating fin
            
            // if reaches the end of the screen puts x off screen on the left
            if (fishX >= 900) {
                fishX = -150;
            }

            
            // obstacles
            // increases by 0.05 speed every second (obstacle speed increases 0.0168 sixty times (sixty frames) then divide that number by 20 and add it to the original)
            obstacleSpeed = obstacleSpeed + 0.000833333;
            
            obstacleX = (int)(obstacleX - obstacleSpeed);
            obstacleX2 = (int)(obstacleX2 - obstacleSpeed);
            obstacleX3 = (int)(obstacleX3 - obstacleSpeed);
            obstacleX4 = (int)(obstacleX4 - obstacleSpeed);
            
            if (obstacleX < 0 - obstacleWidth) {
                // randomize Y when it comes off screen
                obstacleY = (int)(Math.random() * (obstacleHeight - (HEIGHT - obstacleHeight) + 1)) + (HEIGHT - obstacleHeight);
                obstacleX = WIDTH + obstacleWidth;
            }
            if (obstacleX2 < 0 - obstacleWidth) {
                // randomize Y when it comes off screen
                obstacleY2 = (int)(Math.random() * (obstacleHeight - (HEIGHT - obstacleHeight) + 1)) + (HEIGHT - obstacleHeight);
                obstacleX2 = WIDTH + obstacleWidth;
            }
            if (obstacleX3 < 0 - obstacleWidth) {
                // randomize Y when it comes off screen
                obstacleY3 = (int)(Math.random() * (obstacleHeight - (HEIGHT - obstacleHeight) + 1)) + (HEIGHT - obstacleHeight);
                obstacleX3 = WIDTH + obstacleWidth;
            }
            if (obstacleX4 < 0 - obstacleWidth) {
                // randomize y when it goes off the screen on the left
                obstacleY4 = (int)(Math.random() * (obstacleHeight - (HEIGHT - obstacleHeight) + 1)) + (HEIGHT - obstacleHeight);
                obstacleX4 = WIDTH + obstacleWidth;
            }
            
            // make fish food appear just off screen on the right side after being collected or reaching the very left
            fishFoodX = fishFoodX - fishFoodSpeed;
            if (fishFoodX <= (fishFoodWidth * 30) * -1) {
                fishFoodY = (int)(Math.random() * (fishFoodHeight - (HEIGHT - obstacleHeight) + 1)) + (HEIGHT - obstacleHeight);
                fishFoodX = WIDTH + fishFoodWidth;
            }
            // collision detection between obstacles and fish
            // find the distance between the two circles and if that distance is less than the sum of the two radiuses, then collision occurs
            // center point of the obstacle and the radius
            // updating variables
            // obstacle 1 and fish variables for collision detection
            double obstacleCenterX = obstacleX + (obstacleWidth / 2);
            double obstacleCenterY = obstacleY + (obstacleHeight / 2);
            double obstacleRadius = obstacleWidth / 2;
            
            double fishRadius = fishWidth / 2;
            double fishCenterX = fishX + (fishWidth / 2);
            double fishCenterY = fishY + (fishHeight / 2);
            
            // obstacle 2
            double obstacleCenterX2 = obstacleX2 + (obstacleWidth / 2);
            double obstacleCenterY2 = obstacleY2 + (obstacleHeight / 2);
            
            // obstacle 3
            double obstacleCenterX3 = obstacleX3 + (obstacleWidth / 2);
            double obstacleCenterY3 = obstacleY3 + (obstacleHeight / 2);
            
            // obstacle 4
            double obstacleCenterX4 = obstacleX4 + (obstacleWidth / 2);
            double obstacleCenterY4 = obstacleY4 + (obstacleHeight / 2);
            
            if (hasCollided(obstacleCenterX, obstacleCenterY, obstacleWidth, fishCenterX, fishCenterY, fishWidth) == true) {
                gameOver = true;
                done = true;
            }
            
            if (hasCollided(obstacleCenterX2, obstacleCenterY2, obstacleWidth, fishCenterX, fishCenterY, fishWidth) == true) {
                gameOver = true;
                done = true;
            }
            
            if (hasCollided(obstacleCenterX3, obstacleCenterY3, obstacleWidth, fishCenterX, fishCenterY, fishWidth) == true) {
                gameOver = true;
                done = true;
            }
            if (hasCollided(obstacleCenterX4, obstacleCenterY4, obstacleWidth, fishCenterX, fishCenterY, fishWidth) == true) {
                gameOver = true;
                done = true;
            }
            
            
            // fish food collision with fish
            double fishFoodCenterX = fishFoodX + (fishFoodWidth / 2);
            double fishFoodCenterY = fishFoodY + (fishFoodHeight / 2);
            double fishFoodRadius = fishFoodWidth / 2;
            
            
            if (hasCollided(fishFoodCenterX, fishFoodCenterY, fishFoodWidth, fishCenterX, fishCenterY, fishWidth)) {
                // when touching fish food, collect fish food
                fishFoodCounter++;
                fishFoodX = fishFoodWidth * -1;
                
            }
            // if fish food counter reaches 5, reset to 0 and add + 1 speed.
            if (fishFoodCounter == 5) {
                fishFoodCounter = 0;
                fishSpeed = fishSpeed + 1;
                fishFoodSpeed = fishFoodSpeed + 1;
            }
            // bubbles rising

            bubbleY = bubbleY - 1;
            bubbleY2 = bubbleY2 - 1;
            bubbleY3 = bubbleY3 - 1;

            int randomNum = (int) (Math.random() * (40 - 1 + 1)) + 1;
            if (randomNum == 1) {
                bubbleX = bubbleX - 3;
                bubbleX2 = bubbleX2 - 3;
                bubbleX3 = bubbleX3 - 3;
            } else if (randomNum == 2) {
                bubbleX = bubbleX + 3;
                bubbleX2 = bubbleX2 + 3;
                bubbleX3 = bubbleX3 + 3;
            } else {
            }

            // if they reach top of screen, resets them at the bottom
            if (bubbleY <= -50) {
                bubbleY = 650;
            }

            if (bubbleY2 <= -50) {
                bubbleY2 = 650;
            }

            if (bubbleY3 <= -50) {
                bubbleY3 = 650;
            }

            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_RIGHT) {
                right = true;
            } else if (key == KeyEvent.VK_LEFT) {
                left = true;
            } else if (key == KeyEvent.VK_UP) {
                up = true;
            } else if (key == KeyEvent.VK_DOWN) {
                down = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();

            if (key == KeyEvent.VK_RIGHT) {
                right = false;
            } else if (key == KeyEvent.VK_LEFT) {
                left = false;
            } else if (key == KeyEvent.VK_UP) {
                up = false;
            } else if (key == KeyEvent.VK_DOWN) {
                down = false;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FishGame game = new FishGame();

        // starts the game loop
        game.run();
    }
}
