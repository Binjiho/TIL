package lotto;

import java.awt.*;
import java.awt.event.*;

public class ClientUI extends Frame implements ActionListener {
	private TextArea textArea = new TextArea();
	private TextField textField1= new TextField("ID입력",30);
	private TextField textField2= new TextField("번호 입력",30);
	private Panel p1 = new Panel();
	private Panel p2 = new Panel();
	
	private Button button1 = new Button("Buy");
	private Button button2 = new Button("Exit");
	
	private Client client = null;
	
	public ClientUI() {
		client = new Client(this);
	}
	
	public void createGUI() {
		p1.add(button1);
		p1.add(button2);
		add(textArea,"South");
		textField1.selectAll();
		textField2.selectAll();
		p2.add(textField1);
		p2.add(textField2);
		add(p2,"North");
		add(p1,"East");
		setBounds(300,300,600,400);
		setVisible(true);
		textField1.requestFocus();
		textField1.addActionListener(this);
		textField2.requestFocus();
		textField2.addActionListener(this);
		
		
		button2.addActionListener(new ActionListener() {            //Exit버튼
			public void actionPerformed(ActionEvent ae) {
				System.exit(0);
			}
		});
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		/*
		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae) {			
				client.send(actionPerformed());  //여기에 구조체 넘겨야함
			}
		});
		*/
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String id = textField1.getText().trim();
		/*
		String lottonum = textField2.getText().trim(); 
		Byte[] numbers = new Byte[lottonum.length()];
//	arraycopy주의 및 중복체크 해줘야함
		for(int i=0;i<6;i++) {
			numbers[i]=(byte) (lottonum.charAt(i));
		}
		User user = new User(id,numbers);
		 */
		User user = new User(id,null);
		textField1.setText("");
		client.send(user);
	}
	

	public void showMessage(String msg) {
		textArea.append(msg);
	}
	
	public static void main(String[] args) {
		ClientUI clientUI = new ClientUI();
		clientUI.createGUI();

	}
	
}
