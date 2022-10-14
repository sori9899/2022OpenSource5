import java.util.*;

public class Point {
    public static void main(String[] args) {
        HashMap<String, Integer> person = new HashMap<String, Integer>();

        System.out.println("** 포인트 관리 프로그램입니다 **");

        Scanner scanner = new Scanner(System.in);
        String name;
        int point;

        while(true){
            System.out.print("이름과 포인트 입력>>");
            name = scanner.next();
            if(name.equals("그만"))
                break;
            point = scanner.nextInt();
            if(person.containsKey(name)){
                person.replace(name, person.get(name)+point);
            }else {
                person.put(name,point);
            }

            Set<String> keys = person.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()) {
                String n = it.next();
                System.out.print("("+n+","+person.get(n)+") ");
            }
            System.out.println();
        }
    }
}