package common;

import dao.pharmacyUtils;
import java.awt.Desktop;
import java.io.File;

//Cross platform solution to view a PDF file
public class op {

	public static void open(String id) {

	  try {

		File pdfFile = new File(pharmacyUtils.billPath+id+".pdf");
		if (pdfFile.exists()) {

			if (Desktop.isDesktopSupported()) {
				Desktop.getDesktop().open(pdfFile);
			} else {
				System.out.println("Awt Desktop is not supported!");
			}

		} else {
			System.out.println("File is not exists!");
		}

		System.out.println("Done");
        }
          catch (Exception ex) {
		ex.printStackTrace();
	  }

	}
}