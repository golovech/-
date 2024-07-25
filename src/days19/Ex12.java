package days19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author love
 * @date 2024. 7. 25. - 오후 4:30:21
 * @subject 		[ Map ]
 * @content		1. key + value == Entry
 * 				2. key 중복 x / value 중복 o
 * 				3. HashMap 	  / HashTable (구)
 *				4. 해싱 (Hashing) 이란?
 *					- 해시함수를 사용하여 해시 테이블에 data를 저장하고, 검색하는 기법.
 *					- 해시함수란?
 *					  데이터를 저장하는 곳을 알려주는 함수.
 *					  데이터를 빠르게 검색 가능. (hash = 검색)
 *
 *				예)
 *					[2022 일기] - [1월][2월]. . .[12월]
 *					[2023 일기] - [1월][2월]. . .[12월]
 *					[2024 일기] - [1월][2월]. . .[12월]. .... . . .   . ...
 *					해싱을 사용하기 때문에, 많은 데이터도 금방 읽어올 수 있다.
 *
 */
public class Ex12 {

	public static void main(String[] args) {
		
		// 		  id    value
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("admin", "관리자");
		hm.put("hong", "홍길동");
		hm.put("love", "최사랑");
		
		Set<Entry<String, String>> es = hm.entrySet();
		Iterator<Entry<String, String>>  ir = es.iterator();
		while (ir.hasNext()) {
			Entry<String,String> entry = (Entry<String, String>) ir.next();
			System.out.printf("%s=%s\n",entry.getKey(), entry.getValue());
			
		}
		
		

//		System.out.println(hm);
//		System.out.println(hm.size()); // 엔트리의 갯수
//		
//		// 1. 모든 key 조회
//		Set <String> keys = hm.keySet(); 
//		Iterator<String> ir = keys.iterator(); // iterator 사용할 때는 Iterator<String>을 앞에 붙이자.
//		while (ir.hasNext()) {
//			String key = ir.next();
//			System.out.printf("%s=%s\n", key, hm.get(key));
//		}
//		
//		Collection<String> values = hm.values();
//		Iterator<String> ir2 = keys.iterator(); // iterator 사용할 때는 Iterator<String>을 앞에 붙이자.
//		while (ir2.hasNext()) {
//			String value = ir2.next();
//			System.out.printf("%s\n", value);
//		}
		
		
	
		
		
	} // main

} // class
