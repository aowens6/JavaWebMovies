$(function(){
	var $leftCurtain = $("#leftCurtain");
	var $rightCurtain = $("#rightCurtain");
	var $dimScreen = $("#dimScreen");
	var $container = $(".container");
	
	$leftCurtain.css({
		
		left: 0
		
	}).animate({
		left: "-600px"
	}, 4000);
	
	
	$rightCurtain.css({
		
		right: 0
		
	}).animate({
		right: "-570px"
	}, 4000, function(){
		
		$dimScreen.animate({
			
			opacity: 0
			
		}, 3000, function(){
			
			$container.css({
				
				"z-index": 102
				
			});
		});
		
	});
	
		
	
});