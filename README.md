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

## 요구 사항에 따른 설명
코드의 시작은 kr.or.connect.preworkproject.main의 mainTest.java에서 실행할 수 있습니다.

코드 실행시 사용자, 즐겨찾기 필지와 관련하여 3가지로 선택 가능합니다.

- 사용자를 선택시 : '사용자 전체조회', '사용자 추가', 'id입력으로 사용자 정보 조회', 'id입력으로 사용자 제거'가 가능합니다. 사용자 정보는 id(email)(PK), name, gender, age 가 있습니다.

- 즐겨찾기를 선택시 : '즐겨찾기를 사용중인 유저조회', '사용자의 즐겨찾기 추가', '사용자가 즐겨찾기한 필지 조회', '사용자가 즐겨찾기한 필지 제거'가 있으며 즐겨찾기는 member_id(FK)와 parcel_id(FK)로 되어 있습니다.

- 필지를 선택시 : '전체 필지 조회', '필지 추가', 'PNU값으로 필지조회', 'Adress값으로 필지검색'이 가능하며 필지는 id(PK), address, geometry, pnu(UQ) 정보를 가집니다.

- 마지막으로 필지데이터는 kr.or.connect.preworkproject.JsonData의 ParcelJsonData.java 에서 파싱하여 데이터를 추가할 수 있도록 만들었습니다.

# Pre_work_project

2



3

필지(parcel) 데이터 [https://drive.google.com/file/d/1J-4tietZkJxPPEfQ_SBRqSg2nDXYLH2J/view?usp=sharing](https://drive.google.com/file/d/1J-4tietZkJxPPEfQ_SBRqSg2nDXYLH2J/view?usp=sharing)

4



5

## 프로젝트의 요구사항

6



7

- 사용자는 '이메일' 로 구분되며 '이름', '성별', '나이' 를 가짐(해결)

8

- 사용자는 각 필지(parcel)에 대하여 즐겨찾기 추가/조회/삭제 를 할 수 있음

9

- 사용자는 각 필지(parcel)에 대해 고유값(pnu)로 조회 가능(해결)

10

- 사용자는 필지의 주소로 검색 가능(해결)

11



12

해당 프로젝트의 주안점은 다음과 같습니다.

13



14

- 구동에 문제가 없는가?

15

- 적절한 자료구조를 선택하여 문제를 해결하였는가?

16

- 코드의 Readability

17

- 옵션) 테스트가 용이한가?

18



19

## 기술 

20

- 사용언어 : Java

21

- DB : MySQL을 사용

22

- 사용한 오픈 소스 : spring  

23

- Eclipce에서 Maven으로 프로젝트 빌드

24



25

## 요구 사항에 따른 설명

26

코드의 시작은 kr.or.connect.preworkproject.main의 mainTest.java에서 실행할 수 있습니다.

27



28

코드 실행시 사용자, 즐겨찾기 필지와 관련하여 3가지로 선택 가능합니다.

29



30

- 사용자를 선택시 : '사용자 전체조회', '사용자 추가', 'id입력으로 사용자 정보 조회', 'id입력으로 사용자 제거'가 가능합니다. 사용자 정보는 id(email)(PK), name, gender, age 가 있습니다.

31



32

- 즐겨찾기를 선택시 : '즐겨찾기를 사용중인 유저조회', '사용자의 즐겨찾기 추가', '사용자가 즐겨찾기한 필지 조회', '사용자가 즐겨찾기한 필지 제거'가 있으며 즐겨찾기는 member_id(FK)와 parcel_id(FK)로 되어 있습니다.

33



34

- 필지를 선택시 : '전체 필지 조회', '필지 추가', 'PNU값으로 필지조회', 'Adress값으로 필지검색'이 가능하며 필지는 id(PK), address, geometry, pnu(UQ) 정보를 가집니다.

35



36

- 마지막으로 필지데이터는 kr.or.connect.preworkproject.JsonData의 ParcelJsonData.java 에서 파싱하여 데이터를 추가할 수 있도록 만들었습니다.

37



38

![Spacewalk_DB](https://user-images.githubusercontent.com/33721972/113986169-e67eab00-9887-11eb-9658-719d958aa234.png)
Database 스키마
