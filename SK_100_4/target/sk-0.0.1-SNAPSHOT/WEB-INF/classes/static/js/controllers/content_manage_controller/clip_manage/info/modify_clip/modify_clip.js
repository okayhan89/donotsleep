'use strict';

/* Controllers */

  // Form controller
app.controller('ModifyClipController', ['$scope', function($scope) {

	
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
	
	/*//$scope.heart=0;
	if($scope.heart.$error){
		$scope.msg='에러';
	}*/
	
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
