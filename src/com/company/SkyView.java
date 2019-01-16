package com.company;

public class SkyView {
    private double[][]view;
    public SkyView(int numRows,int numCols,double[] scanned){
        view=new double[numRows][numCols];
        int x=0;
        for(int n=0;n<numRows;n++){
            if(n%2==0){
                for(int i=0;i<numCols;i++){
                    view[n][i]=scanned[x];
                    x++;
                }
            }else{
                for(int j=numCols-1;j>-1;j--){
                    view[n][j]=scanned[x];
                    x++;
                }
            }
        }
    }
    public double getAverage(int startRow, int endRow,int startCol,int endCol){
        double sum=0;
        int x=0,y=0;
        for(int n=startCol;n<endCol;n++){
            for (int i=startRow;i<endRow;i++){
                sum+=view[i][n];
                y++;
            }
            x++;
        }
        return sum/(x*y);
    }
}
