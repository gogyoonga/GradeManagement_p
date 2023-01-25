import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("반갑습니다. 권한을 선택해주세요.");
            System.out.println("1.학생 2. 교수 / 그 외. 종료 \n >> ");
            int select = sc.nextInt();

            switch (select){
                case 1:
                    System.out.println("test");
                    break;
                case 2:
                    break;
                default:
                    break;

            }

        }

        System.out.println("exe");
    }
}