public class mainclass {
    public static void main(String[] args){
        linkedlist list=new linkedlist();
        list.insert(18);
        list.insert(45);
        list.insert(12);
        list.insertatstart(25);
        list.insertat(2,55);
        list.insertat(0,99);
        list.deleteat(2);
        list.show();
    }
}
