$(document).ready(function($) {
	//alert('jquery 잘되나?');
	$(".menu-toggle-btn").click(function() {
		$(".gnb").stop().slideToggle("fast");
	})
})