import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var time = sc.nextInt();
    var h = 0;
    var m = 0;

    for(i in 3600..time step 3600){
        h += 1;
    }

    time -= 3600 * h;

    for(i in 60..time step 60){
        m += 1;
    }

    time -= 60 * m;

    println("$h:$m:$time");

}