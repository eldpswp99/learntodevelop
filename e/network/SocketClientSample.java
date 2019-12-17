package e.network;

import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.time.ZonedDateTime;
import java.io.PrintWriter;
import java.time.ZoneId;

public class SocketClientSample {
    public static void main(String[] args){
        SocketClientSample sample = new SocketClientSample();
        sample.sendSocketSample();
    }
    
    public void sendSocketSample(){
        for(int loop = 0;loop<3;loop++){
            sendAndReceiveSocketData("I liked java at " +ZonedDateTime.now(ZoneId.of("Asia/Seoul")));
        }
        sendAndReceiveSocketData("EXIT");
    }
    
    public void sendSocketData(String data){
        Socket socket = null;
        try{
            System.out.println("Client : Connecting");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("Client : Connect status = " + socket.isConnected());
            Thread.sleep(1000);
            OutputStream stream = socket.getOutputStream();
            BufferedOutputStream out = new BufferedOutputStream(stream);
            
            byte[] bytes = data.getBytes();
            out.write(bytes);
            System.out.println("Client Sent Data="+data);
            out.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(socket != null){
                try{
                    socket.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void sendAndReceiveSocketData(String data){
        Socket socket = null;
        try{
            System.out.println("Client : Connecting");
            socket = new Socket("127.0.0.1",9999);
            System.out.println("Client : Connect status = " + socket.isConnected());
            Thread.sleep(1000);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            
            out.write(data);
            out.flush();
            
            System.out.println("Client Sent Data="+data);
            
            String str = null;
            StringBuffer receivedData = new StringBuffer();
            
            while((str = in.readLine()) != null){
                receivedData.append(str);
            }
            System.out.println("receivedData : "+receivedData);
            out.close();
            in.close();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(socket != null){
                try{
                    socket.close();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
