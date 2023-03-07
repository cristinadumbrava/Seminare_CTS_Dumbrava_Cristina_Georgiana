package cts.s02.principii_clean_code.clase.readere;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElev extends ReaderAplicant{
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner input2 = new Scanner(new File(file));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
           Elev elev = new Elev();
           citesteAplicant(input2, elev);
            elev.setClasa(input2.nextInt());
            elev.setTutore(input2.next());
            elevi.add(elev);
        }

        input2.close();
        return elevi;
    }
}
