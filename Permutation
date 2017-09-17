public class IsPermutation{

	public static boolean permutation(String str1, String str2){
		boolean flag = false;
		if(str1.length() == str2.length()){
			for (int i = 0;i < str1.length() ;i++ ) {
				for (int j = 0;j < str2.length() ;j++ ) {
					if (str2.indexOf(j+1) < str2.length()) {
						if (str1.charAt(i) == str2.charAt(j)) {
							flag = true;
							continue;
						}
					}else{
						flag = false;
						break;
					}
				}
			}
		}

		return flag;
	}
	public static void main(String[] args) {
		System.out.println("El resultado es :"+permutation("armonización","romanización"));
	}
}
