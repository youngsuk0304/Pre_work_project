package kr.or.connect.preworkproject.dto;

public class Favorite {
	private String member_id;
	private int parcel_id;

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
		return "Favorite [ member_id=" + member_id + ", parcel_id=" + parcel_id + "]";
	}
}