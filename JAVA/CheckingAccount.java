package Chap13.Thread.problem;

// ����
class Account {
	// �ܰ�
	private int balance;

	public Account(int initBalance) {
		this.balance = initBalance;
	}

	// ���
	public boolean withdraw(int amount) {
		synchronized (this) { // parameter�� '��ü'�� ������
			if (amount <= balance) {
				try {
					Thread.sleep((int) Math.random() * 200);
				} catch (InterruptedException e) {
				}
				balance -= amount;
				return true;
			}
			return false;
		}
	}

	// �Ա�        //synchronized ��
	public void deposit(int amount) {
		synchronized (this) {
			balance += amount;
		}
	}


	// �ܰ���ȸ       //synchronized�޼���
	public synchronized int getBalance() {  //method �ٵ� ��ü�� ����ȭ, lock�� ��ü�� this�� ���
		return balance;
	}
}

class WithdrawMoney implements Runnable {
	private Account account;

	public WithdrawMoney(Account account) {
		this.account = account;
	}

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		for (int count = 0; count < 5; count++) {
			System.out.println(
					name + "��(��) 10000���� ����մϴ�." + " ���: " + account.withdraw(10000) + "���� �ܰ�" + account.getBalance());
		}
	}
}

public class CheckingAccount {
	public static void main(String[] args) {
		Account myAccount = new Account(50000);
		System.out.println("���� �ܰ�� " + myAccount.getBalance() + "���Դϴ�.");

		Runnable r = new WithdrawMoney(myAccount);
		Thread husband = new Thread(r, "����");
		Thread wife = new Thread(r, "����");
		husband.start();
		wife.start();

		while (true)
			if (!husband.isAlive() && !wife.isAlive())
				break;
		System.out.println("���� �ܰ�� " + myAccount.getBalance() + "���Դϴ�.");
	}
}