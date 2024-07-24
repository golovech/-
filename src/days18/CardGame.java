package days18;

import java.util.Random;
import java.util.Scanner;

public class CardGame {

	public static Scanner input = new Scanner(System.in);
	   
	   public static int HEIGHT = 11;
	   public static int WIDTH = 7;   
	   public static String [] cardNumber = {"２","３","４","５","６","７","８","９","10","Ｊ","Ｑ","Ｋ","Ａ"};
	   public static String [] cardStyle  = {"♠","◆","♥","♣"};
	   public static int [] cardRandom;

	   public static void main(String[] args)
	   {   
	      String [][][] poCard = new String[4][HEIGHT][WIDTH];
	      String [][][] ranCard;
	      
	      // 카드 디자인 빈칸 초기화.
	      poCard = initialization(poCard);
	      
	      int numCards = 0;
	      while(true)
	      {
	         cardMenu();
	         int sw = chooseMenu();
	         
	         switch (sw) 
	         {
	         case 1:
	            numCards = howCard();
	            ranCard = new String [numCards][HEIGHT][WIDTH];
	            ranCard = initialization(ranCard);
	            ranCard = designCard(ranCard);
	            cardRandom(numCards);
	            dispRanCard(ranCard);            
	            break;
	         case 2:   
	            poCard = designCard(poCard);
	            poCard = patternDesignCard(poCard);      
	            dispAllCard(poCard);   
	            break;
	         default:
	            break;
	         }
	      }
	   }

	   private static String[][][] initialization(String[][][] ranCard) 
	   {
	      for (int i = 0; i < ranCard.length; i++) 
	         for (int j = 0; j < ranCard[i].length; j++) 
	            for (int k = 0; k < ranCard[i][j].length; k++) 
	               ranCard[i][j][k]="　";
	      return ranCard;
	   }
	   private static void dispRanCard(String[][][] ranCard) 
	   {
	      for (int k = 0; k < ranCard[0].length; k++) 
	      {
	         for (int i = 0; i < cardRandom.length; i++) 
	         {
	            ranCard[i][2][1]            = cardStyle[(cardRandom[i]-1)/13];
	            ranCard[i][HEIGHT-3][WIDTH-2]   = cardStyle[(cardRandom[i]-1)/13];
	            ranCard[i][1][1]            = cardNumber[(cardRandom[i]-1)%13];
	            ranCard[i][HEIGHT-2][WIDTH-2]   = cardNumber[(cardRandom[i]-1)%13];
	            ranCard[i] = innerPattern((cardRandom[i]-1)%13,(cardRandom[i]-1)/13,ranCard[i]);
	            for (int j = 0; j < ranCard[0][i].length; j++) 
	               System.out.printf("%s",ranCard[i][k][j]);            
	         }
	         System.out.println();
	      }      
	   }

	   private static void cardRandom(int numCards) 
	   {
	      cardRandom = new int[numCards];
	      Random rnd = new Random();
	            
	      int idx = 0;
	      while (idx < numCards)
	      {
	         int n = rnd.nextInt(52)+1;
	         if(!dupliLotto(n,idx))
	         {
	            cardRandom[idx]=n;
	            idx++;
	         }
	      }
	      idx = 0;
	   }
	   private static boolean dupliLotto(int n, int idx) 
	   {
	      for (int k = 0; k <= idx; k++) 
	         if(n == cardRandom[k])   return true;
	      return false;
	   }
	   private static int howCard() 
	   {
	      System.out.print(" How many Cards ? ");
	      return input.nextInt();
	   }

	   private static int chooseMenu() 
	   {
	      System.out.print(" Choose the Menu - ");
	      return input.nextInt();
	   }
	   private static void cardMenu() 
	   {
	      String [] menus = {"Random Card","All Card","Exit"};
	      
	      System.out.println("\n   -  Menu  -");
	      for (int i = 0; i < menus.length; i++) 
	         System.out.printf("  %d. %s\n",i+1,menus[i]);
	      System.out.println();
	   }

	   private static void dispAllCard(String[][][] poCard) 
	   {
	      for (int i = 0; i < 13; i++) 
	      {
	         for (int j = 0; j < poCard.length; j++) 
	         {
	            poCard[j][1][1]            = cardNumber[i];
	            poCard[j][HEIGHT-2][WIDTH-2]= cardNumber[i];
	            poCard[j] = innerPattern(i,j,poCard[j]);
	         }         
	         dispCard(poCard);
	      }
	   }

	   private static String[][] innerPattern(int i, int j, String[][] poCard) 
	   {
	      poCard = poCardCleaner(poCard);
	      
	      switch (i) 
	      {
	      case 0 :   for (int k = 1; k <= 2; k++) 
	                  poCard[4*k-1][3]=cardStyle[j];
	               break;
	      
	      case 1 :   for (int k = 1; k <= 3; k++)
	                  poCard[2*k+1][3]=cardStyle[j];
	               break;
	      
	      case 2 :   for (int k = 1; k <= 2; k++) 
	                  for (int l = 1; l <= 2; l++) 
	                     poCard[4*k-1][2*l] = cardStyle[j];
	               break;
	                     
	      case 3 :   for (int k = 1; k <=2 ; k++)
	                  for (int l = 1; l <=2 ; l++)
	                     poCard[4*k-1][2*l] = cardStyle[j];
	               poCard[5][3]=cardStyle[j];         
	               break;
	      
	      case 4 :   for (int k = 1; k <= 3; k++) 
	                  for (int l = 1; l <= 2; l++) 
	                     poCard[2*k+1][2*l] = cardStyle[j];                  
	               break;
	      
	      case 5 :   for (int k = 1; k <= 3; k++) 
	                  for (int l = 1; l <= 2; l++) 
	                     poCard[2*k+1][2*l] = cardStyle[j];   
	               poCard[4][3] = cardStyle[j];
	               break;
	      
	      case 6 :   for (int k = 1; k <= 2; k++) 
	                  for (int p = 1; p <= 4 ; p++) 
	                     poCard[p*2][k*2] = cardStyle[j];                                             
	               break;
	                                                
	      case 7 :   for (int k = 1; k <= 2; k++) 
	                  for (int p = 1; p <= 4 ; p++) 
	                     poCard[p*2][k*2] = cardStyle[j];   
	               poCard[5][3] = cardStyle[j];
	               break;
	                  
	      case 8 :   for (int k = 1; k <= 2; k++) 
	                  for (int p = 1; p <= 4 ; p++) 
	                     poCard[p*2][k*2] = cardStyle[j];   
	               poCard[3][3] = cardStyle[j];
	               poCard[7][3] = cardStyle[j];
	               break;
	                  
	      case 9 :   poCard[2][3]="Ｊ";
	               poCard[4][3]="Ａ";
	               poCard[6][3]="Ｃ";
	               poCard[8][3]="Ｋ";
	               break;
	               
	      case 10:   poCard[3][3]="Ｑ";
	               poCard[4][3]="Ｕ";
	               poCard[5][3]="Ｅ";
	               poCard[6][3]="Ｅ";
	               poCard[7][3]="Ｎ";
	               break;
	               
	      case 11:   poCard[2][3]="Ｋ";
	               poCard[4][3]="Ｉ";
	               poCard[6][3]="Ｎ";
	               poCard[8][3]="Ｇ";
	               break;
	      
	      case 12:   poCard[5][3]=cardStyle[j];         break;

	      }
	      return poCard;
	   }

	   private static String[][] poCardCleaner(String[][] poCard) 
	   {
	      for (int l = 2; l < HEIGHT-2; l++) 
	         for (int k = 2; k < WIDTH-2; k++) 
	            poCard[l][k]="　";
	      return poCard;
	   }
	   private static String[][][] patternDesignCard(String[][][] poCard) 
	   {
	      for (int i = 0; i < poCard.length; i++) 
	      {
	         poCard[i][2][1]            = cardStyle[i];
	         poCard[i][HEIGHT-3][WIDTH-2]= cardStyle[i];                  
	      }
	      return poCard;
	   }
	   private static String[][][] designCard(String[][][] poCard) 
	   {
	      for (int i = 0; i < poCard.length; i++) 
	      {
	         poCard[i][0][0]          = "┌";
	         poCard[i][0][WIDTH-1]       = "┐";
	         poCard[i][HEIGHT-1][0]       = "└";
	         poCard[i][HEIGHT-1][WIDTH-1]= "┘";
	         for (int j = 1; j < HEIGHT-1; j++) 
	            poCard[i][j][0] = "│";
	         for (int j = 1; j < HEIGHT-1; j++) 
	            poCard[i][j][WIDTH-1] = "│";
	         for (int j = 1; j < WIDTH-1; j++) 
	            poCard[i][0][j] = "─";
	         for (int j = 1; j < WIDTH-1; j++) 
	            poCard[i][HEIGHT-1][j] = "─";         
	      }
	      return poCard;
	   }
	   private static void dispCard(String[][][] poCard) 
	   {
	      for (int i = 0; i < poCard[0].length; i++) 
	      {
	         for (int j = 0; j < poCard.length; j++) 
	            for (int k = 0; k < poCard[0][i].length; k++) 
	               System.out.printf("%s",poCard[j][i][k]);
	         System.out.println();
	      }      
	   }

}
