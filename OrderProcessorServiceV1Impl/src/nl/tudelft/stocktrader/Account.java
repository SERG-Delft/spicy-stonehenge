package nl.tudelft.stocktrader;

import java.math.BigDecimal;
import java.util.Calendar;

public class Account {
	protected String userID;
    protected Integer accountID;
    protected Integer loginCount;
    protected Integer logoutCount;
    protected Calendar lastLogin;
    protected Calendar creationDate;
    protected BigDecimal balance;
    protected BigDecimal openBalance;
    protected String profileID;

	public Account() {
	}

	public Account(int accountId, String profileId,
			Calendar creationDate, BigDecimal openBalance, int logoutCount,
			BigDecimal balance, Calendar lastLogIn, int loginCount) {
		setAccountID(accountId);
		setProfileID(profileId);
		setCreationDate(creationDate);
		setOpenBalance(openBalance);
		setLogoutCount(logoutCount);
		setBalance(balance);
		setLastLogin(lastLogIn);
		setLoginCount(loginCount);
		setLogoutCount(logoutCount);
	}

	public String getUserID() {
		return this.userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Integer getLoginCount() {
        return loginCount;
    }

    public void setLoginCount(Integer loginCount) {
        this.loginCount = loginCount;
    }

    public Integer getLogoutCount() {
        return logoutCount;
    }

    public void setLogoutCount(Integer logoutCount) {
        this.logoutCount = logoutCount;
    }

    public Calendar getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Calendar lastLogin) {
        this.lastLogin = lastLogin;
    }

    public Calendar getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Calendar creationDate) {
        this.creationDate = creationDate;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getOpenBalance() {
        return openBalance;
    }

    public void setOpenBalance(BigDecimal openBalance) {
        this.openBalance = openBalance;
    }

    public String getProfileID() {
        return profileID;
    }

    public void setProfileID(String profileID) {
        this.profileID = profileID;
    }
}
