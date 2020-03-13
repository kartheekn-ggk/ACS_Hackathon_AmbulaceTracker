package com.Ambulance.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Ambulance {
	
	public Ambulance()
	{
		xCoord = (long) 0;
		yCoord = (long) 0;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="XCOORD")
	private Long xCoord;
	
	@Column(name="YCOORD")
	private Long yCoord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getxCoord() {
		return xCoord;
	}

	public void setxCoord(Long xCoord) {
		this.xCoord = xCoord;
	}

	public Long getyCoord() {
		return yCoord;
	}

	public void setyCoord(Long yCoord) {
		this.yCoord = yCoord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((xCoord == null) ? 0 : xCoord.hashCode());
		result = prime * result + ((yCoord == null) ? 0 : yCoord.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ambulance other = (Ambulance) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (xCoord == null) {
			if (other.xCoord != null)
				return false;
		} else if (!xCoord.equals(other.xCoord))
			return false;
		if (yCoord == null) {
			if (other.yCoord != null)
				return false;
		} else if (!yCoord.equals(other.yCoord))
			return false;
		return true;
	}
	
	
	
}
