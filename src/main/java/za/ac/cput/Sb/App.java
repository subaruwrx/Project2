package za.ac.cput.Sb;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    }
    public String sayhello()
    {
        return "Hello World!";
    }
    public float myFloat()
    {
        float num1 = (float) 6.8;
        return num1;
    }

    public int myInteger()
    {
        int num2=8;
        return num2;
    }
    public boolean objectEquality()
    {
       String  a = new String();

      return true;
    }
    public boolean myIdentity()
    {
        String b="found";
        return true;
    }

    public boolean myTruth()
    {
        return true;
    }

    public boolean myfalse()
    {
        return false;
    }
    public String nullNess()
    {

        return null;
    }

    public String  notNull()
    {
        String n="abc";
        return n;
    }

    public int[] myArray()
    {

        int[] arry = {1,2,3};
        return arry;
    }

   public boolean failTest()
   {
       return true;
   }

}
