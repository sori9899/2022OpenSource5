import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
import java.util.Vector;

class Word{
    String eng;
    String kor;
    public Word(String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }
}

public class OpenCallenge {
    public static void main(String[] args) {
        Vector<Word> v = new Vector<Word>();

        v.add(new Word("love", "사랑"));
        v.add(new Word("aniaml", "동물"));
        v.add(new Word("rice", "쌀"));
        v.add(new Word("computer", "컴퓨터"));
        v.add(new Word("camera", "카메라"));
        v.add(new Word("car", "자동차"));
        v.add(new Word("train", "기차"));
        v.add(new Word("banana", "바나나"));
        v.add(new Word("fish", "물고기"));
        v.add(new Word("girl", "여자"));
        v.add(new Word("man", "남자"));
        v.add(new Word("eye", "눈"));
        v.add(new Word("painting", "그림"));
        v.add(new Word("picture", "사진"));
        v.add(new Word("bear", "곰"));
        v.add(new Word("human", "인간"));
        v.add(new Word("society", "사회"));

        Scanner scanner =  new Scanner(System.in);

        int num,p;
        int question;
        Vector<String> answer = new Vector<String>();
        System.out.println("\"명품영어\"의 단어테스트를 시작합니다. -1을 입력하면 종료합니다.");
        System.out.println("현재 "+v.size()+"개의 단어가 들어 있습니다.");
        while(true){
            question = (int)(Math.random()*17);
            System.out.println(v.get(question).eng+"?");

            p=(int)(Math.random()*4+1);
            while(answer.size()!=4){
                num = (int)(Math.random()*17);
                if(answer.size() == p-1) {
                    answer.add(v.get(question).kor);
                    continue;
                }
                if(num!=question && !answer.contains(v.get(num).kor)){
                    answer.add(v.get(num).kor);
                }
            }

            for(int i=0; i<answer.size(); i++){
                System.out.print("("+(i+1)+")"+answer.get(i)+" ");
            }
            System.out.print(" :> ");
            num = scanner.nextInt();

            if(num== -1){
                System.out.println("\"명품영어\"를 종료합니다...");
                break;
            }

            if(v.get(question).kor.equals(answer.get(num-1)))
                System.out.println("Excellent !!");
            else
                System.out.println("No. !!");

            answer.clear();
        }
    }
}
