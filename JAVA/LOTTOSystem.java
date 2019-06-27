
public class LOTTOSystem extends LOTTO {
	static int count=0;                              // 맞춘갯수
	static int[] answer = new int[7];
	static int bonus = answer[6]; 
	
	
	public static void main(String args[]) {
	  
	  System.out.println("\t이번주 로또 번호는!");
	//로또 당첨권 난수 생성	
		 for(int i=0;i<answer.length;i++) {
		        answer[i]=(int)(Math.random()*45)+1;
		        for(int j=0;j<i;j++) {                  //중복체크 알고리즘 확인해야함
		        	if(answer[i]==answer[j]) {
		        		i--;
		        		break;
		        	}
		        }
		 }
	 
	  for(int i=0;i<answer.length;i++) {
		  System.out.printf("%4d",answer[i]);
	  }
	  System.out.println();
	  System.out.println();
		
      LOTTO buyer1= new LOTTO("박지호",4,5,6,7,8,9,10);
      
      //함수화시켜야함
      for(int i=0;i<6;i++) {
			if (answer[i]==mynum[i]) {
				count++;
				}
			}
		switch(count){
		default:
			System.out.println("\t꽝입니다~~!");
			break;
		case 3:
			System.out.println("\t5등 당첨 5000원");
			break;
		case 4:
			System.out.println("\t4등 당첨 5만원");
			break;
		case 5:
			System.out.println("\t3등 당첨 100만원");
			break;
		case 6:
			if(count==6 && mybonus!=bonus) {
				System.out.println("\t2등 당첨 1000만원");
				break;
			}
			else {
				System.out.println("\t1등 당첨 10억!!!");
				break;
			}	
		}
      
      System.out.println();
      LOTTO buyer2 = new LOTTO("오윤록");
      
      for(int i=0;i<6;i++) {
			if (answer[i]==mynum[i]) {
				count++;
				}
			}
		switch(count){
		default:
			System.out.println("\t꽝입니다~~!\n");
			break;
		case 3:
			System.out.println("\t5등 당첨 5000원\n");
			break;
		case 4:
			System.out.println("\t4등 당첨 5만원\n");
			break;
		case 5:
			System.out.println("\t3등 당첨 100만원\n");
			break;
		case 6:
			if(count==6 && mybonus!=bonus) {
				System.out.println("\t2등 당첨 1000만원\n");
				break;
			}
			else {
				System.out.println("\t1등 당첨 10억!!!\n");
				break;
			}	
		}
	}
}

class LOTTO{
	  String name;   
      static int[] mynum = new int[7]; 
	  static int mybonus = mynum[6];
	  
      LOTTO(){}
      
      LOTTO(String name){
	      this.name=name;
	      System.out.println("\t"+name);
	      for(int i=0;i<mynum.length;i++) {
	         mynum[i]=(int)(Math.random()*45)+1;
	         for(int j=0;j<i;j++) {                  //중복체크 알고리즘 확인해야함
		        	if(mynum[i]==mynum[j]) {
		        		i--;
		        		break;
		        	}
	         }
	      }
	      for (int i=0;i<6;i++) {
	    	  System.out.printf("%4d",mynum[i]);
	      	}
	      System.out.println();
	      //check();
	   }

	   
	   LOTTO(String name,int num1, int num2,int num3, int num4,int num5, int num6, int numbonus){
	      this.name=name;
	      System.out.println("\t"+name);
	      mynum[0]=num1;
	      mynum[1]=num2;
	      mynum[2]=num3;
	      mynum[3]=num4;
	      mynum[4]=num5;
	      mynum[5]=num6;
	      mynum[6]=numbonus;
	      for (int i=0;i<6;i++) {
	    	  System.out.printf("%4d",mynum[i]);
	      	}
	      System.out.println();
	      //check();
	   }
}

