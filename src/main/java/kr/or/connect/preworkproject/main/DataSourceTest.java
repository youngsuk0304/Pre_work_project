package kr.or.connect.preworkproject.main;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.preworkproject.config.ApplicationConfig;

public class DataSourceTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		DataSource ds = ac.getBean(DataSource.class);

		Connection conn = null;
		try {// 접속이 잘되는지 확인
			conn = ds.getConnection();
			if (conn != null)
				System.out.println("접속 성공");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}