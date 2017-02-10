'use strict';

/* Controllers */

  // Form controller
app.controller('AdminNewController', ['$scope', function($scope) {

	
	$scope.check  = function() {
		alert("admin_id check");
		$scope.admin_id_check=$scope.admin_id;
		$scope.admin_id_check=$scope.admin_id+'는 사용하실 수 있는 Admin ID입니다..';
	};
	
	$scope.double_check = function() {
		alert("user_email check");
		$scope.user_email_check=$scope.user_email;
		$scope.user_email_check=$scope.user_email_check+'는 사용하실 수 있는 메일입니다.';
	};
	
	$scope.double_check_2 = function() {
		alert("user_alias check");
		$scope.user_alias_check=$scope.user_alias;
		$scope.user_alias_check=$scope.user_alias_check+'는 사용하실 수 있는 alias입니다.';
		
	};
	
	
	var compareTo = function() {
	    return {
	      require: "ngModel",
	      scope: {
	        otherModelValue: "=compareTo"
	      },
	      link: function(scope, element, attributes, ngModel) {

	        ngModel.$validators.compareTo = function(modelValue) {
	          return modelValue == scope.otherModelValue;
	        };

	        scope.$watch("otherModelValue", function() {
	          ngModel.$validate();
	        });
	      }
	    };
	  };

	  app.directive("compareTo", compareTo);
	
	
	 var updateModel = function(val){
	      $scope.$apply(function(){
	        $scope.val = val;
	      });
	    };
	
	/*return {
	      require: 'ngModel',
	      link: function (scope, elem, attrs, ctrl) {
	        var firstPassword = '#' + attrs.pwCheck;
	        elem.add(firstPassword).on('keyup', function () {
	          scope.$apply(function () {
	            var v = elem.val()===$(firstPassword).val();
	            ctrl.$setValidity('pwmatch', v);
	          });
	        });
	      }
	    }*/
	
	/*//$scope.heart=0;
	if($scope.heart.$error){
		$scope.msg='에러';
	}*/
	
	$scope.reset = function() {
		//$scope.frm.reset();
		document.frm.reset();
		
		/*
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
        */
    };
	
}]);
