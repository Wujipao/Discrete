import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntersectionWindow extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel titleLabel, label, exampleTitle, exampleLabel;
    private JButton backButton, tryButton;

    public IntersectionWindow() {

        titleLabel = new JLabel("INTERSECTION OF SETS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0x89F07F));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        label = new JLabel("<html><p style='width: 400px; text-align: " +
                "justify; text-indent: 20px; line-height: 2.0; color: white;'><strong>The Intersection of sets</strong> is the set " +
                "that contains all the elements that are common to both sets. The symbol for the intersection of " +
                "sets is “∩’’. For any two sets A and B, the intersection, A ∩ B (read as A intersection B) " +
                "lists all the elements that are present in both sets (common elements of A and B).</p> ");
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        exampleTitle = new JLabel("EXAMPLE OF INTERSECTION OF SETS");
        exampleTitle.setForeground(new Color(0x89F07F));
        exampleTitle.setFont(new Font("Arial", Font.BOLD, 16));

        exampleLabel = new JLabel("<html><p style='width: 400px; text-align: justify; text-indent: 20px; line-height: 2.0; color: white;'> " +
                "<br>1. Set A = {1, 2, 3, 4} and Set B = {3, 4, 5, 6}<br>" +
                "   <br><strong>Intersection: A ∩ B = {3, 4}</strong><br> <br><br>" +
                "<br>2. Set X = {apple, banana, orange} and Set Y = {banana, cherry, grape}<br>" +
                "  <br> <strong>Intersection: X ∩ Y = {banana}</strong><br> <br><br>" +
                "<br>3. Set P = {red, green, blue, yellow} and Set Q = {blue, yellow, purple}<br>" +
                "   <br><strong>Intersection: P ∩ Q = {blue, yellow}</strong><br> </p></html>");
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
        setTitle("INTERSECTION WINDOW");
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
