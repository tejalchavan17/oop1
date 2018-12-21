import java.io.*;
class Mersenee
{
     int p,r,i,n;
     void prime()
     {
        outer:for(p=2;p<=31;p++)
        {
            n=power(p);
            n=n-1;
            for(i=2;i<n;i++)
            {
                r=n%i;
                if(r==0)
                {
                    continue outer;                
                }
            }
            System.out.println(n +" is prime when p=" +p);
        }
     }
    int power(int p)
    {
        if(p==0)
            return 1;
        return 2*power(p-1); //Recursion
    }
}
class BranchLoop
{
    public static void main(String args[])
    {
          Mersenee m=new Mersenee();
          System.out.println("prime nos.");
          m.prime();
    }
}

output:

C:\prog>javac BranchLoop.java

C:\prog>java BranchLoop
prime nos.
3 is prime when p=2
7 is prime when p=3
31 is prime when p=5
127 is prime when p=7
8191 is prime when p=13
131071 is prime when p=17
524287 is prime when p=19
2147483647 is prime when p=31