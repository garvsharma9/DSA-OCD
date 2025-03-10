class pairwithmaxsum {
    public:
      int pairWithMaxSum(vector<int> &arr) {
         int  n=arr.size();
            int msum=-1;
      for (int i=0;i<n-1;i++){
          int mini=min(arr[i],arr[i+1]);//smallest 
          int mini2=max(arr[i],arr[i+1]);//second smallest
          msum=max(msum,mini+mini2);
          for(int j=i+2;j<n && arr[j]<mini2;j++){
              if(arr[j]<mini){
                  mini2=mini;
                  mini=arr[j];
              }
              int sum=mini+mini2;
              msum=max(msum,sum);   }
      }
      return msum;
      }
  };
  