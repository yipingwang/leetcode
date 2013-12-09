/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists.size()==0)return null;
    
        PriorityQueue<ListNode> heap=new PriorityQueue<ListNode>(lists.size(),
        new Comparator<ListNode>()
        {
            public int compare(ListNode n1, ListNode n2)
            {
                if(n1.val<n2.val)return -1;
                if(n1.val==n2.val)return 0;
                return 1;
            }
        });
    
        //initial , k heads
        // current->
        //each loop: extract min, add min.next, if null continue extract
    
        for(int i=0;i<lists.size();i++)
        {
            if(lists.get(i)!=null)heap.add(lists.get(i));
            else
            {
                lists.remove(i);
                i--;
            }
        }
    
        ListNode current=new ListNode(0);
        ListNode head=current;
        int k=heap.size();
    
    
        while(heap.size()!=0)
        {
            current.next=heap.poll();
            current=current.next;
        
            if(current.next!=null)heap.offer(current.next);
        
        }
        return head.next;
    }
}
