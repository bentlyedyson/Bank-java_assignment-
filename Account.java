
public class Account {
	 	
		private double balance;
		
		public Account(double balance) {
			this.balance = balance;
		}

		public double getBalance() {
			return balance;
		}
		
		public boolean deposit(double amount) {
			if (amount < 0 ) {
			return false;
			
		}else {
			return true;
		}
			
		}
		public boolean Withdraw(double amount) {
			if(amount <= this.balance) {
				this.balance -=amount;
				return true;
			} 
			else {
				return false;
			}
	}

}
