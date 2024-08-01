package days23;

public class Project01 {

   public static void main(String[] args) {
      
      // [ 점수 듀스 ]
      int [] score = { 0,15,30,40,50 }; // 점수. 50점은 advan, deuce에 활용됨
      String [] player = { "김준석","박준용","원충희","이시훈","최사랑" };
      int teamscoreA = 40; // 듀스 상태 점수로 잡아놓음
      int teamscoreB = 40;
      boolean end = false; // 끝나는지점에 true / false값 줌


      for (int scoreA = 0; scoreA <= 40; scoreA++) {
         if (teamscoreA >= 40 && teamscoreB >= 40 
        		 && teamscoreA == teamscoreB) {
            System.out.println("deuce"); // A와 B의 점수가 40과 같거나 크면 듀스를 출력한다.
         } // if
         
         else if (teamscoreA >= 40 && teamscoreB >= 40) {
            if (teamscoreA > teamscoreB ) {
               System.out.println("advan team A");
            } else if (teamscoreB > teamscoreA) {
               System.out.println("advan team B");
            } // else if
         } // if

         if (teamscoreA - teamscoreB >= 2) {
            end = true;
            break;
         } else if (teamscoreB - teamscoreA >= 2) {
            end = true;
            break;
         }
      } // for

   } // main

} // class