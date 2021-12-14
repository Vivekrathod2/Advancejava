package jdbc;

public class TestMarksheet {
public static void main(String[] args) throws Exception {
	add();
	//update();
	//delete();
}

public static void add() throws Exception
{
	
		MarksheetBean m = new MarksheetBean();
	m.setRollno(3);
	m.setFNAME("adarsh2");
	m.setLNAME("karma");
	m.setPHY(80);
	m.setCHE(85);
	m.setMATH(75);
	
	MarksheetModel Y = new MarksheetModel();
Y.add(m);

}
/*
public static void update() throws Exception 
{
	MarksheetBean m = new MarksheetBean();
	m.setFNAME("ajay");
	m.setLNAME("karma");
	m.setPHY(44);
	m.setCHE(35);
	m.setMATH(48);
	m.setRollno(1);
	
	MarksheetModel Y = new MarksheetModel();
	Y.update(m);

	
}
*/
/*
public static void delete() throws Exception
{
	MarksheetBean m = new MarksheetBean();
	MarksheetModel Y = new MarksheetModel();
	m.setRollno(3);
	Y.delete(m);
	
}*/
}
