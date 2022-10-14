import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

class Line extends Shape{

    @Override
    public void draw() {
        System.out.println("Line");
    }
}

class Rect extends Shape{

    @Override
    public void draw() {
        System.out.println("Rect");
    }
}

class Circle extends Shape{

    @Override
    public void draw() {
        System.out.println("Circle");
    }
}


public class GraphicVector{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Shape> v = new Vector<Shape>();

        int num=0,n;
        System.out.println("그래픽 에디터 beauty을 실행합니다");
        while (num != 4){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4) >> ");
            num = scanner.nextInt();
            switch (num){
                case 1:
                    System.out.print("Line(1), Rect(2), Circle(3)>>");
                    n = scanner.nextInt();
                    switch (n){
                        case 1:
                            v.add(new Line());
                            break;
                        case 2:
                            v.add(new Rect());
                            break;
                        case 3:
                            v.add(new Circle());
                            break;
                        default:
                            System.out.println("잘못된 입력입니다.");
                    }
                    break;
                case 2:
                    System.out.print("삭제할 도형의 위치>>");
                    n = scanner.nextInt();
                    if(n> v.size() || n<=0){
                        System.out.println("삭제할 수 없습니다.");
                    }else{
                        v.remove(n-1);
                    }
                    break;
                case 3:
                    Iterator<Shape> it = v.iterator();
                    while(it.hasNext()){
                        Shape sp = it.next();
                        sp.draw();
                    }
                    break;
                case 4:
                    System.out.println("beauty를 종료합니다");
                    break;
            }
        }

    }
}

