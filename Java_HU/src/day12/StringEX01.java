package day12;

import java.util.Arrays;

public class StringEX01 {

	public static void main(String[] args) {
		//char charAt(index) : 문자열의 index번지 문자를 반환
		String str = "Hello World";
			System.out.println(str + "의 3번째 문자 : " + str.charAt(2));
		//boolean equals(Object obj) : 문자열이 같은지를 반환
		String str2 = "Hello World";
			System.out.println(str + "와" + str2 + "는 같나요? " + str.equals(str2));
		//int indexOf(문자열) : 문자열의 시작번지를 반환, 없으면 -1
			System.out.println(str + "에서 world의 시작 번지는? " + str.indexOf("world"));
		//boolean contains(문자열) : 문자열이 있는지 없는지 반환
			System.out.println(str + "에서 world가 있습니까? " + str.contains("world"));
		//String replace(찾을 문자열, 교체할 문자열) : 문자열에서 찾을 문자열을 찾아서 교체할 문자열로 바꾼 후 반환
			System.out.println(str + "에서 o를 찾아서 0으로 수정 : " + str.replace("o", "0"));
			System.out.println("수정한 후 str : " + str);
		//String substring(시작번지) : 시작번지부터 부분 문자열을 추출
		//String substring(시작번지, 끝번지) : 시작번지부터 끝번지 전까지 부분 문자열을 추출(끝번지 포함 X)
			System.out.println(str + "에서 6번지부터 부분 문자열 : " + str.substring(6));
			System.out.println(str + "에서 6번지부터 10번지 전까지 부분 문자열 : " + str.substring(6, 10));
			//substring에서 끝번지는 포함하지 않음 EX 6, 10을 지정했다면 6~9까지만 문자열로 나옴
		//String toLowerCase() : 소문자로
		//String toUpperCase() : 대문자로
			System.out.println(str + "을 소문자로" + str.toLowerCase());
			System.out.println(str + "을 대문자로" + str.toUpperCase());
		//String trim() : 첫문자 앞 공백과 마지막 문자 뒤 공백을 제가한 문자열을 반환
			String str3 = "안녕하세요.                     리뷰입니다.                      \n";
			System.out.println(str3.trim());
		//String valueOf(기본자료형) : 기본 자료형을 문자열로 반환
			String str4 = String.valueOf(1);//String str4 = "" + 1;과 같음
			System.out.println(str4);
			String str5 = String.valueOf(true);//String str5 = "" + true;
			System.out.println(str5);
			
		//String [] split(정규표현식) : 정규표현식을 기준으로 문자열을 추출하여 배열로 반환
			String fruit = "오랜지, 사과, 바나나, 수박, 복숭아";
			String [] fruits =fruit.split(",");
			System.out.println(Arrays.toString(fruits));
	}

}
