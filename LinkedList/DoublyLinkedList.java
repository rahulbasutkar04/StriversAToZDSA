package LinkedList;


class NodeDll{
    int data;
    NodeDll next;
    NodeDll prev;

    NodeDll(int data, NodeDll next, NodeDll prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    NodeDll(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }


};
public class DoublyLinkedList {

    //To display contents in the linked list
    public static  void display(NodeDll head)
    {
        while(head!=null)
        {
            System.out.print(head.data+" ");
            head=head.next;
        }
        System.out.println();
    }
    //array to doubly linked List
    public static NodeDll arrayToDll(int [] arr)
    {

        System.out.println("Array to Doubly Linked List:");
        NodeDll head=new NodeDll(arr[0]);

        NodeDll back=head;

        for(int i=1;i<arr.length;i++)
        {
            NodeDll temp=new NodeDll(arr[i],null,back);
            back.next=temp;

            back=temp;

        }

        return  head;

    }

    //insertion operations

    //insert before the head
   public static NodeDll insertBeforeHead(NodeDll head,int val)
    {

        System.out.println("Insertion of element before the head");
        NodeDll newNode=new NodeDll(val,head,null);
        head.prev=newNode;

        return newNode;
    }

    //insert before the tail

    public static NodeDll inserteforeTail(NodeDll head,int val)
    {

        System.out.println("Insertion of element at before the tail");
        if(head.next==null)
        {
            return new NodeDll(val,null,null);
        }

        NodeDll tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }

        NodeDll back=tail.prev;
        NodeDll newNode=new NodeDll(val,tail,back);

        back.next=newNode;
        tail.prev=newNode;

        return head;

    }

    //insertion at the given kth position

    public static NodeDll insertAtkth(NodeDll head, int val, int k) {
        System.out.println("Insertion at the given position");
        if (k == 1) {
            return insertBeforeHead(head, val);
        }

        NodeDll temp = head;
        int cnt = 1; // Start counting from 1
        while (temp != null && cnt < k) {
            temp = temp.next;
            cnt++;
        }

        if (temp == null) { // If temp is null, k is greater than the size of the list
            System.out.println("Position " + k + " is out of bounds");
            return head; // No insertion is performed
        }

        NodeDll back = temp;
        NodeDll newNode = new NodeDll(val);
        newNode.prev = back;
        if (back.next != null) {
            back.next.prev = newNode;
            newNode.next = back.next;
        }
        back.next = newNode;

        return head;
    }

    //insertion of value before the given node

    public static void insertBeforeNode(NodeDll node,int val)
    {
        System.out.println("Inserting Before the Given Node");
        NodeDll back=node.prev;
        NodeDll newNode=new NodeDll(val,node,back);
        back.next=newNode;
        node.prev=newNode;
    }


    //Deletion Operations

    public static NodeDll delteHeadNode(NodeDll head)
    {

        System.out.println("Deleting the head from DLL:");
        if(head==null || head.next==null)
        {
            return null;
        }

        NodeDll back=head;
        head=head.next;
        head.prev=null;
        back.next=null;

        return head;

    }

    //Deleting tail of the DLl

    public static NodeDll deleteTail(NodeDll head)
    {
        System.out.println("Deleting the tail of Dll:");
        if(head==null || head.next==null)
        {
            return  null;
        }

        NodeDll tail=head;
        while(tail.next!=null)
        {
            tail=tail.next;
        }

        NodeDll newTail=tail.prev;
        newTail.next=null;
        tail.prev=null;

        return head;

    }

    //Deleting kth element in DLL
    public static NodeDll deleteKthElement(NodeDll head,int k)
    {

        System.out.println("Deleting the kth NOde element:");
        if(head==null)
        {
            return  null;
        }

        NodeDll knode=head;
        int cnt=0;
        while(knode!=null)
        {
            cnt++;
            if(cnt==k)
            {
                      break;

            }

            knode=knode.next;
        }

        NodeDll back=knode.prev;
        NodeDll front=knode.next;

        if(back==null && front==null)
        {
            return null;
        }

        else if(back==null)
        {
            return delteHeadNode(head);
        }

        else if(front==null)
        {
            return deleteTail(head);
        }

        back.next=front;
        knode.prev=null;

        return head;
    }

    //Delete the node of dll

    public static void deleteNode(NodeDll temp)
    {
        System.out.println("Deleting the specified Node");
        NodeDll back=temp.prev;
        NodeDll front=temp.next;

        if(front==null){
            back.next=null;
            temp.prev=null;
            return;
        }

        back.next=front;
        front.prev=back;

        temp.next=temp.prev=null;

    }
    public static void main(String[] args) {

        int [] arr={1,2,3,4,5};

        NodeDll head=arrayToDll(arr);

        display(head);

        head=insertBeforeHead(head,0);

        display(head);

        head=inserteforeTail(head,6);
        display(head);

        head=insertAtkth(head,7,4);

        display(head);

        insertBeforeNode(head.next.next,8);

        display(head);

        head=delteHeadNode(head);
        display(head);

        head=deleteTail(head);
        display(head);

        head=deleteKthElement(head,3);
        display(head);

        deleteNode( head.next.next);
        display(head);

    }


}


//output->
Array to Doubly Linked List:
1 2 3 4 5 
Insertion of element before the head
0 1 2 3 4 5 
Insertion of element at before the tail
0 1 2 3 4 6 5 
Insertion at the given position
0 1 2 3 7 4 6 5 
Inserting Before the Given Node
0 1 8 2 3 7 4 6 5 
Deleting the head from DLL:
1 8 2 3 7 4 6 5 
Deleting the tail of Dll:
1 8 2 3 7 4 6 
Deleting the kth NOde element:
1 8 3 7 4 6 
Deleting the specified Node
1 8 3 
