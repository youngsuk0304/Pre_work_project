package kr.or.connect.preworkproject.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.mysql.jdbc.Statement;

import kr.or.connect.preworkproject.dto.Member;
import static kr.or.connect.preworkproject.dao.MemberDaoSqls.*;

@Repository
public class MemberDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Member> rowMapper = BeanPropertyRowMapper.newInstance(Member.class);

	public MemberDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("tbl_member");
	}
	//INSERT
	public int insert(Member member) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(member);
		return insertAction.execute(params);
	}
	//SELECT_All
	public List<Member> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap(),rowMapper);
		//query(sql문, 바인딩할 값을 전달하기위한 객체, 결과를 dto저장);
	}
	//SECECT_BY_MEMBER_ID
	public Member selectById(String id) {
		try {
			Map<String, ?> params = Collections.singletonMap("id", id);
			return jdbc.queryForObject(SELECT_BY_MEMBER_ID, params, rowMapper);		
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}
	//UPDATE
	public int update(Member member) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(member);
		return jdbc.update(UPDATE, params);
	}
	//DELETE_BY_MEMBER_ID
	public int deleteById(String id) {//값이 여러개 들어가지 않고 하나만 들어갈때 사용 가능
		Map<String,?> params = Collections.singletonMap("id",id);
		return jdbc.update(DELETE_BY_MEMBER_ID, params);
	}
	//EXITS_MEMBER_ID
//	public Member exitsMemberId(String id) {
//		
//		
//		
//		
//	}
}