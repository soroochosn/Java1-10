import java.awt.*;

public class Runner {
    public static void main(String[] args) {
        System.out.println(icyHot(600, 50));
        System.out.println(doubleX("axaxax"));
        System.out.println(firstTwo("Hello"));
        int[] x={6,19,12};
        System.out.println(sum2(x));
        System.out.println(love6(5,6));
        System.out.println(luckySum(3,6,13));
        int[] s={10,20,30};
        System.out.println(lucky13(s));
        System.out.println(repeatEnd("Hello", 3));

    }

    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 > 100 && temp2 < 0) || (temp1 < 0 && temp2 > 100)) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean doubleX(String str) {
        int i = str.indexOf("x");
        if(i==-1){
            return false;
        }
        if(i+1>=str.length()){
            return false;
        }
        if(str.substring(i+1,i+2).equals("x")){
            return true;
        }else{
            return false;
        }
    }
    public static String firstTwo(String str) {
        if(str.length()==0){
            return str;
        }
        if(str.length()==1){
            return str;
        }
        return str.substring(0,2);
    }
    public static int sum2(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        return nums[0]+nums[1];
    }
    public static boolean love6(int a, int b) {
        if(a==6 || b==6){
            return true;
        }
        if(a+b==6){
            return true;
        }
        if(a-b==6 || b-a==6){
            return true;
        }
        return false;
    }
    public static int luckySum(int a, int b, int c) {
        if(a==13){
            return 0;
        }
        if(b==13){
            return a;
        }
        if(c==13){
            return a+b;
        }
        return a+b+c;
    }
    public static String repeatEnd(String str, int n) {
        String x = str.substring(str.length()-n);
        String y = "";
        for(int i=0 ;i<n;i++){
            y=y+x;
        }
        return y;
    }


    public static boolean lucky13(int[] nums) {
        boolean no=true;
        for(int i = 0; i<nums.length;i++){
            if(nums[i]==1||nums[i]==3){
                no=false;
            }
        }
        return no;
    }







}






