package jdbc;

public class MarksheetBean {

	private int rollno;
	private String FNAME;
	private String LNAME;
	private int PHY;
	private int CHE;
	private int MATH;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getFNAME() {
		return FNAME;
	}
	public void setFNAME(String fNAME) {
		FNAME = fNAME;
	}
	public String getLNAME() {
		return LNAME;
	}
	public void setLNAME(String lNAME) {
		LNAME = lNAME;
	}
	public int getPHY() {
		return PHY;
	}
	public void setPHY(int pHY) {
		PHY = pHY;
	}
	public int getCHE() {
		return CHE;
	}
	public void setCHE(int cHE) {
		CHE = cHE;
	}
	public int getMATH() {
		return MATH;
	}
	public void setMATH(int mATH) {
		MATH = mATH;
	}
}
