import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
    
class BuildCalculator  implements ActionListener{
        JFrame actualWindow;
        JPanel resultPanel, buttonPanel;        
        JTextField resultTxt;
        JButton btn_digits[] = new JButton[10];
        JButton btn_plus, btn_minus, btn_mul, btn_div, btn_equal, btn_dot, btn_clear; 
        char eventFrom;
        double oparand_1 = 0, operand_2 = 0;
        String operator = "=";
        
        BuildCalculator() {
            actualWindow = new JFrame("Calculator");
            resultPanel = new JPanel();
            buttonPanel = new JPanel();

            actualWindow.setLayout(new GridLayout(3, 1));
            buttonPanel.setLayout(new GridLayout(4, 4));
            actualWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            resultTxt = new JTextField(15);
            for(int i = 0; i < 10; i++) {
                btn_digits[i] = new JButton(""+i);
                btn_digits[i].addActionListener(this);
            }
            btn_plus = new JButton("+");
            btn_plus.addActionListener(this);
            btn_minus = new JButton("-");
            btn_minus.addActionListener(this);
            btn_mul = new JButton("*");
            btn_mul.addActionListener(this);
            btn_div = new JButton("/");
            btn_div.addActionListener(this);
            btn_dot = new JButton(".");
            btn_dot.addActionListener(this);
            btn_equal = new JButton("=");
            btn_equal.addActionListener(this);
            btn_clear = new JButton("Clear");
            btn_clear.addActionListener(this);
                
            
            resultPanel.add(resultTxt);
            
            for(int i = 0; i < 10; i++) {
                buttonPanel.add(btn_digits[i]);
            }
            buttonPanel.add(btn_plus);
            buttonPanel.add(btn_minus);
            buttonPanel.add(btn_mul);
            buttonPanel.add(btn_div);
            buttonPanel.add(btn_dot);
            buttonPanel.add(btn_equal);
            buttonPanel.add(btn_clear);
                                
            actualWindow.add(resultPanel);
            actualWindow.add(buttonPanel);
                           
            actualWindow.setSize(300, 500);
            actualWindow.setVisible(true);
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            eventFrom = e.getActionCommand().charAt(0);
            String buildNumber;
            if(Character.isDigit(eventFrom)) {
                buildNumber = resultTxt.getText() + eventFrom; 
                resultTxt.setText(buildNumber);
            } else if(e.getActionCommand() == ".") {
                buildNumber = resultTxt.getText() + eventFrom; 
                resultTxt.setText(buildNumber);
            }
            else if(eventFrom != '='){
                oparand_1 = Double.parseDouble(resultTxt.getText());
                operator = e.getActionCommand();
                
                resultTxt.setText("");
            } else if(e.getActionCommand() == "Clear") {
                resultTxt.setText("");
            }
            else {
                operand_2 = Double.parseDouble(resultTxt.getText());
    
                
                switch(operator) {
                    case "+": 	resultTxt.setText(""+(oparand_1 + operand_2)); break;
                    case "-": 	resultTxt.setText(""+(oparand_1 - operand_2)); break;
                    case "*": 	resultTxt.setText(""+(oparand_1 * operand_2)); break;
                    case "/": 	try {
                                    if(operand_2 == 0) 
                                        throw new ArithmeticException();
                                    resultTxt.setText(""+(oparand_1 / operand_2)); break;
                                } catch(ArithmeticException ae) {
                                    JOptionPane.showMessageDialog(actualWindow, "Divisor can not be ZERO");
                                }
                }
            }
        }
    
    
        
        public static void main(String[] args) {
            BuildCalculator a = new BuildCalculator();
        }
}