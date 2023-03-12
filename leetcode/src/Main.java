package src;


import static src.exercises.ReverseInteger.reverse;
import static src.exercises.ReverseInteger.reverse_GPT;

public class Main {
    public static void main(String[] args) {
        int x = -1234567892;

        System.out.println(reverse_GPT(x));
    }
}