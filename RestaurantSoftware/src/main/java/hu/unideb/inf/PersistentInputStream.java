
package hu.unideb.inf;


import java.io.*;
import hu.unideb.inf.Persistent;
import hu.unideb.inf.PersistentInput;

public class PersistentInputStream extends DataInputStream
                                   implements PersistentInput{
    public PersistentInputStream(InputStream in) {
        super(in);
    }
    public final Persistent readPersistent() throws IOException {
        Persistent obj = null;
        String cname = readUTF();

        if ( "null".equals(cname) ) {
            obj = null;
        }
        else {
            try {
                Class c = Class.forName(cname);
                obj = (Persistent) c.newInstance();
                obj.read(this);
            }
            catch( ClassNotFoundException ee ) 
            {    throw new IOException(ee.toString());   }
            catch( InstantiationException ee )
            {    throw new IOException(ee.toString());   }
            catch( IllegalAccessException ee )
            {    throw new IOException(ee.toString());   }
        }
        return obj;
    }
}
