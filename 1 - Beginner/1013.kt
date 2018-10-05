import java.util.*;

fun findHighest(a: Int, b: Int) = (a + b + Math.abs(a - b))/2;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();

    println("${findHighest(findHighest(a, b), c)} eh o maior");
}