'use strict';

/* Controllers */

  // Form controller
app.controller('AdminLogInfoController', ['$scope','$modal', function($scope, $modal) {
	
	$scope.selectExcel  = function() {alert("선택된 데이터만 엑셀화시킵니다.");};
	$scope.allExcel  = function() {alert("모든 데이터만 엑셀화시킵니다.");};
	$scope.selectAdvancedExcel  = function() {alert("선택된 데이터 advanced데이터까지 엑셀화시킵니다.");};
	$scope.oneVideoDown  = function() {alert("하나의 Clip 다운로드합니다.");};
	
	$scope.delete_check = function(){
		confirm("이 유저를 관리자회원에서 제외시키겠습니까?");
	};
	
	$scope.login_log= function () {
		
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/admin_user/log_information/popup_page/login_log.html',
			controller: 'LoginLogController'
			});
	}
	$scope.behavior_log= function () {
		
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/admin_user/log_information/popup_page/behavior_log.html',
			controller: 'BehaviorLogController'
		});
	}
	
}]);

app.controller('LoginLogController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
	
	$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);

app.controller('BehaviorLogController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
		
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);