import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class thirdWindow extends JFrame implements ActionListener {

    JLabel welcomeLabel;
    JLabel label;
    JLabel label1;
    JLabel label2;
    JButton readButton;
    JButton startButton;

    public thirdWindow(String name) {

        label = new JLabel();
        label1 = new JLabel();
        label2 = new JLabel();

        label.setText("Please select the options below.");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.BOLD, 10));

        label1.setText("Select [Read] to learn about Operations on Sets.");
        label1.setFont(new Font("Calibre", Font.PLAIN, 12));
        label1.setForeground(new Color(0x59D34D));

        label2.setText("Select [Start] to solve Operations on Sets.");
        label2.setFont(new Font("Calibre", Font.PLAIN, 12));
        label2.setForeground(new Color(0x59D34D));

        welcomeLabel = new JLabel("Hello, " + name + "!");
        welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        welcomeLabel.setForeground(new Color(0x84E97B));

        readButton = new JButton("Read");
        readButton.setPreferredSize(new Dimension(100, 25)); // Set preferred size
        readButton.setBackground(new Color(0x84E366));
        readButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        readButton.setForeground(Color.BLACK);

        startButton = new JButton("Start");
        startButton.setPreferredSize(new Dimension(100, 25)); // Set preferred size
        startButton.setBackground(new Color(0x84E366));
        startButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));
        startButton.setForeground(Color.BLACK);

        readButton.addActionListener(this);
        startButton.addActionListener(this);

        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.BLACK);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.weightx = 1.0;
        c.anchor = GridBagConstraints.CENTER;
        c.insets = new Insets(0, 0, 10, 0); // Add some vertical space between labels

        panel.add(welcomeLabel, c);

        c.gridy = 1;
        panel.add(label, c);

        c.gridy = 2;
        panel.add(label1, c);

        c.gridy = 3;
        panel.add(label2, c);

        c.gridy = 4;
        c.anchor = GridBagConstraints.CENTER; // Center align buttons
        panel.add(readButton, c);

        c.gridy = 5;
        panel.add(startButton, c);

        add(panel);

        setSize(350, 400); // Increased height to accommodate buttons
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == readButton) {
            // Perform action for Read button
            ReadWindow readWindow = new ReadWindow();
            readWindow.setVisible(true);
            dispose();
        } else if (e.getSource() == startButton) {
            // Perform action for Start button
            StartButton sButton = new StartButton();
            sButton.setVisible(true);
            dispose();
        }
    }
}
