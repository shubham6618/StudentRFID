/**
 *  BRANCH FETCH 
 */

 $(document).ready(
        function() {
        		
        	
        	
        	
        	
        	
        	
        	
        	

        	 $.getJSON("FetchAllBranchJSON", function(json){
                 $('#branch').empty();
                 $('#branch').append($('<option>').text("Select"));
                 $.each(json, function(i, item){
                         $('#branch').append($('<option>').text(item.BRANCHNAME).attr('value', item.BRANCHID));
                 });
             });
        	 
       
 

 
 });
 