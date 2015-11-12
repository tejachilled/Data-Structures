package com.Interviews;

import java.util.HashSet;

public class CeaserCipher {

	public static void main(String[] args) {

		System.out.println(decode("spwwz hzcwo"));	
	}

	static String decode(String encoded) {
		double[] freq = {0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228,
				0.02015, 0.06094, 0.06966, 0.00153, 0.00772, 0.04025,
				0.02406, 0.06749, 0.07507, 0.01929, 0.00095, 0.05987,
				0.06327, 0.09056, 0.02758, 0.00978, 0.02360, 0.00150,
				0.01974,0.00074};

		double maxVal = Double.MAX_VALUE;
		String finString = "";

		for(int key = 0; key < 26; ++key) {
			int encryptKey = - key;
			String dString = "";
			for (int i = 0; i < encoded.length(); ++i) {
				char chr = encoded.charAt(i);
				char encoded_chr;
				if ('a' <= chr  &&  chr <= 'z') {
					encoded_chr = (char)((chr - 'a' + encryptKey + 26) % 26 + 'a');
				}
				else
					encoded_chr = chr;
				dString += encoded_chr;
			}
			double entropy = 0;
			for (int i = 0; i < dString.length(); ++i) {
				char ch = dString.charAt(i);
				if ('a' <= ch && ch <= 'z')
					entropy += -Math.log(freq[ch - 'a']);
			}
			if (entropy + 2 < maxVal){
				maxVal = entropy;
				finString = dString;}
		}

		return finString;
	}	
	static String encodeCaesar(String encoded, int encryptKey) {
		String dString = "";
		for (int i = 0; i < encoded.length(); ++i) {
			char chr = encoded.charAt(i);
			char encoded_chr;
			if ('a' <= chr  &&  chr <= 'z') {
				encoded_chr = (char)((chr - 'a' + encryptKey + 26) % 26 + 'a');
			}
			else
				encoded_chr = chr;
			dString += encoded_chr;
		}
		return  dString;
	}

	static double getEntropy(String dString) {
		double[] freq = {0.08167, 0.01492, 0.02782, 0.04253, 0.12702, 0.02228,
				0.02015, 0.06094, 0.06966, 0.00153, 0.00772, 0.04025,
				0.02406, 0.06749, 0.07507, 0.01929, 0.00095, 0.05987,
				0.06327, 0.09056, 0.02758, 0.00978, 0.02360, 0.00150,
				0.01974,0.00074};
		double res = 0;
		for (int i = 0; i < dString.length(); ++i) {
			char ch = dString.charAt(i);
			if ('a' <= ch && ch <= 'z')
				res += -Math.log(freq[ch - 'a']);
		}
		return res;

	}


}
