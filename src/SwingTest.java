import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SwingTest {

    static boolean sw = true;

    public static void main(String[] args) throws IOException {
        Image image = ImageIO.read(new File("resources/images/image.png"));

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) frame.getContentPane();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setSize(new Dimension(500,600));

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(frame.getSize());
            }
        });

        JButton button = new JButton("Button1");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(sw)
                    frame.setExtendedState(frame.getExtendedState() | JFrame.MAXIMIZED_BOTH);
                else
                    frame.setSize(new Dimension(500,600));
                sw=!sw;
            }
        });
        panel.add(button);
        timer.start();

        frame.setVisible(true);

        HashMap<String,String> map = new HashMap<>();
        for(Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
