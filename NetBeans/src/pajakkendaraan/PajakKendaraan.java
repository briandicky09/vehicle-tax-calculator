package pajakkendaraan;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class PajakKendaraan {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ignored) {}
        SwingUtilities.invokeLater(() -> new FormUtama().setVisible(true));
    }
}
