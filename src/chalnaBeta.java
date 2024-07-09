public class chalnaBeta {
    public static void main(String[] args) {
        int[]arr = {0,2,1,2,0};
        sort012(arr);
    }
    public static void sort012(int a[])
    {
        // code here
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for(int i = 0; i< a.length; i++){
            if(a[i]==0){
                count1++;
            }
            if(a[i]==1){
                count2++;
            }
            if(a[i]==2){
                count3++;
            }
        }
        for(int j=0; j<count1; j++){
            System.out.print("0 ");
        }
        for(int k=0; k<count2; k++){
            System.out.print("1 ");
        }
        for(int l=0; l<count3; l++){
            System.out.print("2 ");
        }
    }
}
