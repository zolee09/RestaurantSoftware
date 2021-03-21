
package hu.unideb.inf;


import java.io.*;
import hu.unideb.inf.Persistent;
import hu.unideb.inf.PersistentOutput;

public class PersistentOutputStream extends DataOutputStream
                                    implements PersistentOutput{
    public PersistentOutputStream(OutputStream out) {
        super(out);
    }
    public final void writePersistent(Persistent obj) throws IOException {
        if ( obj == null ) {
            writeUTF("null");
        }
        else {
            writeUTF(obj.getClass().getName());
            obj.write(this);
        }
    }
}
