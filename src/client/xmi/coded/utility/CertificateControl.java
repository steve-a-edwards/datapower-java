package client.xmi.coded.utility;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
// import java.util.Properties;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class CertificateControl {
	
	static boolean ignoring_certificates = true; // if this is true, the next boolean is irrelevant
	static boolean ignoring_subject_alternative_names_problem = true;

	public static void setup(String endpoint) {
		try {
			
			// Below: ignore lack of availability of server certificates.
			if (ignoring_certificates) {
				CertificateControl.ignore_certificates(endpoint);
			} else {// no need to do this next as above call already done it
				// Below: have set access to valid certificate in cacerts, but there is subject name problem,
				// presumes use of VM argument -Djavax.net.ssl.trustStore
				if (ignoring_subject_alternative_names_problem)
					CertificateControl.ignore_subject_alternative_names_problem();
			}			
		} catch (Exception e) {
			System.out.println("SE Exc: " + e.getMessage());
		}	
	}

// =========================================================================================================
	
	public static void ignore_subject_alternative_names_problem(){
		// Now you are telling the JRE to ignore the hostname
		// Code below is defining a class
		HostnameVerifier hv = new HostnameVerifier() {
			public boolean verify(String urlHostName, SSLSession session) {
				System.out.println("Warning: URL Host: " + urlHostName
						+ " vs. " + session.getPeerHost());
				return true;
			}
		};
		System.out.println("Created HostnameVerifier");
		HttpsURLConnection.setDefaultHostnameVerifier(hv);
		System.out.println("HttpsURLConnection using this HostnameVerifier");
	}
	
	public static String ignore_certificates(String endpoint)throws Exception {
		// subscribe is based on sample code
		return subscribe(endpoint);
	}

		// Code to get Java to ignore certificate problems with SSL communications.
		// http://www.java-samples.com/showtutorial.php?tutorialid=211
		// public String subscribe(String dist,String userid,String password, String
		// email,String name,String expirydate) throws Exception{
		public static String subscribe(String endpoint) throws Exception {
			String resp = "";
			URL url;
			URLConnection urlConn;
			//DataOutputStream printout;
			//DataInputStream input;
			//String str = "";
			//int flag = 1;

			try {
				// Properties sysProperties = System.getProperties();
				// change proxy settings if required and enable the below lines
				// sysProperties.put("proxyHost", "proxy.starhub.net.sg");
				// sysProperties.put("proxyPort", "8080");
				// sysProperties.put("proxySet", "true");
				
				// Now you are telling the JRE to ignore the hostname
				ignore_subject_alternative_names_problem();


				// Now you are telling the JRE to trust any https server.
				// If you know the URL that you are connecting to then this should
				// not be a problem
				trustAllHttpsCertificates();
				url = new URL(endpoint);
				urlConn = url.openConnection();
				urlConn.setDoInput(true);
				//Object object;
				// STEVE's experimentation
				//urlConn.setConnectTimeout(100); // 100 ms
				//System.out.println("urlConn.getConnectTimeout(): " + urlConn.getConnectTimeout());
				
				
				urlConn.setUseCaches(false);

				//System.out.println("Content-Type: application/x-www-form-urlencoded");
				//urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

			} catch (MalformedURLException mue) {
				mue.printStackTrace();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}

			return resp;
		}

		// Just add these two functions in your program

		public static class miTM implements javax.net.ssl.TrustManager,
				javax.net.ssl.X509TrustManager {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public boolean isServerTrusted(
					java.security.cert.X509Certificate[] certs) {
				return true;
			}

			public boolean isClientTrusted(
					java.security.cert.X509Certificate[] certs) {
				return true;
			}

			public void checkServerTrusted(
					java.security.cert.X509Certificate[] certs, String authType)
					throws java.security.cert.CertificateException {
				return;
			}

			public void checkClientTrusted(
					java.security.cert.X509Certificate[] certs, String authType)
					throws java.security.cert.CertificateException {
				return;
			}
		}

		private static void trustAllHttpsCertificates() throws Exception {

			// Create a trust manager that does not validate certificate chains:

			javax.net.ssl.TrustManager[] trustAllCerts = new javax.net.ssl.TrustManager[1];

			javax.net.ssl.TrustManager tm = new miTM();

			trustAllCerts[0] = tm;

			//javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("SSL");
			javax.net.ssl.SSLContext sc = javax.net.ssl.SSLContext.getInstance("TLS");

			sc.init(null, trustAllCerts, null);

			javax.net.ssl.HttpsURLConnection.setDefaultSSLSocketFactory(

			sc.getSocketFactory());

		}
	}

