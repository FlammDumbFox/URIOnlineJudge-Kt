import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var x = sc.nextInt();
    var y = sc.nextDouble();

    println("%.3f".format(x/y) + " km/l");
}