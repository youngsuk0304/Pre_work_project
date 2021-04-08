package kr.or.connect.preworkproject.dao;

public class ParcelDaoSqls {
	// 전체 출력
	public static final String SELECT_ALL = "SELECT id, address, geometry, pnu FROM tbl_parcel order by id";
	// pnu값으로 조회
	public static final String SELECT_BY_PNU = "SELECT id, address, geometry, pnu FROM tbl_parcel WHERE pnu=:pnu";
	// address는 일부 주소로 검색 가능 하도록!!
	public static final String SELECT_BY_ADDRESS = "SELECT id, address, geometry, pnu FROM tbl_parcel WHERE address = address";

}