'use strict';

/* Controllers */

  // Form controller
app.controller('DetailInfoController', ['$scope','$modal', function($scope, $modal) {

	$scope.primary_hashtag = '#서울예고';
	$scope.view_cnt='10';
	$scope.heart_cnt='10';
	$scope.share_cnt='10';
	$scope.comment_cnt='10';
	
	$scope.delete_check = function(){
		alert("이 클립을 삭제하시겠습니까?");
	};
	
	$scope.modify = function () {
		var modalInstance = $modal.open({
		templateUrl: 'tpl/content_manage/hashtag_manage/total_hashtag_info_subpage/popup_page/modify.html',
		controller: 'ModifyController'
		});
	};
	
	
	
	
	$scope.reset = function() {
        $scope.alias = angular.copy('');
        $scope.primary_hashtag = angular.copy('');
        $scope.optional_hashtag1 = angular.copy('');
        $scope.optional_hashtag2 = angular.copy('');
        $scope.optional_hashtag3 = angular.copy('');
        $scope.optional_hashtag4 = angular.copy('');
        $scope.optional_hashtag5 = angular.copy('');
        $scope.location = angular.copy('');
        $scope.description = angular.copy('');
        $scope.upload = angular.copy('');
        $scope.heart = angular.copy('');
        $scope.Open_N = angular.copy('');
    };
	
}]);
app.controller('ModifyController', [ '$scope', '$modalInstance', function($scope, $modalInstance) {
	
	$scope.close = function() {
	
	$modalInstance.dismiss('cancel');
	};
	
	

	$scope.check  = function() {
		alert("alias check");
		$scope.alias_check=$scope.alias;
		$scope.alias_check='alias :'+$scope.alias+'있습니다.';
	};
	
	$scope.search  = function() {
		alert("해시태그 check");
		$scope.primary_hashtag_check=$scope.primary_hashtag;
		$scope.primary_hashtag_check='메인해시태그 :'+$scope.primary_hashtag_check+'있습니다.';
	};
	
	$scope.reset = function() {
        $scope.alias = angular.copy('');
        $scope.primary_hashtag = angular.copy('');
        $scope.optional_hashtag1 = angular.copy('');
        $scope.optional_hashtag2 = angular.copy('');
        $scope.optional_hashtag3 = angular.copy('');
        $scope.optional_hashtag4 = angular.copy('');
        $scope.optional_hashtag5 = angular.copy('');
        $scope.location = angular.copy('');
        $scope.description = angular.copy('');
        $scope.upload = angular.copy('');
        $scope.heart = angular.copy('');
        $scope.Open_N = angular.copy('');
    };
    
} ]);

