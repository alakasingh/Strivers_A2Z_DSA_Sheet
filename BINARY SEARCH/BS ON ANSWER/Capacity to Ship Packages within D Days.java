Capacity to Ship Packages within D Days
Problem Statement: You are the owner of a Shipment company. You use conveyor belts to ship packages from one port to another. The packages must be shipped within ‘d’ days.
The weights of the packages are given in an array ‘of weights’. The packages are loaded on the conveyor belts every day in the same order as they appear in the array. The loaded weights must not exceed the maximum weight capacity of the ship.
Find out the least-weight capacity so that you can ship all the packages within ‘d’ days.

Examples
Example 1:
Input Format: N = 5, weights[] = {5,4,5,2,3,4,5,6}, d = 5
Result: 9
Explanation: If the ship capacity is 9, the shipment will be done in the following manner:
Day         Weights            Total
1        -       5, 4          -        9
2        -       5, 2          -        7
3        -       3, 4          -        7
4        -       5              -        5
5        -       6              -        6
So, the least capacity should be 9.

Example 2:

Input Format: N = 10, weights[] = {1,2,3,4,5,6,7,8,9,10}, d = 1
Result: 55
Explanation: We have to ship all the goods in a single day. So, the weight capacity should be the summation of all the weights i.e. 55.

code--------------------------------------------------------------------------------------------------------------------------------------------------------------

class Solution {
    public static int findNoOfDay(int weights[] , int capcity){
           //STEP 1(A)- INITIALIZE LOAD AS 0 BECAUSE SHIP IS NO LOADED AT    
                     //START AND DAY IS ONE
           int load=0;
           int day=1;
           int n=weights.length;
           //STEP 1(B)- ITREAT THE LOOP FOR ALL THE WEIGHT
           for(int i=0;i<n;i++){
           //STEP 1(C)- IF SUM OF LOAD AND VALUE OF CURRENT WEIGHT IS GREATER
                       //THAN CAPCITY SO WE WILL ADD DAY AS DAY+1 AND   
                       //INIALIZE LOAD AS NEW WEIGHT OR CURRENT WEIGHT
           if(load+weights[i]>capcity){
               day=day+1;
               load=weights[i];
           }//STEP 1(D)- IF TILL ABOVE CONDITION NOT SATICFIDE ADD THE ALL 
             //WEIGHT IN THE LOAD
           else{
               load+=weights[i];
           }
        }//STEP 1(E)-AFTER ITERATOR ALL THE VALUES WE FOUND OUT OUR DAY     
         //AND JUST RETURN IT
        return day;

    }
    //PROGRAM START HERE
    public int shipWithinDays(int[] weights, int days) {
        //STEP 1-FIND LOWEST CAPCITY OF WEIGHTS
                //FOR EXAMPLE - [1,2,3,4,5,6,7,8,9,10]  
                //ABOVE WEIGHT ARRAY LOWEST CAPCITY IS 10 (ALSO MAX ELEMENT)
                //SO WE CHOOSE IS LOWEST AS 10
                //-WHY WE CHOOSE LOWEST AS 10 WE ALSO CHOOSE 1 OR 2 OR MORE
                //WHY ONLY 10 - IF WE TAKE LOWEST VALUE LESS THAN 10
                //WE ARE NOT ABLE TO SHIPPED 10 WEIGHT OF PACKAGE

        //STEP 2-FIND AT LAST RANGE 
                //SO LAST RANGE POSSIBLE START FROM 10 TO GRATER THAN 10
                //BUT HERE WE FOUND HOW CAPCITY WE REQUIRED TO ALL THE
                //PACKAGES SHIPPED IN ONE DAY
                //FOR THAT WE ADD ALL THE WEIGHT IN ARRAYT
                //WE ALSO USE THIS FORMULA (N*(N+1)/2)FOR CALCULATING sumOfal

        int low=Integer.MIN_VALUE;
        int high=0;
        for(int num : weights){
            if(num>low){
               low=num; 
            }
           high+=num;
        }
        //STEP 3- CHECK THE LOW LESS THAN EQUAL TO HIGH
        while(low<=high){   
        //STEP 4- FIND MID VALUE OF CAPCITY , CHACK FOR LEAST CAPCITY
        int mid=(low+high)/2;
        //STEP 5- CREATE ANOTHER FUNCTION FOR CALCULATING NUMBER 
                  //OF DAY USING ARRAY OF WEIGHT AND MIF(CAPCITY) 
        int numberOfDay = findNoOfDay(weights,mid);
        //STEP 6- NUMBER OF DAY IS LESS THAN TARGET  
        if(numberOfDay <= days){
            //IF YES JUST DECREAS HIGH AS MID-1 BECAUSE WE WANT LEAST 
            high=mid-1;
        }else{
            //IF NO JUST INCREASE LOW AS MID+1 
            low=mid+1;
        }
    }   //STEP 7- WE SIMPLEY  RETURN LOW 
        //WHY HERE RETURN LOW THINK OUT??
        return low;
    }
}
