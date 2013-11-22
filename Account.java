// Account.java
package cscie55.hw6;

/**
 * This class creates an account object, which interacts with the ATM given the client instructions.
 *
 * @author Antonio Recalde
 * @version 10/30/2013
 *
 */
public class Account
{
	float balance;

	/**
	 * Class constructor
	 */
	public Account()
	{
		balance = 0;
	}

	/**
	 * Returns the current balance in the account
	 *
	 * @return balance Account balance
	 */
	public float getBalance()
	{
		return balance;						// no need to synchronize. It only reads the data.
	}

	/**
	 * Sets the balance of the account to the given parameter
	 *
	 * @param amount	New value of the account's balance
	 */
	public synchronized void setBalance(float amount)
	{
		balance = amount;
	}

	/**
	 * Deposits into account by incrementing the current balance by the value given as parameter
	 *
	 * @param amount	Amount to be deposited
	 */
	public synchronized void deposit(float amount)
	{
		balance += amount;
	}

	/**
	 * Withdraws from account. Decreases balance by amount given as parameter
	 *
	 * @param amount	Amount to be withdrawn
	 */
	public synchronized void withdraw(float amount)
	{
		balance -= amount;
	}

}
