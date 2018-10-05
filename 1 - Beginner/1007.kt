import java.util.Scanner;

fun diff(a: Int, b: Int, c: Int, d: Int) = (a * b - c * d);

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();
    var d = sc.nextInt();

    var diff = diff(a, b, c, d);
    println("DIFERENCA = $diff");
}