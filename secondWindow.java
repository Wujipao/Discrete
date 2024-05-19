import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class secondWindow extends JFrame implements ActionListener, KeyListener {

    JPanel panel;
    JButton button;
    JTextField textField;
    JLabel label;

    public secondWindow() {

        button = new JButton("Submit");
        button.setFocusable(false);
        button.setBackground(new Color(0x84E366));
        button.addActionListener(this);

        textField = new JTextField(20);
        textField.setEditable(true);
        textField.setBackground(new Color(0x394C37));
        textField.setForeground(Color.WHITE);
        textField.setFont(new Font("Serif", Font.PLAIN, 12));

        label = new JLabel("Please enter your name:");
        label.setForeground(new Color(0x84E97B));
        label.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 20));

        panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));  // Add small gaps
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);  // Add small gaps
        panel.add(label, c);

        c.gridy = 1;
        panel.add(textField, c);

        c.gridy = 2;
        panel.add(button, c);

        textField.addKeyListener(this);

        add(panel);
        setSize(500, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            String name = textField.getText();
            thirdWindow tWindow = new thirdWindow(name);
            tWindow.setVisible(true);
            dispose();
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        button.doClick();
        }
    }
}
