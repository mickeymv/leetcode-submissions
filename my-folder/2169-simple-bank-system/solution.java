class Bank {

    int noOfAccounts=0;
    long[] balances;

    public Bank(long[] balance) {
        noOfAccounts=balance.length;
        balances = balance;
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(!isAccountValid(account1) || !isAccountValid(account2)) {
            return false;
        }

        if(!isBalanceValid(account1, money)) {
            return false;
        }

        withdraw(account1, money);
        deposit(account2, money);
        return true;
    }
    
    public boolean deposit(int account, long money) {
        if(!isAccountValid(account)) {
            return false;
        }
        balances[account-1] = balances[account-1]+money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(!isAccountValid(account)) {
            return false;
        }        

        if(!isBalanceValid(account, money)) {
            return false;
        }

        balances[account-1] = balances[account-1]-money;
        return true;
    }

    private boolean isAccountValid(int account) {
        if(account>=1 && account<=noOfAccounts) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isBalanceValid(int account, long money) {
        long balance = balances[account-1];
        return balance>=money;
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */
