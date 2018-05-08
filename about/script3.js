//問１
for(var a = 0; a < 5; a++){
    for(var b = 0; b < 5; b++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");


//問２
for(var c = 0; c < 5; c++){
    for(var d = 0; d < 5; d++){
        if(c % 2 == 0 && d % 2 == 0 || c % 2 == 1 && d % 2 == 1){
            document.write("★");
        }else{
            document.write("☆");
        }
    }
    document.write("<br>");
}


//問２別解
/*
for(var e = 0; e < 5; e++){
    for(var f = 0; f < 5; f++){
        if((e + f) % 2 == 0){
            document.write("★");
        }else{
            document.write("☆");
        }
    }
    document.write("<br>");
}
*/

document.write("<br>");

//問３
for(var g = 0; g < 5; g++){
    for(var h = 0; h < 5; h++){
        if(g == h){
            document.write("☆");
        }else {
            document.write("★");
        }
    }
    document.write("<br>");
}

document.write("<br>");

//問４
for(var i = 0; i < 5; i++){
    for(var j = 0; j < i+1; j++){
        document.write("★");
    }
    document.write("<br>");
}

document.write("<br>");

//問５
for(var k = 0; k < 5; k++){
    for(var l = 0; l < k+1; l++){
        if(k == l){
            document.write("☆");
        }else{
            document.write("★");
        }
    }
    document.write("<br>");
}




















