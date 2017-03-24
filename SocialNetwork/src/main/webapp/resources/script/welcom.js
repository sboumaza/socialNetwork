$( document ).ready(function() {

    var myDate = new Date();
    var hrs = myDate.getHours();

    var greet;

    if (hrs < 12)
        message = 'Bonjour';
    else if (hrs >= 12 && hrs <= 17)
    	message = 'Bon apres-midi';
    else if (hrs >= 17 && hrs <= 24)
    	message = 'Bonne soirée';

    document.getElementById('mes').innerHTML =
        message +'  ' ;
    
    
});

function textAreaAdjust(o) {
	  o.style.height = "1px";
	  o.style.height = (25+o.scrollHeight)+"px";
	}
