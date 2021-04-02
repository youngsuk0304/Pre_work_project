package kr.or.connect.preworkproject.dao;

import java.util.Collections;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
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
		this.insertAction = new SimpleJdbcInsert(dataSource)
                .withTableName("tbl_parcel");
	}
	public List<Parcel> selectAll(){
		return jdbc.query(SELECT_ALL, Collections.emptyMap(),rowMapper);
		//query(sql문, 바인딩할 값을 전달하기위한 객체, 결과를 dto저장);
		
	}
}