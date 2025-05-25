class countnumber
{
public static void main(String args[])
{
int arr[]={1,0,1,1,0,0,1,0};
int countzero=0;
int countone=0;
for(i=0;i<7;i++)
{
if(arr[i]==0)
{
countzero++;
}
else if(arr[i]==1)
{
countone++;
}
}
System.out.print("no. of zeroes : " + countzero + " ");
System.out.print("no. of ones :" + countone);
}
}
