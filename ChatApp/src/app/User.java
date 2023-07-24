package app;

public class User {
	private String nick, email, ip;
	
	public User (String nick, String email, String ip) {
		this.nick = nick;
		this.email = email;
		this.ip = ip;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}
	
	@Override
	public String toString() {
		return this.nick;
	}
	
}
