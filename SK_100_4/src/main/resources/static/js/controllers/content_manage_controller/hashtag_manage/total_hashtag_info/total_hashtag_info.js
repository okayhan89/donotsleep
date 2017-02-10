'use strict';

/* Controllers */

  // Form controller
app.controller('TotalHashTagInfoController', ['$scope', function($scope) {
	
	$scope.selectExcel  = function() {alert("선택된 데이터만 엑셀화시킵니다.");};
	$scope.allExcel  = function() {alert("모든 데이터만 엑셀화시킵니다.");};
	$scope.selectAdvancedExcel  = function() {alert("선택된 데이터 advanced데이터까지 엑셀화시킵니다.");};
	$scope.oneVideoDown  = function() {alert("하나의 Clip 다운로드합니다.");};
	
	$scope.admin = function(){
		alert("관리자 HashTag 로 지정하시겠습니까?");
	};
	
}]);
