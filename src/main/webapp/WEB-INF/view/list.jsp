<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/resource/js/jquery-3.2.1.js"></script>

<script type="text/javascript">
	$(function(){
		
	})
	function fenye(num) {
		alert(num)
		$("[name=pagenum]").val(num);
		$("[name=myform]").submit();
	}
</script>
</head>
<body>
	<form action="list" name="myform">
			<input type="hidden" name="pagenum" value="${dats.pagenum }">
		种类：<select name="tid">
				<option value="0" selected="selected">
				<option value="1">空调</option>
				<option value="2">电视</option>
				<option value="3">电脑</option>
				<option value="4">洗衣机</option>
			</select>
		品牌：<select name="bid">
				<option value="0" selected="selected">
				<option value="1">海尔</option>
				<option value="2">美的</option>
				<option value="3">戴尔</option>
				<option value="4">联想</option>
			</select>
		
		单价<input type="text" name="price1" value="${dats.price1}">
			-<input type="text" name="price2" value="${dats.price2}">
		名称：<input type="text" name="goodname" value="${dats.goodname}">
		<button>查找</button>
	</form>
	<table border="1">
		<tr>
				<td>商品</td>
				<td>id</td>
				<td>中文名</td>
				<td>英文名</td>
				<td>种类</td>
				<td>品牌</td>
				<td>尺寸</td>
				<td>价格</td>
				<td>数量</td>
				<td>标签</td>
				<td>图片</td>
		</tr>
		<c:forEach items="${list}" var="list">
			<tr>
				<td>商品</td>
				<td>${list.id }</td>
				<td>${list.china }</td>
				<td>${list.english }</td>
				<td>${list.type.tname}</td>
				<td>${list.brand.bname}</td>
				<td>${list.size }</td>
				<td>${list.price }</td>
				<td>${list.mach }</td>
				<td>${list.noter}</td>
				<td>${list.img }</td>
			</tr>
		</c:forEach>
	</table>
	<c:forEach begin="1" end="${page.pages }" var="i">
		<input type="button" value="${i}" onclick="fenye(${i})">
	</c:forEach>
</body>
</html>