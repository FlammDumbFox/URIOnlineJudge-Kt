import java.util.Scanner;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var x = sc.nextDouble();
    var y = sc.nextDouble();

    if(x == 0.0 && y == 0.0){
        println("Origem");
    } else if(x != 0.0 && y == 0.0){
        println("Eixo X");
    } else if(x == 0.0 && y != 0.0){
        println("Eixo Y");
    } else if(x > 0.0 && y > 0.0){
        println("Q1");
    } else if(x < 0.0 && y > 0.0){
        println("Q2");
    } else if(x < 0.0 && y < 0.0){
        println("Q3");
    } else {
        println("Q4");
    }
}