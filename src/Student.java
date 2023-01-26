import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Student {
    String stuNo; //학번
    String name; //이름
    int year; //학년
    HashMap<String, Integer> score = new HashMap<String, Integer>(); //과목 점수


    public String getStuNo(){return stuNo;}
    public void setStuNo(String stuNo){this.stuNo = stuNo;}
    public String getName(){return name;}
    public void setName(String name){ this.name = name;}
    public int getYear() {return year;}
    public void setYear(int year){this.year = year;}
    public void getScore(){
        score.forEach((sub, sco)->{
            System.out.println(sub+" : "+sco);
                }
        );}
    public void getSubject(){
        Set<String> SubSet = score.keySet();
        for(String k : SubSet){System.out.print(k+",");}
    }

    public void putSubject(String sub) {
        score.put(sub, 0);
    }
    public void removeSubject(String sub){
        score.remove(sub);
    }
    public void clearSubject(){ score.clear();}

    public void showScore(String stuNo){


        if (this.stuNo != stuNo){
            System.out.println("정보가 없습니다.");
        }
        else{
        System.out.println("1. 내 성적 보기 2. 내 정보 보기 / 그 외. 종료 \n >> ");
        Scanner sc = new Scanner(System.in);
        int select = sc.nextInt();
        switch (select) {
            case 1:
                System.out.println("---내 성적 보기---");
                getScore();
                break;
            case 2:
                System.out.println("---내 정보 보기---");
                System.out.println("학 번 : "+getStuNo());
                System.out.println("이 름 : "+getName());
                System.out.println("학 년 : "+getYear());
                System.out.println("수강 과목 : ");
                getSubject();
                break;
            default:
                System.out.println("종료?");
                break;
        }

        }
    }


}
