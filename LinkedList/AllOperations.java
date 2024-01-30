
class Node 
{
    int data;
    Node next;
    Node(int data1,Node next1)
    {
        this.data=data1;
        this.next=next1;
    }
    
    Node(int data1)
    {
        this.data=data1;
        this.next=null;
        
    }
};

class Opeartions
{
    //method to print values in node
    public static void display(Node head)
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    //method for converting array to linked list
   public static  Node convertToll(int [] arr)
    {
        Node head=new Node(arr[0]);
        Node mover=head;
        for(int i=1;i<arr.length;i++)
        {
            Node temp=new Node(arr[i]);
            mover.next=temp;
            mover=temp;
        }
        return head;
    }
//method to get length of LL
public static int length(Node head) {
    Node temp = head;
    int cnt = 0;
    while (temp != null) {
        cnt++;
        temp = temp.next;
    }
    return cnt;
}
//check if elemtn is present in list or not

public static boolean isPresent(Node head,int val)
{
    Node temp=head;
    while(temp!=null)
    {
        if(temp.data==val)
        {
            return true;
        }
        temp=temp.next;
    }
    
    return false;
    
}
//insert element at head
public static Node insertAtfirst(Node head,int val)
{
    Node temp=new Node(val,head);
    return temp;
}

//insert element at end of LL
public static Node insertAtEnd(Node head, int val) {
    if (head == null) {
        return new Node(val);
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }
    Node newNode = new Node(val);
    temp.next = newNode;
    return head;  // Update the head reference with the new node
}

static Node insertAtAny(Node head, int val, int pos) {
    if (head == null) {
        if (pos == 1) {
            return new Node(val);
        } else {
            return head;
        }
    }

    if (pos == 1) {
        Node temp = new Node(val, head);
        return temp;
    }

    int count = 0;
    Node temp = head;
    while (temp != null) {
        count++;
        if (count == pos - 1) {
            Node x = new Node(val);
            x.next = temp.next;
            temp.next = x;
            break;
        }
        temp = temp.next;
    }
    return head;
}
//method for deleting the head node
static Node deleteHead(Node head)
{
    if(head==null)
    {
        return head;
    }
    head=head.next;
    return head;
}
//method for deleting the tail Node
static Node deleteTail(Node head)
{
    if(head==null || head.next==null)
    {
        return null;
    }
    Node temp=head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;
    return head;
}
//delete from kth position
static Node deleteKth(Node head,int k)
{
    if(head==null) return head;
    if(k==1)
    {
        
        head=head.next;
        return head;
    }
    int cnt=0;
    Node temp=head;
    Node prev=null;
    while(temp!=null)
    {
        cnt++;
        if(cnt==k)
        {
            prev.next=prev.next.next;
            break;
        }
        prev=temp;
        temp=temp.next;
    }
    return head;
}
    public static void main(String[] args)
    {
        
        int [] arr={1,2,3,4,5};
        Node head=convertToll(arr);
        display(head);
        System.out.println("length of linked list is:"+length(head));
        boolean ans=isPresent(head,4);
        if(ans)
        {
            System.out.println("Yes element is present in LL");
        }
        else
        {
            System.out.println("Not present in LL");
        }
        
        System.out.println("Linked List after Adding node at Beginning..");
        //inserting element 0 at the first position
        head=insertAtfirst(head,0);
        display(head);
        head=insertAtEnd(head,9);
        System.out.println("Linked List after adding node at end");
        display(head);
        
        head=insertAtAny(head,12,3);
        System.out.println("Linked List after adding element at the given position.");
        display(head);
        head=deleteHead(head);
        System.out.println("linked List after removing head element.");
        display(head);
        
        head=deleteTail(head);
        System.out.println("linked List after removing Tail element.");
        display(head);
        
         head=deleteKth(head,5);
        System.out.println("linked List after removing kth positioned element.");
        display(head);
        
        
    }
}


output->
  java -cp /tmp/wNTre0CNZi Opeartions
1 2 3 4 5 
length of linked list is:5
Yes element is present in LL
Linked List after Adding node at Beginning..
0 1 2 3 4 5 
Linked List after adding node at end
0 1 2 3 4 5 9 
Linked List after adding element at the given position.
0 1 12 2 3 4 5 9 
linked List after removing head element.
1 12 2 3 4 5 9 
linked List after removing Tail element.
1 12 2 3 4 5 
linked List after removing kth positioned element.
1 12 2 3 5 
