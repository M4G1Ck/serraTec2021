function fetchData() {
    var request = new XMLHttpRequest();
    request.open("GET", "http://api.github.com/users/weilemann/repos", true);
    request.onreadystatechange = function() {
        if(resquest.readyState == XMLHttpRequest.DONE){
            console.log(request.responseText);
        }
    }
    request.send();
}