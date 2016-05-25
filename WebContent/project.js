$(document).ready(
        function() {
 
        	
            $('#btn').click(
            function() {
                
                $.getJSON('VehicleDisplayJSON', {
                   
                    ajax : 'true'
                }, function(data) {
                    
                    var html = '<table border=1>';
                   // var len = data.length;
                    html+="<tr><th>Vehicle ID</th><th>Vehicle Name</th><th>Edit/Delete</th></tr>";
                    $.each(data, function(i, item) {
                    	html += '<tr><td>' + item.VID + '</TD><TD>' + item.VNAME + '</TD><TD><a href=VehicleDisplayByID?vid='+item.VID+'>Edit/Delete</a></TD></TR>'; 
                      });
                     
                    html += '</TABLE>';
   
                    $('#result').html(html);
                });
            });
            
            
        });
       
   