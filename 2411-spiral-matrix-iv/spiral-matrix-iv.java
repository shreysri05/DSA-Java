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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int [][]arr= new int [m][n];
        int x=-1;
       int firstrow=0, firstcolumn=0, lastrow=m-1, lastcolumn=n-1;
       while(firstrow<=lastrow && firstcolumn<=lastcolumn){
         
        for (int j=firstcolumn;j<=lastcolumn;j++)
        {if (head!=null) {x = head.val; head=head.next;}
         else  x =-1;
            arr[firstrow][j]=x;
            
        } firstrow++;
        if(firstrow<=lastrow && firstcolumn<=lastcolumn){
            for(int i =firstrow;i<=lastrow;i++){
                if (head!=null) { x = head.val; head=head.next;}
                else  x =-1;
                arr[i][lastcolumn]=x;
               
            }}
        lastcolumn--;
        
         if(firstrow<=lastrow && firstcolumn<=lastcolumn)
         {
            for (int j=lastcolumn;j>=firstcolumn;j--)
            {
                if (head!=null){ x = head.val; head=head.next;}
                else  x =-1;
            arr[lastrow][j]=x;
          
            }} lastrow--;
         if(firstrow<=lastrow && firstcolumn<=lastcolumn){
            for(int i =lastrow;i>=firstrow;i--){
                if (head!=null)  {x = head.val; head=head.next;}
                else x =-1;
                arr[i][firstcolumn]=x;
                
            }}
        firstcolumn++;
       }  return arr;
    }
}