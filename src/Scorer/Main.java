package Scorer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String przebiegGry = new String();
        int a = 0 , b = 0, c = 0, d = 0;
        System.out.print("Wprowadz przebieg gry: ");

        przebiegGry = s.next();
        for (Character slowo : przebiegGry.toCharArray()){
            switch (slowo.charValue()){
                case 'a':
                    a++;
                    break;
                case 'A':
                    a--;
                    break;
                case 'b':
                    b++;
                    break;
                case 'B':
                    b--;
                    break;
                case 'c':
                    c++;
                    break;
                case 'C':
                    c--;
                    break;
                case 'd':
                    d++;
                    break;
                case 'D':
                    d--;
                    break;
            }
        }

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);
        System.out.println("d: " + d);
    }
}
