import java.sql.SQLSyntaxErrorException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Precipitation {
    public static void main(String[] args) {
        Vector<Integer> v  = new Vector<Integer>();

        Scanner scanner = new Scanner(System.in);
        Iterator<Integer> it;
        int num, sum=0;
        while(true){
            System.out.print("강수량 입력(0입력시 종료)>>");
            num = scanner.nextInt();
            if(num==0)
                break;
            v.add(num);
            sum =0;

            for(int i=0; i<v.size(); i++){
                System.out.print(v.get(i)+" ");
                sum += v.get(i);
            }
            System.out.println();
            System.out.println("현재 평균 "+sum/v.size() );
        }
    }
}
