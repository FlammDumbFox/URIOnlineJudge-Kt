import java.util.Scanner;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var a = sc.nextInt();
    var b = sc.nextInt();
    var c = sc.nextInt();
    var d = sc.nextInt();

    if((b > c) && (d > a) && (c + d > a + b) && (c > 0) && (d > 0) && (a % 2 == 0)) println("Valores aceitos") else println("Valores nao aceitos");
}