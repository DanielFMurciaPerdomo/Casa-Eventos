package co.edu.utadeo.modelos;

public class Hora {

	private int hh;
	private int mm;
	private int ss;
	public Hora(int hh, int mm, int ss) {
		super();
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;
	}
	public int getHh() {
		return hh;
	}
	public void setHh(int hh) {
		this.hh = hh;
	}
	public int getMm() {
		return mm;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public int getSs() {
		return ss;
	}
	public void setSs(int ss) {
		this.ss = ss;
	}
	@Override
	public String toString() {
		if(this.mm<10 && this.ss<10)return hh+":"+0+mm+":"+0+ss;
		if(this.ss==0) return hh+":"+mm+":"+0+ss;
		return hh+":"+mm+":"+ss;
	}
	
	
}
