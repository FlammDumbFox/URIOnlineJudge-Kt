import java.util.Scanner;

fun media(a: Double, b: Double, c: Double) = (2 * a + 3 * b + 5 * c)/10;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextDouble();
    var b = sc.nextDouble();
    var c = sc.nextDouble();

    var m = media(a, b, c);
    println("MEDIA = %.1f".format(m));
}