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
public class Detective {
	private String name, jK;
	private int umur;

	public Detective(String name, String jK, int umur) {
		this.name = name;
		this.jK = jK;
		this.umur = umur;
	}

	public void pekerjaan(){
		System.out.print("Halo Saia Seorang Detektif");
	}	

	public void kenalan(){
		System.out.println("Halo Nama Saia " + this.name);
		System.out.println("Saia seorang " + this.jK);
		System.out.println("Saia berumur " + this.umur + "\n");
	}
}
