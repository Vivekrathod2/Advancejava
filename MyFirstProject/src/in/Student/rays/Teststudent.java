package in.Student.rays;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Teststudent {
	public static void main(String[] args) throws Exception {
		// testadd();
		// testupdate();
		// testdelete();
		ArrayList<StudentBean>  list =   StudentModel.search();
	
for (StudentBean Bean : list) 
		{
			System.out.println(Bean.getFirstName());
			System.out.println(Bean.getLastName());
			System.out.println(Bean.getRollNo());
			System.out.println(Bean.getSession());
		}
	}

	/*
	 * private static void testadd() throws Exception { // TODO Auto-generated
	 * method stub StudentBean m = new StudentBean(); StudentModel s = new
	 * StudentModel(); m.setFirstName("palak"); m.setLastName("karodia");
	 * m.setId(89); m.setRollNo("102"); m.setSession("201"); s.add(m); }
	 */
	private static void testupdate() throws Exception {
		StudentBean b = new StudentBean();
		StudentModel m = new StudentModel();
		b.setFirstName("deeppak");
		b.setLastName("rathod");

		b.setRollNo("102");
		b.setSession("2020");
		b.setId(1);
		m.update(b);
	}

	public static void testdelete() throws Exception {
		StudentBean b = new StudentBean();
		StudentModel m = new StudentModel();
		b.setId(1);
		m.delete(b);
	}

}