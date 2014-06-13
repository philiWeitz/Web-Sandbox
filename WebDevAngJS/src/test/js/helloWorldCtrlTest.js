
describe('HelloWorldCtrl', function() {

	beforeEach(module('helloWorldApp'));

	it('should create "message" model with 3 messages', inject(function(
			$controller) {
		var scope = {}, ctrl = $controller('HelloWorldCtrl', {
			$scope : scope
		});

		expect(scope.messages.length).toBe(3);
	}));

});