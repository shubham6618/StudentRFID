 $(document).ready(
        function() {
        		
        	
        	
        	
        	
        	
        	
        	
        	

        	 $.getJSON("FetchStatesJSON", function(json){
                 $('#stateid').empty();
                 $('#stateid').append($('<option>').text("Select"));
                 $.each(json, function(i, item){
                         $('#stateid').append($('<option>').text(item.STATENAME).attr('value', item.STATEID));
                 });
             });
        	 
       
 
 $("#stateid").change(function(){
	 
 	$.getJSON("FetchAllCitiesByStateIdJSON",{sid:$('#stateid').val()}, function(json){
 	
         $('#cityid').empty();
         $('#cityid').append($('<option>').text("Select"));
         $.each(json, function(i, item){
                 $('#cityid').append($('<option>').text(item.CITYNAME).attr('value', item.CITYID));
         	});
 		}); 
 	});
 
 
 });
 