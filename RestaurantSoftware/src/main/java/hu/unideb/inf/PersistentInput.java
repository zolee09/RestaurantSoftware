
package hu.unideb.inf;

import hu.unideb.inf.Persistent;
import java.io.DataInput;
import java.io.IOException;

public interface PersistentInput extends DataInput{
    Persistent readPersistent() throws IOException;
}
