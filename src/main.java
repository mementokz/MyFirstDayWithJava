import javax.swing.JFrame;

public class main {
	public static void main(String args[]) {
		Logic l = new Logic("Калькулятор");
		l.setVisible(true);
		l.setSize(300, 500);
		l.setLocationRelativeTo(null);
		l.setResizable(false);
		l.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
