import java.util.Scanner;
class Tests {
public Voc[] masW;	
public String[] masT;
	
public void Test1(Voc[] v){
	
Scanner in = new Scanner(System.in);

 masW = new Voc[v.length];
 masT = new String[v.length];
 for (int i = 0; i < v.length; i++){
	 masW[i] = new Voc();
 }
    masW[0] = v[1];
	masT[0] = v[2].getTranslation();
	masW[1] = v[0];
	masT[1] = v[1].getTranslation();
	masW[2] = v[2];
	masT[2] = v[0].getTranslation();
 
 /*for(int i = 0; i < v.length; i++){
	 System.out.print(masW[i].getWord()+" ");
 }*/
 System.out.println("");
 
 for(int i = 0; i < v.length; i++){
	 System.out.print(masT[i]+" ");
 }
 System.out.println("");
 
 for(int i = 0; i < v.length; i++){
 System.out.println("Which translation belongs to "+(i+1)+" word?");
 int x = in.nextInt();
 if (masW[i].getTranslation().equals(masT[x-1])){
 System.out.println("You are right");
 for (int j = 0; j < v.length; j++){
	 if(v[j].getTranslation().equals(x)){
	  int t = v[j].getcorrect()+1;
	  v[j].setCorrect(t);
	 }
	 }
 }
 else{
	 System.out.println("You are wrong");
 }
 }	

    masW[0] = v[0];
	masT[0] = v[2].getTranslation();
	masW[1] = v[1];
	masT[1] = v[0].getTranslation();
	masW[2] = v[2];
	masT[2] = v[1].getTranslation();

for(int i = 0; i < v.length; i++){
	 System.out.print(masW[i].getWord()+" ");
}
System.out.println("");

for(int i = 0; i < v.length; i++){
	 System.out.print(masT[i]+" ");
}
System.out.println("");

for(int i = 0; i < v.length; i++){
System.out.println("Which translation belongs to "+(i+1)+" word?");
int x = in.nextInt();
if (masW[i].getTranslation().equals(masT[x-1])){
System.out.println("You are right");
for (int j = 0; j < v.length; j++){
if(v[j].getTranslation().equals(x)){
 int t = v[j].getcorrect()+1;
 v[j].setCorrect(t);
}
}
}
else{
	 System.out.println("You are wrong");
}
}
masW[0] = v[1];
masT[0] = v[0].getTranslation();
masW[1] = v[2];
masT[1] = v[1].getTranslation();
masW[2] = v[0];
masT[2] = v[2].getTranslation();

for(int i = 0; i < v.length; i++){
 System.out.print(masW[i].getWord()+" ");
}
System.out.println("");

for(int i = 0; i < v.length; i++){
 System.out.print(masT[i]+" ");
}
System.out.println("");

for(int i = 0; i < v.length; i++){
System.out.println("Which translation belongs to "+(i+1)+" word?");
int x = in.nextInt();
if (masW[i].getTranslation().equals(masT[x-1])){
System.out.println("You are right");
for (int j = 0; j < v.length; j++){
if(v[j].getTranslation().equals(x)){
 int t = v[j].getcorrect()+1;
 v[j].setCorrect(t);
}
}
}
else{
 System.out.println("You are wrong");
}
}
masW[0] = v[0];
masT[0] = v[2].getTranslation();
masW[1] = v[2];
masT[1] = v[1].getTranslation();
masW[2] = v[1];
masT[2] = v[0].getTranslation();

for(int i = 0; i < v.length; i++){
 System.out.print(masW[i].getWord()+" ");
}
System.out.println("");

for(int i = 0; i < v.length; i++){
 System.out.print(masT[i]+" ");
}
System.out.println("");

for(int i = 0; i < v.length; i++){
System.out.println("Which translation belongs to "+(i+1)+" word?");
int x = in.nextInt();
if (masW[i].getTranslation().equals(masT[x-1])){
System.out.println("You are right");
for (int j = 0; j < v.length; j++){
if(v[j].getTranslation().equals(x)){
 int t = v[j].getcorrect()+1;
 v[j].setCorrect(t);
}
}
}
else{
 System.out.println("You are wrong");
}
 
 }

}

public void Test3(Voc[] v){
	Scanner in = new Scanner(System.in);
	/*masW = new Voc[v.length];
	 masT = new String[1];
	 for (int i = 0; i < v.length; i++){
		 masW[i] = new Voc();
	 }
	    masW[0] = v[1];
		masT[0] = v[2].getTranslation();
		masW[1] = v[0];
		masW[2] = v[2];*/
	 
	 for(int i = 0; i < v.length; i++){
		 System.out.print(masW[i].getWord()+" ");
	 }
	 System.out.println("");
	 
		 System.out.print(masT[0]+" ");
	 System.out.println("");
	 

	 System.out.println("Which word belongs to this translation?");
	 int x = in.nextInt();
	 if (masW[x-1].getTranslation().equals(masT[0])){
	 System.out.println("You are right");
	 for (int j = 0; j < v.length; j++){
		 if(v[j].getTranslation().equals(masT[0])){
		  int t = v[j].getcorrect()+1;
		  v[j].setCorrect(t);
		 }
		 }
	 }
	 else{
		 System.out.println("You are wrong");
	 }
	

	    masW[0] = v[0];
		masT[0] = v[1].getTranslation();
		masW[1] = v[1];
		masW[2] = v[2];

	for(int i = 0; i < v.length; i++){
		 System.out.print(masW[i].getWord()+" ");
	}
	System.out.println("");

		 System.out.print(masT[0]+" ");
	
	System.out.println("");


	 System.out.println("Which word belongs to this translation?");
	 x = in.nextInt();
	 if (masW[x-1].getTranslation().equals(masT[0])){
	 System.out.println("You are right");
	 for (int j = 0; j < v.length; j++){
		 if(v[j].getTranslation().equals(masT[0])){
		  int t = v[j].getcorrect()+1;
		  v[j].setCorrect(t);
	}
	}
	}
	else{
		 System.out.println("You are wrong");
	}
	
	masW[0] = v[1];
	masT[0] = v[0].getTranslation();
	masW[1] = v[2];
	masW[2] = v[0];

	for(int i = 0; i < v.length; i++){
	 System.out.print(masW[i].getWord()+" ");
	}
	System.out.println("");

	 System.out.print(masT[0]+" ");

	System.out.println("");

	 System.out.println("Which word belongs to this translation?");
	 x = in.nextInt();
	 if (masW[x-1].getTranslation().equals(masT[0])){
	 System.out.println("You are right");
	 for (int j = 0; j < v.length; j++){
		 if(v[j].getTranslation().equals(masT[0])){
		  int t = v[j].getcorrect()+1;
		  v[j].setCorrect(t);
	}
	}
	}
	else{
	 System.out.println("You are wrong");
	}
	
	masW[0] = v[0];
	masT[0] = v[2].getTranslation();
	masW[1] = v[2];
	masW[2] = v[1];

	for(int i = 0; i < v.length; i++){
	 System.out.print(masW[i].getWord()+" ");
	}
	System.out.println("");


	 System.out.print(masT[0]+" ");
	
	System.out.println("");

	 System.out.println("Which word belongs to this translation?");
	 x = in.nextInt();
	 if (masW[x-1].getTranslation().equals(masT[0])){
	 System.out.println("You are right");
	 for (int j = 0; j < v.length; j++){
		 if(v[j].getTranslation().equals(masT[0])){
		  int t = v[j].getcorrect()+1;
		  v[j].setCorrect(t);
	}
	}
	}
	else{
	 System.out.println("You are wrong");
	}
	 
	 }

	
}


