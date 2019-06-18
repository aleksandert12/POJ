public class Sudoku
{
    public static int[][] jakies_sudoku ={
            { 5, 0, 0, 0, 8, 0, 0, 4, 9 },
            { 0, 0, 0, 5, 0, 0, 0, 3, 0 },
            { 0, 6, 7, 3, 0, 0, 0, 0, 1 },
            { 1, 5, 0, 0, 0, 0, 0, 0, 0 },
            { 0, 0, 0, 2, 0, 8, 0, 0, 0 },
            { 0, 0, 0, 0, 0, 0, 0, 1, 8 },
            { 7, 0, 0, 0, 0, 4, 1, 5, 0 },
            { 0, 3, 0, 0, 0, 2, 0, 0, 0 },
            { 4, 9, 0, 0, 5, 0, 0, 0, 3 },
    };

    private int[][] tablica;
    public static final int pusto = 0;
    public static final int wielkosc = 9;

    public Sudoku(int[][] tablica)
    {
        this.tablica = new int[wielkosc][wielkosc];

        for (int i = 0; i < wielkosc; i++)
        {
            for (int j = 0; j < wielkosc; j++)
            {
                this.tablica[i][j] = tablica[i][j];
            }
        }
    }

    private boolean rzad(int rzad, int numer)
    {
        for (int i = 0; i < wielkosc; i++)
        {
            if (tablica[rzad][i] == numer)
            {
                return true;
            }
        }
        return false;
    }

    private boolean kolumna(int kolumna, int numer)
    {
        for (int i = 0; i < wielkosc; i++)
        {
            if (tablica[i][kolumna] == numer)
            {
                return true;
            }
        }
        return false;
    }

    private boolean kwadrat(int rzad, int kolumna, int numer)
    {
        int r = rzad - rzad % 3;
        int c = kolumna - kolumna % 3;

        for (int i = r; i < r + 3; i++)
        {
            for (int j = c; j < c + 3; j++)
            {
                if (tablica[i][j] == numer)
                {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dobre(int rzad, int kolumna, int numer)
    {
        return !rzad(rzad, numer)  &&  !kolumna(kolumna, numer)  &&  !kwadrat(rzad, kolumna, numer);
    }

    public boolean liczenie()
    {
        for (int rzad = 0; rzad < wielkosc; rzad++)
        {
            for (int kolumna = 0; kolumna < wielkosc; kolumna++)
            {
                if (tablica[rzad][kolumna] == pusto)
                {
                    for (int numer = 1; numer <= wielkosc; numer++)
                    {
                        if (dobre(rzad, kolumna, numer))
                        {
                            tablica[rzad][kolumna] = numer;

                            if (liczenie())
                            {
                                return true;
                            } else {
                                tablica[rzad][kolumna] = pusto;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void wynik()
    {
        for (int i = 0; i < wielkosc; i++)
        {
            for (int j = 0; j < wielkosc; j++)
            {
                System.out.print(" " + tablica[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        Sudoku sudoku = new Sudoku(jakies_sudoku);
        System.out.println("Podany wzor sudoku:");
        sudoku.wynik();


        if (sudoku.liczenie())
        {
            System.out.println("Rozwiazanie: ");
            sudoku.wynik();
        } else {
            System.out.println("Niewykonalne");
        }
    }

}
