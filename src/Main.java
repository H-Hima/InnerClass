import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        Human.Foot foot = human.new Foot();

        Geometry2D.Point point2D = new Geometry2D.Point();
        Geometry2D.Vector vector2d = new Geometry2D.Vector();

        Geometry3D.Point point3D = new Geometry3D.Point();


        class temporaryInnerClass implements Actionable {
            @Override
            public void act() {
                System.out.println("Action");
            }
        }
        Actionable actionableObject1 = new temporaryInnerClass();

        Integer a=0;

        Actionable actionableObject2 = new Actionable() {
            @Override
            public void act() {
                System.out.println("Action");
                System.out.println(a);
            }
        };

        actionableObject1.act();
        actionableObject2.act();

        class InnerA implements A {
            @Override
            public void function() {
                System.out.println("Inner A");
                int a=0,b,c;

                class MyClass {
                    int b;
                    void myFunction() {
                        int d = a;
                    }
                }
            }
        }
        A definedA = new InnerA();

        A aObject = new A() {
            @Override
            public void function() {
                System.out.println("Inner A");
            }
        };

        class MyActionListener implements ActionListener {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Action performed");
            }
        }
        Timer timer1 = new Timer(
                1000,
                new MyActionListener());

        Timer timer2 = new Timer(
                1000,
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        System.out.println("Action performed");
                    }
                });

        JFrame frame = new JFrame();
        frame.setSize(new Dimension(500,500));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = (JPanel) frame.getContentPane();

        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        JButton button1 = new JButton("Button1");
        panel.add(button1);

        JButton button2 = new JButton("Button2");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                button1.setBackground(Color.RED);
            }
        });
        panel.add(button2);

        frame.setVisible(true);

    }
}

interface A {
    void function();
}
