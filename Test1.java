import java.util.Scanner;
import javax.swing.*;

public class Test1 {
public static Voc[] v;

  public static void main(String[] args){
	  	  
		  v = new Voc[3];
		  v[0] = new Voc();
		  v[0].setWord("dog");
		  String[] a = new String[1];
		  a[0] = "собака";
		  v[0].setTrans(a);
		  v[1] = new Voc();
		  v[1].setWord("cat");
		  String[] b = new String[1];
		  b[0] = "котик";
		  v[1].setTrans(b);
		  v[2] = new Voc();
		  v[2].setWord("fish");
		  String[] c = new String[1];
		  c[0] = "рыбка";
		  v[2].setTrans(c);
	  
	  WorkFrame frame = new WorkFrame();
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frame.setVisible(true);
	}
  }





