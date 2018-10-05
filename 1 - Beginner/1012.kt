import java.util.*;

fun areaTriangle(base: Double, height: Double) = (base * height)/2;
fun areaCircle(radius: Double) = 3.14159 * radius * radius;
fun areaTrapezium(baseLower: Double, baseUpper: Double, height: Double) = ((baseLower + baseUpper) / 2) * height;
fun areaSquare(sideLength: Double) = sideLength * sideLength;
fun areaRectangle(sideLengthA: Double, sideLengthB: Double) = sideLengthA * sideLengthB;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextDouble();
    var b = sc.nextDouble();
    var c = sc.nextDouble();

    println("TRIANGULO: %.3f".format(areaTriangle(a, c)));
    println("CIRCULO: %.3f".format(areaCircle(c)));
    println("TRAPEZIO: %.3f".format(areaTrapezium(a, b, c)));
    println("QUADRADO: %.3f".format(areaSquare(b)));
    println("RETANGULO: %.3f".format(areaRectangle(a, b)));
}