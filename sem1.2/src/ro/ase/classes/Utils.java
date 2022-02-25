package ro.ase.classes;

public class Utils {
	public static int aparitiiMin(int[] v) {
		int min=0;
		int apar=0;
		for(int i=0; i<v.length; i++) {
			if(min==v[i]) {
				apar++;
			}

			if(min>v[i]) {
				min=v[i];
				apar=1;
			}
		}
		return apar;
	}
}
