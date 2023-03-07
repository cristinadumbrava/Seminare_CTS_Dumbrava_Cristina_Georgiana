package cts.s02.principii_clean_code.clase.readere;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderStudent extends ReaderAplicant{
    @Override
    public List<Aplicant> readAplicants(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Student student = new Student();
            citesteAplicant(input, student);
            student.setAn_studii(input.nextInt());
            student.setFacultate((input.next()));
            studenti.add(student);
        }
        input.close();
        return studenti;
    }
}
