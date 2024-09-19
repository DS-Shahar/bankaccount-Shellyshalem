package homewrok1;

public class BankAccount {
	private int balance;
    private int minBalance;
    private String owner;
  //the balance needs to be more than the minbalance
    public BankAccount(int balance, int minBalance, String owner) {
        this.balance = balance;
        this.minBalance=minBalance;
        this.owner=owner;
    }
    
    public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
        return balance;
    }

	public int getMinBalance() {
		return minBalance;
	}

	public void setMinBalance(int minBalance) {
		this.minBalance = minBalance;
	}

	public void setBalance(int x) {
		if (x>minBalance){
			balance = x;
		}
	}
	
	public String toString() {
		String ans="balance of "+ owner +": "+balance;
		return ans;
	}
	
	public boolean withdraw(int amount) {
        if (balance - amount < minBalance)
            return false;
        balance = balance - amount;
        return true;
	}
	
	public void deposit(int amount) {
		balance = balance + amount;
	    }
	
	public boolean transfer(BankAccount target, int amount) {
	    if (withdraw(amount) == false)
	       return false;
	       target.deposit(amount);
		return true;
	    }


}