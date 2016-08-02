package org.servlets;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/SampleLogin")
public class SampleLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String uName = request.getParameter("uName");
		String pwd = request.getParameter("pwd");
		try 
		{
			//Generates a key
			KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
			keyGenerator.init(128);
			SecretKey aesKey = keyGenerator.generateKey();
			//Encrypt Cipher
			Cipher encryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			encryptCipher.init(Cipher.ENCRYPT_MODE, aesKey);
			//Encrypt
			ByteArrayOutputStream outputStream =  new ByteArrayOutputStream();
			CipherOutputStream cipherOutputStream =  new CipherOutputStream(outputStream, encryptCipher);
			cipherOutputStream.write(pwd.getBytes());
			cipherOutputStream.flush();
			cipherOutputStream.close();
			//Print the encrypted String
			out.println(new String(outputStream.toByteArray())+"<br/><br/>");
			//Decryption wrong
			/*byte encryptedBytes[]=outputStream.toByteArray();
			Cipher decryptCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			IvParameterSpec ivParameterSpec = new IvParameterSpec(aesKey.getEncoded());
			decryptCipher.init(Cipher.DECRYPT_MODE, aesKey,ivParameterSpec);
			outputStream = new ByteArrayOutputStream();
			ByteArrayInputStream inStream = new ByteArrayInputStream(encryptedBytes);
			CipherInputStream cipherInputStream = new CipherInputStream(inStream, decryptCipher);
			byte buffer[] = new byte[1024];
			int bytesRead;
			while((bytesRead =cipherInputStream.read(buffer))>=0)
			{
				outputStream.write(buffer, 0, bytesRead);
				
			}
			out.println(new String(outputStream.toByteArray(),"UTF-8"));*/
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
