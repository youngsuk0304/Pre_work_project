package kr.or.connect.preworkproject.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.preworkproject.config.ApplicationConfig;
import kr.or.connect.preworkproject.dao.ParcelDao;
import kr.or.connect.preworkproject.dto.Parcel;

public class JDBCTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		
		ParcelDao roleDao =ac.getBean(ParcelDao.class);

		List<Parcel> list = roleDao.selectAll();
		
		for(Parcel role: list) {
			System.out.println(role);
		}

	}
}
