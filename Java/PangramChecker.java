import java.util.Scanner;
 class PangramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }
        boolean pangram = true;
        for (int i = 0; i <= 25; i++) {
            if (mark[i] == false) {
                pangram = false;
                break;
            }
        }
        if (pangram) {
            System.out.println(str + " is a pangram.");
        } else {
            System.out.println(str + " is not a pangram.");
        }
    }
}
