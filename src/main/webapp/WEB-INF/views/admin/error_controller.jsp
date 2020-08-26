<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="include/header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">에러 페이지</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item">에러명</li>
              <li class="breadcrumb-item active">${exception.getMessage()}>에러페이지 Starter Page</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    <!-- /.content-header -->

    <!-- Main content -->
    <div class="content">
    <p><a href='<c:out value="${prevPage}"/>'>이전페이지로 가기</a>
    <p>에러 상세내역</p>
    <ul>
    <c:forEach items="${exception.getStackTrace()}" var="stack">
    <li>
    ${stack.toString()}
    </li>
    </c:forEach>
    </ul>
     ${exception}
    </div>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->


</body>
</html>

<%@ include file="include/footer.jsp"%>