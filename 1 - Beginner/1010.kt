import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var itemID1 = sc.nextInt();
    var amountItem1 = sc.nextInt();
    var priceItem1 = sc.nextDouble();

    var itemID2 = sc.nextInt();
    var amountItem2 = sc.nextInt();
    var priceItem2 = sc.nextDouble();

    println("VALOR A PAGAR: R$ %.2f".format(amountItem1 * priceItem1 + amountItem2 * priceItem2));
}