/**
 * 
 */


        $(function () {
            $('#type-ahead').typeahead(
                {
                    name: 'StudentRecordcached',
                    prefetch: {
                        url: './teams.json',
                        ttl: 0
                    }
                }
            );

        });
    