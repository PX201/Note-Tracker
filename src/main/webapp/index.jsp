<%@page import="com.note.Note"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<title>Welcome</title>
</head>
<body>
	<div class="container mt-4">
  <form action="${pageContext.request.contextPath}/NoteController" method="post">
    <div class="form-group">
      <label for="noteTitle">Note title</label>
      <input type="text" class="form-control" id="noteTitle" name="noteTitle">
    </div>
    <div class="form-group">
      <label for="note">Note</label>
      <textarea class="form-control" id="note" name="note" rows="5"></textarea>
    </div>
    <button type="submit" class="btn btn-primary">Add Note</button>
  </form>

  <div class="mt-4">
    <table class="table">
      <thead>
        <tr>
          <th>Note Title</th>
          <th>Note</th>
          <th></th>
        </tr>
      </thead>
      <tbody>
        <c:forEach var="myNote" items="${notes}">
          <tr>
            <td>${myNote.noteTitle}</td>
            <td>${myNote.note}</td>
            <td>
              <a href="${pageContext.request.contextPath}/NoteController?noteTitle=${myNote.noteTitle}"
                class="btn btn-danger btn-sm">Delete</a>
            </td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </div>
</div>

</body>
</html>