# Pre_work_project

필지(parcel) 데이터 [https://drive.google.com/file/d/1J-4tietZkJxPPEfQ_SBRqSg2nDXYLH2J/view?usp=sharing](https://drive.google.com/file/d/1J-4tietZkJxPPEfQ_SBRqSg2nDXYLH2J/view?usp=sharing)

## 프로젝트의 요구사항

- 사용자는 '이메일' 로 구분되며 '이름', '성별', '나이' 를 가짐(해결)
- 사용자는 각 필지(parcel)에 대하여 즐겨찾기 추가/조회/삭제 를 할 수 있음
- 사용자는 각 필지(parcel)에 대해 고유값(pnu)로 조회 가능(해결)
- 사용자는 필지의 주소로 검색 가능(해결)

해당 프로젝트의 주안점은 다음과 같습니다.

- 구동에 문제가 없는가?
- 적절한 자료구조를 선택하여 문제를 해결하였는가?
- 코드의 Readability
- 옵션) 테스트가 용이한가?

## 기술 
- 사용언어 : Java
- DB : MySQL을 사용
- 사용한 오픈 소스 : spring  
- Eclipce에서 Maven으로 프로젝트 빌드

## 요구 사항에 따른 코드 설명
코드의 시작은 kr.or.connect.preworkproject.main의 mainTest.java에서 실행할 수 있습니다.

코드 실행시 사용자, 즐겨찾기 필지와 관련하여 선택 가능하며 

사용자를 선택시 '사용자 전체조회', '사용자 추가', 'id입력으로 사용자 정보 조회', 'id입력으로 사용자 제거'가 가능합니다. 사용자 정보는 id(email), name, gender, age 가 있습니다.

즐겨찾기를 선택시 '즐겨찾기를 사용중인 유저조회', '사용자의 즐겨찾기 추가', '사용자가 즐겨찾기한 필지 조회', '사용자가 즐겨찾기한 필지 제거'가 있으며 즐겨찾기는 member_id와 parcel_id로 되어 있습니다.

마지막으로 필지를 선택시 '전체 필지 조회', '필지 추가', 'PNU값으로 필지조회', 'Adress값으로 필지검색'이 가능하며 필지는 id, address, geometry, pnu 정보를 가집니다.

