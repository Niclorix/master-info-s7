package fr.ubordeaux.ao.domain;

import java.util.*;

public class Reference {
    private String id;
    private String name;
    private String description;
    private Price basePrice;

    public Reference(String id, String name, String description, Price basePrice) {
        this.setReferenceId(id);
        this.setName(name);
        this.setDescription(description);
        this.setBasePrice(basePrice);
    }
    public Reference(String id){
      this.setReferenceId(id);
      this.setName("none");
      this.setDescription("none");
      Price p = new Price(123);
      this.setBasePrice(p);
    }

    private void setReferenceId(String id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    private void setBasePrice(Price basePrice) {
        this.basePrice = basePrice;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getDescription() {
        return this.description;
    }

    public Price getBasePrice() {
        return this.basePrice;
    }

    @Override
    public boolean equals(Object other) {
      if(!(other instanceof Reference)) return false; //si l'objet n'est pas de type reference on return false
      Reference otherReference = (Reference) other;  //s'il l'est, on créé un objet de type référence dans lequel on caste notre objet (car il est fournit sous la forme d'un Object et pas de Reference)
      return this.getId().compareTo(otherReference.getId())==0;
      //getId() retourne un String, on utilise la fonction compareTo de la classe String de java
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Reference id="+id+ " name="+name+" description="+description;
    }
}
