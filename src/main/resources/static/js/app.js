$(document).ready(function() {



  $("#create_user_btn").click(function() {
      $("#home").hide();
      $("#create_user").show();
    });

  $("#find_user_btn").click(function() {
      $("#home").hide();
      $("#create_user").hide();
      $("#find_user").show();
    });

    // process the  create user form
  $("#create_submit_button").click(function(event) {
        // get the form data
        // there are many ways to get this data using jQuery (you can use the class or id also)
        var userData = {
            'name': $('input[name=name]').val(),
            'birthday': $('input[name=birthday]').val(),
            'age': $('input[name=age]').val()
        };

        // process the form
        var settings = {
            "async": true,
            "crossDomain": true,
            "url": "http://localhost:8080/user",
            "method": "POST",
            "headers": {
                "Content-Type": "application/json",
                "Cache-Control": "no-cache"
            },
            "processData": false,
            "data": JSON.stringify(userData)
        };

      $.ajax(settings).done(function(response) {
            console.log("User had been successfully created");
            $("#user_creation_status").text("User has been successfully created");
        });
        // stop the form from submitting the normal way and refreshing the page
        //event.preventDefault();
    });
    
    $(".back_to_homepage").click(function(event){
		$("#home").show();
		 $("#create_user").hide();
      $("#find_user").hide();
});

    //process the find user form

  $("#find_submit_button").click(function(event) {
        var url = "http://localhost:8080/" + $('input[name=finduser_name]').val() + "/" + $('input[name=finduser_information]:checked').val();
        console.log(url);
        $.get(url, function (data, textStatus, jqXHR) {  // success callback
           console.log(data);
           $("#search_result").text(data);
        });
    });
});
