import java.io.*;
import java.lang.*;
class Alphabet
{
public static void main(String args[])throws Exception
{
char c;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
c=(char)br.read();
if((c>=65)&&(c<=90)||(c>=97)&&(c<=122))
{
System.out.println("The character is an alphabet");
}
else
{
System.out.println("The character is not an alphabet");
}
}
}
