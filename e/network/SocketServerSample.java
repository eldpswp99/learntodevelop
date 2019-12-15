package e.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    
    public static void main(String[] args){
        SocketServerSample sample = new SocketServerSample();
        sample.startReplyServer();
    }
    
    public void startServer(){
        ServerSocket server = null;
        Socket client = null;
        
        try{
            server = new ServerSocket(9999);
            while(true){
                System.out.println("Server.Waiting for request");
                client = server.accept();
                System.out.println("Server : Accepted");
                InputStream stream = client.getInputStream();
                
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));
                String data = null;
                StringBuilder receivedData = new StringBuilder();
                
                while((data = in.readLine()) != null){
                    receivedData.append(data);
                }
                System.out.println("Received data : " + receivedData);
                in.close();
                stream.close();
                client.close();
                
                if(receivedData != null && "EXIT".equals(receivedData.toString())){
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("-----------------");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(server != null){
                try{
                    server.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void startReplyServer(){
        ServerSocket server = null;
        Socket client = null;
        
        try{
            server = new ServerSocket(9999);
            while(true){
                System.out.println("Server.Waiting for request");
                client = server.accept();
                System.out.println("Server : Accepted");
                InputStream istream = client.getInputStream();
            //    OutputStream ostream = client.getOutputStream();
                
                BufferedReader in = new BufferedReader(new InputStreamReader(istream));
          //      BufferedWriter out = new BufferedWriter(new OutputStreamWriter(ostream));
                String reply = "OK";
                StringBuilder data = new StringBuilder();
                String str = null;
                                
                while((str = in.readLine()) != null){
                    data.append(str);
                }
                System.out.println("received Data : " + data);
              //  out.write(reply);

                
               
                in.close();
                istream.close();
                /*out.close();
                ostream.close();*/
                client.close();
                
                if(data != null && "EXIT".equals(data.toString())){
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("-----------------");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(server != null){
                try{
                    server.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
