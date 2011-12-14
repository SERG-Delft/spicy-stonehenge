package nl.tudelft.stocktrader;

public class AccountProfile {
	   	protected String userID;
	    protected String password;
	    protected String fullName;
	    protected String address;
	    protected String email;
	    protected String creditCard;

		public AccountProfile() {
		}

		public AccountProfile(String userId, String password,
				String fullName, String address, String email, String creditcard) {
			setUserID(userId);
			setPassword(password);
			setFullName(fullName);
			setAddress(address);
			setEmail(email);
			setCreditCard(creditcard);
		}

	    public String getUserID() {
	        return userID;
	    }

	    public void setUserID(String userID) {
	        this.userID = userID;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getCreditCard() {
	        return creditCard;
	    }

	    public void setCreditCard(String creditCard) {
	        this.creditCard = creditCard;
	    }
}
