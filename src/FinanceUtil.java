import javax.swing.*;

/**
 * Created by DingLei on 3/13/14.
 */
public class FinanceUtil {
    private UtilGUI utilGUI;

    public FinanceUtil() {
        utilGUI = new UtilGUI();
    }

    public static void main(String[] args) {
        System.out.println("Finance Util Start!");
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                FinanceUtil financeUtil = new FinanceUtil();
            }
        });
    }
}
