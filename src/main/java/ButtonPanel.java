import javax.swing.*;
import java.awt.*;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {

    JTextField screen;

    public ButtonPanel() {
        screen = new JTextField("", 10);
        screen.setFont(new Font("TimesRoman", Font.BOLD, 50));
        add(screen, BorderLayout.NORTH);

        setLayout(new GridLayout(5, 4));
        JButton jbCancel = new JButton("C");
        jbCancel.setBackground(Color.orange);
        JButton jbRemove = new JButton("«");
        jbRemove.setBackground(Color.orange);
        JButton jbSN = new JButton("x²");
        jbSN.setBackground(Color.orange);
        JButton jbSQRT = new JButton("√");
        jbSQRT.setBackground(Color.orange);
        JButton jb1 = new JButton("1");
        JButton jb2 = new JButton("2");
        JButton jb3 = new JButton("3");
        JButton jb4 = new JButton("4");
        JButton jb5 = new JButton("5");
        JButton jb6 = new JButton("6");
        JButton jb7 = new JButton("7");
        JButton jb8 = new JButton("8");
        JButton jb9 = new JButton("9");
        JButton jb0 = new JButton("0");
        JButton jbMltp = new JButton("*");
        jbMltp.setBackground(Color.orange);
        JButton jbDivide = new JButton("/");
        jbDivide.setBackground(Color.orange);
        JButton jbPlus = new JButton("+");
        jbPlus.setBackground(Color.orange);
        JButton jbMinus = new JButton("-");
        jbMinus.setBackground(Color.orange);
        JButton jbDot = new JButton(".");
        jbDot.setBackground(Color.orange);
        JButton jbEQ = new JButton("=");
        jbEQ.setBackground(Color.orange);
        add(jbCancel);
        add(jbRemove);
        add(jbSQRT);
        add(jbSN);
        add(jbCancel);
        add(jbRemove);
        add(jbSQRT);
        add(jbSN);
        add(jb1);
        add(jb2);
        add(jb3);
        add(jbPlus);
        add(jb4);
        add(jb5);
        add(jb6);
        add(jbMinus);
        add(jb7);
        add(jb8);
        add(jb9);
        add(jbMltp);
        add(jbDot);
        add(jb0);
        add(jbEQ);
        add(jbDivide);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 1);
                } else {
                    screen.setText("1");
                }
            }
        });

        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 2);
                } else {
                    screen.setText("2");
                }
            }
        });

        jb3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 3);
                } else {
                    screen.setText("3");
                }
            }
        });

        jb4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 4);
                } else {
                    screen.setText("4");
                }
            }
        });

        jb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 5);
                } else {
                    screen.setText("5");
                }
            }
        });

        jb6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 6);
                } else {
                    screen.setText("6");
                }
            }
        });

        jb7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 7);
                } else {
                    screen.setText("7");
                }
            }
        });

        jb9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 9);
                } else {
                    screen.setText("9");
                }
            }
        });

        jb0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 0);
                } else {
                    screen.setText("0");
                }
            }
        });

        jb8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!screen.getText().equals("0")) {
                    screen.setText(screen.getText() + 8);
                } else {
                    screen.setText("8");
                }
            }
        });

        jbCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                screen.setText("");
            }
        });

        jbDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (screen.getText().equals("") | screen.getText() == null) {
                    screen.setText("0.");
                } else if (!screen.getText().contains(".")) {
                    screen.setText(screen.getText() + ".");
                }
            }
        });

        jbRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (screen.getText().length() >= 1) {
                    String s = screen.getText().substring(0, screen.getText().length() - 1);
                    screen.setText(s);
                }
            }
        });

        jbSQRT.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sqrt = Math.sqrt(Double.parseDouble(screen.getText())) + "";
                if (sqrt.length() > 17) {
                    sqrt = sqrt.substring(0, 17);
                }
                if (sqrt.split("\\.")[1].equals("0")) {
                    sqrt = sqrt.split("\\.")[0];
                }
                screen.setText(sqrt);
            }
        });

        jbSN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sn = Math.pow(Double.parseDouble(screen.getText()), 2) + "";
// if (sn.length() > 17) {
// sn = sn.substring(0, 17);
// }
                if (sn.split("\\.")[1].equals("0")) {
                    sn = sn.split("\\.")[0];
                }
                screen.setText(sn);
            }
        });

        jbMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (screen.getText().equals("0")) {
                    screen.setText("-");
                }

                if (screen.getText().length() >= 1) {

                    if ((screen.getText().charAt(screen.getText().length() - 1) != '-') | (screen.getText().charAt(screen.getText().length() - 1) != '.')) {
                        screen.setText(screen.getText() + "-");
                    }
                } else {
                    screen.setText("-");
                }
            }
        });


    }
}
