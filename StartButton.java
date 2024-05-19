import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class StartButton extends JFrame implements ActionListener {
    private static JLabel titleLabel, universalSetLabel, setLabel;
    private static JPanel panel;
    private static JTextField universalSetTextField, setTextField;
    private static JButton submitButton;
    private static Map<String, Set<Integer>> sets;

    public StartButton(){

        sets =  new HashMap<>();

        titleLabel = new JLabel("--------ENTER THE FOLLOWING--------");
        titleLabel.setForeground(Color.WHITE);
        titleLabel.setFont(new Font("Arial", Font.PLAIN, 12));

        universalSetLabel = new JLabel("Enter the values for Universal Set (separated by a space):");
        universalSetLabel.setForeground(new Color(0x89F07F));
        universalSetLabel.setFont(new Font("Courier New", Font.PLAIN, 14));

        setLabel = new JLabel("Enter the number of Sets:");
        setLabel.setForeground(new Color(0x89F07F));
        setLabel.setFont(new Font("Courier New", Font.PLAIN, 14));

        universalSetTextField = new JTextField(20);
        universalSetTextField.setEditable(true);
        universalSetTextField.setBackground(new Color(0x394C37));
        universalSetTextField.setForeground(Color.WHITE);
        universalSetTextField.setFont(new Font("Serif", Font.PLAIN, 12));


        setTextField = new JTextField(20);
        setTextField.setEditable(true);
        setTextField.setBackground(new Color(0x394C37));
        setTextField.setForeground(Color.WHITE);
        setTextField.setFont(new Font("Serif", Font.PLAIN, 12));

        submitButton = new JButton("Submit");
        submitButton.setFocusable(false);
        submitButton.setBackground(new Color(0x84E366));
        submitButton.addActionListener(this);

        panel = new JPanel(new GridBagLayout());
        panel.setBackground(Color.BLACK);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5); // Add some padding

        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.CENTER;
        panel.add(titleLabel, c);

        c.gridy = 1;
        panel.add(universalSetLabel, c);

        c.gridy = 2;
        panel.add(universalSetTextField, c);

        c.gridy = 3;
        panel.add(setLabel, c);

        c.gridy = 4;
        panel.add(setTextField, c);

        c.gridy = 5;
        panel.add(submitButton, c);

        add(panel);

        setTitle("OPERATIONS ON SETS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == submitButton){
                // Parse input values
                String universalSetInput = universalSetTextField.getText().trim();
                String[] universalSetValues = universalSetInput.split("\\s+");
                Set<Integer> universalSet = new HashSet<>();
                for (String value : universalSetValues) {
                    universalSet.add(Integer.parseInt(value));
                }
                sets.put("Universal Set", universalSet);

                int numSets = Integer.parseInt(setTextField.getText().trim());
                for (int i = 1; i <= numSets; i++) {
                    String setIndex = JOptionPane.showInputDialog(null, "Enter values for Set " + i + " (separated by a space):");
                    String[] setValues = setIndex.trim().split("\\s+");
                    Set<Integer> set = new HashSet<>();
                    for (String value : setValues) {
                        set.add(Integer.parseInt(value));
                    }
                    sets.put("Set " + i, set);
                }

                // Display operations window
                new OperationsWindow(sets);
            }
        }
    }




