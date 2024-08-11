import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempleGameGUI {
    private JFrame frame;
    private JButton enterButton;
    private JButton quitButton;
    private JTextArea textArea;

    public TempleGameGUI() {
        frame = new JFrame("Temple Adventure Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        textArea = new JTextArea();
        textArea.setEditable(false);
        frame.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        enterButton = new JButton("Enter the Temple");
        quitButton = new JButton("Quit");
        buttonPanel.add(enterButton);
        buttonPanel.add(quitButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        enterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enterTemple();
            }
        });

        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        textArea.append("Welcome to the Temple Adventure!\n");
        textArea.append("You are standing at the entrance of a mysterious temple.\n");
System.out.println("Saurabh");
        frame.setVisible(true);
    }

    public void enterTemple() {
        textArea.setText(""); // Clear the text area
        textArea.append("You are inside the temple. You see two doors: one on the left and one on the right.\n");

        enterButton.setEnabled(false); // Disable "Enter the Temple" button
        quitButton.setEnabled(false);  // Disable "Quit" button

        JButton leftButton = new JButton("Enter Left Door");
        JButton rightButton = new JButton("Enter Right Door");
        JButton backButton = new JButton("Go Back");

        leftButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("You entered the left door and found a treasure!\n");
                leftButton.setEnabled(false); // Disable the left door button
                rightButton.setEnabled(false); // Disable the right door button
                backButton.setEnabled(true);   // Enable the "Go Back" button
            }
        });

        rightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("You entered the right door and encountered a trap!\n");
                leftButton.setEnabled(false); // Disable the left door button
                rightButton.setEnabled(false); // Disable the right door button
                backButton.setEnabled(true);   // Enable the "Go Back" button
            }
        });

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText(""); // Clear the text area
                textArea.append("You are back at the entrance of the temple.\n");
                enterButton.setEnabled(true); // Enable "Enter the Temple" button
                quitButton.setEnabled(true);  // Enable "Quit" button
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(leftButton);
        buttonPanel.add(rightButton);
        buttonPanel.add(backButton);

        frame.add(buttonPanel, BorderLayout.SOUTH);
        frame.revalidate();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TempleGameGUI();
            }
        });
    }
}


