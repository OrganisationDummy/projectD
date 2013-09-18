$(document).ready(function()
{
	login = new Login();
	login.request();
});

function Login()
{
	var self = this;
	
	this.request = function()
	{
		$("#login").click(function()
		{
			var username = $("#username").val();
			var password = $("#password").val();
			
			self.response(username, password);
		});
	};
	
	this.response = function(username, password)
	{
		$.ajax({
            type: "POST",
            url: "/projectd/rest/account/login",
            contentType: "application/json",
            data: JSON.stringify({ username: username, password: password }),
            success: function(response) 
            {
            	if(response)
        		{
            		window.location.replace("/projectd/blog/overview");
            		
        		} else {
        			
        			alert("Ungültige Eingaben");
        		}
            },
            error: function(e) {}
		});
	};
};