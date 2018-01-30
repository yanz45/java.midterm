//sauce is akihiro
//tsula ni
//ian gutierrez
import  javax.swing.JOptionPane;
public class Gutierrez_MidtermExam {
        

    public static void main(String[] args) {
       
       int income,count=0,p40=0,p35=0,p30=0,p25=0,p20=0,p15=0,dq=0;
       double tuit,tuit1,Ftuit;
       String ans="y";
       
      while(ans.equals("y")){ //choosing Y

       income=Integer.parseInt(JOptionPane.showInputDialog("what is your income monthly? "));
       count++;
			
			if(income>20000){
				JOptionPane.showMessageDialog(null,"Sorry!  \nThe student is not qualified for Discount Grant.");
				dq++;
			}
		
			 if (income>=18000 && income<= 20000){				// this is for 15% discount
				tuit=Double.parseDouble(JOptionPane.showInputDialog("Enter Student Total Tuition Fee:"));
				tuit1=tuit*0.15;
				Ftuit= tuit - tuit1;
				JOptionPane.showMessageDialog(null,"Discount Grant : 15%"+
													"\nTuition Fee:" +tuit +
													"\nDiscount: "+tuit1 +
													"\nDiscounted Tuition Fee:" +Ftuit);
				p15++;
			}
			else if (income>=16000 && income<= 17999){				// this is for 20% discount
				tuit=Double.parseDouble(JOptionPane.showInputDialog("Enter Student Total Tuition Fee:"));
				tuit1=tuit*0.2;
				Ftuit= tuit - tuit1;
				JOptionPane.showMessageDialog(null,"Discount Grant : 20%"+
													"\nTuition Fee:" +tuit +
													"\nDiscount: "+tuit1 +
													"\nDiscounted Tuition Fee:" +Ftuit);
				p20++;
			}
			else if (income>=14000 && income<= 15999){				// this is for 25% discount
				tuit=Double.parseDouble(JOptionPane.showInputDialog("Enter Student Total Tuition Fee:"));
				tuit1=tuit*0.25;
				Ftuit= tuit - tuit1;
				JOptionPane.showMessageDialog(null,"Discount Grant : 25%"+
													"\nTuition Fee:" +tuit +
													"\nDiscount: "+tuit1 +
													"\nDiscounted Tuition Fee:" +Ftuit);
				p25++;
			}
//sauce is akihiro
//tsula ni
//ian gutierrez
			else if (income>=12000 && income<= 13999){				// this is for 30% discount
				tuit=Double.parseDouble(JOptionPane.showInputDialog("Enter Student Total Tuition Fee:"));
				tuit1=tuit*0.3;
				Ftuit= tuit - tuit1;
				JOptionPane.showMessageDialog(null,"Discount Grant : 30%"+
													"\nTuition Fee:" +tuit +
													"\nDiscount: "+tuit1 +
													"\nDiscounted Tuition Fee:" +Ftuit);
				p30++;
			} 
			else if (income>=10000 && income<= 11999){				// this is for 35% discount
				tuit=Double.parseDouble(JOptionPane.showInputDialog("Enter Student Total Tuition Fee:"));
				tuit1=tuit*0.35;
				Ftuit= tuit - tuit1;
				JOptionPane.showMessageDialog(null,"Discount Grant : 35%"+
													"\nTuition Fee:" +tuit +
													"\nDiscount: "+tuit1 +
													"\nDiscounted Tuition Fee:" +Ftuit);
				p35++;
			}   
//sauce is akihiro
//tsula ni
//ian gutierrez
			else if (income< 1000){				// this is for 40% discount lowest income
				tuit=Double.parseDouble(JOptionPane.showInputDialog("Enter Student Total Tuition Fee:"));
				tuit1=tuit*0.4;
				Ftuit= tuit - tuit1;
				JOptionPane.showMessageDialog(null,"Discount Grant : 40%"+
													"\nTuition Fee:" +tuit +
													"\nDiscount: "+tuit1 +
													"\nDiscounted Tuition Fee:" +Ftuit);
				p40++;
			}
     ans = JOptionPane.showInputDialog(null,"Enter Another Student? [y/n]");
      }
      while(ans.equals("n")){ // result and dchoosing N
      	
      JOptionPane.showMessageDialog(null,"Student Discount Tuition Summary:" +
      									"\nNo. of Students : " +count +
      									"\nNo of Students NOT Discounted : " + dq+
      									"\nNo of Students with Discount: " +
      										"\n40%" +p40 +
      										"\n35%"+p35 +
      										"\n30%" +p30 +
      										"\n25%" +p25 +
      										"\n20%" +p20 +
      										"\n15%" +p15  );
      break;
      }
}
}

//sauce is akihiro
//tsula ni
//ian gutierrez

//this was run it jcreator5.0
//save as
//Gutierrez_MidTerm.java
