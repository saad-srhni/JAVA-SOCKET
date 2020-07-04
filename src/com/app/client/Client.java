package com.app.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main() throws UnknownHostException, IOException {
	ServerSocket ss=new ServerSocket(125);
	Socket  serv=ss.accept();
	InputStream in=serv.getInputStream();
	OutputStream on=serv.getOutputStream();
	int nbre=in.read();
	int s=0,R;
	for(int  i=1;i<nbre;i++)
	          if  (nbre%i==0)
		s=s+i;
	if  (nbre==s)
	           R=1;
	else
	            R=0;
	on.write(R);
	serv.close();

	}
}
