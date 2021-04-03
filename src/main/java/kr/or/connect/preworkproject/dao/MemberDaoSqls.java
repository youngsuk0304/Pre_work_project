package kr.or.connect.preworkproject.dao;

public class MemberDaoSqls {
	public static final String SELECT_ALL = "SELECT id, name, gender, age FROM member order by id";
	public static final String UPDATE = "UPDATE tbl_member SET name = :name, gender:gender, age:age WHERE id = :id";
	public static final String SELECT_BY_MEMBER_ID  = "SELECT id, name, gender, age FROM member where id";
	public static final String DELETE_BY_MEMBER_ID = "DELETE FROME member WHERE id=:id";
}
