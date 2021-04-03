package kr.or.connect.preworkproject.dao;


import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.preworkproject.dto.Favorite;
import static kr.or.connect.preworkproject.dao.FavoriteDaoSqls.*;
@Repository
public class FavoriteDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Favorite> rowMapper = BeanPropertyRowMapper.newInstance(Favorite.class);

	public FavoriteDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("tbl_favorite");
	}

	//즐겨찾기 추가
	public int insert(Favorite favorite) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(favorite);
		return insertAction.execute(params);
	}
	//즐겨찾기 목록
	//SELECT_All
	public List<Favorite> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap(),rowMapper);
		//query(sql문, 바인딩할 값을 전달하기위한 객체, 결과를 dto저장);
	}
	//즐겨찾기 개별 삭제
	//즐겨찾기 비우기
	//즐겨찾기 갯수
	//즐겨찾기 수정
}