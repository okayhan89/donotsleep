'use strict';

/* Controllers */

  // Form controller
app.controller('CorporateUserController', ['$scope','$modal', function($scope, $modal) {
	
	$scope.selectExcel  = function() {alert("선택된 데이터만 엑셀화시킵니다.");};
	$scope.allExcel  = function() {alert("모든 데이터만 엑셀화시킵니다.");};
	$scope.selectAdvancedExcel  = function() {alert("선택된 데이터 advanced데이터까지 엑셀화시킵니다.");};
	$scope.oneVideoDown  = function() {alert("하나의 Clip 다운로드합니다.");};
	
	$scope.password_reset = function(){
		alert("유저에게 패스워드를 다시 설정할수 있는 메일을 보냅니다.");
	};
	
	$scope.upload_list= function () {
		
		alert("이 팝업은 table에서 중복체크 하여 클릭이 가능하며 user가 업로드한 data들 조회할 수 있습니다.");
		
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/user_info/personal_user/popup_page/upload_list.html',
			controller: 'UploadListController'
			});
		}
	$scope.reply_list= function () {
		
		alert("이 팝업은 table에서 중복체크 하여 클릭이 가능하며 user가 클립에 대해 반응한 data들 조회할 수 있습니다.");
		
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/user_info/personal_user/popup_page/reply_list.html',
			controller: 'ReplyListController'
			});
		}
}]);

app.controller('UploadListController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
	
	$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);

app.controller('ReplyListController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
		
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);
