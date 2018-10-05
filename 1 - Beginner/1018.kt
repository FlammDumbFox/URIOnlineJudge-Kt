import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var k = sc.nextInt();   // Initial amount
    var b: Int;             // Bills

    var bills = arrayOf(100, 50, 20, 10, 5, 2, 1);

    println("$k");
    for(i in bills.indices){
        b = 0;
        for(j in bills[i]..k step bills[i]) b++;
        println("$b nota(s) de R$ " + bills[i] + ",00");
        k -= b * bills[i];
    }
}