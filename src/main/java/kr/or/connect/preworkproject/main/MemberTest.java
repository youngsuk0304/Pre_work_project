package kr.or.connect.preworkproject.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.preworkproject.config.ApplicationConfig;
import kr.or.connect.preworkproject.dao.MemberDao;
import kr.or.connect.preworkproject.dto.Member;

public class MemberTest {
	
	static ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);
	static MemberDao memberDao = ac.getBean(MemberDao.class);
	//Insert
	public static void memberInsert(String id,String name, String gender, int age) {
		Member member = new Member();
		member.setId(id);
		member.setName(name);
		member.setGender(gender);
		member.setAge(age);
		memberDao.insert(member);
	}
	//SELECT_ALL
	public static void memberSelectAll() {
		List<Member> list = memberDao.selectAll();
		for(Member member1: list) {
			System.out.println(member1);
		}
	}
	//SELECT_BY_ID
	public static void memberSelectByMemberId(String id) {
		
		Member resultMember = memberDao.selectById(id);
		
		System.out.println(resultMember);
	}
	//DELETE_BY_ID
	public static void memberDeleteByMemberId(String id) {
		memberDao.deleteById(id);
		System.out.println("id = "+id+"인 사용자를 삭제하였습니다.");
	}
//UPDATE
//	Member member = new Member();
//	member.setId("123@123.com");
//	member.setName("서영석");
//	member.setGender("man");
//	member.setAge(30);
//	
//	int count = memberDao.update(member);
//	System.out.println(count + "건 입력하였습니다.");

}