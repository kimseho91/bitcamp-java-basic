import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        System.out.println("첫번째 숫자를 입력하세요.");
        int a, b, c = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요.");
        b = sc.nextInt();
        String op = "";
        System.out.println("연산종류를 선택하세요 +, -, *, /");
        op = sc.next();
        if(op.equals("+")){
        c = a + b;
            System.out.println(String.format(" %d + %d = %d", a, b, c));
        }else if(op.equals("-")){
        c = a - b;
            System.out.println(String.format(" %d - %d = %d", a, b, c));
        }else if(op.equals("*")){
        c = a * b;
            System.out.println(String.format(" %d * %d = %d", a, b, c));
        }else if(op.equals("/")){
        c = a / b;
            System.out.println(String.format(" %d / %d = %d", a, b, c));
        }else{
            System.out.println("다시 시도해 주세요.");
        }
    }
}