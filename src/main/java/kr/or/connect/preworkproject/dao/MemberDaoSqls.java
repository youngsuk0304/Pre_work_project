package kr.or.connect.preworkproject.dao;

public class MemberDaoSqls {
	//사용자 전체 조회
	public static final String SELECT_ALL = "SELECT id, name, gender, age FROM member order by id";
	//사용자 id로 다른값 변경
	public static final String UPDATE = "UPDATE tbl_member SET name = :name, gender:gender, age:age WHERE id = :id";
	//id로 사용자 조회
	public static final String SELECT_BY_MEMBER_ID  = "SELECT id, name, gender, age FROM member where id";
	//id로 사용자 제거
	public static final String DELETE_BY_MEMBER_ID = "DELETE FROME member WHERE id=:id";
}
