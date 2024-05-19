import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ReadWindow extends JFrame implements ActionListener {
    JPanel panel, buttonPanel ;
    JLabel titleLabel;
    JLabel label;
    JButton complementButton;
    JButton intersectionButton;
    JButton unionButton;
    JButton differenceButton;

    public ReadWindow(){

        titleLabel = new JLabel("OPERATIONS ON SETS");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
        titleLabel.setForeground(new Color(0x89F07F));
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);

        label = new JLabel("<html><div style='width: 400px; text-align: justify; text-indent: 20px; " +
                "line-height: 2.0; color: white;'> <strong>Operations on Sets</strong> are mathematical " +
                "operations that are performed on sets to " +
                "manipulate or combine them in various ways. These operations allow us to compare, analyze, " +
                "and manipulate sets to derive new sets or to understand relationships between existing sets. " +
                "Here are the four major operations of sets: " +
                "<ul style='list-style-type: disc; margin-left: 40px;'> <li><strong>COMPLEMENT</strong></li> " +
                "<li><strong>INTERSECTION</strong></li> " +
                "<li><strong>UNION</strong></li> " +
                "<li><strong>DIFFERENCE</strong></li>  </ul>" +
                "Each operation provides a way to interact with sets and extract meaningful " +
                "information about their elements and relationships. " +
                "<br><br>Learn about the four operations by clicking the buttons below:</div>");
                label.setForeground(Color.WHITE);
        label.setFont(new Font("Arial", Font.PLAIN, 14));

        complementButton = new JButton("Read Complement");
        complementButton.setFocusable(false);
        complementButton.setForeground(Color.WHITE);
        complementButton.setBackground(new Color(0x486A45));
        complementButton.setBorder(BorderFactory.createEtchedBorder());
        complementButton.setSize(30, 15);
        complementButton.addActionListener(this);
        complementButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        intersectionButton = new JButton("Read Intersection");
        intersectionButton.setFocusable(false);
        intersectionButton.setForeground(Color.WHITE);
        intersectionButton.setBackground(new Color(0x486A45));
        intersectionButton.setBorder(BorderFactory.createEtchedBorder());
        intersectionButton.setSize(30, 15);
        intersectionButton.addActionListener(this);
        intersectionButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        unionButton = new JButton("Read Union");
        unionButton.setFocusable(false);
        unionButton.setForeground(Color.white);
        unionButton.setBackground(new Color(0x486A45));
        unionButton.setBorder(BorderFactory.createEtchedBorder());
        unionButton.setSize(30, 15);
        unionButton.addActionListener(this);
        unionButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        differenceButton = new JButton("Read Difference");
        differenceButton.setFocusable(false);
        differenceButton.setForeground(Color.WHITE);
        differenceButton.setBackground(new Color(0x486A45));
        differenceButton.setBorder(BorderFactory.createEtchedBorder());
        differenceButton.setSize(30, 15);
        differenceButton.addActionListener(this);
        differenceButton.setFont(new Font("Times New Roman", Font.PLAIN, 12));

        panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(label, BorderLayout.CENTER);

        buttonPanel = new JPanel(new GridLayout(4,1 , 10, 10));
        buttonPanel.setBackground(Color.BLACK);
        buttonPanel.add(complementButton);
        buttonPanel.add(intersectionButton);
        buttonPanel.add(unionButton);
        buttonPanel.add(differenceButton);

        panel.add(buttonPanel, BorderLayout.SOUTH);

        add(panel);
       setTitle("READ WINDOW");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(600,500);
       setLocationRelativeTo(null);
       setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        String command = e.getActionCommand();
        switch(command){
            case "Read Complement":
                ComplementWindow cw = new ComplementWindow();
                cw.setVisible(true);
                dispose();
                break;
            case "Read Intersection":
                IntersectionWindow iw = new IntersectionWindow();
                iw.setVisible(true);
                dispose();
                break;
            case "Read Union":
                UnionWindow uw = new UnionWindow();
                uw.setVisible(true);
                dispose();
                break;
            case "Read Difference":
                DifferenceWindow dw = new DifferenceWindow();
                dw.setVisible(true);
                dispose();
                break;

        }
    }
}
