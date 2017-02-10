'use strict';

/* Controllers */

  // Form controller
app.controller('AdminHashTagInfoController', ['$scope', function($scope) {
	
	$scope.selectExcel  = function() {alert("선택된 데이터만 엑셀화시킵니다.");};
	$scope.allExcel  = function() {alert("모든 데이터만 엑셀화시킵니다.");};
	$scope.selectAdvancedExcel  = function() {alert("선택된 데이터 advanced데이터까지 엑셀화시킵니다.");};
	$scope.oneVideoDown  = function() {alert("하나의 Clip 다운로드합니다.");};
	
	$scope.save =function(){
		alert("바뀐 table을 저장하시겠습니까?");
	};
	$scope.admin_leave =function(){
		alert("지금 선택하신 hashtag를 admin hashtag에서 제외하시겠습니까?");
	};
	$scope.setting =function(){
		alert("논의중에 있습니다..");
	};
	
	
	
}]);
