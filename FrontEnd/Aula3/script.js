function getDate(){
    var formattedDate;
    var today = new Date();
    today.setMonth(3);
    var month = today.getMonth() + 1;
    var day = today.getDate();
    var weekDay = today.getDay();
    var year = today.getFullYear();
    var formattedDate = day + "/" + month + "/" + year;
    console.log(formattedDate);
    document.getElementById("date-container").innerHTML = formattedDate
}
