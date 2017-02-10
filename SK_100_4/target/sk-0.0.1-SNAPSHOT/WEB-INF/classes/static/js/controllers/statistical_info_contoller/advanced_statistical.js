/**
 * 
 */
'use strict';

/* Controllers */

app
// Flot Chart controller
.controller('AdvancedController',
		[
				'$scope',
				'$http',
				function($scope, $http) {
			/*		$scope.d = [ [ 1, 5 ], [ 2, 6.5 ], [ 3, 7 ], [ 4, 8 ],
							[ 5, 7.5 ], [ 6, 7 ], [ 7, 6.8 ], [ 8, 7 ],
							[ 9, 7.2 ], [ 10, 7 ], [ 11, 6.8 ], [ 12, 7 ],
							[ 12, 10 ], [ 13, 1 ], [ 14, 10 ] ];
*/
					//$http.get('js/controllers/yeob.json').then(
					$http.get('./index1').then(
							function(response) {
								
								console.log(response.data);
								$scope.d = response.data;
								
							})
							
					
					/*
					 * $http.get("http://www.w3schools.com/angular/customers.php")
					 * .then(function(response) { $scope.myData =
					 * response.data.records; })
					 */
							
					$scope.d1_1 = [ [10, 120], [20, 70], [30, 70], [40, 60] ];

				    $scope.d1_2 = [ [10, 50],  [20, 60], [30, 90],  [40, 35] ];

				    $scope.d1_3 = [ [10, 80],  [20, 40], [30, 30],  [40, 20] ];
				} ]);