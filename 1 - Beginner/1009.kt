import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var nome = sc.next();
    var baseIncome = sc.nextDouble();
    var baseRevenue = sc.nextDouble();

    println("TOTAL = R$ %.2f".format(baseIncome + 0.15 * baseRevenue));
}