import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int lungime = word.length();
        int mijloc = lungime / 2;

        if (lungime % 2 == 0) {
            System.out.println(word.substring(0, mijloc - 1) + word.substring(mijloc + 1));
        } else {
            System.out.println(word.substring(0, mijloc) + word.substring(mijloc + 1));
        }
    }
}