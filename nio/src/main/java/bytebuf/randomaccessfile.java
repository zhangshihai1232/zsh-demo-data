package bytebuf;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by zsh on 2016/9/30.
 */
public class randomaccessfile {
    public static String filename="D:\\code\\zsh\\zsh-demo-data\\nio\\src\\main\\resources\\test.txt";

    public static void main(String[] args) throws Exception {
        RandomAccessFile randFile = new RandomAccessFile(filename, "rw");
        FileChannel inChannel = randFile.getChannel();
        ByteBuffer buf = ByteBuffer.allocate(48);
        int bytesRead = inChannel.read(buf); //read into buffer.
        while (bytesRead != -1) {

            buf.flip();  //make buffer ready for read

            while(buf.hasRemaining()){
                System.out.print((char) buf.get()); // read 1 byte at a time
            }

            buf.clear(); //make buffer ready for writing
            bytesRead = inChannel.read(buf);
        }
        randFile.close();
    }
}
