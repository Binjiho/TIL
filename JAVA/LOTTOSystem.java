
public class LOTTOSystem extends LOTTO {
	static int count=0;                              // ���᰹��
	static int[] answer = new int[7];
	static int bonus = answer[6]; 
	
	
	public static void main(String args[]) {
	  
	  System.out.println("\t�̹��� �ζ� ��ȣ��!");
	//�ζ� ��÷�� ���� ����	
		 for(int i=0;i<answer.length;i++) {
		        answer[i]=(int)(Math.random()*45)+1;
		        for(int j=0;j<i;j++) {                  //�ߺ�üũ �˰��� Ȯ���ؾ���
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
		
      LOTTO buyer1= new LOTTO("����ȣ",4,5,6,7,8,9,10);
      
      //�Լ�ȭ���Ѿ���
      for(int i=0;i<6;i++) {
			if (answer[i]==mynum[i]) {
				count++;
				}
			}
		switch(count){
		default:
			System.out.println("\t���Դϴ�~~!");
			break;
		case 3:
			System.out.println("\t5�� ��÷ 5000��");
			break;
		case 4:
			System.out.println("\t4�� ��÷ 5����");
			break;
		case 5:
			System.out.println("\t3�� ��÷ 100����");
			break;
		case 6:
			if(count==6 && mybonus!=bonus) {
				System.out.println("\t2�� ��÷ 1000����");
				break;
			}
			else {
				System.out.println("\t1�� ��÷ 10��!!!");
				break;
			}	
		}
      
      System.out.println();
      LOTTO buyer2 = new LOTTO("������");
      
      for(int i=0;i<6;i++) {
			if (answer[i]==mynum[i]) {
				count++;
				}
			}
		switch(count){
		default:
			System.out.println("\t���Դϴ�~~!\n");
			break;
		case 3:
			System.out.println("\t5�� ��÷ 5000��\n");
			break;
		case 4:
			System.out.println("\t4�� ��÷ 5����\n");
			break;
		case 5:
			System.out.println("\t3�� ��÷ 100����\n");
			break;
		case 6:
			if(count==6 && mybonus!=bonus) {
				System.out.println("\t2�� ��÷ 1000����\n");
				break;
			}
			else {
				System.out.println("\t1�� ��÷ 10��!!!\n");
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
	         for(int j=0;j<i;j++) {                  //�ߺ�üũ �˰��� Ȯ���ؾ���
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

