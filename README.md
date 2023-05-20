# 프로젝트 이름

<p align="center">
<br>
IMAGES
<br>
</p>

  <br><br>
  
## 팀원
유서린 | 장유진 |
:---------:|:----------:|
[SeorinY](https://github.com/SeorinY) | [jinchiim](https://github.com/jinchiim) | 
관련 기능 | 관련 기능 |
<br><br>

## 구현 기능

### 기능 1

### 기능 2

### 기능 3

### 기능 4


## 코드 컨벤션
<details>
<summary> 코드 컨벤션 </summary>
<div markdown="1">

- **자바 코드 컨벤션을 지키면서 프로그래밍했는가?**

- **한 메서드에 최소한의 들여쓰기(indent)만 허용했는가?**
    - **최대 depth : 2** 까지만 허용

- **else 예약어를 쓰지 않았는가?**

- **setter 없이 구현했는가?**

- **핵심 로직을 구현하는 도메인 객체에 setter를 쓰지 않고 구현했는가? 단, DTO는 허용한다.**

- **코드 한 줄에 점(.)을 하나만 허용했는가?**

- **메소드의 인자 수를 제한했는가? 4개 이상의 인자는 허용하지 않는다. 3개도 가능하면 줄이기 위해 노력해 본다.**

- **메소드가 한가지 일만 담당하도록 구현했는가?**

- **클래스를 작게 유지하기 위해 노력했는가?**

    메서드당 line을 10까지만 허용

    길이가 길어지면 메서드로 분리


- **매직 넘버 사용을 자제하고** **상수 사용**

- entity에서는 newInstance

- dto에서는 of 생성자 사용

- SuccessType에 CRUE_what_SUCCESS 사용

</details>
  <br><br>

## 깃 컨벤션
<details>
<summary> 공통 타입 </summary>
<div markdown="1">
[feat] : 새로운 기능 추가

[add] : Feat 이외의 부수적인 코드 추가, 라이브러리 추가, 새로운 View나 Activity 생성

[fix] : 잘못된 부분 수정

[chore] : 버전 코드 수정, 패키지 구조 변경, 파일 이동, 가독성이나 변수명, reformat 등

[delete] : 쓸모없는 코드 삭제

[refact] : 내부 로직은 변경 하지 않고 기존의 코드를 개선하는 리팩토링 시

[hotfix] : 해결이 급한 부분 수정

[docs] : README나 WIKI 등의 문서 개정

[merge] : 머지할때
</details>
  
<details>
<summary> 브랜치명 </summary>
<div markdown="1">
  
```
feature/{#이슈번호}-이슈내용

ex)
feature/#11-fix-userList
```
 
</details>
    
<details>
<summary>   이슈템플릿 </summary>
<div markdown="1">
  
```
## 📌 Feature Issue
<!-- 구현할 기능에 대한 내용을 설명해주세요. -->

## 📝 To-do
<!-- 해야 할 일들을 적어주세요. -->

- [ ]
```
  
</details>
  
<details>
<summary>   pr템플릿 </summary>
<div markdown="1">
  
```
## ✒️ 관련 이슈번호

- Closes #

## 🔑 Key Changes

1. 

## 📢 To Reviewers
-
```
  
</details>
  
<details>
<summary> 커밋 </summary>
<div markdown="1">
  
```
{#이슈번호} [type] : 작업 내용

ex)
#11 [add] : 유저 리스트 엔티티 추가
```
  
</details>
    <br><br>
                
## 프로젝트 구조
  
  ```
├── 📂 controller
│   ├── 📂 user
│   │   ├── UserController
│   │   └── 📂 dto
│   │        └── 📂 request
│   │        └── 📂 response
│   ├── 📂 review
│   └── 📂 post
│
├── 📂 service
│   ├── 📂 user
│   │   ├── UserService
│   │   └── UserServiceImpl
│   ├── 📂 review
│   └── 📂 post
│
├── 📂 infrastructure
│   ├── 📂 user
│   │   ├── UserEntity
│   │   ├── UserRepository
│   │   └── UserRepositoryImpl
│   ├── 📂 review
│   └── 📂 post
│
├── 📂 common
│   ├── 📂 advice
│   └── 📂 dto
│
└── 📂 exception
    ├── 📂 model
    ├── Error
    └── Success
```
  <br><br>
  
  
## ERD
  
## 참여자
프론트팀
<table>
<tr>
  <td>정찬우</td>
  <td>조승희</td>
  <td>유지민</td>
</tr>
<tr>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/b1b988ff-0044-4126-be40-36c9c63f4303">  </td>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/b1b988ff-0044-4126-be40-36c9c63f4303">  </td>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/b1b988ff-0044-4126-be40-36c9c63f4303">  </td>
</tr>
</table>

기획
<table>
<tr>
  <td>김정언</td>
  <td>김해린</td>

</tr>
<tr>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/2dbeecce-8ead-4693-89d2-2f63e4390965"> </td>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/5acd154e-41a0-4e06-8e96-7f7c0af74cf2"> </td>
</tr>
</table>

디자인
<table>
<tr>
  <td>김유림</td>
  <td>조정연</td>

</tr>
<tr>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/64ca9e88-dea5-4616-9e2c-41406fade31b"> </td>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/b346e1d4-ce7b-45d4-ae2b-ec2af6765645"> </td>
</tr>
</table>

서버
<table>
<tr>
  <td>유서린</td>
  <td>장유진</td>

</tr>
<tr>
  <td> <img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/8e2664a1-73c5-41ef-a77e-66e3ef6bd349"> </td>
  <td><img width="157" alt="image" src="https://github.com/SOPKATHON-2/FrontEnd/assets/91375979/0a63a1b9-376e-462c-9404-d058b7cd7f8c"> </td>
</tr>
</table>
