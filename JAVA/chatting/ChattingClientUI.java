package chatting;
import java.awt.*;
import java.awt.event.*;

public class ChattingClientUI extends Frame implements ActionListener  {
	private TextArea textArea = new TextArea();
	private TextField textField = new TextField();
	private Panel panel = new Panel();
	private Button button1 = new Button("Send");
	private Button button2 = new Button("Exit");
	
	private ChattingClient client = null; //ChattingClient �ּ�

	public ChattingClientUI() {
		client = new ChattingClient(this);  //ChattingClient�� �����Ǹ鼭 this�� ���� �ּҸ� �Ѱ���  
	}
	
	public void createGUI() {
		panel.add(button1);
		panel.add(button2);
		add(textArea,"West");
		add(textField,"South");
		add(panel,"Center");
		setBounds(200,200,500,400);
		setVisible(true);
		textField.requestFocus();
		textField.addActionListener(this);
		
		button2.addActionListener(new ActionListener() {            //Exit��ư
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {         // X��ư 
				System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent ae) {
		String msg = textField.getText().trim();
		client.communicate(msg);
		textField.setText("");
	}
	
	public void showMessage(String msg) {
		textArea.append(msg);
	}
	
	public static void main(String[] args) {
		ChattingClientUI clientUI = new ChattingClientUI();
		clientUI.createGUI();
	}

	

	
}
