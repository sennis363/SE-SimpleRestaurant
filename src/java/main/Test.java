/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.Serializable;
import java.text.DecimalFormat;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Michael
 */
@Entity
public class Test implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Test)) {
            return false;
        }
        Test other = (Test) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "main.test[ id=" + id + " ]";
    }
    
    public double displayPrice(String fruit) {
        if (fruit == "apple") {
            return 3.5;
        } else if (fruit == "banana") {
            return 4;
        } else if (fruit == "coconut") {
            return 7;
        } else return 2;
    }
    
    public double addTax(Double price) {
        Double tax = 0.0;
        tax = price * .1;
        DecimalFormat df = new DecimalFormat("#.##");
        df.format(tax);
        return tax;
    }
    
    public double suggestedTip(String fruit) {
        if (fruit == "apple") {
            return 2;
        } else if (fruit == "banana") {
            return 3;
        } else if (fruit == "coconut") {
            return 4;
        } else return 5;
    }
    
    public double finalPrice(String fruit) {
        if (fruit == "apple") {
            return 5.85;
        } else if (fruit == "banana") {
            return 7.40;
        } else if (fruit == "coconut") {
            return 11.70;
        } else return 7.20;
    }
    
}
