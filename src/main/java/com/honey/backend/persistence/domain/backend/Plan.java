/**
 * @author honey
 */
package com.honey.backend.persistence.domain.backend;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author honey
 *
 */
@Entity
public class Plan implements Serializable {

	/** The Serial Version UID for Serializable classes. */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String name;

	/** Default constructor. */
	public Plan() {

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
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		Plan plan = (Plan) o;

		return id == plan.id;

	}

	@Override
	public int hashCode() {
		return id;
	}
}
