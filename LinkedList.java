public class LinkedList{
    public static class Node{
        int data;
        Node next;  // node type ka next refrence variable which points to next data

        public Node(int data){  // as a parameter aaya hai data
            this.data=data;
            this.next = null; // initially linked list is empty
        }
    }
    public static Node head;  // static kyunki ek hi head aur ek hi tail hai
    public static Node tail;
    public static int size;  // by default java iski value initialize karega as 0


    // addfirst head tail sbko directly access kar sakta hai kyunki ye sb information ek single class ke ander hai which is my linkedList class
    public void addFirst(int data){
        // empty linkedList
        // step 1 --->>> create new node
        Node newNode = new Node(data);  
        // jaise hi naya node add hua vaise hi mai size ko kar dungi size++
        size++;
        if(head==null){
            head = tail = newNode;  // when linked list was empty then i made newnode as tail and then made tail as head
            return;
        }

        // step 2 mai naye node ke next me assign kr du apni head ki value
        newNode.next = head;  // yaha par maine actually LINK kiya h ek node ko dusre node se  (LINKING STEP == isi step ke wajah se ek linked list create hoti hai)

        //step 3 ---->>> head ki value ab new node ban jaye
        head = newNode;
    } 
    
    // addLast
    public static void addLast(int data){
        // step 1 --->>>> create new node
        Node newNode = new Node(data);
        // jaise last pe naya node create hua mai size ko kar dungi size++
        size++;
        // special case agar meri linked list khali hai
        if(head == null){
            head = tail = newNode;
            return;            
        }
        // step 2 --->>>> tail ke next ko point krwau apne new node ke taraf
        tail.next = newNode;
 
        //step 3 --->>>> new node ko hi apna tail bana du
        tail = newNode;
    }
    // method to print the linkedList
    public void print(){
        // if linked list is empty
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");  // printing the data of temp
            // after printing the initial value of temp we need to update temp
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void add(int idx,int data){
        // agar mai idx = 0 deti hu iska mtlb hai mai head pe add kr rahi hu to directly addFirst ko call kr dungi
        if(idx==0){
            addFirst(data);
            return;

        }
        //step 1 --->>> create newNode
        Node newNode = new Node(data);
        // jaise hi naya node add hoga mai size ko ++ kar dungi
        size++;
        // step 2 --->>> temp banana h
        Node temp = head;
        // step 3 --->>> ab mujhe ek loop chalana hai jo track krega ki temp kon se index pe h
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        // when i =idx-1 ; temp-->> prev
        newNode.next=temp.next;
        temp.next = newNode;
    }
    public int removeFirst(){  // koi parameter nahi pass hoga kyunki head already hai mere paas
        if(size==0){
            // linked list agar khaali hai to koi node hi nhi h delete karne ke liye
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;  // koi valid value ko maine return nhi kiya hai
        }else if(size ==1){
            int val = head.data;
            head = tail=null;
            size=0;
            return val;
        }
        int val = head.data;  // jis value ko mai delete karne waali hu wo hai head ka data
        head = head.next;  // new haed will be nextNode
        size--;
        return val;
    }
    public int removeLast(){
        if(size ==0){
            System.out.println("LinkedList is empty");
        }else if(size==1){
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        // mujhe loop lgakr apne previous node tak pohochna hai
        // previous node wo hoga jiski i ki value hogi size-2 ke equal
        Node prev = head;
        for(int i=0; i<size -2;i++){
            prev = prev.next;
        }
        int val = prev.next.data; // ya to mai isko keh skti hu tail ka data
        // jab ye loop khatam hoga to mai apne actual size-2 index pe khadi hongi
        prev.next = null;
        tail=prev;
        size--;
        return val;
    }
    // recursive search
    // recursion me har baar mera head change ho ra h 
    // head ko  change krne ka best tareeka ye h ki mai ek helper function bana lu
    public int helper(Node head , int key){   // time complexity -->>> O(n) bcoz of thr helper function in recursive search
        if(head == null){
            return -1;
        }
        if(head.data == key){
            return 0;
        }
        int idx = helper(head.next , key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int Rsearch(int key){
        return helper(head,key);
    }
    // iterative serach
    public int searchkey(int key){
        int idx=0;
        Node temp = head;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }else{
                temp = temp.next;
                idx++;
            }
        }
        return -1;
    }
    public void reverse(){  // time complexity -->>> O(n)
        Node prev = null;  // abhi head ke pehle waali node null hai  mtlb kuch h hi nhi
        Node curr = tail = head ;  //mai list ko reverse kar rhi hu to ab meri head ki value mere tail aur curr dono me store ho gyi
        Node next; // we will not initialize next right now , we will initialize it in a loop
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev=curr;
            curr=next;
        }
        head = prev;
    }
    public void deletefromEnd(int n){
        // first task is to   ---->>>> calculate size of linkedList
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        // now i will check if i have to delete my head only
        if(n==sz){
            head =head.next; // removeFirstOperation
            return;
        }

        // "sz-n" tak pohochna hai
        int i =1;
        int idxtoFind = sz-n;
        Node prev  = head;
        while(i<idxtoFind){
            prev=prev.next;
            i++;
        }
        prev.next = prev.next.next; // ab next ki value direct jayegi prev ke baad that means node is deleted

    }

    public Node findMid(Node head){  // ek tareeke se ye mera helper function hai
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next != null){
            slow = slow.next;  // move by +1
            fast = fast.next.next; // move by +2

        }
        // jaise hi while loop khatam hua to slow is my middle
        return slow;  // slow is my mid Node
    }
    public boolean checkPalindrome(){
        if(head==null || head.next == null){
            return true;
        }
        // step 1 --->> to find mid
        Node midNode = findMid(head);

        // step 2 --->> reverse second half
        Node prev =null;
        Node curr = midNode;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right = prev; //right half ka head
        Node left = head;

        //step 3 --->>> check left half and right half for palindrome
        while(right!=null){
            if(left.data !=right.data){
                return false;
            }
            left = left.next;
            right= right.next;

        }
        return true;
    }
    
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;   // cycle exist as slow becomes equal to fast
            }
        }
        return false;
    }

    public static void removeCycle(){
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle =false;  // shuru me initialize krenge ki cycle exist nhi krti
        while(fast!=null && fast!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;  // jb hm while loop se bahar niklenge to slow fast ke equal ho jayega aur prev ke ander humara lastnode store hp jayega
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }
        // remove cycle   -->>> last.next = null   // last ke next ko null bana du
        prev.next=null;
    }
    private Node merge(Node head1 , Node head2){
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1!=null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1=head1.next;
                temp= temp.next;
                }
                else{
                    temp.next = head2;
                    head2=head2.next;
                    temp=temp.next;
                }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp= temp.next;
        }
        while(head2!=null){
            temp.next = head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    }
    private Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // mid node
    }

    public Node mergeSort(Node head){  // merge sort hokr jo linkedList hogi uska ye HEAD return karega
        //base case  -->> jab ya to linkedList khali ho ya usme ek node ho
        if(head==null || head.next ==null){
            return head;
        }

        // first task is to find mid 
        Node mid = getMid(head);

        // for left & right half call Merge Sort
        Node rightHead = mid.next;
        mid.next=null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // merge
        return merge(newLeft, newRight);
    }

    public void zigZag(){
        // find middle
        Node slow = head;
        Node fast = head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        // reverse 2nd half
        Node curr = mid.next; // starting point of right half
        mid.next=null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next = curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left = head;
        Node right = prev;
        Node nextL;
        Node nextR;
        
        // alt merge - zigZag merge
        while(left!=null && right!=null){
            nextL= left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    // practice questions
    public Node intersection(){
        
    }
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        // 1->2->3->4->5
        ll.print();
        ll.zigZag();
        ll.print();
        // ll.head= ll.mergeSort(ll.head);
        // ll.print();


        // // we are making a linkedList in which cycle exists
        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next=temp;        
        // head.next.next = new Node(3);
        // head.next.next.next= temp;
        // // head.next.next.next= new Node(4);
        // // 1-> 2-> 3-> 2(2nd node se connected hai 3)  
        // // matlab yaha 3 point kar raha h waapas head ko , yaha cycle exists krti hai
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        // creating linked list in main class
        // LinkedList ll=  new LinkedList();  // same linked list class ki maine ek object banayi hai ll naam se aur isi object ke amder mai saare nodes create krne waali hu 
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print(); // 1->2->2->1
        // System.out.println(ll.checkPalindrome());
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.add(2,3);
        // ll.print();  // 1 -> 2-> 3 -> 4 -> 5
        
        // ll.deletefromEnd(3); 
        // ll.print();

        // ll.reverse();
        // ll.print();
        //int key = 5;
        // System.out.println(ll.Rsearch(3));
        //System.out.println(ll.searchkey(9));

        // ll.removeFirst();
        // ll.print();

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // ll.head = new Node(1);
        // ll.head.next = new Node(1);
        
    }
}