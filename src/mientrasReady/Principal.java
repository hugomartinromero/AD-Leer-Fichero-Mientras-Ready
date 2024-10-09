package mientrasReady;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("fichero.txt"))) {
			while (br.ready()) {
				String linea = br.readLine();
				System.out.println(linea);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
