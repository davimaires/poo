package aventura.br.com.daviaires;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        initialize();
    }

    private void initialize(){
        window = new JFrame();
        window.setLayout(new BorderLayout(10,5));
        window.setTitle("Maple Tale");
        window.setSize(800, 500);
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 5));
        panel.setBackground(Color.black);
        Button button = new Button("Button");
        panel.add(button);
        window.add(panel, BorderLayout.CENTER);

    }

    public void show(){
        window.setVisible(true);
    }
}
