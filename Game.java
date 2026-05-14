//This program will be commented from start to end :)

import java.awt.*; //Imported for GUI layout and color classes
import java.awt.event.*; //Imported for handling the events
import javax.swing.*; //Imported for components like JFrame and JButton
import java.util.Random; //Imported for randomizing the target square

public class Game extends JFrame{  // Our main class representing the game window

	private int targetSquare; // Variable for our target square
    private int triesLeft = 3; //Variable for the amount of tries left until program termination
    private JButton[] buttons = new JButton[9]; // Array to store all 9 squares (buttons)
	
	public Game() { // Constructor for our class to set up the interface
		setLayout(new GridLayout(3, 3)); // Organizing the window into a 3x3 grid layout
		
		targetSquare = new Random().nextInt(9); // Generating a random value for our target square (between 0 and 8)
		
		setTitle("Target Square: " + (targetSquare + 1)); /* Displaying the target square in the title and 
		incrementing it by 1 so the user picks a realistic value and not an index value*/
		
		
		for (int i = 0; i < 9; i++) { // Loop to create and set up all the squares (buttons)
            buttons[i] = new JButton(); // declaring the button (creating an instance of it)
            buttons[i].setContentAreaFilled(false); // Make our square transparent so the color change is easily seen
            buttons[i].setOpaque(true); // Allowing the square to be filled with color
            buttons[i].setBorder(BorderFactory.createLineBorder(Color.BLACK)); /* Adding black borders to each square
            so that they become more easily distinguishable */
            final int index = i; // Storing each loop's index so that it gets used in the listeners below

           
            buttons[i].addMouseListener(new MouseAdapter() { // An event listener for each square to handle hover and click logic
                @Override
                public void mouseEntered(MouseEvent e) { //  Triggers when mouse hovers
                    if (buttons[index].getBackground() != Color.RED && 
                        buttons[index].getBackground() != Color.GREEN) { 
                        buttons[index].setBackground(Color.BLUE); /* Square is set to blue when hovered on as long as 
                        it has not been clicked in a previous attempt */
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {  //Triggers when mouse leaves a square
                    if (buttons[index].getBackground() == Color.BLUE) {
                        buttons[index].setBackground(null); /* Returns square to transparent color if its last color 
                        was blue when it was hovered on */
                    }
                }

                @Override
                public void mousePressed(MouseEvent e) { // Triggers when square is clicked
                	
                    if (index == targetSquare) {
                        buttons[index].setBackground(Color.GREEN); 
                        JOptionPane.showMessageDialog(null, "Rami says you won!");
                        System.exit(0); /* Square color set to green, congratulation message displayed, and program termination
                        after target square is clicked */
                    } else {
                        buttons[index].setBackground(Color.RED); 
                        triesLeft--; // Remaining attempts amount decremented and square color set to red after wrong square clicked
                        
                        if (triesLeft > 0) {
                            JOptionPane.showMessageDialog(null, "Whoops... Rami gives you " + triesLeft + " more tries"); // Remaining attempts displayed if greater than 0
                        } else {
                            JOptionPane.showMessageDialog(null, "Game Over! Rami says you Lost:(");
                            System.exit(0); // Program terminated after no more attempts remaining
                        }
                    }
                }
            });
            add(buttons[i]); // Add the squares (buttons) to the window
        }
		
		setSize(350, 300); // Setting the window's width and height
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Ensuring program termination after window is closed
		setVisible(true); // Making the window appear on the screen
	}
	
	
	public static void main(String[] args) { // For starting the program
		new Game(); // Creating an instance of our game (literally starting the program)
	}
} // I  hope the comments were explanatory. Thank you Dr. Alan for making these abstract and complicated OOP concepts easy for us to understand!

