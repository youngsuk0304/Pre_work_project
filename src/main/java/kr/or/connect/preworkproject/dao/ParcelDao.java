package kr.or.connect.preworkproject.dao;

import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import kr.or.connect.preworkproject.dto.Parcel;

import static kr.or.connect.preworkproject.dao.ParcelDaoSqls.*;

@Repository
public class ParcelDao {
	private NamedParameterJdbcTemplate jdbc;
	private SimpleJdbcInsert insertAction;
	private RowMapper<Parcel> rowMapper = BeanPropertyRowMapper.newInstance(Parcel.class);

	public ParcelDao(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
		this.insertAction = new SimpleJdbcInsert(dataSource).withTableName("tbl_parcel");
	}

	// SELECT_All
	public List<Parcel> selectAll() {
		return jdbc.query(SELECT_ALL, Collections.emptyMap(), rowMapper);
		// query(sql문, 바인딩할 값을 전달하기위한 객체, 결과를 dto저장);
	}

	// SELECT_BY_PNU
	public Parcel selectByPnu(String pnu) {
		try {
			Map<String, ?> params = Collections.singletonMap("pnu", pnu);
			return jdbc.queryForObject(SELECT_BY_PNU, params, rowMapper);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}
	}

	// SELECT_BY_ADDRESS
	public List<Parcel> selectByAddress(String address) {
		try {
			Map<String, ?> params = Collections.singletonMap("address", address);
			return jdbc.query(SELECT_BY_ADDRESS, params, rowMapper);
		} catch (EmptyResultDataAccessException e) {
			return null;
		}

	}

	// INSERT
	public int insert(Parcel parcel) {
		SqlParameterSource params = new BeanPropertySqlParameterSource(parcel);
		return insertAction.execute(params);
	}

}