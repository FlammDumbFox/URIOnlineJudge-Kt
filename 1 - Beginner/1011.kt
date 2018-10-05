import java.util.*;

fun sphereArea(r: Double) = (4 * 3.14159 * r * r * r)/3;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var r = sc.nextDouble();

    println("VOLUME = %.3f".format(sphereArea(r)));
}