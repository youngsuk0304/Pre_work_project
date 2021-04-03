package kr.or.connect.preworkproject.dto;

public class Parcel {
	private int id;
	private String adress;
	private String geometry;
	private int pnu;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getGeometry() {
		return geometry;
	}
	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}
	public int getPnu() {
		return pnu;
	}
	public void setPnu(int pnu) {
		this.pnu = pnu;
	}
	@Override
	public String toString() {
		return "Parcel [id=" + id + ", adress=" + adress + ", geometry=" + geometry + ", pnu=" + pnu + "]";
	}
	
	
}
