

 (function($) {
     var url = 'http://localhost:8080/WebDevSpringRESTfull/service/greeting/jsonp/jsonp';
     $.ajax({
         type: 'GET',
         url: url,
         async: false,
         jsonpCallback: 'jsonpCallback',
         dataType: 'jsonp',
         success: function(json) {     
              alert(json.message);
         }
     });
})(jQuery);