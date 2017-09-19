public class Compression{
	public static void compre(String str){
		StringBuilder sb = new StringBuilder();
		int counter = 0;

		for (int i = 0 ;i< str.length() ;i++ ) {
			if(i+1 < str.length()){
				if (str.charAt(i) == str.charAt(i+1)){
					counter++;
				}else{
					counter ++;
					sb.append(str.charAt(i));
					sb.append(String.valueOf(counter));
					counter =0;
				}
			}else{
				counter ++;
				sb.append(str.charAt(i));
				sb.append(String.valueOf(counter));
			}
		}
		if(sb.length() < str.length())
			System.out.println(sb);
		else
			System.out.println(str);
	}
	public static void main(String[] args) {
		compre("aabcccccaaa");
	}
}
