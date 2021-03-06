package com.techno.OneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Girl {
	@Id
	private int id;
    private String name;
    
    @OneToOne
    private Boy boy;
    
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Girl [id=" + id + ", name=" + name + ", boy=" + boy + "]";
	}
	
	
    
    
}
