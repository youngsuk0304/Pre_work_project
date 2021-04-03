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

		ParcelDao parcelDao = ac.getBean(ParcelDao.class);

		//Parcel parcel = new Parcel();
		/////insert
		//parcel.setId(30);
		//parcel.setAddress("서울 강남구 논현동 242-1");
		//parcel.setGeometry("[[127.04010779,37.51585568],[127.04026063,37.5158905],[127.04031586,37.51573677],[127.04016472,37.51570114],[127.04010779,37.51585568]]");
		//parcel.setPnu("1168010800102420003");

		//int count = parcelDao.insert(parcel);
		//System.out.println(count + "건 입력하였습니다.");
		////////////	

		//int parcel = parcelDao.update(parcel);
		//System.out.println(count +  " 건 수정하였습니다.");


		//selectByPnu
		Parcel resultParcel = parcelDao.selectByPnu("1168010800102420001");
		System.out.println(resultParcel);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		//selectByAddress
		List<Parcel> list = parcelDao.selectByAddress("서울 강남구 논현동");

		for(Parcel parcel1: list) {
			System.out.println(parcel1);
		}
	}
}