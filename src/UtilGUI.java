import javax.swing.*;
import javax.swing.border.Border;
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

    private JPanel northPanel;
    private JLabel srcExcelLabel;
    private JTextArea srcExcelArea;
    private JLabel filterExcelLabel;
    private JTextArea filterExcelArea;

    public UtilGUI() {
        setUpGuiPositon();
        mainFrame.setVisible(true);

        northPanel = new JPanel();
        northPanel.setLayout(new GridLayout(2, 2));
        northPanel.setBackground(Color.pink);

        srcExcelLabel = new JLabel("Source Excel File Absolute Destination: ");
        srcExcelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        northPanel.add(srcExcelLabel);
        srcExcelArea = new JTextArea();
        srcExcelArea.setBorder(BorderFactory.createLineBorder(Color.red));
        northPanel.add(srcExcelArea);

        filterExcelLabel = new JLabel("Filter Excel File Absolute Destination: ");
        filterExcelLabel.setHorizontalAlignment(SwingConstants.CENTER);
        northPanel.add(filterExcelLabel);
        filterExcelArea = new JTextArea();
        filterExcelArea.setBorder(BorderFactory.createLineBorder(Color.red));
        northPanel.add(filterExcelArea);

        mainFrame.add(northPanel, BorderLayout.NORTH);
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
