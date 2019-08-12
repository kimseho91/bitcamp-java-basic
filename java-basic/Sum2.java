import java.util.Scanner;
class Sum2{
    public static void main(String[] args){
        System.out.println("첫번째 수를 입력하세요.");
        int a,b,c = 0;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        System.out.println("두번째 수를 입력하세요.");
        b = scanner.nextInt();
        c = a-b;
        System.out.println(String.format(" %d - %d = %d ",a, b, c));
    }
}