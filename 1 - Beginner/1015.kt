import java.util.*;

fun calcDistance(x1: Double, y1: Double, x2: Double, y2: Double) = Math.sqrt(Math.pow(x2 - x1, 2.0) + Math.pow(y2 - y1, 2.0));

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var x1 = sc.nextDouble();
    var y1 = sc.nextDouble();

    var x2 = sc.nextDouble();
    var y2 = sc.nextDouble();

    println("%.4f".format(calcDistance(x1, y1, x2, y2)));
}