import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) throws IOException {

        final String PRO_CODE = "pro1234";


        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("반갑습니다. 권한을 선택해주세요.");
            System.out.println("1.학생 2. 교수 / 그 외. 종료 \n >> ");
            int select = sc.nextInt();

            switch (select){
                case 1:
                    System.out.println("인증 코드 (학번) 입력 >> ");
                    String codeNumberS = sc.next();

                    Student student = new Student();
                    student.setStuNo(codeNumberS);

                    student.showScore(codeNumberS);

                    BufferedReader br = new BufferedReader(new FileReader(new File("data.txt")));
                    String str = "";
                    str = br.readLine();
                    while(str!=codeNumberS){
                        str=br.readLine();
                        if(str==null) {
                            System.out.println("존재하지 않음.");
                            Student student1 = new Student();
                            student1.setStuNo(codeNumberS);
                            System.out.println("학 번 : "+student1.getStuNo());
                            System.out.print("이 름 : ");
                            String name = sc.next();
                            student1.setName(name);
                            System.out.print("학 년 : ");
                            int year = sc.nextInt();
                            student1.setYear(year);
                            System.out.print("수강 과목(종료 0) :");
                            String subject = sc.nextLine();
                            while(subject != "0")
                            {
                                student1.putSubject(subject);
                            }
                            //파일 저장
                            File file = new File("./data.txt");
                            try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                                writer.append(student1.getStuNo()+"/");
                                writer.append(student1.getName()+"/");
                                writer.append(student1.getYear()+"/");

                            } catch (IOException e) {
                                e.printStackTrace();
                            }


                            break;}
                    }
                    if(str == codeNumberS) System.out.println("존재함");


                    break;
                case 2:
                    System.out.println("인증 코드 입력 >> ");
                    String codeNumberP = sc.next();
                    if(codeNumberP == PRO_CODE) System.out.println("인증 성공!");



                    // 파일 읽기
                    try{
                        Path path = Paths.get("./data.txt");
                        List<String> lines = Files.readAllLines(path);
                        for(String line:lines){
                            System.out.println(line);
                        }
                    }catch(IOException e) {
                        e.printStackTrace();
                    }

                    /*//파일 저장
                    File file = new File("./data.txt");
                    try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                        writer.append("");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }*/

                    break;
                default:

                    break;

            }

        }

    }
}