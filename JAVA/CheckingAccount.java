package Chap13.Thread.problem;

// 계좌
class Account {
	// 잔고
	private int balance;

	public Account(int initBalance) {
		this.balance = initBalance;
	}

	// 출금
	public boolean withdraw(int amount) {
		synchronized (this) { // parameter에 '객체'가 들어가야함
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

	// 입금        //synchronized 블럭
	public void deposit(int amount) {
		synchronized (this) {
			balance += amount;
		}
	}


	// 잔고조회       //synchronized메서드
	public synchronized int getBalance() {  //method 바디 전체가 동기화, lock의 객체가 this인 경우
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
					name + "이(가) 10000원을 출금합니다." + " 결과: " + account.withdraw(10000) + "남은 잔고" + account.getBalance());
		}
	}
}

public class CheckingAccount {
	public static void main(String[] args) {
		Account myAccount = new Account(50000);
		System.out.println("현재 잔고는 " + myAccount.getBalance() + "원입니다.");

		Runnable r = new WithdrawMoney(myAccount);
		Thread husband = new Thread(r, "남편");
		Thread wife = new Thread(r, "부인");
		husband.start();
		wife.start();

		while (true)
			if (!husband.isAlive() && !wife.isAlive())
				break;
		System.out.println("현재 잔고는 " + myAccount.getBalance() + "원입니다.");
	}
}