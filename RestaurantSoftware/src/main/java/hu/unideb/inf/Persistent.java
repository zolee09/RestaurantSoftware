
package hu.unideb.inf;

import hu.unideb.inf.PersistentInput;
import hu.unideb.inf.PersistentOutput;
import java.io.IOException;

public interface Persistent {
   public void write(PersistentOutput out) throws IOException;
   public void  read(PersistentInput in)   throws IOException; 
}
