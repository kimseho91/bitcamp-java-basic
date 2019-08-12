import java.util.Scanner;
import java.util.Random;
class Dice{
    /**
     * 주사위를 던져서 홀수인지 짝수인지 맞추는 게임입니다.
     * 일단 컴퓨터가 던져서 얻은 값은 3입니다.
     * 사용자는 입력을 홀수 인거 같으면 '홀', 짝수 인거 같으면 '짝'을 선택
     * 한다고 할 때, 결과를 출력하세요.
     */
    public static void main(String[] args) {
        System.out.println("주사위를 던져서 결과가 홀수인지 짝수인지 맞추는 게임입니다.");
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int dice = 0;
        dice = ran.nextInt(6)+1;
        System.out.println(String.format("랜덤으로 나온 수 %d", dice));
        String answer = "";
        String dap = "";
        System.out.println("컴퓨터의 숫자를 예상한 홀, 짝 선택");
        answer = sc.next();
        if(dice == 1 || dice == 3 || dice == 5 || answer == "홀"){
            System.out.println(dap = "정답입니다.");
        }else if(dice == 2 && dice == 4 && dice == 6 && answer == "짝"){
            System.out.println(dap = "정답입니다.");
        }else if(dice == 1 && dice == 3 && dice == 5 && answer == "짝"){
            System.out.println(dap = "틀렸습니다.");
        }else if(dice == 2 && dice == 4 && dice == 6 && answer == "홀"){
            System.out.println(dap = "틀렸습니다.");
        }else{
            System.out.println("잘못입력했습니다.");
        }
    }
}