package org.example;
public class SearchNumber {
    public Boolean searchInArray(int[] array, int n) {
        for(int i = 0; i < array.length; i++){
            if(array[i] == n){
                return true;
            }
        }
        return false;
    }


    public boolean searchInArray2D(int[][] array, int n){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == n){
                    return true;
                }
            }
        }
        return false;
    }
}
