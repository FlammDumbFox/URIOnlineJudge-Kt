import java.util.Scanner;

fun main(vararg args: String) {
    val sc = Scanner(System.`in`);
    var a = sc.nextDouble();

    if(a < 0 || a > 100){
        println("Fora de intervalo");
    } else if(a <= 25){
        println("Intervalo [0,25]");
    } else if(a <= 50){
        println("Intervalo (25,50]");
    } else if(a <= 75){
        println("Intervalo (50,75]");
    } else {
        println("Intervalo (75,100]");
    }
}