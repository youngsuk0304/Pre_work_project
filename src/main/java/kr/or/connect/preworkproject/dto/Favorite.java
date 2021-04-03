package kr.or.connect.preworkproject.dto;

public class Favorite {
	private int favorite_id;
	private String member_id;
	private int parcel_id;
	public int getFavorite_id() {
		return favorite_id;
	}
	public void setFavorite_id(int favorite_id) {
		this.favorite_id = favorite_id;
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public int getParcel_id() {
		return parcel_id;
	}
	public void setParcel_id(int parcel_id) {
		this.parcel_id = parcel_id;
	}
	@Override
	public String toString() {
		return "Favorite [favorite_id=" + favorite_id + ", member_id=" + member_id + ", parcel_id=" + parcel_id + "]";
	}
}