package cts.s02.principii_clean_code.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.readers.AplicantReader;

public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAplicant = new ArrayList<>();
		AplicantReader reader = new AplicantReader() {
			@Override
			public List<Aplicant> citireAplicanti(String numeFisier) throws FileNotFoundException {
				return new ArrayList<>();
			}
		};
		try {
			listaAplicant = reader.citireAplicanti("studenti.txt");
			for (Aplicant aplicant : listaAplicant)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e){
			throw new RuntimeException(e);
		}
		for (Aplicant aplicant : listaAplicant)
			System.out.println(aplicant.toString());
	}

}