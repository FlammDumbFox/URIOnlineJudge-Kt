import java.util.Scanner;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var arr = arrayOf(4.00, 4.50, 5.00, 2.00, 1.50);
    var id = sc.nextInt();
    var amount = sc.nextInt();

    println("Total: R$ %.2f".format(arr[id - 1] * amount));
}