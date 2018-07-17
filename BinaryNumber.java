import java.util.Scanner;

//	30 Days Of Code >> Day 10: Binary Number


public class BinaryNumber {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String op="";
        if(n!=0) {
            while (n > 1) {
                op += "" + n % 2;
                n = n / 2;
            }
            op += "1";
        }else{
            op+=""+n;
        }
        int count = BinaryNumber.Count(op);
        StringBuilder rev = new StringBuilder(op).reverse();
        int count1 = BinaryNumber.Count(rev.toString());
        count = count<=count1? count1:count;
        System.out.println(count);
    }
    public static int Count(String s){
        int count=0;
        for(int j=0;j<s.length();j++){
            if(s.charAt(j)=='1'){
                count++;
            }else{
                count=0;
            }
        }
        return count;
    }
}
