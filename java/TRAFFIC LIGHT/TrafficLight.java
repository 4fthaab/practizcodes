import javax.swing.*;
import java.awt.*;

public class TrafficLight extends JFrame {

   JRadioButton redButton, yellowButton, greenButton;
   JPanel radioPanel, mainPanel;
   JPanel redLight, yellowLight, greenLight;

    public TrafficLight() {
        super("Traffic Light Simulator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1366, 765);

        redButton = new JRadioButton("Red");
        yellowButton = new JRadioButton("Yellow");
        greenButton = new JRadioButton("Green");
//ButtonGroup ensure that only one radio button within the group can be selected at a time.
        ButtonGroup radioGroup = new ButtonGroup();
        radioGroup.add(redButton);
        radioGroup.add(yellowButton);
        radioGroup.add(greenButton);

        radioPanel = new JPanel(new FlowLayout());
        radioPanel.add(redButton);
        radioPanel.add(yellowButton);
        radioPanel.add(greenButton);

        mainPanel = new JPanel(new FlowLayout());

        redLight = new JPanel();
        redLight.setPreferredSize(new Dimension(300,300));
        redLight.setBackground(Color.GRAY);
        redLight.setOpaque(true);
        redLight.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        yellowLight = new JPanel();
        yellowLight.setPreferredSize(new Dimension(300,300));
        yellowLight.setBackground(Color.GRAY);
        yellowLight.setOpaque(true);
        yellowLight.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        greenLight = new JPanel();
        greenLight.setPreferredSize(new Dimension(300,300));
        greenLight.setBackground(Color.GRAY);
        greenLight.setOpaque(true);
        greenLight.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        mainPanel.add(redLight);
        mainPanel.add(yellowLight);
        mainPanel.add(greenLight);

        add(radioPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        redButton.addActionListener(e -> {
            if (redButton.isSelected()) {
                redLight.setBackground(Color.RED);
                yellowLight.setBackground(Color.GRAY);
                greenLight.setBackground(Color.GRAY);
            }
        });

        yellowButton.addActionListener(e -> {
            if (yellowButton.isSelected()) {
                redLight.setBackground(Color.GRAY);
                yellowLight.setBackground(Color.YELLOW);
                greenLight.setBackground(Color.GRAY);
            }
        });

        greenButton.addActionListener(e -> {
            if (greenButton.isSelected()) {
                redLight.setBackground(Color.GRAY);
                yellowLight.setBackground(Color.GRAY);
                greenLight.setBackground(Color.GREEN);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TrafficLight());
    }
}