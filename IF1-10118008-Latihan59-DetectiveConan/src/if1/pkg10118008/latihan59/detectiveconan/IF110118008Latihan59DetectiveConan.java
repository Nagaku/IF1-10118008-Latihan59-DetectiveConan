/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan59.detectiveconan;

/**
 *
 * @author ASUS
 */
public class IF110118008Latihan59DetectiveConan {

	static void kenalan(Detective a){
		a.kenalan();
	}
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		Cilik conan = new Cilik("Conan Edogawa", "Laki-Laki", 7);
		Dewasa ran = new Dewasa("Ran Mouri", "Perempuan", 23);	
		conan.pekerjaan();
		kenalan(conan);
		ran.pekerjaan();
		kenalan(ran);
	}
	
}
