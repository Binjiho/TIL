package awt_test;
import java.awt.*;
import java.awt.event.*;

public class WindowEventEx extends Frame implements WindowListener {
	public WindowEventEx() {
		super("windowEvent �׽�Ʈ");

		Label exit = new Label("�������� ���� ��ư�� �����ּ���");

		add(exit);
		setBounds(300, 300, 200, 200);
		setVisible(true);

		addWindowListener(this);

	}

	public static void main(String[] args) {
		new WindowEventEx();
	}

	@Override
	public void windowActivated(WindowEvent arg0) {

	}

	@Override
	public void windowClosed(WindowEvent arg0) {

	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		System.exit(0); // ���α׷� ����
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {

	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {

	}

	@Override
	public void windowIconified(WindowEvent arg0) {

	}

	@Override
	public void windowOpened(WindowEvent arg0) {

	}

}
