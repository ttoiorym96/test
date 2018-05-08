$(function(){
    $("h1").css("color", "red");
});



$(function(){
    $("h2").text("おやすみ");
});

$(function(){
    $("#aa,#bb").css("color","red");
});

$(function(){
    $("h1").click(function(){
        $("p").fadeOut();
    });
});

$(function(){
    $("div").click(function(){
        $("p").css("color", "blue");
    });
});

$(function(){
    $(".total").click(function(){
        $("p").text(20);
    });
});

$(function(){
    $(".boxA").click(function(){
        $(".boxB").hide();
    });
});



$(function(){
    $("img").hover(function(){
        $(this).animate({width:"220px"});
    },
                   function(){
        $(this).animate({width:"200px"});
    });
});

$(function(){
    $('.image li img').hover(function(){
        $(this).animate({
            'width':'150px',
            'height':'150px',
            'marginTop':'-32px'
        });
    });
});





