package school.dto;

public class serDto {

	private int id;
	private int stNum;
	private int Q1;
	private int Q2;
	private int Q3;
	private int Q4;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStNum() {
		return stNum;
	}
	public void setStNum(int stNum) {
		this.stNum = stNum;
	}
	public int getQ1() {
		return Q1;
	}
	public void setQ1(int q1) {
		Q1 = q1;
	}
	public int getQ2() {
		return Q2;
	}
	public void setQ2(int q2) {
		Q2 = q2;
	}
	public int getQ3() {
		return Q3;
	}
	public void setQ3(int q3) {
		Q3 = q3;
	}
	public int getQ4() {
		return Q4;
	}
	public void setQ4(int q4) {
		Q4 = q4;
	}
	@Override
	public String toString() {
		return "serDto [id=" + id + ", stNum=" + stNum + ", Q1=" + Q1 + ", Q2=" + Q2 + ", Q3=" + Q3 + ", Q4=" + Q4
				+ "]";
	}
	
	
}
