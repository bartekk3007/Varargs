public class Main
{
    public static void main(String[] args)
    {
        System.out.println(sum(1, 2, 3, 4, 5));
    }
    public static double sum(double... args)
    {
        double sum = 0;
        for (double elem : args)
        {
            sum += elem;
        }
        return sum;
    }
}