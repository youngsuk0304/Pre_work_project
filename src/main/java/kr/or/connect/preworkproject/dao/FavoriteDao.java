package kr.or.connect.preworkproject.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import kr.or.connect.preworkproject.dto.Favorite;

public class FavoriteDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Favorite> rowMapper = BeanPropertyRowMapper.newInstance(Favorite.class);

	public FavoriteDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("tbl_favorite");
	}
	public int insert(Favorite favorite) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(favorite);
		return insertAction.execute(params);
	}
}
