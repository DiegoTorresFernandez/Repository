import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;

public class runner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setSize(450, 800); // Set the size of the window
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Make sure the program exits when the frame closes
        frame.setLocationRelativeTo(null); // This will center the JFrame in the middle of the screen

        // Create a new label and add it to the frame
        JLabel label = new JLabel("Hello, World!", JLabel.CENTER);
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        // Create a new button and add it to the frame
        JButton button = new JButton("Click me");
        frame.getContentPane().add(button, BorderLayout.NORTH);

        frame.setVisible(true); // This will make the JFrame visible
    }
}
