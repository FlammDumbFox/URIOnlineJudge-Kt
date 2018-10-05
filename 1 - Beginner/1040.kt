import java.util.Scanner;

fun main(vararg args: String){
    val sc = Scanner(System.`in`);
    var arr = DoubleArray(4);
    var weights = arrayOf(2, 3, 4, 1);
    var k = 0.0;
    for(i in 0..3){
        arr[i] = sc.nextDouble();
        k += arr[i] * weights[i];
    }
    k /= 10;
    println("Media: %.1f".format(k - 0.01));
    if(k >= 7.0){
        println("Aluno aprovado.");
    } else if(k < 5.0) {
        println("Aluno reprovado.");
    } else {
        println("Aluno em exame.");
        var q = sc.nextDouble();
        println("Nota do exame: $q");
        if((q + k)/2 >= 5.0) println ("Aluno aprovado.") else println("Aluno reprovado.");
        println("Media final: %.1f".format((q + k)/2));
    }
}