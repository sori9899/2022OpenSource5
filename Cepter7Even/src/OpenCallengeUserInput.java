import javax.swing.*;
import java.sql.SQLSyntaxErrorException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

class Dic{
    String eng;
    String kor;
    public Dic(String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }

    public String getEng() {
        return eng;
    }

    public String getKor(){
        return kor;
    }
}

public class OpenCallengeUserInput {
    public static void main(String[] args) {
        Vector<Dic> v = new Vector<Dic>();

        v.add(new Dic("love", "사랑"));
        v.add(new Dic("aniaml", "동물"));
        v.add(new Dic("rice", "쌀"));
        v.add(new Dic("computer", "컴퓨터"));
        v.add(new Dic("camera", "카메라"));
        v.add(new Dic("car", "자동차"));
        v.add(new Dic("train", "기차"));
        v.add(new Dic("banana", "바나나"));
        v.add(new Dic("fish", "물고기"));
        v.add(new Dic("girl", "여자"));
        v.add(new Dic("man", "남자"));
        v.add(new Dic("eye", "눈"));
        v.add(new Dic("painting", "그림"));
        v.add(new Dic("picture", "사진"));
        v.add(new Dic("bear", "곰"));
        v.add(new Dic("human", "인간"));
        v.add(new Dic("society", "사회"));

        Scanner scanner =  new Scanner(System.in);

        int num,p;
        int question;
        Vector<String> answer = new Vector<String>();

        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\"입니다. ****");
        int order=0;
        while(order != 3){
            System.out.print("단어 테스트 :1, 단어 삽입:2, 종료:3 >>");

            try{
                order = scanner.nextInt();
            }catch (InputMismatchException e){
                System.out.println("숫자를 입력하세요!!");
                scanner = new Scanner(System.in);
                order = 0;
            }

            switch (order){
                case 1:
                    System.out.println("\"명품영어\"의 단어테스트를 시작합니다. -1을 입력하면 종료합니다.");
                    System.out.println("현재 "+v.size()+"개의 단어가 들어 있습니다.");
                    while(true){
                        question = (int)(Math.random()*v.size());
                        System.out.println(v.get(question).getEng()+"?");

                        p=(int)(Math.random()*4+1);
                        while(answer.size()!=4){
                            num = (int)(Math.random()*v.size());
                            if(answer.size() == p-1) {
                                answer.add(v.get(question).getKor());
                                continue;
                            }
                            if(num!=question && !answer.contains(v.get(num).getKor())){
                                answer.add(v.get(num).getKor());
                            }
                        }

                        for(int i=0; i<answer.size(); i++){
                            System.out.print("("+(i+1)+")"+answer.get(i)+" ");
                        }
                        System.out.print(" :> ");

                        try{
                            num = scanner.nextInt();
                            if(num== -1){
                                System.out.println();
                                answer.clear();
                                break;
                            }

                            if(v.get(question).getKor().equals(answer.get(num-1)))
                                System.out.println("Excellent !!");
                            else
                                System.out.println("No. !!");
                        }catch (InputMismatchException e){
                            System.out.println("숫자를 입력하세요!!");
                            scanner = new Scanner(System.in);
                        }
                        answer.clear();
                    }
                    break;
                case 2:
                    boolean key=true;
                    System.out.println("영어 단어에 그만을 입력하면 종료합니다.");
                    while(true){
                        key=true;
                        System.out.print("영어 한글 입력 >> ");
                        String english= scanner.next();
                        if(english.equals("그만"))
                            break;
                        String korean = scanner.next();

                        for(int i=0; i<v.size(); i++){
                            if(v.get(i).getEng().equals(english)){
                                System.out.println("이미 있는 단어입니다");
                                key=false;
                            }
                        }
                        if(key){
                            v.add(new Dic(english, korean));
                        }

                    }
                    break;
                case 3:
                    System.out.println("\"명품영어\"를 종료합니다...");
                    break;
            }
        }
    }
}