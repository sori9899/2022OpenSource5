import java.sql.SQLSyntaxErrorException;
import java.util.ArrayList;
import java.util.Scanner;

class Character{
    String string;
    Double aDouble;

    public Character(String string, Double aDouble){
        this.aDouble = aDouble;
        this.string = string;
    }

    public Double getaDouble() {
        return aDouble;
    }

    public String getString() {
        return string;
    }
}

public class ScoreMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Character> arrayList = new ArrayList<Character>();
        arrayList.add(new Character("A", 4.0));
        arrayList.add(new Character("B", 3.0));
        arrayList.add(new Character("C", 2.0));
        arrayList.add(new Character("D", 1.0));
        arrayList.add(new Character("F", 0.0));

        String s;
        double sum=0;
        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i=0; i<6; i++){
            s = scanner.next();
            for(int j=0; j<arrayList.size(); j++){
                if(arrayList.get(j).getString().equals(s)){
                    sum+=arrayList.get(j).getaDouble();
                }
            }
        }

        System.out.println(sum/6);
    }
}
