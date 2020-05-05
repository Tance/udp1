package com.example.udp1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;



import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    private EditText show;

    private Handler handler;
    private Button buttonUp;
    private Button buttonDown;
    private Button buttonLeft;
    private Button buttonRight;
    private Button buttonDrop;
    private Button buttonUnDrop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show = (EditText) findViewById(R.id.show);
        buttonUp  = findViewById(R.id.keyUp);
        buttonDown = findViewById(R.id.keyBack);
        buttonLeft = findViewById(R.id.keyLeft);
        buttonRight = findViewById(R.id.keyRight);
        buttonDrop = findViewById(R.id.keyDrop);
        buttonUnDrop = findViewById(R.id.keyUnDrop);

        buttonUp.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                            //当然也可以不指明，已测试成功
                            //现在仅仅指明手机端口为8888
                            DatagramSocket ds = new DatagramSocket(52033);

                            //2.将要发送的数据封装到数据包中
                            String str = "1";
                            byte[] buf = str.getBytes("utf-8");
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.4.1"), 52033);

                            //3.udp发送,使用socket服务将数据包发送出去
                            ds.send(dp);
                            ds.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                //你要做的事
                return false;
            }
        });
        buttonDown.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                            //当然也可以不指明，已测试成功
                            //现在仅仅指明手机端口为8888
                            DatagramSocket ds = new DatagramSocket(52033);

                            //2.将要发送的数据封装到数据包中
                            String str = "2";
                            byte[] buf = str.getBytes("utf-8");
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.4.1"), 52033);

                            //3.udp发送,使用socket服务将数据包发送出去
                            ds.send(dp);
                            ds.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                //你要做的事
                return false;
            }
        });
        buttonLeft.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                            //当然也可以不指明，已测试成功
                            //现在仅仅指明手机端口为8888
                            DatagramSocket ds = new DatagramSocket(52033);

                            //2.将要发送的数据封装到数据包中
                            String str = "3";
                            byte[] buf = str.getBytes("utf-8");
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.4.1"), 52033);

                            //3.udp发送,使用socket服务将数据包发送出去
                            ds.send(dp);
                            ds.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                //你要做的事
                return false;
            }
        });
        buttonRight.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                            //当然也可以不指明，已测试成功
                            //现在仅仅指明手机端口为8888
                            DatagramSocket ds = new DatagramSocket(52033);

                            //2.将要发送的数据封装到数据包中
                            String str = "4";
                            byte[] buf = str.getBytes("utf-8");
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.4.1"), 52033);

                            //3.udp发送,使用socket服务将数据包发送出去
                            ds.send(dp);
                            ds.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                //你要做的事
                return false;
            }
        });
        buttonDrop.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                            //当然也可以不指明，已测试成功
                            //现在仅仅指明手机端口为8888
                            DatagramSocket ds = new DatagramSocket(52033);

                            //2.将要发送的数据封装到数据包中
                            String str = "5";
                            byte[] buf = str.getBytes("utf-8");
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.4.1"), 52033);

                            //3.udp发送,使用socket服务将数据包发送出去
                            ds.send(dp);
                            ds.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                //你要做的事
                return false;
            }
        });
        buttonUnDrop.setOnTouchListener(new View.OnTouchListener()
        {
            @Override
            public boolean onTouch(View v, MotionEvent event)
            {
                // TODO Auto-generated method stub

                new Thread() {
                    @Override
                    public void run() {
                        try {
                            //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                            //当然也可以不指明，已测试成功
                            //现在仅仅指明手机端口为8888
                            DatagramSocket ds = new DatagramSocket(52033);

                            //2.将要发送的数据封装到数据包中
                            String str = "6";
                            byte[] buf = str.getBytes("utf-8");
                            DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.4.1"), 52033);

                            //3.udp发送,使用socket服务将数据包发送出去
                            ds.send(dp);
                            ds.close();

                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                //你要做的事
                return false;
            }
        });
        new Thread() {
            @Override
            public void run() {
                try {
                    //1.udpsocket服务对象，使用DatagramSocket创建,可以指明本地IP和端口
                    //当然也可以不指明，已测试成功
                    //现在仅仅指明手机端口为8888
                    DatagramSocket ds = new DatagramSocket(52033);

                    //2.将要发送的数据封装到数据包中
                    String str = "udp tranmsimit,i am mobilephone";
                    byte[] buf = str.getBytes("utf-8");
                    DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("192.168.52.179"), 52033);

                    //3.udp发送,使用socket服务将数据包发送出去
                    ds.send(dp);
                    /*接收数据*/
                   // byte[] recvBuf = new byte[100];
                   // DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);
                   // ds.receive(recvPacket);
                    //String recvStr = new String(recvPacket.getData(), 0, recvPacket.getLength());
                    // show.setText("收到: \t" + recvStr);
                    //Message message = Message.obtain(handler);
                   // message.obj = recvStr;
                    //handler.sendMessage(message);
                    //4.关闭连接
                    ds.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }.start();
         handler = new Handler() {
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                show.setText((String)msg.obj);   //在handleMessage中处理消息队列中的消息
            }
        };

    }

}
