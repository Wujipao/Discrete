import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InitialWindow extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public InitialWindow() {

    button = new JButton("Continue");
        button.setFocusable(false);
        button.setBackground(new Color(0x84E366));
        button.addActionListener(this);

    label = new JLabel("WELCOME TO OPERATIONS ON SETS!");
        label.setForeground(new Color(0xA6FF8A));
        label.setFont(new Font("TIMES NEW ROMAN", Font.BOLD, 15));

    panel = new JPanel();
    panel.setBackground(new Color(0,0,0));
        panel.setLayout(new GridBagLayout());  // Use GridBagLayout for centering
    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
        panel.add(label, gbc);

    gbc.gridy = 2;
        panel.add(button, gbc);

    add(panel);


    setTitle("OPERATIONS ON SETS");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(500, 150);
    setLocationRelativeTo(null);
    setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
          secondWindow sWindow = new secondWindow();
          sWindow.setVisible(true);
          dispose();
        }
    }
}
