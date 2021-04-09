package kr.or.connect.preworkproject.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.preworkproject.config.ApplicationConfig;
import kr.or.connect.preworkproject.dao.ParcelDao;
import kr.or.connect.preworkproject.dto.Parcel;

public class ParcelPart {
	static ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

	static ParcelDao parcelDao = ac.getBean(ParcelDao.class);

	// SELECT_ALL
	public static void parcelSelectAll() {
		List<Parcel> list = parcelDao.selectAll();
		for (Parcel parcel : list) {
			System.out.println(parcel);
		}
	}

	// INSERT
	public void parcelAdd(int parcel_id, String address, String geometry, String pnu) {
		Parcel parcel = new Parcel();
		parcel.setId(parcel_id);
		parcel.setAddress(address);
		parcel.setGeometry(geometry);
		parcel.setPnu(pnu);
		parcelDao.insert(parcel);
		System.out.println("새로운 필지를 입력하였습니다.");
	}

	// SELECT_BY_PNU
	public static void parcelSelectByPnu(String pnu) {
		Parcel resultParcel = parcelDao.selectByPnu(pnu);
		System.out.println(resultParcel);
	}

	// SELECT_BY_ADDRESS
	public static void parcelSelectByAdress(String address) {
		List<Parcel> list = parcelDao.selectByAddress(address);
		for (Parcel parcel1 : list) {
			System.out.println(parcel1);
		}
	}
}