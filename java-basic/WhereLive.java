import java.util.Scanner;
class WhereLive{
    public static void main(String[] args){
        System.out.println("어디에 사시나요 ?");
        String where = "";
        Scanner scanner = new Scanner(System.in);
        where = scanner.next();
        System.out.println(String.format("저는 %s에 삽니다.", where));
    }
}