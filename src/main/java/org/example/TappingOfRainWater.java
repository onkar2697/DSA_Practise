package org.example;

public class TappingOfRainWater {
    public int tapWater(int[] height) {
        int n =  height.length;
        int[] lmax = new int[n]; // from left time take all the max height
        int[] rmax = new int[n];  // from right to left take all max height

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, height[i]);
            lmax[i] = max;
        }

        int mx  = Integer.MIN_VALUE;
        for(int i=n-1;i>0;i--){
            mx = Math.max(mx, height[i]);
            rmax[i] = mx;
        }

        int ans =0;
        for(int i=0; i<n; i++){
            if(height[i]<rmax[i] && height[i]<lmax[i]){
                ans += Math.min(lmax[i],rmax[i])-height[i];
            }
        }
        return ans;
    }
}
