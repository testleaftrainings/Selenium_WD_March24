package week5.day4;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurance {
public static void main(String[] args) {
	String text="aabbcdiiizzzzz";
	//a-->2 b->2,c->1,d->1,i->3,z->5
	
	//convert the string into char array
	char[] charArray = text.toCharArray();
	
	Map<Character, Integer> characterOccurance=new LinkedHashMap<Character, Integer>();
	for (int i = 0; i < charArray.length; i++) {
		if(characterOccurance.containsKey(charArray[i])) {
			Integer integer = characterOccurance.get(charArray[i]);
			int newValues=integer+1;
			characterOccurance.put(charArray[i], newValues);
			
		}else {
			characterOccurance.put(charArray[i], 1);
		}
	}
	System.out.println(characterOccurance);
}
}//aravindchennai
// a-->3,r-1