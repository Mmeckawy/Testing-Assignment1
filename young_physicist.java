import java.util.Scanner;

public class young_physicist {
    public String isEquilibrium(int[][] array, int n){
        int sum=0;
        Scanner in = new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                sum += array[i][j];
            }
        }
        if(sum==0) return "YES";
        else return "NO";
    }
}
