function findStuff(RecipeID){
    var requestURL = 'http://localhost:8080/Project/example/web/find/' + RecipeID;
    var request = new XMLHttpRequest();
    request.open('GET', requestURL);
    request.responseType = 'json';
    request.send();
    request.onload = function () {
        var reply = request.response;
        var myH1 = document.createElement('h1');
        myH1.textContent = reply.Rname;
        document.getElementsByTagName('body')[0].appendChild(myH1);
        
        
        var x = document.createElement("P");
        var element = document.getElementById("food");
        
        x.innerHTML += reply.Rname;
        element.appendchild(x);
    }
}
