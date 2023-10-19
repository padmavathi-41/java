import java.io.*;
public class JaggedArrayDemo{
    public static void main(String args[]){
        int Jarr[][]= new int[3][];
        Jarr[0]=new int[3];
        Jarr[1]=new int[4];
        Jarr[2]=new int[2];
        int count=0;
        for(int i=0;i<Jarr.length;i++){
            for(int j=0;j<Jarr[i].length;j++){
                Jarr[i][j]=count++;
            }
        }
        System.out.println("The elements in Jagged Array are: ");
        for(int i=0;i<Jarr.length;i++){
            for(int j=0;j<Jarr[1].length;j++){
                System.out.println(Jarr[i][j]);
            }
        }
    }
}
