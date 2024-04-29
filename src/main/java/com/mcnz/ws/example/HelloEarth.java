package com.mcnz.ws.example;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

//This is making a Direct HTTP Request to an SOAP ENDPOINT

public class HelloEarth {
	public static void main(String[] args) throws Exception {
		// Create HTTPClient
		HttpClient client = new DefaultHttpClient();

		// Set up HTTP Post method
		HttpPost post = new HttpPost("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
		post.setHeader("Content-Type", "text/xml;charset=UTF-8");
		post.setHeader("SOAPAction", ""); // Sometimes SOAPAction is needed, check the WSDL or service documentation

		// Create the SOAP request XML
		String soapXml = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:web=\"http://www.dataaccess.com/webservicesserver/\">\n"
				+ "   <soapenv:Header/>\n" + "   <soapenv:Body>\n" + "      <web:NumberToWords>\n"
				+ "         <web:ubiNum>123</web:ubiNum>\n" + "      </web:NumberToWords>\n" + "   </soapenv:Body>\n"
				+ "</soapenv:Envelope>";

		// Set the request entity
		StringEntity entity = new StringEntity(soapXml);
		post.setEntity(entity);

		// Execute the request
		HttpResponse response = client.execute(post);

		// Print the response
		String responseString = EntityUtils.toString(response.getEntity());
		System.out.println(responseString);
	}
}
