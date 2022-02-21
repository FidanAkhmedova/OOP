import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;

    public CounterApp(int initialValue){
        setBounds(500, 500, 300, 120);
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 32);

//        JLabel counterView = new JLabel();
        JTextField counterView = new JTextField();

        counterView.setFont(font);
        counterView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterView, BorderLayout.CENTER);

        value = initialValue;
        counterView.setText(String.valueOf(value));

        Button decrementButton = new Button("-");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        Button incrementButton = new Button("+");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = counterView.getText();
                int a = Integer.valueOf(n);
                a--;
                counterView.setText(String.valueOf(a));
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n = counterView.getText();
                int b = Integer.parseInt(n);
                b++;
                counterView.setText(String.valueOf(b));
            }
        });
        /*counterView.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                update(counterView);
            }
        });*/


        setVisible(true);
    }
}
