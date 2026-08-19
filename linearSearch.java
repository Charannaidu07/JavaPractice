public class linearSearch {
    public static void main(String[] args) {
        int nums[]=new int[1000];
        int target=900;
        int result1=linersearchcheck(nums,target);
        int result2=binarysearchcheck(nums,target,0,nums.length-1);
        if(result2 != -1) {
            System.out.println("Element Found At Index: " + result2);
        }
        else
            System.out.println("Element not found");
    }

    public static int linersearchcheck(int[] nums, int target) {
        int steps=0;
        for (int i=0;i< nums.length;i++){
            steps++;
            if(nums[i]==target){
                System.out.println("Steps taken by ls: "+steps);
                return i;
            }
        }
        System.out.println("Steps taken by ls: "+steps);
        return -1;
    }
    public static int binarysearchcheck(int[] nums, int target,int left,int right) {
        int steps=0;
        if(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if (nums[mid]<target) {
                return binarysearchcheck(nums,target,mid+1,right);
            }
            else {
                return binarysearchcheck(nums,target,left,mid-1);
            }
        }
//        while(left<=right){
//            steps++;
//            int mid=(left+right)/2;
//            if(nums[mid]==target){
//                System.out.println("Steps taken by bs: "+steps);
//                return mid;
//            }
//            else if (nums[mid]<target) {
//                left=mid+1;
//            }
//            else {
//                right=mid-1;
//            }
//        }
//        System.out.println("Steps taken by bs: "+steps);
        return -1;
    }
}
