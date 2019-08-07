package awt_test;
import java.awt.*;
import java.awt.event.*;
public class ActionEventEx extends Frame implements ActionListener,WindowListener{
	Panel p;
	   Button input, exit;
	   TextArea ta;
	   
	   public ActionEventEx() {
	      
	      super("ActionEnvet Test");
	      
	      p=new Panel();
	      
	      input=new Button("�Է�");
	      exit=new Button("����");
	      ta=new TextArea();
	      
	      input.addActionListener(this);   // ������ ����
	      exit.addActionListener(this);   // ������ ����
	      
	      addWindowListener(this);
	      
	      p.add(input);
	      p.add(exit);
	      
	      add(p, BorderLayout.NORTH);
	      add(ta, BorderLayout.CENTER);
	      
	      setBounds(300,300,300,200);
	      setVisible(true);
	   }
	   
	   @Override
	   public void actionPerformed(ActionEvent ae) {
	      String name;
	      name=ae.getActionCommand();
	      
	      if(name.equals("�Է�"))
	         ta.append("��ư�� �ԷµǾ����ϴ�.\n");
	      else
	      {
	         ta.append("���α׷��� �����մϴ�.\n");
	         try {   // �ǹ������� ����ó��
	            Thread.sleep(2000);
	         }catch(Exception e) {}
	         
	         System.exit(0);
	      }
	   }

	   public static void main(String[] args) {

	      new ActionEventEx();
	   }

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
			
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
			
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
			
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
			
		}
		
		@Override
		public void windowOpened(WindowEvent e) {
			
		}
}
