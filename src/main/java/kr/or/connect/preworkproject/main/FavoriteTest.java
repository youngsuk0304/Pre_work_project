package kr.or.connect.preworkproject.main;
import java.util.Collections;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.or.connect.preworkproject.config.ApplicationConfig;
import kr.or.connect.preworkproject.dao.FavoriteDao;
import kr.or.connect.preworkproject.dto.Favorite;

public class FavoriteTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		FavoriteDao favoriteDao = ac.getBean(FavoriteDao.class);


		///insert
		//Favorite favorite = new Favorite();
		//favorite.setMember_id("123@123.com");
		//favorite.setParcel_id(28);
		//int count = favoriteDao.insert(favorite);
		//System.out.println(count + "건 입력하였습니다.");
		
		//SELECT_ALL
		List<Favorite> list = favoriteDao.selectAll();
		
		for(Favorite favorite1: list) {
			
			System.out.println(favorite1);
		}
		System.out.println("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		//SELECT_FAVORITE
		List<Favorite> resultFavorite = favoriteDao.selectFavorite("123@123.com");
		System.out.println(resultFavorite);
		for(Favorite favorite1: resultFavorite) {
			
			System.out.println(favorite1);
		}
		//DELETE_FAVORITE
//		Favorite favorite = new Favorite();
//		favorite.setMember_Id("123@123.com");
//		favorite.setParcel_id(30);
//		
//		int count = memberDao.update(member);
//		System.out.println(count + "건 삭제하였습니다.");


		//DELETE
//		int deleteCount=memberDao.deleteById("123@123.com");
//		System.out.println(deleteCount+"건 삭제하였습니다.");

	}
}
