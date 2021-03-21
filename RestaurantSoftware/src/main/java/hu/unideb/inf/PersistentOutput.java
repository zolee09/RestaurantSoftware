
package hu.unideb.inf;

import hu.unideb.inf.Persistent;
import java.io.DataOutput;
import java.io.IOException;

public interface PersistentOutput extends DataOutput{
    void writePersistent(Persistent obj) throws IOException;
}
