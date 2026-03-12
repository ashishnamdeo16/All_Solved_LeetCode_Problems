class Solution {
    public String gameResult(ListNode head) {
        ListNode left = head;
        ListNode right = head;
        int even = 0;
        int odd = 0;
        if(head.next == null) return "Even";
        while(true){
             if(left == null || left.next == null){
                break;
            }
            right = left;

            for(int i=0;i<1;i++){
                if(right == null){
                    break;
                }
                right = right.next;
            }

            if(right != null){
                  if(left.val > right.val){
                even++;
            }else{
                odd++;
            }
            }
          
            left = right.next;
        }

        if(even > odd){
            return "Even";
        }else if(odd > even){
            return "Odd";
        }

        return "Tie";
    }
}