package kr.or.connect.preworkproject.main;

import java.util.Scanner;


public class mainTest {
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		while(true) {
			System.out.println(" 1 : 사용자 관련");
			System.out.println(" 2 : 즐겨찾기 관련");
			System.out.println(" 3 : 필지 관련");
			System.out.println(" 4 : 종료");
			System.out.println(" 숫자를 입력하세요");
			int input_num=sc.nextInt();
			sc.nextLine();
			if(input_num==4)break;
			switch (input_num)
			{
			case 1:
				member();
				break;
			case 2:
				favorite();
				break;
			case 3:
				parcel();
				break;
			default :
				System.out.println("잘못 입력하셨습니다");
				break;
			}
		}
		
	}
	public static void member() {
		while(true) {
			int member_num;
			String member_id,name,gender;
			int age;
			
			System.out.println(" 1 : 사용자 전체조회");
			System.out.println(" 2 : 사용자 추가");
			System.out.println(" 3 : id입력 사용자 조회");
			System.out.println(" 4 : id입력 사용자 제거");
			System.out.println(" 5 : 종료");
			System.out.println(" 숫자를 입력하세요");
			member_num=sc.nextInt();
			sc.nextLine();
			if(member_num==1){
				//SELECT_ALL
				System.out.println("--사용자 전체 조회--");
				MemberTest.memberSelectAll();
			}
			else if(member_num==2){
				//INSERT
				char first_char;
				char last_char;
				System.out.println("--사용자 추가--");
				System.out.println("사용자 정보 입력");
				System.out.println("사용자 id(이메일) : ");
				member_id=sc.nextLine();
				first_char=member_id.charAt(0);
				last_char=member_id.charAt(member_id.length()-1);
				if(first_char=='@'||last_char=='@'||member_id.contains("@")==false) {
					System.out.println("이메일 형식이 아닙니다");
					continue;
				}
				System.out.println("이름 : ");
				name=sc.nextLine();
				System.out.println("성별 (man, woman) : ");
				gender=sc.nextLine();
				System.out.println("나이 : ");
				age=sc.nextInt();
				MemberTest.memberInsert(member_id, name, gender, age);
				System.out.println("추가하였습니다.");
			}
			else if(member_num== 3){
				//SELECT_BY_MEMBER_ID
				System.out.println("--id로 사용자 조회--");
				System.out.println("사용자 id 입력 : ");
				member_id=sc.nextLine();
				MemberTest.memberSelectByMemberId(member_id);
			}
			else if(member_num==4) {
				//DELETE_BY_MEMBER_ID
				System.out.println("--id로 사용자 제거--");
				System.out.println("사용자 id 입력 : ");
				member_id=sc.nextLine();
				MemberTest.memberDeleteByMemberId(member_id);
			}
			else if(member_num==5) {
				break;
			}
			else System.out.println("잘못 입력하셨습니다.");
		}
	}
	public static void favorite() {
		while(true) {
			int favorite_num;
			String member_id;
			int parcel_id;
			System.out.println(" 1 : 즐겨찾기 사용중이 유저조회");
			System.out.println(" 2 : 즐겨찾기 추가");
			System.out.println(" 3 : 사용자가 즐겨찾기한 필지조회");
			System.out.println(" 4 : 사용자가 즐겨찾기한 필지제거");
			System.out.println(" 5 : 종료");
			System.out.println(" 숫자를 입력하세요");
			favorite_num=sc.nextInt();
			sc.nextLine();
			if(favorite_num==1) {
				System.out.println("--즐겨찾기를 사용하는 유저조회--");
				FavoriteTest.favoriteSelectAll();
			}else if(favorite_num==2) {
				System.out.println("--즐겨찾기 추가--");
				System.out.println("사용자 id 입력 : ");
				member_id=sc.nextLine();
				System.out.println("즐겨찾기할 필지 id 입력");
				parcel_id=sc.nextInt();
				sc.nextLine();
				FavoriteTest.favoriteInsert(member_id,parcel_id);
			}else if(favorite_num==3) {
				System.out.println("--즐겨찾기한 필지조회--");
				System.out.println("사용자 id 입력 : ");
				member_id=sc.nextLine();
				FavoriteTest.favoriteSelectFavorite(member_id);
			}else if(favorite_num==4) {
				System.out.println("--즐겨찾기한 필지제거--");
				System.out.println("사용자 id 입력 : ");
				member_id=sc.nextLine();
				System.out.println("즐겨찾에서 제거할 필지 id 입력");
				parcel_id=sc.nextInt();
				FavoriteTest.favoriteDeletetFavorite(member_id, parcel_id);
			}else if(favorite_num==5) {
				break;
			}else System.out.println("잘못 입력하셨습니다.");
		}
		
	}
	public static void parcel() {
		while(true) {
			int parcel_num;
			int parcel_id;
			String address,geometry,pnu;
			ParcelTest pt=new ParcelTest();
			System.out.println(" 1 : 전체 필지 조회");
			System.out.println(" 2 : 필지 추가");
			System.out.println(" 3 : PNU값으로 필지조회");
			System.out.println(" 4 : Adress값으로 필지검색");
			System.out.println(" 5 : 종료");
			System.out.println(" 숫자를 입력하세요");
			parcel_num=sc.nextInt();
			sc.nextLine();
			if(parcel_num==1) {
				System.out.println("--전체 필지 조회--");
				ParcelTest.parcelSelectAll();
			}else if(parcel_num==2) {
				System.out.println("--필지 추가--");
				System.out.println("필지 id 입력 : ");
				parcel_id=sc.nextInt();
				sc.nextLine();
				System.out.println("필지 address 입력 : ");
				address=sc.nextLine();
				System.out.println("필지 geometry 입력 : ");
				geometry=sc.nextLine();
				System.out.println("필지 pnu 입력 : ");
				pnu=sc.nextLine();
				pt.parcelAdd(parcel_id, address, geometry, pnu);
			}else if(parcel_num==3) {
				System.out.println("--PNU값으로 필지조회--");
				System.out.println("pnu 입력 : ");
				pnu=sc.nextLine();
				ParcelTest.parcelSelectByPnu(pnu);
			}else if(parcel_num==4) {
				System.out.println("--Adress값으로 필지검색--");
				System.out.println("address 입력 : ");
				address=sc.nextLine();
				ParcelTest.parcelSelectByAdress(address);
			}else if(parcel_num==5) {
				break;
			}else System.out.println("잘못 입력하셨습니다.");
				
		}
	}
}
