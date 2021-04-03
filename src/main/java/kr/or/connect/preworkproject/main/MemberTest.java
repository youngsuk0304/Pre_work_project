package kr.or.connect.preworkproject.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.connect.preworkproject.config.ApplicationConfig;
import kr.or.connect.preworkproject.dao.MemberDao;
import kr.or.connect.preworkproject.dto.Member;

public class MemberTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		MemberDao memberDao = ac.getBean(MemberDao.class);


		//insert
		Member member = new Member();
		member.setId("123@123.com");
		member.setName("서영석");
		member.setGender("man");
		member.setAge(29);
		int count = memberDao.insert(member);
		System.out.println(count + "건 입력하였습니다.");

		//SELECTBYID
		//Member resultMember = memberDao.selectById("123@123.com");
		//System.out.println(resultMember);

		//UPDATE
//		Member member = new Member();
//		member.setId("123@123.com");
//		member.setName("서영석");
//		member.setGender("man");
//		member.setAge(30);
//		
//		int count = memberDao.update(member);
//		System.out.println(count + "건 입력하였습니다.");


		//DELETE
//		int deleteCount=memberDao.deleteById("123@123.com");
//		System.out.println(deleteCount+"건 삭제하였습니다.");

	}
}