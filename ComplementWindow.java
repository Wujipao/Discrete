import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComplementWindow extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label, titleLabel, exampleLabel, exampleTitle;
    private JButton backButton, tryButton;

    public ComplementWindow() {

        titleLabel = new JLabel("COMPLEMENT OF A SET");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0x89F07F));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

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

        label = new JLabel("<html><p style='width: 400px; text-align: " +
                "justify; text-indent: 20px; line-height: 2.0; color: white;'>The <strong>Complement of a set</strong> " +
                "is the set that includes all the elements of the universal set that are not present in " +
                "the given set. Let's say A is a set of all coins which is a subset of a universal set " +
                "that contains all coins and notes, so the complement of set A is a set of notes " +
                "(which does not includes coins).</p> " +
                "<html><p style='width: 400px; text-align: justify; text-indent: 20px; line-height: 2.0; color: white;'>" +
                "The complement of a set A is the set of elements in the universal set which are not in set A; " +
                "that is the set of all elements in the universal set outside of a set A. We denote the complement " +
                "of A by A¹." +
                "</p> ");
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        exampleTitle = new JLabel("EXAMPLE OF COMPLEMENT OF A SET");
        exampleTitle.setForeground(new Color(0x89F07F));
        exampleTitle.setFont(new Font("Arial", Font.BOLD, 16));

        exampleLabel = new JLabel("<html><p style='width: 400px; text-align: justify; text-indent: 20px;" +
                "line-height: 2.0; color: white;'>The procedure of finding the complement of a set is demonstrated " +
                "by an example here. If the universal set is all prime numbers up to 25 and set A = {2, 3, 5} " +
                "then the complement of set A contains elements other than the elements of A. " +
                "<br><br><strong>Step 1</strong>: Check for the universal set and the set for which you need to find " +
                "the complement. U = {2, 3, 5, 7, 11, 13, 17, 19, 23}, A = {2, 3, 5}." +
                "<br><strong>Step 2</strong>: Subtract, that is (U – A). Here, <strong>U – A = A’</strong>" +
                "<br>= { ̶2̶,̶ 3̶,̶ 5̶, 7, 11, 13, 17, 19, 23} – { ̶2̶,̶ 3̶,̶ 5̶}" +
                "<br><strong>= {7, 11, 13, 17, 19, 23}</strong>" +
                "<br><br>Example #2" +
                "<br>U = {1,3,4,6,8,9}" +
                "<br>A = {1,4,9}" +
                "<br><strong>Answer: A¹ = {3,6,8}</strong>" +
                "<br><br>Example #3" +
                "<br>U = {1,2,3,4,5,6,7,8,9}" +
                "<br>A = {2,4,6,8,9}" +
                "<br><strong>Answer: A¹ = {1,3,5,7}</strong></p></html>");
        exampleLabel.setFont(new Font("Arial", Font.PLAIN, 14));

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
        setTitle("COMPLEMENT WINDOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==backButton){
            ReadWindow rw = new ReadWindow();
            rw.setVisible(true);
            dispose();
        }
        else if (e.getSource()==tryButton){
            StartButton sb = new StartButton();
            sb.setVisible(true);
            dispose();
        }
    }
}
