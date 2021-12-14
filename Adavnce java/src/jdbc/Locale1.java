package jdbc;

import java.util.Locale;
import java.util.ResourceBundle;

public class Locale1 {
	public static void main(String[] args) {
		ResourceBundle rb = ResourceBundle.getBundle("jdbc.nam",new Locale("sp"));
		System.out.println(rb.getString("greeting"));
		
		ResourceBundle rc = ResourceBundle.getBundle("jdbc.hi",new Locale("hi"));
		System.out.println(rc.getString("greeting"));
		
}
}