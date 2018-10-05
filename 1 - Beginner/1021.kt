import java.util.Scanner;
import kotlin.math.*;

fun main(vararg args: String){
    // UM FODA-SE FODIDO PRA VOCÊ
    // GLÓRIA À DEUX
    val sc = Scanner(System.`in`);
    var k = sc.nextDouble();   // Initial amount
    var b: Int;             // Bills
    var c: Int;             // Coins

    var integerSegment = truncate(k).toInt();
    var decimalSegment = (100 * (k - truncate(k) + 0.001)).toInt();

    var bills = arrayOf(100, 50, 20, 10, 5, 2);
    var coins = arrayOf(50, 25, 10, 5, 1);

    println("NOTAS:");
    for(i in bills.indices){
        b = 0;
        for(j in bills[i]..integerSegment step bills[i]) b++;
        println("$b nota(s) de R$ " + bills[i] + ",00");
        integerSegment -= b * bills[i];
    }
    println("MOEDAS:");
    println("$integerSegment moeda(s) de R$ 1.00");
    for(i in coins.indices){
        c = 0;
        for(j in coins[i]..decimalSegment step coins[i]) c++;
        println("$decimalSegment");
        println("$c moeda(s) de R$ %.2f".format(coins[i].toDouble() / 100));
        decimalSegment -= c * coins[i];
    }
}