public class doublyll {
    DNode head;
    public void insertatstart(int data) {
        DNode node=new DNode();
        node.data=data;
        node.prev=null;
        node.next=null;
        head=node;
    }
    public void insertatend(int data) {
        DNode node=new DNode();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            DNode n=head;
            while (n.next!=null){
                n=n.next;
            }
            node.prev=n;
            n.next=node;
        }
    }

    public void insertat(int data, int index) {
        DNode node=new DNode();
        node.data=data;
        if(head==null){
            head=node;
        }
        else{
            DNode n=head;
            for(int i=0;i<index;i++){
                n=n.next;
            }
            node.prev=n;
            node.next=n.next;
            n.next=node;
        }
    }
    public void display() {
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}
