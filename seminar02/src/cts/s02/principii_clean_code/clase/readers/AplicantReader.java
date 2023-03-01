package cts.s02.principii_clean_code.clase.readers;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

import java.io.FileNotFoundException;
import java.util.List;

//la interfata de obicei numele e readerable
public interface AplicantReader {
    List<Aplicant> readAplicants(String fileName) throws FileNotFoundException;
}
