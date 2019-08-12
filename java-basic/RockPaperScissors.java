import java.util.Scanner;
import java.util.Random;
class RockPaperScissors{
    public static void main(String[] args) {
        System.out.println("가위 바위 보 게임 시작 !!");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ran = 0;
        ran = random.nextInt(3)+1;
        System.out.println("무엇을 낼건가요 ??");
        String a = "";
        a = sc.next();
        if(ran == 1){
            System.out.println("가위입니다.");
            if(a.equals("가위")){ 
                System.out.println("당신은 비겼습니다.");
            }else if(a.equals("바위")){
                System.out.println("당신은 이겼습니다.");
            }else if(a.equals("보")){
                System.out.println("당신은 졌습니다.");
            }else{
                System.out.println("잘못입력했습니다.");
            }
        }else if(ran == 2){
            System.out.println("바위입니다.");
            if(a.equals("가위")){ 
                System.out.println("당신은 졌습니다.");
            }else if(a.equals("바위")){
                System.out.println("당신은 비겼습니다.");
            }else if(a.equals("보")){
                System.out.println("당신은 이겼습니다.");
            }else{
                System.out.println("잘못입력했습니다.");
            }
        }else{
                System.out.println("보입니다.");
            if(a.equals("가위")){ 
                System.out.println("당신은 이겼습니다.");
            }else if(a.equals("바위")){
                System.out.println("당신은 졌습니다.");
            }else if(a.equals("보")){
                System.out.println("당신은 비겼습니다.");
            }else{
                System.out.println("잘못입력했습니다.");
            }
        }
}
}