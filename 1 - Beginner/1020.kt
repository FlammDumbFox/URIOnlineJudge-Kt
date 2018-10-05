import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var time = sc.nextInt();
    var y = 0;
    var m = 0;

    for(i in 365..time step 365) y++;
    time -= y * 365;

    for(i in 30..time step 30) m++;
    time -= m * 30;

    println("$y ano(s)");
    println("$m mes(es)");
    println("$time dia(s)");
}