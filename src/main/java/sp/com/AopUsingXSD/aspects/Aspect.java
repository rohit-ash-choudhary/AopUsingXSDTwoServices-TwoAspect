package sp.com.AopUsingXSD.aspects;

public class Aspect {
	
	public void MyLogginBefore() {
		
		System.out.println("Sent ULR Beofre Login");
	}
	
	public void MfaOTP() {
		System.out.println("Sent OTP Beofre Login");
		
	}

	public void MyLogginPost() {
		
		System.out.println("Sent Post message once loggedin");
	
}
	
public void MyLoggin() {
		
		System.out.println("++++++++++LogginService++++++++++++++++++++");
	
}

}
