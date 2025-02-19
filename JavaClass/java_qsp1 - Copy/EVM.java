import java.util.Scanner;
class EVM {
   public static void main (String [] args){
   Scanner sc = new Scanner(System.in);

System.out.println("\t Welcome\n");


int bjp=0, cng=0, ss=0, aap=0, mns=0, nota=0;


System.out.println("Enter the population : ");

int pop= sc.nextInt();


for(int i=0; i<=pop; i++){

System.out.println("* ENTER YOUR VOTE *");

System.out.println("\n 1.BJP \n 2.CNG \n 3.SS \n 4.AAP \n 5.MNS \n 6.NOTA");

int vote = sc.nextInt();

if(vote==1) bjp++;
if(vote==2) cng++;
if(vote==3) ss++;
if(vote==4)  aap++;
if(vote==5) mns++;
if(vote==6) nota++;
if(vote!= 1 && vote!=2 && vote!=3 && vote!=4 && vote!=5 && vote!=6 ){

System.out.println("|t ***wrong input**** \n\n  ");
i--;


}

 

}

if(bjp>=cng && bjp>=ss && bjp>=aap && bjp>=mns && bjp>=nota  ){


System.out.println("BJP WON THE ELECTION !" + bjp);


}

if(cng>=ss && cng>=aap && cng>=mns && cng>=nota && cng>=bjp ){


System.out.println("CNG WON THE ELECTION !" + cng);


}

if(ss>=cng && ss>=aap && ss>=mns && ss>=nota && ss>=bjp ){


System.out.println("SS WON THE ELECTION !" + ss);


}


if(aap>=cng && aap>=ss && aap>=mns && aap>=nota && aap>=bjp ){


System.out.println("AAP WON THE ELECTION !" + aap);


}

if(mns>=cng && mns>=ss && mns>=nota && mns>=bjp && mns>=aap ){


System.out.println("MNS WON THE ELECTION !" + mns);


}

if(nota>=cng && nota>=ss && nota>=bjp && nota>=aap && nota>=mns ){


System.out.println("NOTA WON THE ELECTION !" + nota);


}

}
}