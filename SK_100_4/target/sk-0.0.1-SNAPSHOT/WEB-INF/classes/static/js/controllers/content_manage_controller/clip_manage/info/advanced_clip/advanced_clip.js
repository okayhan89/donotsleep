'use strict';

/* Controllers */

  // Form controller
app.controller('AdvancedInfoController', ['$scope','$modal', function($scope, $modal) {
	
	$scope.selectExcel  = function() {alert("선택된 데이터만 엑셀화시킵니다.");};
	$scope.allExcel  = function() {alert("모든 데이터만 엑셀화시킵니다.");};
	$scope.selectAdvancedExcel  = function() {alert("선택된 데이터 advanced데이터까지 엑셀화시킵니다.");};
	$scope.oneVideoDown  = function() {alert("하나의 Clip 다운로드합니다.");};
	
	$scope.delete_data = function(){alert("데이터를 삭제하시겠습니까?");};
	
	$scope.heart_log = function () {
		var modalInstance = $modal.open({
		templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/popup_page/heart_log.html',
		controller: 'HeartLogController'
		});
	}
	$scope.report_log = function () {
		var modalInstance = $modal.open({
			templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/popup_page/report_log.html',
			controller: 'ReportLogController'
		});
	}
	$scope.comment = function () {
		var modalInstance = $modal.open({
			templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/popup_page/comment.html',
			controller: 'CommentController'
		});
	}
	$scope.clip_play_log = function () {
		var modalInstance = $modal.open({
			templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/popup_page/clip_play_log.html',
			controller: 'ClipPlayLogController'
		});
	}
	
}]);

app.controller('HeartLogController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
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

app.controller('CommentController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
		
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);

app.controller('ClipPlayLogController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
		
		$modalInstance.dismiss('cancel');
	};
	
	$scope.sample='this is sample';
} ]);