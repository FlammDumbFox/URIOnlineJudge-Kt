import java.util.Scanner;

fun circleArea(r: Double) = r * r * 3.14159;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var r = sc.nextDouble();
    var area = circleArea(r);
    println("A=%.4f".format(area));
}