package kr.or.connect.preworkproject.dto;

public class Parcel {
	private int id;
	private String address;
	private String geometry;
	private String pnu;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getGeometry() {
		return geometry;
	}
	public void setGeometry(String geometry) {
		this.geometry = geometry;
	}
	public String getPnu() {
		return pnu;
	}
	public void setPnu(String pnu) {
		this.pnu = pnu;
	}
	@Override
	public String toString() {
		return "Parcel [id=" + id + ", address=" + address + ", geometry=" + geometry + ", pnu=" + pnu + "]";
	}



}