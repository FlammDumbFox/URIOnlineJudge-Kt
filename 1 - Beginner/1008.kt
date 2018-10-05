import java.util.*;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var number = sc.nextInt();
    var workedHours = sc.nextInt();
    var moneyPerHour = sc.nextDouble();

    println("NUMBER = $number");
    println("SALARY = U$ %.2f".format(moneyPerHour * workedHours));
}