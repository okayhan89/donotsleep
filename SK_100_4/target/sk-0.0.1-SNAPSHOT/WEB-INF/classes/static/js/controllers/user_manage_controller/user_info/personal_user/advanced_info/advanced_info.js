'use strict';

/* Controllers */

  // Form controller
app.controller('AdvancedInfoController', ['$scope','$modal', function($scope, $modal) {
	
	$scope.selectExcel  = function() {alert("선택된 데이터만 엑셀화시킵니다.");};
	$scope.allExcel  = function() {alert("모든 데이터만 엑셀화시킵니다.");};
	$scope.selectAdvancedExcel  = function() {alert("선택된 데이터 advanced데이터까지 엑셀화시킵니다.");};
	$scope.oneVideoDown  = function() {alert("하나의 Clip 다운로드합니다.");};
	
	$scope.block_list = function(){
		var answer = confirm("Block 리스트에 정말 넣으시겠습니까?");
		if(answer){
			var modalInstance = $modal.open({
				templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/popup_page/block_list.html',
				controller: 'BlockListController'
			});
		}
	};
	
	$scope.leaving_list = function(){
		var answer = confirm("Leaving 리스트에 정말 넣으시겠습니까?");
		if(answer){
			var modalInstance = $modal.open({
				templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/popup_page/leaving_list.html',
				controller: 'LeavingListController'
			});
		}
	};
	
	$scope.login_log = function(){
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/popup_page/login_log.html',
			controller: 'LoginLogController'
		});
	}
	$scope.behavior_log = function(){
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/popup_page/behavior_log.html',
			controller: 'BehaviorLogController'
		});
	}
	$scope.share_log = function(){
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/popup_page/share_log.html',
			controller: 'ShareLogController'
		});
	}
	$scope.report_log = function(){
		var modalInstance = $modal.open({
			templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/popup_page/report_log.html',
			controller: 'ReportLogController'
		});
	}
	
}]);

app.controller('BlockListController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
	
	$modalInstance.dismiss('cancel');
	};
	
	$scope.register = function() {
		
		alert("Block list 금지 회원 으로 가게 합니다.");
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);

app.controller('LeavingListController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
	
	$modalInstance.dismiss('cancel');
	};
	
	$scope.register = function() {
		
		alert("leaving list 탈퇴 회원 으로 가게 합니다.");
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);

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

app.controller('ShareLogController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
		
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);

app.controller('ReportLogController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
		
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);



