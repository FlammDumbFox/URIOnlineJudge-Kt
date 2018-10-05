import java.util.Scanner;

fun media(a: Double, b: Double) = (3.5 * a + 7.5 * b)/11;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextDouble();
    var b = sc.nextDouble();

    var m = media(a, b);
    println("MEDIA = %.5f".format(m));
}