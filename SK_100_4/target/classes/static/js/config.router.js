'use strict';

/**
 * Config for the router
 */
angular.module('app')
  .run(
    [          '$rootScope', '$state', '$stateParams',
      function ($rootScope,   $state,   $stateParams) {
          $rootScope.$state = $state;
          $rootScope.$stateParams = $stateParams;        
      }
    ]
  )
  .config(
    [          '$stateProvider', '$urlRouterProvider', 'JQ_CONFIG', 
      function ($stateProvider,   $urlRouterProvider, JQ_CONFIG) {
          
          $urlRouterProvider
              .otherwise('/app/dashboard');
          $stateProvider
              .state('app', {
                  abstract: true,
                  url: '/app',
                  templateUrl: 'tpl/layout/app.html'
              })       
              
              //dashboard router
              .state('app.dashboard', {
                  url: '/dashboard',
                  templateUrl: 'tpl/dashboard/dashboard.html',
                  resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load(['js/controllers/dashboard_controller/dashboard.js']);
                    }]
                  }
              })
              
              //livechart router
              .state('app.livechart', {
                  url: '/livechart',
                  templateUrl: 'tpl/dashboard/livechart.html',
                  resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load(['js/controllers/dashboard_controller/livechart.js']);
                    }]
                  }
              })
              //livechart router
              .state('app.datatable', {
            	  url: '/datatable',
            	  templateUrl: 'tpl/dashboard/datatable.html',
            	  /*resolve: {
                    deps: ['$ocLazyLoad',
                      function( $ocLazyLoad ){
                        return $ocLazyLoad.load(['js/controllers/dashboard_controller/livechart.js']);
                    }]
                  }*/
              })
              
              //user manage
              .state('app.user', {
            	  abstract: true,
                  url: '/user',
                  template: '<div ui-view class="fade-in-up"></div>'
              })
              
              //user info
              .state('app.user.info', {
            	  abstract: true,
                  url: '/info',
                  template: '<div ui-view class="fade-in-up"></div>'
              })
              
              //personal user
              .state('app.user.info.personal', {
            	  url: '/personal',
            	  templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/personal_user/personal_user.js']);
                      }]
                    }
              })
              //personal user -> advanced info
              .state('app.user.info.personal_advanced', {
            	  url: '/personal_advanced',
            	  templateUrl: 'tpl/user_manage/user_info/personal_user/personal_user_subpage/advanced_info.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/personal_user/advanced_info/advanced_info.js']);
                      }]
                    }
              })
              
              //corporate user
              .state('app.user.info.corporate', {
            	  url: '/corporate',
            	  templateUrl: 'tpl/user_manage/user_info/corporate_user/corporate_user.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/corporate_user/corporate_user.js']);
                      }]
                    }
              })
              
              //corporate user -> new
              .state('app.user.info.corporate_new', {
            	  url: '/corporate_new',
            	  templateUrl: 'tpl/user_manage/user_info/corporate_user/corporate_user_subpage/new.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/corporate_user/new/new.js']);
                      }]
                    }
                    
              })

              //corporate user -> modify
              .state('app.user.info.corporate_modify', {
            	  url: '/corporate_modify',
            	  templateUrl: 'tpl/user_manage/user_info/corporate_user/corporate_user_subpage/modify.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/corporate_user/modify/modify.js']);
            		  }]
            	  }
              
              })
              
              //corporate user -> advanced info
              .state('app.user.info.corporate_advanced', {
            	  url: '/corporate_advanced',
            	  templateUrl: 'tpl/user_manage/user_info/corporate_user/corporate_user_subpage/advanecd_info.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/corporate_user/advanced_info/advanced_info.js']);
            		  }]
            	  }
              
              })
              
              //block user
              .state('app.user.info.block', {
            	  url: '/block',
            	  templateUrl: 'tpl/user_manage/user_info/block_user/block_user.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/block_user/block_user.js']);
            		  }]
            	  }
              })
              //leaving user
              .state('app.user.info.leaving', {
            	  url: '/leaving',
            	  templateUrl: 'tpl/user_manage/user_info/leaving_user/leaving_user.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/user_info/leaving_user/leaving_user.js']);
            		  }]
            	  }
              })

              
              
              
              //admin user
              .state('app.user.admin', {
            	  abstract: true,
                  url: '/admin',
                  template: '<div ui-view class="fade-in-up"></div>'
              })
              //admin info
              .state('app.user.admin.info', {
            	  url: '/info',
            	  templateUrl: 'tpl/user_manage/admin_user/information/information.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/admin_user/information/information.js']);
            		  }]
            	  }
            	  
              })
              
              //admin info --> new
              .state('app.user.admin.info_new', {
            	  url: '/info_new',
            	  templateUrl: 'tpl/user_manage/admin_user/information/information_subpage/new.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/admin_user/information/new/new.js']);
            		  }]
            	  }
              
              })
              
              
              //log info
              .state('app.user.admin.log', {
            	  url: '/log',
            	  templateUrl: 'tpl/user_manage/admin_user/log_information/log_information.html',
            	  resolve: {
            		  deps: ['$ocLazyLoad',
            		         function( $ocLazyLoad ){
            			  return $ocLazyLoad.load(['js/controllers/user_manage_controller/admin_user/log_information/log_information.js']);
            		  }]
            	  }
              })
              
              
              
              
              
              
              //content manage
              .state('app.content', {
            	  abstract: true,
            	  url: '/content',
            	  template: '<div ui-view class="fade-in-up"></div>'
              })
              
              //clip manage
              .state('app.content.clip', {
            	  abstract: true,
            	  url: '/clip',
            	  template: '<div ui-view class="fade-in-up"></div>'
              })
              //clip info
              .state('app.content.clip.info', {
            	  url: '/info',
            	  templateUrl: 'tpl/content_manage/clip_manage/clip_information.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                    	  return $ocLazyLoad.load('js/controllers/content_manage_controller/clip_manage/info/clip_info.js');
                      }]
                    }
            	  
              })
              
              
              //clip info -> new clip
              .state('app.content.clip.newclip', {
            	  url: '/newclip',
            	  templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/newclip.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/content_manage_controller/clip_manage/info/new_clip/new_clip.js']);
                      }]
                    }
            	  
              })
              //clip info -> modify clip
              .state('app.content.clip.modifyclip', {
            	  url: '/modifyclip',
            	  templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/modifyclip.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/content_manage_controller/clip_manage/info/modify_clip/modify_clip.js']);
                      }]
                    }
              })
              //clip info -> advance info
              .state('app.content.clip.advancedinfo', {
            	  url: '/advancedinfo',
            	  templateUrl: 'tpl/content_manage/clip_manage/clip_info_subpage/advancedinfo.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                    	  return $ocLazyLoad.load('js/controllers/content_manage_controller/clip_manage/info/advanced_clip/advanced_clip.js');
                      }]
                    }
              })
              
              //clip setting
              .state('app.content.clip.setting', {
            	  url: '/setting',
            	  templateUrl: 'tpl/content_manage/clip_manage/clip_setting.html',
            	  
              })
              
              
              //hashtag manage
              .state('app.content.hashtag', {
            	  abstract: true,
            	  url: '/hashtag',
            	  template: '<div ui-view class="fade-in-up"></div>'
              })
              
              //total hashtag info
              .state('app.content.hashtag.total', {
            	  url: '/total',
            	  templateUrl: 'tpl/content_manage/hashtag_manage/total_hashtag_information.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/content_manage_controller/hashtag_manage/total_hashtag_info/total_hashtag_info.js']);
                      }]
                    }
              
              })
              
              //total hashtag info -> modify banner
              .state('app.content.hashtag.modifybanner', {
            	  url: '/modifybanner',
            	  templateUrl: 'tpl/content_manage/hashtag_manage/total_hashtag_info_subpage/modify_banner.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/content_manage_controller/hashtag_manage/total_hashtag_info/modify_banner/modify_banner.js']);
                      }]
                    }
              
              })
              
              //total hashtag info -> Primary Hashtag Detail Information
              .state('app.content.hashtag.detail_info', {
            	  url: '/detail_info',
            	  templateUrl: 'tpl/content_manage/hashtag_manage/total_hashtag_info_subpage/detail_info.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/content_manage_controller/hashtag_manage/total_hashtag_info/detail_info/detail_info.js']);
                      }]
                    }
              
              })
              
              //admin hashtag info
              .state('app.content.hashtag.admin', {
            	  url: '/admin',
            	  templateUrl: 'tpl/content_manage/hashtag_manage/admin_hashtag_information.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/content_manage_controller/hashtag_manage/admin_hashtag_info/admin_hashtag_info.js']);
                      }]
                    }
              }) 
              
              //album manage
              .state('app.content.album', {
            	  abstract: true,
            	  url: '/album',
            	  template: '<div ui-view class="fade-in-up"></div>'
              })
              //album info
              .state('app.content.album.info', {
            	  url: '/info',
            	  templateUrl: 'tpl/content_manage/album_manage/album_information.html',
            	  
              })
             
              //bookmark manage
              .state('app.content.bookmark', {
            	  abstract: true,
            	  url: '/bookmark',
            	  template: '<div ui-view class="fade-in-up"></div>'
              })
              //bookmark info
              .state('app.content.bookmark.info', {
            	  url: '/info',
            	  templateUrl: 'tpl/content_manage/bookmark_manage/bookmark_information.html',
            	  
              })
              
              //statistics
              .state('app.statistics', {
            	  abstract: true,
            	  url: '/statistics',
            	  template: '<div ui-view class="fade-in-up"></div>'
              })
              
              //general statistics
              .state('app.statistics.general', {
            	  url: '/general',
            	  templateUrl: 'tpl/statistical_information/general_statistics.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                          return $ocLazyLoad.load(['js/controllers/statistical_info_contoller/general_statistical.js']);
                      }]
                    }
              })
              
              //advanced statistics
              .state('app.statistics.advanced', {
            	  url: '/advanced',
            	  templateUrl: 'tpl/statistical_information/advanced_statistics.html',
            	  resolve: {
                      deps: ['$ocLazyLoad',
                        function( $ocLazyLoad ){
                    	  return $ocLazyLoad.load(['js/controllers/statistical_info_contoller/advanced_statistical.js']);
                      }]
                    }
              })
 
      }
    ]
  );
