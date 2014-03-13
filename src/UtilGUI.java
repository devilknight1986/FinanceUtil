import javax.swing.*;
import java.awt.*;

/**
 * Created by DingLei on 3/13/14.
 */
public class UtilGUI {
    private JFrame mainFrame;
    private static String UTIL_NAME = "Finance Tool (Author: DingLei)";
    private double ratio_Of_gameWnd_Screen = 0.75;
    private int screenHeight;
    private int screenWidth;

    private JTextArea srcExelArea;

    public UtilGUI() {
        setUpGuiPositon();
        mainFrame.setVisible(true);

        srcExelArea = new JTextArea();
        mainFrame.add(srcExelArea, BorderLayout.NORTH);
    }

    private void setUpGuiPositon() {
        mainFrame = new JFrame(UTIL_NAME);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension dm = kit.getScreenSize();
        screenHeight = (int) dm.getHeight();
        screenWidth = (int) dm.getWidth();

        mainFrame.setSize((int)(screenWidth * ratio_Of_gameWnd_Screen),
                (int) (screenHeight * ratio_Of_gameWnd_Screen));

        int top_left_pos_x = (int) (screenWidth * (1 - ratio_Of_gameWnd_Screen) / 2);
        int top_left_pos_y = (int) (screenHeight * (1 - ratio_Of_gameWnd_Screen) / 2);
        mainFrame.setLocation(top_left_pos_x, top_left_pos_y);
    }
}
