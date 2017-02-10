'use strict';

/* Controllers */

  // Form controller
app.controller('ModifyBannerController', ['$scope', function($scope) {

	
	
	
	$scope.search  = function() {
		alert("해시태그 check");
		$scope.primary_hashtag_check=$scope.primary_hashtag;
		$scope.primary_hashtag_check='메인해시태그 :'+$scope.primary_hashtag_check+'있습니다.';
	};
	
	$scope.default_check  = function() {
		alert("인기 순위 1위인 영상을 배너로 지정하시겠습니까?");
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
