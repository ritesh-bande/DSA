class Solution {
    public int firstSearch(int[] arr, int k) {
        // Code Here
        int n=arr.length;
        int l=0;
        int h=n-1;
        int idx=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(arr[mid]>k){
                h=mid-1;
            }
            else if(arr[mid]<k){
                l=mid+1;
            }
            else{
                idx=mid;
                h=mid-1;
            }
        }
        return idx;
    }
}
