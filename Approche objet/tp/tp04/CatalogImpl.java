import java.util.*;
public class CatalogImpl implements Catalog {
  private Map<String, Reference> reference_list;

  public CatalogImpl() {
    Map<String, Reference> reference_list = new HashMap<String, Reference>();
  }

  public int getReferences(){
    return reference_list.size();
  }

  public Set<Reference> getReferences(){
    Set<Reference> result = new HashSet<Reference>(); // on créé un copie pour ne pas retourner l'adresse de notre donnée
    result.addAll(reference_list.values());
    return result;
  }

  public Reference findReferenceById(String id) {
        if (!reference_list.containsKey(id)) throw new ReferenceManagementException("cannot find Reference, id unknown !");
        return reference_list.get(id);
    }

  public void addReference(Reference ref){
    reference_list.put(ref.getId(), ref);
  }

  public void removeReference(Reference reference) {
       reference_list.remove(reference.getId());
   }
}
