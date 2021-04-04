package kr.or.connect.preworkproject.main;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import kr.or.connect.preworkproject.config.ApplicationConfig;
import kr.or.connect.preworkproject.dao.FavoriteDao;
import kr.or.connect.preworkproject.dao.MemberDao;
import kr.or.connect.preworkproject.dto.Favorite;
import kr.or.connect.preworkproject.dto.Member;
import kr.or.connect.preworkproject.dto.Parcel;

public class FavoriteTest {
	static ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

	static FavoriteDao favoriteDao = ac.getBean(FavoriteDao.class);
	static MemberDao memberDao = ac.getBean(MemberDao.class);
	//SELECT_ALL
	public static void favoriteSelectAll() {
		List<Favorite> list = favoriteDao.selectAll();
		for(Favorite favorite: list) {
			System.out.println(favorite.getMember_id());
		}
		
	}
	//INSERT
	public static void favoriteInsert(String member_id,int parcel_id) {
		Favorite favorite = new Favorite();
		favorite.setMember_id(member_id);
		favorite.setParcel_id(parcel_id);
		favoriteDao.insert(favorite);
		System.out.println("member_id : "+member_id+"사용자에게 parcel_id : "+parcel_id+"를 즐겨찾기 하였습니다.");
	}
	//SELECT_FAVORITE
	public static void favoriteSelectFavorite(String member_id) {

		List<Favorite> resultFavorite = favoriteDao.selectFavorite(member_id);
		for(Favorite favorite: resultFavorite) {
			System.out.println(favorite.getParcel_id());
		}
	}
	//DELETE_FAVORITE
	public static void favoriteDeletetFavorite(String member_id,int parcel_id) {
		Favorite favorite = new Favorite();
		favorite.setMember_id(member_id);
		favorite.setParcel_id(parcel_id);
		
		favoriteDao.deleteFavorite(favorite);
		System.out.println("id : "+member_id+" 사용자의 parcel : " +parcel_id+ "를 삭제하였습니다.");
	}
}
