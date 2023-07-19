package def_package;
import javax.swing.JOptionPane;

public class InputWithDialog {
	public static void main(String[] args) {
		String s = null;
		s = JOptionPane.showInputDialog(null, "Wie heißt du? ");
		System.out.println("Hallo, " + s);
	}
}
