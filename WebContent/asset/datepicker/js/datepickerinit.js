/**
 * 
 */

    $('#dob').datepicker({
        format: "mm/dd/yyyy",
        beforeShowYear: function (date){
                      if (date.getFullYear() == 1990) {
                        return false;
                      }
                    }
    });