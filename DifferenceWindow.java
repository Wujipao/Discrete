import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DifferenceWindow extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label, titleLabel, exampleLabel, exampleTitle;
    private JButton backButton, tryButton;
    public DifferenceWindow() {
        titleLabel = new JLabel("DIFFERENCE OF SETS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0x89F07F));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        label = new JLabel("<html><p style='width: 400px; text-align: " +
                "justify; text-indent: 20px; line-height: 2.0; color: white;'>The <strong>Difference between the two sets</strong>," +
                "A and B, written as A\\ B or A- B, is a set that contains those elements of A that are NOT in B. " +
                "To find the difference, we remove all the elements of set B from set A. The resulting set " +
                "consists of the remaining elements exclusive to set A.<br><br>" +
                "To find the set difference between two sets, say Set A and Set B, follow the following steps:<br>" +
                "<strong>Step 1</strong>: Find the intersection of the sets A and B.<br>" +
                "<strong>Step 2</strong>: Eliminate the elements of A ∩ B from Set A to write a new set. " +
                "In other words, remove the elements in A that are also present in Set B.<br>" +
                "<strong>Step 3</strong>: Define the new set as A B.</p> ");
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        exampleTitle = new JLabel("EXAMPLE OF DIFFERENCE OF SETS");
        exampleTitle.setForeground(new Color(0x89F07F));
        exampleTitle.setFont(new Font("Arial", Font.BOLD, 16));

        exampleLabel = new JLabel("<html><p style='width: 400px; text-align: justify; text-indent: 20px;" +
                "line-height: 2.0; color: white;'>" +
                "<br>1. A = {1, 2, 3, 4, 5, 6, 7, 8, 9 , 10} " +
                "<br>B = {6, 7, 8, 9, 10, 11, 12}" +
                "<br>A-B= {1, 2, 3, 4, 5, 6, 7, 8, 7, 10} - {6, 7, 8, 9, 10, 11, 12}" +
                "<br><strong>A – B = {1, 2, 3, 4, 5}</strong> <br>" +
                "<br>2. A = {1, 2, 3, 4}" +
                "<br>B = {2, 3, 5, 6}" +
                "<br><strong>A-B = {1, 4}</strong><br>" +
                "<br>3. A = {10, 20, 30, 40, 50}" +
                "<br>B = {20,30, 40,60,70,80}" +
                "<br><strong>A-B = {60, 70,80}</strong> " +
                " </p></html>");
        exampleLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        backButton = new JButton("BACK");
        backButton.addActionListener(this);
        backButton.setBackground(new Color(0x89F07F));
        backButton.setFocusable(false);
        backButton.setBorder(BorderFactory.createEtchedBorder());
        backButton.setPreferredSize(new Dimension(100, 15));
        backButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        tryButton = new JButton("TRY");
        tryButton.addActionListener(this);
        tryButton.setBackground(new Color(0x89F07F));
        tryButton.setFocusable(false);
        tryButton.setBorder(BorderFactory.createEtchedBorder());
        tryButton.setPreferredSize(new Dimension(100, 15));
        tryButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));


        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.BLACK);
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        panel.add(label, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        panel.add(exampleTitle, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(exampleLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        panel.add(tryButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(backButton, gbc);

        add(panel);
        setTitle("DIFFERENCE WINDOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==tryButton){
            StartButton sb = new StartButton();
            sb.setVisible(true);
            dispose();
        } else if(e.getSource()==backButton){
            ReadWindow rw = new ReadWindow();
            rw.setVisible(true);
            dispose();
        }

    }
}
