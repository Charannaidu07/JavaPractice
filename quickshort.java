public class quickshort {
    public static void quickshortcheck(int[] arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            quickshortcheck(arr, low,pi-1);
            quickshortcheck(arr,pi+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }

    public static void main(String[] args){
        int nums[]={6,5,2,8,9,4};
        int size=nums.length;
        System.out.println("Before Sorting:");
        for(int num:nums){
            System.out.print(num+" ");
        }
        quickshortcheck(nums,0,size-1);
        System.out.println();
        System.out.println("After Sorting:");
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
