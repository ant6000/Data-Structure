
public class Main {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        while(n > 0){
            
            var r = n %2;
            var s = n / 2;
            n = r;
            if(s ==1)
             count++;
        }
        System.out.println(count);

    }
}
