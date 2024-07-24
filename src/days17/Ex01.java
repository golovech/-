package days17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

/**
 * @author kenik
 * @date 2024. 7. 23. - 오전 6:49:04
 * @subject
 * @content
 *
 */
public class Ex01 {

	public static void main(String[] args) {

		String fileName = "SS21_Team.txt";

		String myName = "이시훈";
	    String teamLeader = null;
	    String teamLine = null;
	    String teamMemberLine = null;
	    String [] teamMember = null;  // 팀원들 저장할 배열
	    String regex = "\\s*,\\s*";

	    String key = "user.dir";
	    String userDir = System.getProperty(key);
	    // System.out.println( userDir );

	    fileName = String.format("%s\\src\\days17\\%s", userDir, fileName );
	    // System.out.println(fileName);

	    try (
	    	   FileReader reader = new FileReader(fileName);
	    	   BufferedReader br = new BufferedReader(reader);
	        ){

	    	 while( ( teamLine = br.readLine() ) != null  ) {
	    		 teamMemberLine = br.readLine();
	    		 if( teamMemberLine.contains(myName) ) {
	    			 break;
	    		 } // if
	    	 } // while

	    	 //System.out.println(teamLine);
	    	 //System.out.println(teamMemberLine);
	    	 teamMember = teamMemberLine.split(regex);
	    	 String prefix = "[팀장]";
	    	 for (int i = 0; i < teamMember.length; i++) {
				if( teamMember[i].trim().startsWith(prefix))
					teamLeader = teamMember[i].trim().replace(prefix, "");
			 } //
	    	 //System.out.println(teamLeader);
	    	 // 나머지 팀원들을 내림차순으로 정렬.
	    	 String [] temp = new String[teamMember.length -1 ];
	    	 System.arraycopy(teamMember, 1, temp, 0, teamMember.length-1);
	    	 //System.out.println(Arrays.toString(temp));
	    	 Arrays.sort(temp);
	    	 //System.out.println(Arrays.toString(temp));
	    	 System.arraycopy(temp, 0, teamMember, 1, temp.length);
	    	 //System.out.println(Arrays.toString(teamMember));
	    	 /*
	    	 [ 2조 ]
	    			 <ul>
	    			 	<li class="leader">박우현</li>
	    			 	<li>이동찬</li>
	    			 	<li>윤형준</li>
	    			 	<li>유진</li>
	    			 	<li>원대안</li>
	    			 </ul>
	    	*/
	    	Arrays.sort(temp, (s1,s2)-> s2.compareTo(s1));

	    	StringBuilder sb = new StringBuilder(teamLine+"\n");
	    	sb.append("<ul>\n");
	    	sb.append("\t<li class=\"leader\">"+teamLeader+"</li>\n");
	    	sb.append("\t<li>" );
	    	sb.append( String.join("</li>\n\t<li>", temp) );
	    	sb.append("</li>\n</ul>\n");


	    	System.out.println(sb.toString());


		} catch (Exception e) {
			// TODO: handle exception
		}


	} // main

} // class








