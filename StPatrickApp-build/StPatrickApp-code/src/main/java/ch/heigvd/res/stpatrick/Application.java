package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

/**
 *
 * @author Olivier Liechti
 */
public class Application {

    BufferedWriter bw;
    IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();

    public IStreamProcessorsFactory getStreamProcessorsFactory() {
        return processorsFactory;
    }

    public static void main(String[] args) {
        Socket clientSocket = null;
        OutputStream os = null;
        InputStream is = null;
        try {
            clientSocket = new Socket("10.192.114.100", 1703);
            os = clientSocket.getOutputStream();
            is = clientSocket.getInputStream();

        } catch (IOException e) {

        }
    }

    IStreamDecoratorController getStreamDecoratorController() {
        
        /*IStreamDecoratorController decoController = new IStreamDecoratorController() {
            @Override
            public Reader decorateReader(Reader inputReader) {
                BufferedReader br = new BufferedReader(inputReader);
                try {
                    int c = br.read();
                    while (c != -1) {
                        switch (c) {
                            case 'a':
                                break;
                            case 'A':
                                break;
                            default:
                                bw.write(c);
                                break;
                        }
                        c = br.read();
                    }
                    bw.flush();
                } catch (IOException e) {

                }
                return br;
                //throw new UnsupportedOperationException("Not  yet."); //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public Writer decorateWriter(Writer outputWriter) {
                bw = new BufferedWriter(outputWriter);
                return bw;
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        };
        return decoController;*/
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            
    }

}
