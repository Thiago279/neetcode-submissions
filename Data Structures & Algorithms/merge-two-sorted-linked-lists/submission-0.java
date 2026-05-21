/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // condição de parada: node1.next!= null && node2.next != null
        ListNode node1 = list1;
        ListNode node2 = list2;
        ListNode res = null;
        ListNode resHead= null;
        
        if(list1 == null){
            return list2;
        }else if (list2 == null){
            return list1;
        }
        
        //keep track of head of result
        if (node1.val > node2.val){
            res = node2;
            node2 = node2.next;
        }else{
            res = node1;
            node1 = node1.next;
        }
        resHead = res;
        //loop ate o final das duas ou final da primeira? 
        //resposta: ate o final da primeira!! 
        //nao precisamos loopar o resto da lista que faltou
        while(node1 != null && node2 != null){
            if (node1.val > node2.val){
                res.next = node2;
                node2 = node2.next;
            }else{
                res.next = node1;
                node1 = node1.next;
            }
            res = res.next;
        }
        if (node1 == null){
            res.next = node2;
        }else{
            res.next = node1;
        }
            
        return resHead;
    }
}