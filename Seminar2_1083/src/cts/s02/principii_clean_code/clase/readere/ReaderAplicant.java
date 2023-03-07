package cts.s02.principii_clean_code.clase.readere;

import cts.s02.principii_clean_code.clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class ReaderAplicant {
    public abstract List<Aplicant> readAplicants(String file) throws FileNotFoundException;

    public void  citesteAplicant(Scanner scanner, Aplicant aplicant){
        //abstract -> nu pot instantia obiecte
        aplicant.setNume(scanner.next());

        aplicant.setPrenume(scanner.next());
        aplicant.setVarsta(scanner.nextInt());
        aplicant.setPunctaj(scanner.nextInt());
        aplicant.setNrProiecte(scanner.nextInt());

        String[] denumiriProiecte = new String[aplicant.getNrproiecte()];
        for (int i = 0; i < aplicant.getNrproiecte(); i++)
            denumiriProiecte[i] = scanner.next();
        aplicant.setDenumireProiect(denumiriProiecte);



    }

}
