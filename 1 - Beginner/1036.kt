import java.util.Scanner;
import kotlin.math.sqrt;

fun checkDiscriminant(a: Double, b: Double, c: Double): Boolean{
    return sqrt((b * b) - (4 * a * c)) >= 0;
}

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextDouble();
    var b = sc.nextDouble();
    var c = sc.nextDouble();

    if(checkDiscriminant(a, b, c) && a != 0.0){
        var d = sqrt((b * b) - (4 * a * c));
        println("R1 = %.5f".format((- b + d) / (2 * a)));
        println("R2 = %.5f".format((- b - d) / (2 * a)));
    } else {
        println("Impossivel calcular");
    }
}