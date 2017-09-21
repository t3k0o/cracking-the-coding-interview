public class OneSeven{
	public static void fillWithZero(int [][] matriz,int x, int y){
		int count = 0 ;
		for (int i=0; i < matriz.length; i++) {
  			for (int j=0; j < matriz[i].length; j++) {
    			if(matriz[i][j] == 0)
    				count ++;
 			}
		}
		int [] position = new int [count*2];
		int aux=0;
		for (int i=0; i < matriz.length; i++) {
  			for (int j=0; j < matriz[i].length; j++) {
    			if(matriz[i][j] == 0){
					position[aux]= i;
					position[++aux]= j;
					aux ++;
    			}
 			}
		}
		int n = 0 , m = 0;
		for (int i = 0; i < position.length ;i++ ) {

			n = position[i];
			m = position[i+1];
			i++;

			for (int l = n;l >= 0 ;l-- ) 
				matriz[l][m]=0;
			for (int l = n;l < matriz.length ;l++ )
				matriz[l][m]=0;
			for (int k = m;k >=0 ;k-- )
				matriz[n][k]=0;
			for (int k = m;k <matriz[y-1].length ;k++ )
				matriz[n][k]=0;
		}

		//printing
		for (int ii= 0;ii < matriz.length ;ii++ ){ 
			for (int jj= 0;jj < matriz[ii].length ;jj++ )
				System.out.print(matriz[ii][jj]);
			System.out.println();
		}

	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int [][] matriz  = new int [n][m];

		for (int i=0; i < matriz.length; i++) {
  			for (int j=0; j < matriz[i].length; j++) {
    			matriz[i][j] = (int) (Math.random()*9);
 			}
		}
		for (int i=0; i < matriz.length; i++) {
  			for (int j=0; j < matriz[i].length; j++) {
    			System.out.print(matriz[i][j]);
 			}
 			System.out.println();
		}
		System.out.println();
		fillWithZero(matriz,n,m);
	}
}
