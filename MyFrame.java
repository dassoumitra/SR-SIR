import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        // Set the frame properties
        setTitle("Output Frame");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JLabel to display output
        JLabel outputLabel = new JLabel("Your output goes here!");
        
        // Add the label to the frame's content pane
        getContentPane().add(outputLabel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MyFrame frame = new MyFrame();
            frame.setVisible(true);
        });
    }
}