public class Stackegg {
    public static void main(String[] args){
        Dynamicstack nums=new Dynamicstack();
        nums.push(15);
        nums.push(20);
        nums.push(25);
        nums.push(30);
        nums.push(35);
        nums.pop();
        nums.peek();
        nums.show();
        System.out.println();
        System.out.println("size is: "+nums.size());
        System.out.println("Is Stack empty: "+nums.isEmpty());
        nums.pop();
        nums.pop();
        nums.show();
        System.out.println();
        nums.pop();
        nums.show();
        System.out.println();
        nums.pop();
        nums.show();
    }
}
