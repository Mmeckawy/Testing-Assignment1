public class watermelon {
    public String divide_watermelon(int w){
        int i,j;
        int sum=0;

        if(w<1 || w>100){
            System.out.print("Invalid input!");
        }
        if(w>0 && w<4){
            return "NO";
        }

        while(sum<w && (w>=1 && w<=100)){
            for(i =2; i<w; i+=2){
                for(j=2; j<=i; j+=2){
                    sum = i+j;
                    break;
                }
            }
        }

        if(sum==w){
            return "YES";
        }
        else{
            return "NO";
        }
    }
}


