package com.mcnz.ws.example;

import com.example.client.currency.NumberConversion;
import com.example.client.currency.NumberConversionSoapType;
import java.math.BigInteger;

//This is using SOAP client Stubs to making a request to an SOAP endpoint

public class HelloWorld {

	public static void main(String[] args) {
		NumberConversion service = new NumberConversion();
		NumberConversionSoapType port = service.getNumberConversionSoap();

		// Convert the integer to BigInteger
		BigInteger number = BigInteger.valueOf(123);

		// Now pass the BigInteger to the method
		String words = port.numberToWords(number);
		System.out.println("Number to Words: " + words);

		// If you need to convert a string number to BigInteger
		BigInteger largeNumber = new BigInteger("15637");
		String moreWords = port.numberToWords(largeNumber);
		System.out.println("Larger Number to Words: " + moreWords);
	}
}
