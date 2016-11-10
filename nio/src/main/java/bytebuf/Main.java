package bytebuf;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by zsh on 2016/10/19.
 */
public class Main {
    public static void main(String[] args) throws IOException {
//        Set selectedKeys = Selector.selectedKeys();
//        Iterator keyIterator = selectedKeys.iterator();
//        while(keyIterator.hasNext()) {
//            SelectionKey key = (SelectionKey) keyIterator.next();
//            if(key.isAcceptable()) {
//                // a connection was accepted by a ServerSocketChannel.
//            } else if (key.isConnectable()) {
//                // a connection was established with a remote server.
//            } else if (key.isReadable()) {
//                // a channel is ready for reading
//            } else if (key.isWritable()) {
//                // a channel is ready for writing
//            }
//            keyIterator.<tuihighlight class="tuihighlight"><a href="javascript:;" style="display:inline;float:none;position:inherit;cursor:pointer;color:#7962D5;text-decoration:underline;" onclick="return false;">remove</a></tuihighlight>();
        }
}

