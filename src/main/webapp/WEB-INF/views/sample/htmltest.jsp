<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>main page layout</title>
</head>
<body>
	<h1>Html 이란?</h1>
	<h2>HTML 의 역사</h2>
	<h3>팀 버너스리에 대해</h3>
	<h4>HTML 의 태그</h4>
	<h5>HTML 의 태그</h5>
	<a href="/htmltest">페이지 다시 로딩-불러오기</a>
	<img src="/resources/images/asd.jpg" alt="꽃">
	<p>
		<strong>이것은</strong>문단입니다.<br> <b>이것은</b> 문단입니다.
	</p>
	<P>이것은&nbsp;&nbsp;&nbsp;&nbsp; &amp; &lt; &gt; &copy;
		&nbsp;&nbsp;&nbsp;&nbsp;특수문자입니다.<hr /></p>


	<ul>
		<li>리스트 1</li>
		<li>리스트 2</li>
	</ul>
	<ol>
		<li>리스트 1</li>
		<li>리스트 2</li>
	</ol>
	<div>
		<h2>회원가입홈 입니다.</h2>
		<form method="post" action="/htmltest">
			성별을 선택해주세요 <select name="gender">
				<option value="M">남자</option>
				<option value="F">여자</option>
			</select> <br> <input type="text" name="userid"
				placeholder="사용자 아이디를 입력해주세요"> <input type="file"
				name="upload_file">
			<textarea name="contents" cols="100" rows="5"> 여기에 글을 입력하세요.</textarea>
			<input type="submit" name="submit" value="회원가입" class="login">
		</form>
	</div>
	<br>
	<table summary="00학교 00반 성적표" style="border: 1px solid black">
		<!-- 인라인 스타일 주기 -->
		<caption>이 테이블은 학생들의 성적표 입니다.</caption>
		<tr>
			<th>이름</th>
			<th>성적</th>
		</tr>
		<tr>
			<td>백시몬</td>
			<td>15</td>
		</tr>
		<tr>
			<td colspan="2">BBB</td>
		</tr>
		<tr>
			<td>CCC</td>
			<td>C</td>
		</tr>
	</table>
</body>