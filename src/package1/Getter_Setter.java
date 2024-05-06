package package1;

class AuthenticationofGTM {


	private String password = "123";
	private String Username = "contact@grotechminds.com";
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
	this.Username = username;
	}
	public class Getter_Setter{
	
	public static void main(String[] args) {
		AuthenticationofGTM a1=new AuthenticationofGTM();
		a1.setUsername("dinish@grotechminds.com");
System.out.println(a1.getUsername());
a1.setPassword("12324");
System.out.println(a1.getPassword());
	}

}
}
