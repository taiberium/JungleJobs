function loadNews() {
    $.ajax({
        url: '/record',
        type: 'GET',
        dataType: 'json',
        success: function (data) {
            console.log(data);
            var newHTML = '';
            data.forEach(function (record) {
                newHTML += '<div class="col-md-4">';
                newHTML += '<h2>' + record.title + '</h2>';
                newHTML += '<p>' + record.content + '</p>';
                newHTML += '<p><a class="btn btn-secondary" href="/news/' + record.id + '" role="button">View details »</a></p>';
                newHTML += '</div>';
            });
            $('#news').html(newHTML);
        }
    });
}

function loadOneNews() {
    var url = window.location.href.split('/');
    var recordId = url[url.length - 1];
    $.ajax({
        url: '/record/' + recordId,
        type: 'GET',
        dataType: 'json',
        success: function (record) {
            console.log(record);
            var newHTML = '<div class="col-md-4">';
            newHTML += '<h2>' + record.title + '</h2>';
            newHTML += '<p>' + record.content + '</p>';
            newHTML += '<p>' + record.creationDate + '</p>';
            newHTML += '</div>';
            $('#singleNews').html(newHTML);
        }
    });
}