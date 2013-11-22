package cscie55.hw6;

public class ATMImplementation implements ATM
{
	Account account;

	/**
	 * Class constructor
	 */
	public ATMImplementation()
	{
		account = new Account();
	}

	/**
	 * Deposits into account
	 *
	 * @param amount The amount to be deposited
	 */
	@Override
	public void deposit(float amount) throws ATMException
	{
		account.deposit(amount);
	}

	/**
	 * Withdraws from account
	 *
	 * @param amount	The amount being withdrawn
	 */
	@Override
	public void withdraw(float amount) throws ATMException
	{
		account.withdraw(amount);
	}

	/**
	 * Returns the current balance in the account
	 *
	 * @return	account.balance	balance in the account
	 */
	@Override
	public Float getBalance() throws ATMException
	{
		return account.getBalance();
	}
}
