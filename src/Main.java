import java.awt.*;
import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
        System.out.println("Red Vs. Blue");
        Main window = new Main();
    }
    public class Grid extends JPanel {
        public Grid() {
            int a; //x coordinate of the grid object
            int b; //y coordinate of the grid object
        }
    
    public class Cell extends JPanel {
        public Cell() {
            Cell[] a = new Cell[400];
            }
        }
    }
    public class Canvas extends JPanel {
        public Canvas() {
            setPreferredSize(new Dimension(720, 720));
        }
        @Override
        public void paint(Graphics g) {
            for(int i = 10; i < 710; i+=35) {
                for (int j = 10; j < 710; j+=35) {
                    g.drawRect(i, j, 35, 35);
                }
            }
        }
    }

    private Main() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        Canvas canvas = new Canvas();
        this.setContentPane(canvas);
        this.setVisible(true);
    }
        
}
