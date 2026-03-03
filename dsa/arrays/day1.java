import java.util.*;

public class day1 {
    public static void update(int marks[],int mau){
        mau=mau+5;
         System.out.println(mau);
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1;
           
      }
    }

    //Linear Search 

    public static int linearSearch(int marks[],int key){
     for(int i=0;i<marks.length;i++){
          if(marks[i]==key){
            return i;
          }
          
      }
      return -1;
        
    }
    
    public static int getLargestElement(int marks[]){
    
       int largest=Integer.MIN_VALUE;
        for(int i=0;i<marks.length;i++){
          if(largest<marks[i]){
            largest=marks[i];
          }
        }
        return largest;
    }

    public static int getSmallestElement(int marks[]){
      int smallest=Integer.MAX_VALUE;
      for(int i=0;i<marks.length;i++){
          if(smallest>marks[i]){
           smallest=marks[i];
          }
        }
        return smallest;
    }
     
    public static int binarySearch(int marks[],int key){
       int start=0,end=marks.length-1;
       while(start<=end){
        int mid=(start+end)/2;
        if(marks[mid]==key){
          return mid;
        }
        if(marks[mid]<key){
          start=mid+1;
        }
        else{
          end=mid-1;
        }
       }
       return -1;
    }

    public static void reverseArray(int marks[]){
      int start=0,end=marks.length-1;
      while (start<end) {
        int temp=marks[end];
        marks[end]=marks[start];
        marks[start]=temp;
        start++;
        end--;
      }
    }

    public static void printPairs(int marks[]){
      int totalPairs=0;
      for(int i=0;i<marks.length;i++){
        for(int j=i+1;j<marks.length;j++){
          System.out.print("("+marks[i]+","+marks[j]+")");
          totalPairs++;

        }
        System.out.println();
      }
      System.out.println(totalPairs);
    }
  
  public static void printSubarrays(int marks[]){
    int ts=0;
    for(int i=0;i<marks.length;i++){
      for(int j=i;j<marks.length;j++){
        for(int k=i;k<=j;k++){
          System.out.print(marks[k]+" ");
          
        }
        ts++;
        System.out.println();
      }
      System.out.println();
    }
    System.out.println(ts);
  }

   public static void printMaxSubArraySum(int marks[]){
    int maxsum=Integer.MIN_VALUE;
    int currsum=0;
    for(int i=0;i<marks.length;i++){
      for(int j=i;j<marks.length;j++){
           currsum=0;
        for(int k=i;k<=j;k++){
          currsum=currsum+marks[k];
          
        }
        if(maxsum<currsum){
          maxsum=currsum;
        }
        // ts++;
        ;
      }
      
    }
    System.out.println(maxsum);
  }


  public static void kadanes(int marks[]){
    int ms=Integer.MIN_VALUE;
    int cs=0;
    for(int i=0;i<marks.length;i++){
      cs=cs+marks[i];
      if(cs<0){
        cs=0;
      }
      ms=Math.max(cs,ms);
    }
    System.out.println(ms);
    
  }






 public static int trappedRainWater(int height[]) {

    int n = height.length;

    // Left max boundary
    int leftmax[] = new int[n];
    leftmax[0] = height[0];

    for (int i = 1; i < n; i++) {
        leftmax[i] = Math.max(height[i], leftmax[i - 1]);
    }

    // Right max boundary
    int rightmax[] = new int[n];
    rightmax[n - 1] = height[n - 1];

    for (int i = n - 2; i >= 0; i--) {
        rightmax[i] = Math.max(height[i], rightmax[i + 1]);
    }

    // Calculate trapped water
    int trappedRainWater = 0;

    for (int i = 0; i < n; i++) {
        int waterLevel = Math.min(leftmax[i], rightmax[i]);
        trappedRainWater += waterLevel - height[i];
    }

    return trappedRainWater;
}





    public static void main(String[] args) {
      //  int marks[]={2,4,6,8,10,12};
       int height[]={4,2,0,6,3,2,5};
       
 //  printSubarrays(marks);
      //  printSubarrays(marks);
      //  printMaxSubArraySum(marks);
      //  kadanes(marks);
      //  printPairs(marks);
      System.out.println("ANS IS "+trappedRainWater(height));
      
      //  reverseArray(marks);
      // for(int i=0;i<marks.length;i++){
      //     System.out.print(marks[i]+" ");
      // }

      //  System.out.println(binarySearch(marks, key));
      // System.out.println("the largest number is "+getLargestElement(marks));
      // System.out.println("the smallest number is "+getSmallestElement(marks));

      

      //  int mau=10;




      //  int index=linearSearch(marks, key);
      //  if(index==-1){
      //   System.out.println("key not found !!!");
      //  }else{
      //   System.out.println("found at index:"+index);
      //  }



    //  update(marks,mau);
    //  System.out.println(mau);
    //     for(int i=0;i<marks.length;i++){
    //         System.out.print(marks[i]+" ");
    //   }
    //   System.out.println();
      

       
    }
}
