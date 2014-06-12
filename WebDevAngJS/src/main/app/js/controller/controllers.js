

var helloWorldApp = angular.module('helloWorldApp', []);

helloWorldApp.controller('HelloWorldCtrl', function ($scope) {
	
  $scope.helloWorld = 'Hello World'
	
  $scope.messages = [
    {'message': 'List Item 1',
     'imageUrl': '../img/helloWorld.jpg'},
    {'message': 'List Item 2',
     'imageUrl': '../img/helloWorld.jpg'},
    {'message': 'List Item 3',
     'imageUrl': '../img/helloWorld.jpg'}
  ];
});