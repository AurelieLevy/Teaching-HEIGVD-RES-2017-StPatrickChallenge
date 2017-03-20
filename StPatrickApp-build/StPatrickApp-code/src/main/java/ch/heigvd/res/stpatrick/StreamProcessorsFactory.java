package ch.heigvd.res.stpatrick;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

/**
 * This class is responsible for providing different types of Stream Processors.
 *
 * @author Olivier Liechti
 */
public class StreamProcessorsFactory implements IStreamProcessorsFactory {

    @Override
    public IStreamProcessor getProcessor() {
        return new BasicStreamProcessor();
    }

    @Override
    public IStreamProcessor getProcessor(String processorName) throws UnknownNameException {
        //throw new UnknownNameException("The factory does not know any processor called " + processorName);
        IStreamProcessor processor = new IStreamProcessor() {
            @Override
            public void process(Reader in, Writer out) throws IOException {
                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                BufferedReader br = new BufferedReader(in);
                BufferedWriter bw = new BufferedWriter(out);
                int c = br.read();
                while (c != -1) {
                    switch (c) {
                        case 'e':
                            break;
                        case 'E':
                            break;
                        default:
                            out.write(c);
                            break;
                    }
                    c = br.read();
                }
                bw.flush();
            }
        };
        return processor;

    }

}
