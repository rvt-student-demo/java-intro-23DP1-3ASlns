package lv.rvt;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class App
{
    public static void main(String[] args) {
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
    }
}