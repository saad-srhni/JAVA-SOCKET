package com.app.serveur;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Serveur {

	public static void main(String[] args) throws UnknownHostException, IOException {

	Socket sock=new Socket("localhost",125);
	InputStream in=sock.getInputStream();
	OutputStream on=sock.getOutputStream();
	int n=6,R;
	on.write(n);
	R=in.read();
	if (R==1)
	       System.out.println("Le nombre est parfait");
	else
	       System.out.println("Le nombre n’est pas parfait");
	sock.close();

	}

}
