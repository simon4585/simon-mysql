function myFunction() {
	alert(document.getElementById("exam").innerHTML);
	if (document.getElementById("exam").innerHTML == "변경 전")
		document.getElementById("exam").innerHTML = "변경 후"
	else
		document.getElementById("exam").innerHTML = "변경 전"
}