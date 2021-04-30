package ders3odev;

public class UserManager {

	public void login(User user, String email, String password) {
		if(user.getEmail() == email && user.getPassword() == password ) {
			System.out.println("Giriş Başarılı");
		}
		else {
			System.out.println("email veya şifre hatalı");
		}
	}
	
}
