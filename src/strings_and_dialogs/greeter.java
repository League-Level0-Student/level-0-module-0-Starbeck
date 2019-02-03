package strings_and_dialogs;
import javax.swing.JOptionPane;
public class greeter {
	public static void main(String[] args) {
	String name =	JOptionPane.showInputDialog("Name:");
		JOptionPane.showMessageDialog(null, "Hi " + name);
	}

}
