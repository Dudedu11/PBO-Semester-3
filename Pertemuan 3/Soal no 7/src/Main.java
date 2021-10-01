public class Main {
    public static void main(String[] args) {
//One Dimensional Arrays
        int[] fisrtArray = {2, 5, 3};
        int[] secondArray = {9, 5, 3};
        int[] thirdArray = {2, 4, 9};
        int[] fourthArray = {10, 11, 12};
        int[] fifthArray = {13, 14, 15};
        int[] sixthArray = {16, 17, 18};
        int[] seventhArray = {19, 20, 21};
        int[] eighthArray = {22, 23, 24};
        int[] ninthArray = {25, 26, 27};
//Two Dimensional Arrays
        int[][] twoDimensionalArray1 = {fisrtArray, secondArray,
                thirdArray};
  //      System.out.println(twoDimensionalArray1[0][0]);
        int[][] twoDimensionalArray2 = {fourthArray, fifthArray,
                sixthArray};
        int[][] twoDimensionalArray3 = {seventhArray, eighthArray,
                ninthArray};
//Three Dimensional Array
        int[][][] threeDimensionalArray = {twoDimensionalArray1,
                twoDimensionalArray2, twoDimensionalArray3};
//        System.out.println(threeDimensionalArray[1][2][2]);
        int i,j,k;
        for (i=0;i<3;i++){
            System.out.printf("{");
            for (j=0;j<3;j++){
                System.out.printf("{");
                for (k=0;k<3;k++){
                    System.out.printf("%d ", threeDimensionalArray[i][j][k]);
                    if (k == 2){
                        System.out.printf("} ");
                        if((i == 0) && (j == 2) && (k ==2)){
                            System.out.println("}");
                    }
                        if((i == 1) && (j == 2) && (k ==2)){
                            System.out.println("}");
                        }
                        if((i == 2) && (j == 2) && (k ==2)){
                            System.out.println("}");
                        }
                    }
                }
            }
        }
    }
}
