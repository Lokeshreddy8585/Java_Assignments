package Class4;

public class Class4Q1 {
    public static void main(String args[]){
        int a[][]={{1,2,3},{2,6,7},{9,7,3}};
    int b[][]={{4,1,5},{3,2,2},{4,3,4}};

    //creating another matrix to store the multiplication of 2 matrices
    int c[][]=new int[3][3];  //3*3

//multiplying of 2 matrices
for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            c[i][j]=0;
            for(int k=0;k<3;k++)
            {
                c[i][j]+=a[i][k]*b[k][j];
            }//end of k loop
            System.out.print(c[i][j]+" ");
        }//end of j loop
        System.out.println();
    }

        }}
