class first{
public static void main(String args[]){
int a,d_s=0,r;
a=Integer.parseInt(args[0]);
while(a>0)
{
r=a%10;
d_s=d_s+r;
a=a/10;
}
System.out.println(d_s);
}}