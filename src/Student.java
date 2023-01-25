import java.util.HashMap;
import java.util.Map;
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
        for(String k : SubSet){System.out.print(k+" / ");}
    }

    public void putScore(String sub) {
        score.put(sub, 0);
    }
    public void removeScore(String sub){
        score.remove(sub);
    }
    public void clearScore(){ score.clear();}


}
