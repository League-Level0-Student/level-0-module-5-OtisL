package nested_loops;

public class ForLoop {
	public static void main (String[] args) {
		for(int a=0;a<101;a++) {
			System.out.println(a);
		}
		for(int b=100;b>-1;b--) {
			System.out.println(b);
		}
		for(int c=2;c<101;c++) {
			if(c%2==0) {
				System.out.println(c);
			}else {
				
			}
		}
		for(int d=1;d<100;d++) {
			if(d%2==0) {
				
			}else {
				System.out.println(d);
			}
		}
		for(int e=1;e<501;e++) {
			if(e%2==0) {
				System.out.println(e+" is even");
			}else {
				System.out.println(e+" is odd");
			}
		}
		for(int f=0;f<778;f++) {
			if(f%7==0) {
				System.out.println(f);
			}
			if(f==777) {
				System.out.println(f+"-300ER");
			}
		}
		int gg=0;
		for(int g=2005;g<2020;g++) {
			System.out.println("In "+g+" I was "+gg+" years old");
			gg++;
		}
		for(int h=0;h<3;h++) {
			for(int hh=0;hh<3;hh++) {
				System.out.println(h+" "+hh);
			}
		}
		for(int i=1;i<=9 ;i+=3) {
			for(int ii=i;ii<i+3;ii++) {
				System.out.print(ii+" ");
			}
			System.out.println();
		}
		for(int j=1;j<=6;j++) {
			for(int jj=1;jj<=j;jj++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
