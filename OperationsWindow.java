import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OperationsWindow extends JFrame implements ActionListener {
    private Map<String, Set<Integer>> sets;
    private JPanel panel;
    private JButton complementButton, intersectionButton, unionButton, differenceButton;

    public OperationsWindow(Map<String, Set<Integer>> sets) {
        this.sets = sets;

        panel = new JPanel(new GridLayout(0, 1));
        complementButton = new JButton("Complement");
        intersectionButton = new JButton("Intersection");
        unionButton = new JButton("Union");
        differenceButton = new JButton("Difference");

        complementButton.addActionListener(this);
        intersectionButton.addActionListener(this);
        unionButton.addActionListener(this);
        differenceButton.addActionListener(this);

        panel.add(complementButton);
        complementButton.setBackground(new Color(0x486A45));
        complementButton.setForeground(Color.WHITE);
        complementButton.setFont(new Font("Courier New", Font.BOLD, 14));
        complementButton.setBorder(BorderFactory.createEtchedBorder());

        panel.add(intersectionButton);
        intersectionButton.setBackground(new Color(0x486A45));
        intersectionButton.setForeground(Color.WHITE);
        intersectionButton.setFont(new Font("Courier New", Font.BOLD, 14));
        intersectionButton.setBorder(BorderFactory.createEtchedBorder());

        panel.add(unionButton);
        unionButton.setBackground(new Color(0x486A45));
        unionButton.setForeground(Color.WHITE);
        unionButton.setFont(new Font("Courier New", Font.BOLD, 14));
        unionButton.setBorder(BorderFactory.createEtchedBorder());

        panel.add(differenceButton);
        differenceButton.setBackground(new Color(0x486A45));
        differenceButton.setForeground(Color.WHITE);
        differenceButton.setFont(new Font("Courier New", Font.BOLD, 14));
        differenceButton.setBorder(BorderFactory.createEtchedBorder());

        add(panel);

        setTitle("Select Operation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        //Switch case for selection.
        switch (command) {

            //for complement operation
            case "Complement":
                //The user will choose one specific set for the operation.
                String complementIndex = JOptionPane.showInputDialog(null, "Enter the index of the set to find complement:");
                Set<Integer> universalSet = sets.get("Universal Set");
                Set<Integer> setToComplement = sets.get("Set " + complementIndex);
                //Checking if the universal set and the set selected is not null.
                if (universalSet != null && setToComplement != null) {
                    Set<Integer> complement = new HashSet<>(universalSet);
                    complement.removeAll(setToComplement);
                    JOptionPane.showMessageDialog(null, "Complement of Set " + complementIndex + ": " + complement);
                } else {
                    JOptionPane.showMessageDialog(null, "Universal set or set to complement not found.");
                }
                break;

                //for intersection
            case "Intersection":
                //the user will choose whether he/she wants to use all the sets or just use specific sets for the operation.
                String useAll = JOptionPane.showInputDialog(null, "Use all sets? (yes/no):");
                //if yes...
                if (useAll != null && useAll.equalsIgnoreCase("yes")) {
                    Set<Integer> intersection = new HashSet<>();
                    boolean firstSet = true;
                    for (Set<Integer> set : sets.values()) {
                        if (firstSet) {
                            intersection.addAll(set);
                            firstSet = false;
                        } else {
                            intersection.retainAll(set);
                        }
                    }
                    if (intersection.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Intersection of all sets: [] or <empty set>");
                    } else {
                        JOptionPane.showMessageDialog(null, "Intersection of all sets: " + intersection);
                    }
                //if no...
                } else {
                    String indicesInput = JOptionPane.showInputDialog(null, "Enter indices of sets to intersect (separated by space):");
                    if (indicesInput != null) {
                        String[] indices = indicesInput.trim().split("\\s+");
                        Set<Integer> intersection = new HashSet<>();
                        for (String index : indices) {
                            Set<Integer> set = sets.get("Set " + index);
                            if (intersection.isEmpty()) {
                                intersection.addAll(set);
                            } else {
                                intersection.retainAll(set);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Intersection of specified sets: " + intersection);
                    }
                }
                break;

            //for union
            case "Union":
                //the same as intersection, the user will choose whether he/she wants to use all the sets or not.
                String useAllUnion = JOptionPane.showInputDialog(null, "Use all sets? (yes/no):");
                if (useAllUnion != null && useAllUnion.equalsIgnoreCase("yes")) {
                    Set<Integer> union = new HashSet<>();
                    for (Set<Integer> set : sets.values()) {
                        if (set != null) {
                            union.addAll(set);
                        }
                    }
                    JOptionPane.showMessageDialog(null, "Union of sets: " + union);
                } else {
                    String indicesInput = JOptionPane.showInputDialog(null, "Enter indices of sets to union (separated by space):");
                    if (indicesInput != null) {
                        String[] indices = indicesInput.trim().split("\\s+");
                        Set<Integer> union = new HashSet<>();
                        for (String index : indices) {
                            Set<Integer> set = sets.get("Set " + index);
                            if (set != null) {
                                union.addAll(set);
                            }
                        }
                        JOptionPane.showMessageDialog(null, "Union of specified sets: " + union);
                    }
                }
                break;

            //for difference
            case "Difference":
                //the user will select two set indices for the operation.
                String[] diffSets = JOptionPane.showInputDialog(null, "Enter indices of two sets for difference (separated by space):").trim().split("\\s+");
                if (diffSets.length == 2) {
                    Set<Integer> set1 = sets.get("Set " + diffSets[0]);
                    Set<Integer> set2 = sets.get("Set " + diffSets[1]);
                    if (set1 != null && set2 != null) {
                        Set<Integer> difference = new HashSet<>(set1);
                        difference.removeAll(set2);
                        JOptionPane.showMessageDialog(null, "Difference of Set " + diffSets[0] + " and Set " + diffSets[1] + ": " + difference);
                    } else {
                        JOptionPane.showMessageDialog(null, "One or both of the specified sets not found.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Please enter exactly two indices.");
                }
                break;
        }

    }
    }
