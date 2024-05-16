import java.util.Scanner;

public class boyut {

	public static void main(String[] args) {
		int arr1[][]= {{3,6,2},{10,22,33}};
		int i,j;
		for( i=0;i<2;i++)
		{
			for(j=0;j<3;j++) {
				System.out.printf("%d.satırın %d. elemani=%d\n",i+1,j+1,arr1[i][j]);
			}
		}
		
		int arr2[][]= new int[2][2];
		Scanner scanner = new Scanner(System.in);
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.printf("lutfen %d satırın %d. elemanını giriniz:",i+1,j+1);
				arr2[i][j]=scanner.nextInt();
				
			}
		}
		for(i=0;i<2;i++)
		{
			for(j=0;j<2;j++)
			{
				System.out.printf("%d. satırın %d. elemanı=%d\n",i,j,arr2[i][j]);
			}
		}

	}

}
