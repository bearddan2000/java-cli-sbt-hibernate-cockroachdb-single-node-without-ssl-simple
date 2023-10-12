package example.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.OptimisticLockType;

@Entity
@Table(name = "dog")
public class DogEntity {

  public DogEntity(long a, String b, String c)
  {
    id = a;
    color = b;
    breed = c;
  }

  @Id
//  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name="id")
  private long id;

  @Column(name="color")
  private String color;

  @Column(name="breed")
  private String breed;

  // Accessors and mutators for all three fields

  public long getId(){ return id;}

  public String getColor(){ return color;}
  public void setColor(String value){color = value;}

  public String getBreed(){ return breed;}
  public void setBreed(String value){breed = value;}

  @Override
  public String toString(){
    return String.format("[OUTPUT] %d, breed=%s, color=%s", id, breed, color);
  }
}
