import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    val carConsumption = 12.0;
    var timeTaken = sc.nextInt();
    var carSpeed = sc.nextInt();

    println("%.3f".format(timeTaken * carSpeed / carConsumption));
}