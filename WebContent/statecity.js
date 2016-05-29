 $(document).ready(
        function() {
       	 $.getJSON("FetchStatesJSON", function(json){
                 $('#stateid').empty();
                 $('#stateid').append($('<option>').text("Select"));
                 $.each(json, function(i, item){
                         $('#stateid').append($('<option>').text(item.STATENAME).attr('value', item.STATENAME).attr('myid',item.STATEID));
                 });
             });
        	 
       
 
 $("#stateid").change(function(){
	// var myTag = $('#stateid').find(":selected").attr('myid');
	var sid='';
 	$.getJSON("FetchAllCitiesByStateIdJSON",{sid:$('#stateid').find(":selected").attr('myid')}, function(json){
 			
         $('#cityid').empty();
         $('#cityid').append($('<option>').text("Select"));
         $.each(json, function(i, item){
                 $('#cityid').append($('<option>').text(item.CITYNAME).attr('value', item.CITYNAME));
         	});
 		}); 
 	});
 
 
 });
 