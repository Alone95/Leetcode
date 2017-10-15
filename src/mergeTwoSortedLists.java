/**
 * Created by alone95 on 2017/10/15
 */
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
 }
public class mergeTwoSortedLists {

    /**
     * Merge two sorted linked lists and return it as a new list.
     * The new list should be made by splicing together the nodes of the first two lists.
     * 合并两个已排序的链表并将其返回为新列表。新的列表应该由前两个列表的节点拼接而成。
     */

    //递归
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<l2.val){
            l1.next =mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    /**
     *
     * 1）判断l1和l2是否存在空链表，有空链表就可以直接返回。

       2）找出l1和l2中最小的结点，作为新链表的表头结点。

       3）然后依次比较遍历l1和l2，将较小的结点插入在新链表的后面。

     */
    public ListNode mergeTwoLists2(ListNode l1,ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1==null&&l2==null) return null;

        /** l1和l2均为非空 */
        ListNode p1 =l1;
        ListNode p2 =l2;
        //先找到最小的节点作为新链表的头
        ListNode head =null;
        if(l1.val<l2.val){
            head =l1;
            p1 =p1.next;
        }
        else{
            head =l2;
            p2= p2.next;
        }
        //新链表的指针
        ListNode p =head;
        while (p1!=null&&p2!=null){
            if(p1.val<p2.val){
                p.next =p1;
                p =p.next;
                p1 =p1.next;
            }
            else{
                p.next=p2;
                p =p.next;
                p2= p2.next;
            }
        }
        if(p1==null&&p2==null)
            return head;
        else if(p1==null&&p2!=null)
            p.next=p2;
        else if(p2==null&&p1!=null)
            p.next=p1;
        return head;
    }



}
