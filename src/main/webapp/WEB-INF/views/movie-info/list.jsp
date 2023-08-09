<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>내용</th>
		</tr>
		<tbody id="tbody">
		</tbody>
	</table>
	<script>
		const getMovie = function(){
			const xhr = XMLHttpRequest();
			xhr.open("GET","/list");
			xhr.onreadystatechange = function(){
				if(xhr.readyState===4){
					if(xhr.status===200){
						const list = JSON.parse(xhr.responseText);
						console.log(list);
						let html = '';
						for(const movie of list){
							html += '<tr>';
							html += '<td>' + movie.miNum + '</td>';
							html += '<td>' + movie.miName + '</td>';
							html += '<td>' + movie.miDesc + '</td>';
							html += '</tr>';
						}
						document.querySelector('#tbody').innerHTML = html;
					}
				}
			}
			xhr.send();
		}
		window.addEventListener('load',getMovie);
	</script>
</body>
</html>