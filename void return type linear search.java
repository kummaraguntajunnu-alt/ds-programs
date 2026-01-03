class Main {
    static int index=1;
    public static void linearsearch
    (int [] arr,int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
             index=i;
             System.out.println("Element not found at : "+index);
             return;
            } 
        }  
                System.out.println("Element is not found in the given array at : "+index);
    }
    public static void main(String[] args) {
        int[] arr={1,5,8,10};
        int tag=4;
        linearsearch(arr,tag);
    }
}
