package pt.trainings.maven.Lista1TP;

public class WierszTrojkataPascala {
    long wiersz[];
    WierszTrojkataPascala(int n) {
        wiersz = new long [n + 1];
        wiersz[0] = 1;
        for (int i = 1; i <= n; i++){
            wiersz[i] = ((long) (wiersz[i-1] * (n-i+1))/i);
        }
    }
    public int wspolczynnik(int m){
        return (int) wiersz[m];
    }
}