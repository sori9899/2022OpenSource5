import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        for(int i =0; i<4; i++){
            System.out.print("이름을 입력하세요 >> ");
            String s = scanner.next();
            a.add(s);
        }

        for(int i=0; i<a.size(); i++){
            String name = a.get(i);
            System.out.print(name+" ");
        }

        int longestlndex = 0;
        for(int i=0; i<a.size(); i++){
            if(a.get(longestlndex).length() < a.get(i).length())
                longestlndex = i;
        }

        System.out.println("\n가장 긴 이름은 : "+ a.get(longestlndex));
        scanner.close();
    }
}
