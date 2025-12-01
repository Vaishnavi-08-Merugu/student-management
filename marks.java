public class marks {
    public static int average(int[] arr){
        int s=0;
        for(int x:arr) s+=x;
        return arr.length==0?0:s/arr.length;
    }
}
