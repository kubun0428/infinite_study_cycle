public class Escape {
    public static void main(String[] args) {
        final int WAKE_UP_TIME = 8*60;
        final int END_DAY = 24*60;
        int now = WAKE_UP_TIME;
        System.out.printf("%02d:%02d\n", now/60, now%60);
        System.out.println("아... 공부하기 싫다. 30분부터 해야지.");
        while(now<END_DAY){
            now++;
            if (now/60==9){
                System.out.printf("%02d:%02d\n", now/60, now%60);
                System.out.println("아 공부해야겠다");
                break;
            }
            if(now%60==34){
                System.out.printf("%02d:%02d\n", now/60, now%60);
                System.out.println("헐 34분이잖아?");
                System.out.println("그럼 그냥 정각되면 해야겠다.");
            } else if(now%60==8){
                System.out.printf("%02d:%02d\n", now/60, now%60);
                System.out.println("미친 08분이네");
                System.out.println("아... 공부하기 싫다. 30분부터 해야지.");
            }
        }
    }
}
