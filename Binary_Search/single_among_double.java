class Solution {
    int single(int[] arr) {
        // code here
        int n=arr.length;
        int l=0;
        int r=n-1;
        while(l<r){
            int mid=l+(r-l)/2;
            if(mid%2==1)mid--;
            if(arr[mid]==arr[mid+1]){
                l=mid+2;
            }
            else{
                r=mid;
            }
            
        }
        return arr[l];
    }
}
