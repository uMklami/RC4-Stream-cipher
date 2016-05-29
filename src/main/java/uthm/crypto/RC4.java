package uthm.crypto;

public class RC4 {
	
	String key;
	String plaintText;
	private int[] S;
	
	public RC4(String PivateKey){
		this.key = PivateKey;
		S = new int[256];
	}

	public void ksa(int keysize){
		for (int i = 0; i < 256; i++) {
			S[i] = i;
		}
		
	}
}
