function circleArea(radius, pi=3.14){
    return radius*radius*pi;
}

document.write(circleArea(5) + "<br>");
document.write(circleArea(7) + "<br>");
document.write(circleArea(10) + "<br>");

function totalPrice(otona,kodomo){
    return (otona*500) + (kodomo*200) + "円です";
}

document.write(totalPrice(2,4) + "<br>");
document.write(totalPrice(1,5) + "<br>");
document.write(totalPrice(3,7) + "<br>");


