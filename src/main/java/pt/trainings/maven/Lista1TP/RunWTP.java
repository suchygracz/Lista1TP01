package pt.trainings.maven.Lista1TP;

public class RunWTP {
    public static void main(String[] args){
        int n;
        try
        {
            n=Integer.parseInt(args[0]);
        }
        catch (NumberFormatException e)
        {
            System.out.println("nieprawidłowa dana");
            new ExceptionTr();
            return;
        }
        if( n<0 )
        {
            System.out.println("nieprawidłowy zakres");
            new ExceptionTr();
            return;
        }
        else
        {
            WierszTrojkataPascala PrzykladowyWiersz = new WierszTrojkataPascala(n);
            int m;
            for(int i = 1; i < args.length; i++)
            {
                try
                {
                    m = Integer.parseInt(args[i]);
                }
                catch (NumberFormatException e)
                {
                    System.out.println(args[i] +" - nieprawidłowa dana");
                    continue;
                }
                if ( ((m < 0) || (m > n)))
                {
                    System.out.println(m+" - Liczba spoza zakresu");
                    continue;
                }
                else
                {
                    System.out.println(m+" - "+PrzykladowyWiersz.wspolczynnik(m));
                }
            }

        }
    }
}
