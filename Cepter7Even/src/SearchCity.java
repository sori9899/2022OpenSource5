import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

class Location{
    String x;
    String y;
    String city;
    public Location(String x, String  y, String city){
        this.x=x;
        this.y=y;
        this.city=city;
    }

    public String  getX() {
        return x;
    }

    public String getY(){
        return y;
    }
}


public class SearchCity {
    public static void main(String[] args) {
        HashMap<String, Location> city = new HashMap<String, Location>();
        Scanner scanner = new Scanner(System.in);
        int x,y;
        String string;
        String[] s = new String[3];
        System.out.println("도시, 경도, 위도를 입력하세요");
        for(int i=0; i<4; i++){
            System.out.print(">> ");
            string = scanner.nextLine();
            s = string.split(",");
            city.put(s[0], new Location(s[1],s[2],s[0]));
        }

        System.out.println("-----------------------------");

        Set<String> keys = city.keySet();
        Iterator<String> it = keys.iterator();
        while(it.hasNext()){
            String name = it.next();
            System.out.println(name+" "+city.get(name).getX()+" "+city.get(name).getY());
        }
        System.out.println("-----------------------------");

        String name;
        while(true){
            System.out.print("도시 이름 >>");
            name = scanner.next();

            if(name.equals("그만"))
                break;

            if(city.containsKey(name)){
                System.out.println(name+" "+city.get(name).getX()+" "+city.get(name).getY());
            }else{
                System.out.println(name+"는 없습니다.");
            }
        }
    }
}
