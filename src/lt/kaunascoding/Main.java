package lt.kaunascoding;

import java.util.Scanner;
//sukurti nauja branc kuriame butu igyvendintas metodas ivesto skaiciaus kelimui kvadratu
//panaudoti feature branch, sukurti pull request ir atlikti merge
public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Labas, iveskite skaiciu: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int rezultatas = (a * a);
        System.out.println("Skaiciaus kvadratas: " + rezultatas);
    }

    public double kvadratas(int a) {
        return Math.pow(2, a);
    }
}
