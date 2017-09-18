public class Spaces{
	public static void str(String stri){
		char [] replaced = new char[stri.length()];
		char [] temp = new char [stri.length()];
		int n = 0,aux =0;
		for (int i = 0;i < stri.length() ;i++ ) {
			replaced[i] = stri.charAt(i);
			temp[i] = stri.charAt(i);
		}

		for (int i = 0;i<stri.length(); i++ ) {
			if( i+1 < stri.length() && (temp[i] == ' ' && temp[i+1] != ' ')){
				n++;
			}
		}

		int [] location = new int[n];
		int l=0;

		for (int i = 0; i < stri.length() ; i++ ) {
			if(i+1 < replaced.length)
				if( replaced[i] == ' ' && replaced[i+1] != ' '){
					location[l]= i+1;
					l++;
				}
		}

		int counterLocation = 0 ;
		for (int i = 0;i < stri.length() ;i++ ) {
			if (replaced[i] ==' ' ) {
				replaced[i]='%';
				replaced[++i]='2';
				replaced[++i]='0';
				i++;
				aux = i;
				for (int j =location[counterLocation]; j< replaced.length-(n*n) ;j++ ) {
					replaced[aux] = temp[j];
					aux++;
				}
				counterLocation++;
			}
		}
		for (int i=0;i < stri.length() ;i++ ) {
			System.out.print(replaced[i]);
		}
		System.out.println();
	}
	public static void main(String[] args) {
		System.out.println("Input :Mr_john_Smith_ _ _ _");
		System.out.println("Output: ");
		str("Mr john Smith    ");
	}
}
