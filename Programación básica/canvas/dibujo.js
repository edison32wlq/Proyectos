var d = document.getElementById("dibujito");
var lienzo = d.getContext("2d");

dibujarLinea("green", 10, 300, 220, 10);
dibujarLinea("blue", 20, 20, 300, 300);

function dibujarLinea(color, xinicial, yinicial, xfinal, yfinal)
{
    lienzo.beginPath();
    lienzo.strokeStyle = color;
    lienzo.moveTo(xinicial, yinicial);
    lienzo.lineTo(xfinal, yfinal);
    lienzo.stroke();
    lienzo.closePath();
}