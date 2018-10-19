package domain;

import java.util.*;
import infrastructure.*;


public interface Catalog {
  public int size();
  public Set<Reference> getReferences();
  public Reference findReferenceById(String id);
  public void addReference(Reference reference);
  public void removeReference(Reference reference);
}
