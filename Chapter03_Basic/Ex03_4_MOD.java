package Chapter03_Basic;

public class Ex03_4_MOD {
    public static void main(String[] args) throws Exception {
        long answer = 1;
        for (int i = 1; i <= 50; i++) {
            answer = (answer * i) % 10007;
        }
        System.out.println(answer % 10007);
    }
}
