class Solution {
    public int lcm(int a, int b) {
        // code here
          int hcf=1;
              for(int i=2;i<=Math.min(a,b);i++){
                  if(a%i==0 && b%i==0){
                      hcf=Math.max(hcf,i);
                  }
              }
              return (a*b)/hcf;
    }
}
