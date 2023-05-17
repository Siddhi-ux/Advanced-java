import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class JSliderExample extends JFrame {
    private JSlider slider;
    private JLabel label;

    public JSliderExample() {
        setTitle("JSlider Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create a JSlider
        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);
        slider.setMinorTickSpacing(5);
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        // Create a JLabel to display the slider value
        label = new JLabel("Value: " + slider.getValue());

        // Add a ChangeListener to update the label when slider value changes
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                label.setText("Value: " + slider.getValue());
            }
        });

        // Add the slider and label to the JFrame
        add(slider);
        add(label);

        pack();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JSliderExample().setVisible(true);
            }
        });
    }
}
