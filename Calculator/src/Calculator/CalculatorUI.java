//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Calculator;

        import java.awt.Color;
        import java.awt.EventQueue;
        import java.awt.Font;
        import java.awt.LayoutManager;
        import java.awt.event.MouseAdapter;
        import java.awt.event.MouseEvent;
        import javax.swing.JButton;
        import javax.swing.JFrame;
        import javax.swing.JLabel;
        import javax.swing.border.MatteBorder;
        import Calculator.Math;
        import Calculator.Math.OPERATOR;

public class CalculatorUI extends JFrame {
    private final JLabel calcArea = new JLabel("");
    private boolean initialCalcAreaInputState;
    private CalculatorUI.STATE mathState;
    private OPERATOR mathOp;
    private double arg1;
    private double arg2;
    private double calcAnswer;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CalculatorUI frame = new CalculatorUI();
                frame.setVisible(true);
            } catch (Exception var1) {
                var1.printStackTrace();
            }

        });
    }

    private void calculateAnswer() {
        this.calcAnswer = Math.calculateIt(this.arg1, this.mathOp, this.arg2);
        this.calcArea.setText(String.valueOf(this.calcAnswer));
        this.arg1 = Double.parseDouble(this.calcArea.getText());
        this.mathState = CalculatorUI.STATE.CALC;
        this.initialCalcAreaInputState = true;
    }

    private void updateCalcArea(String string) {
        if (this.initialCalcAreaInputState) {
            this.calcArea.setText(string);
            this.initialCalcAreaInputState = false;
        } else {
            JLabel var10000 = this.calcArea;
            String var10001 = this.calcArea.getText();
            var10000.setText(var10001 + string);
        }

    }

    private void saveValueOfArg1() {
        this.arg1 = Double.parseDouble(this.calcArea.getText());
        this.mathState = CalculatorUI.STATE.SAVE1;
        this.initialCalcAreaInputState = true;
    }

    private void saveValueOfArg2() {
        if (this.mathState != CalculatorUI.STATE.CALC) {
            this.arg2 = Double.parseDouble(this.calcArea.getText());
            this.mathState = CalculatorUI.STATE.SAVE2;
        }

    }

    private void saveValueOfMathOp(OPERATOR op) {
        this.mathOp = op;
    }

    private void clearCalculator() {
        String calcAreaDefault = "0.0";
        this.calcArea.setText(calcAreaDefault);
        this.mathState = CalculatorUI.STATE.INITIAL;
        this.initialCalcAreaInputState = true;
        this.arg1 = 0.0D;
        this.arg2 = 0.0D;
        this.calcAnswer = 0.0D;
    }

    public CalculatorUI() {
        this.getContentPane().setBackground(new Color(29, 147, 187));
        this.setDefaultCloseOperation(2);
        this.setBounds(100, 100, 418, 450);
        this.getContentPane().setLayout((LayoutManager)null);
        this.calcArea.setForeground(Color.BLACK);
        this.calcArea.setFont(new Font("Times New Roman", 0, 72));
        this.calcArea.setHorizontalAlignment(4);
        this.calcArea.setBounds(18, 6, 377, 67);
        this.getContentPane().add(this.calcArea);
        final JButton button_1 = new JButton("1");
        button_1.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_1.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_1.setBackground(Color.GREEN);
            }
        });
        button_1.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_1.setOpaque(true);
        button_1.setForeground(Color.BLACK);
        button_1.setBackground(Color.GREEN);
        button_1.addActionListener((e) -> {
            this.updateCalcArea(button_1.getText());
        });
        button_1.setBounds(35, 86, 75, 40);
        this.getContentPane().add(button_1);
        final JButton button_2 = new JButton("2");
        button_2.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_2.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_2.setBackground(Color.GREEN);
            }
        });
        button_2.addActionListener((e) -> {
            this.updateCalcArea(button_2.getText());
        });
        button_2.setOpaque(true);
        button_2.setForeground(Color.BLACK);
        button_2.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_2.setBackground(Color.GREEN);
        button_2.setBounds(122, 86, 75, 40);
        this.getContentPane().add(button_2);
        final JButton button_3 = new JButton("3");
        button_3.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_3.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_3.setBackground(Color.GREEN);
            }
        });
        button_3.addActionListener((e) -> {
            this.updateCalcArea(button_3.getText());
        });
        button_3.setOpaque(true);
        button_3.setForeground(Color.BLACK);
        button_3.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_3.setBackground(Color.GREEN);
        button_3.setBounds(209, 86, 75, 40);
        this.getContentPane().add(button_3);
        final JButton button_4 = new JButton("4");
        button_4.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_4.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_4.setBackground(Color.GREEN);
            }
        });
        button_4.addActionListener((e) -> {
            this.updateCalcArea(button_4.getText());
        });
        button_4.setOpaque(true);
        button_4.setForeground(Color.BLACK);
        button_4.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_4.setBackground(Color.GREEN);
        button_4.setBounds(35, 138, 75, 40);
        this.getContentPane().add(button_4);
        final JButton button_5 = new JButton("5");
        button_5.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_5.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_5.setBackground(Color.GREEN);
            }
        });
        button_5.addActionListener((e) -> {
            this.updateCalcArea(button_5.getText());
        });
        button_5.setOpaque(true);
        button_5.setForeground(Color.BLACK);
        button_5.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_5.setBackground(Color.GREEN);
        button_5.setBounds(122, 138, 75, 40);
        this.getContentPane().add(button_5);
        final JButton button_6 = new JButton("6");
        button_6.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_6.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_6.setBackground(Color.GREEN);
            }
        });
        button_6.addActionListener((e) -> {
            this.updateCalcArea(button_6.getText());
        });
        button_6.setOpaque(true);
        button_6.setForeground(Color.BLACK);
        button_6.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_6.setBackground(Color.GREEN);
        button_6.setBounds(209, 138, 75, 40);
        this.getContentPane().add(button_6);
        final JButton button_7 = new JButton("7");
        button_7.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_7.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_7.setBackground(Color.GREEN);
            }
        });
        button_7.addActionListener((e) -> {
            this.updateCalcArea(button_7.getText());
        });
        button_7.setOpaque(true);
        button_7.setForeground(Color.BLACK);
        button_7.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_7.setBackground(Color.GREEN);
        button_7.setBounds(35, 190, 75, 40);
        this.getContentPane().add(button_7);
        final JButton button_8 = new JButton("8");
        button_8.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_8.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_8.setBackground(Color.GREEN);
            }
        });
        button_8.addActionListener((e) -> {
            this.updateCalcArea(button_8.getText());
        });
        button_8.setOpaque(true);
        button_8.setForeground(Color.BLACK);
        button_8.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_8.setBackground(Color.GREEN);
        button_8.setBounds(122, 190, 75, 40);
        this.getContentPane().add(button_8);
        final JButton button_9 = new JButton("9");
        button_9.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_9.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_9.setBackground(Color.GREEN);
            }
        });
        button_9.addActionListener((e) -> {
            this.updateCalcArea(button_9.getText());
        });
        button_9.setOpaque(true);
        button_9.setForeground(Color.BLACK);
        button_9.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_9.setBackground(Color.GREEN);
        button_9.setBounds(209, 190, 75, 40);
        this.getContentPane().add(button_9);
        final JButton button_0 = new JButton("0");
        button_0.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_0.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_0.setBackground(Color.GREEN);
            }
        });
        button_0.addActionListener((e) -> {
            this.updateCalcArea(button_0.getText());
        });
        button_0.setOpaque(true);
        button_0.setForeground(Color.BLACK);
        button_0.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_0.setBackground(Color.GREEN);
        button_0.setBounds(122, 242, 75, 40);
        this.getContentPane().add(button_0);
        final JButton button_plus = new JButton("+");
        button_plus.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_plus.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_plus.setBackground(Color.GREEN);
            }
        });
        button_plus.addActionListener((e) -> {
            this.saveValueOfArg1();
            this.saveValueOfMathOp(OPERATOR.PLUS);
        });
        button_plus.setOpaque(true);
        button_plus.setForeground(Color.BLACK);
        button_plus.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_plus.setBackground(Color.GREEN);
        button_plus.setBounds(327, 138, 75, 40);
        this.getContentPane().add(button_plus);
        final JButton button_minus = new JButton("-");
        button_minus.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_minus.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_minus.setBackground(Color.GREEN);
            }
        });
        button_minus.addActionListener((e) -> {
            this.saveValueOfArg1();
            this.saveValueOfMathOp(OPERATOR.MINUS);
        });
        button_minus.setOpaque(true);
        button_minus.setForeground(Color.BLACK);
        button_minus.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_minus.setBackground(Color.GREEN);
        button_minus.setBounds(327, 190, 75, 40);
        this.getContentPane().add(button_minus);

// Modulus button added here
        final JButton button_modulus = new JButton("%");
        button_modulus.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_modulus.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_modulus.setBackground(Color.GREEN);
            }
        });
        button_modulus.addActionListener((e) -> {
            this.saveValueOfArg1();
            this.saveValueOfMathOp(OPERATOR.MODULUS);
        });
        button_modulus.setOpaque(true);
        button_modulus.setForeground(Color.BLACK);
        button_modulus.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_modulus.setBackground(Color.GREEN);
        button_modulus.setBounds(327, 242, 75, 40);
        this.getContentPane().add(button_modulus);
// 327, 242, 75, 40

        final JButton button_equals = new JButton("=");
        button_equals.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_equals.setBackground(Color.BLACK);
            }

            public void mouseReleased(MouseEvent e) {
                button_equals.setBackground(Color.GREEN);
            }
        });
        button_equals.addActionListener((e) -> {
            this.saveValueOfArg2();
            this.calculateAnswer();
        });
        button_equals.setOpaque(true);
        button_equals.setForeground(Color.BLACK);
        button_equals.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_equals.setBackground(Color.GREEN);
        button_equals.setBounds(327, 294, 75, 40);
        this.getContentPane().add(button_equals);
        final JButton button_clear = new JButton("AC");
        button_clear.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                button_clear.setBackground(Color.GREEN);
            }

            public void mouseReleased(MouseEvent e) {
                button_clear.setBackground(Color.GREEN);
            }
        });
        button_clear.addActionListener((e) -> {
            this.clearCalculator();
        });
        button_clear.setOpaque(true);
        button_clear.setForeground(Color.BLACK);
        button_clear.setBorder(new MatteBorder(4, 4, 4, 4, Color.BLACK));
        button_clear.setBackground(Color.GREEN);
        button_clear.setBounds(327, 85, 75, 40);
        this.getContentPane().add(button_clear);
        JLabel lblElliesCalculator = new JLabel("DNHS Calculator");
        lblElliesCalculator.setBounds(6, 6, 134, 16);
        this.getContentPane().add(lblElliesCalculator);
    }

    private static enum STATE {
        INITIAL,
        SAVE1,
        SAVE2,
        CALC;

        private STATE() {
        }
    }
}