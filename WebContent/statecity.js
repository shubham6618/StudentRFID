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
	 var element = $(this).find('option:selected'); 
     var myTag = element.attr("myTag"); 

 	$.getJSON("FetchAllCitiesByStateIdJSON",{sid:$('#stateid option:selected',this).attr('myid')}, function(json){
 			console.log(sid);
         $('#cityid').empty();
         $('#cityid').append($('<option>').text("Select"));
         $.each(json, function(i, item){
                 $('#cityid').append($('<option>').text(item.CITYNAME).attr('value', item.CITYNAME));
         	});
 		}); 
 	});
 
 
 });
 