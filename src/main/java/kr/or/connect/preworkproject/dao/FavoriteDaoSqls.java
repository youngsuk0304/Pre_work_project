package kr.or.connect.preworkproject.dao;

public class FavoriteDaoSqls {
	//즐겨찾기를 사용중인 사용자 모두 찾기
	public static final String SELECT_ALL = "SELECT DISTINCT member_id FROM tbl_favorite order by member_id";
	//member_id로 즐겨찾기한 parcel_id 찾기
	public static final String SELECT_FAVORITE  = "SELECT parcel_id FROM tbl_favorite where member_id=:member_id";
	//mem_id와 parcel_id가 둘다 주어질때 제거
	public static final String DELETE_FAVORITE = "DELETE FROME tbl_favorite WHERE member_id=:member_id and parcel_id =:parcel_id";
}