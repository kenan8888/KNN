import java.util.Arrays;

public class SellectionSortTask {
    public static void main(String[] args) {

        int[] myArray = {9, 8, 7, 7, 9, 6, 5, 4};

        System.out.println("verilen array:\n "+Arrays.toString(myArray)+"\n ");

        for (int i=0;i<myArray.length-1;i++){
            int balacaIndex=i;

            for (int j=i+1;j<myArray.length;j++){
                if (myArray[balacaIndex]>myArray[j]){
                    balacaIndex=j;
                }
            }

            int s=myArray[i];
            myArray[i]=myArray[balacaIndex];
            myArray[balacaIndex]=s;
            System.out.println(Arrays.toString(myArray));
        }


    }
}
