import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UnionWindow extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel, label, exampleTitle, exampleLabel;
    private JButton backButton, tryButton;

    public UnionWindow() {
        titleLabel = new JLabel("UNION OF SETS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0x89F07F));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        label = new JLabel("<html><p style='width: 400px; text-align: " +
                "justify; text-indent: 20px; line-height: 2.0; color: white;'>Union of sets " +
                "is one of the set operations that is used in set theory. In addition to the union of sets, " +
                "the other set operations are difference and intersection. All the set operations are represented " +
                "by using a unique operator. The union of sets is analogous to arithmetic addition. The union of sets " +
                "is the set that contains all the elements present in both sets. The symbol for the union of sets " +
                "is \"∪''. For any two sets A and B, the union, A ∪ B (read as A union B) lists all the elements of set " +
                "A as well as set B. Thus, for two given sets, Set A = {1,2,3,4,5} and " +
                "Set B = {3,4,6,8}, A ∪ B = {1,2,3,4,5,6,8}.</p> ");
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        exampleTitle = new JLabel("EXAMPLE OF UNION OF SETS");
        exampleTitle.setForeground(new Color(0x89F07F));
        exampleTitle.setFont(new Font("Arial", Font.BOLD, 16));

        exampleLabel = new JLabel("<html><p style='width: 400px; text-align: justify; line-height: 1.0; color: white;'> " +
                "1. In Greenville Middle School, two classes will be merged into one in order to reduce costs. " +
                "If the students in Band and Chorus are combined into one new class, then which students will be in that class?<br>" +
                "<br>Band = {Sam, Lorrie, Raúl, Derek} and Chorus = {Robin, Derek, Kyesha}<br>" +
                "<strong>Band ∪ Chorus = {Sam, Lorrie, Raúl, Derek, Kyesha, Robin}</strong><br><br>" +
                "<br>2. Let A = {counting numbers}, B = {multiples of 3 less than 20}, and C = {even numbers less than 20}" +
                "<br><br><strong>B ∪ C = {2, 3, 4, 6, 8, 9, 10, 12, 14, 15, 16, 18}</strong> </p></html>");
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
        setTitle("UNION WINDOW");
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
        }
        else if(e.getSource()==backButton){
            ReadWindow rw = new ReadWindow();
            rw.setVisible(true);
            dispose();
        }
    }
}
