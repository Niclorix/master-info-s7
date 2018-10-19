package infrastructure;

import domain.*;
import java.util.*;

public class CatalogImpl implements Catalog {
  private Map<String, Reference> references;

/*public int size();
public Set<Reference> getReferences();
public Reference findReferenceById(String id);
public void addReference(Reference reference);
public void removeReference(Reference reference);*/

  public CatalogImpl(){
    Map<String, Reference> references = new HashMap<String, Reference>();
  }

  public int size(){
    return references.size();
  }

  public Set<Reference> getReferences(){
    //on utilise un set parce qu'on ne donne pas la liste des clefs au clients, seulement les références
    Set<Reference> refs = new HashSet<Reference>();
    refs.addAll(this.references.values());
    return refs;
  }

  public void addReference(Reference reference){
    this.references.put(reference.getId(), reference);
  }

  public void removeReference(Reference reference){
  this.references.remove(reference.getId());
  }

  public Reference findReferenceById(String id){
    return this.references.get(id);
  }
}
