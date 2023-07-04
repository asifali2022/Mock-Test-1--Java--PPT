package solutions;

public class Q5 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		 int num1=55;
		 
		 long num2=88999999l;
		 
		 float num3=45.778822156225f;
		 
		 double num4=77.4974621687626897612657171717172728;
		 
		 double num5=88.979646464654d;
		 
		 float num7=22.89f;
		 
		 //implicit typecasting
		 
		 //double>float>long>int<short>byte
		 double sum=num1+num2+num3+num4;
		 float sum2=num1+num2+num3;  // num1 & num2 both are int and long value
		 long sum3=num1+num2;
//		 int sum4=num1+num2;  // CE LOSSY COVERSION 
		 double sum4=num1+num2+num3+num4;
//		 float sum5=num1+num2+num3+num4;  //ce lossy coversion
//		 int sum6=num1+num2+num3+num4; //ce lossy coversion
		 
		 //explicit typcasting
		 
		 int num10=(int)num2;  // num2 is declared long
		 long num11=num1;//implicit typecasting
		 long num12=(long)num3; // num3 id declared float
		 float num13=(float)num5; // num5 is declared double 
		 
		 

	}

}
