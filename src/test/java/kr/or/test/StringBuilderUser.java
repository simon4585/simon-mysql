package kr.or.test;

public class StringBuilderUser {

	public static void main(String[] args) {
		String str="";
		for(int cnt=1; cnt<=100; cnt++) {
			//str + = cnt;
			str=str+cnt;
			//문자열하고 숫자 더하면 문자열이 된다.
		}
        System.out.println(str);
        
        StringBuilder sb = new StringBuilder();
        for(int cnt=1; cnt<=100; cnt++) {
        	sb.append(cnt);       	
        }
        str = sb.toString();
        System.out.println(str);
	}

}
