package com.animal.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Result {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Long result;
	
	 @OneToOne
	 @JoinColumn(name = "spin_id") 
	private SpinId spinId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResult() {
		return result;
	}

	public void setResult(Long result) {
		this.result = result;
	}

	public SpinId getSpinId() {
		return spinId;
	}

	public void setSpinId(SpinId spinId) {
		this.spinId = spinId;
	}

	@Override
	public String toString() {
		return "Result [id=" + id + ", result=" + result + ", spinId=" + spinId + "]";
	}

	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Result(Long id, Long result, SpinId spinId) {
		super();
		this.id = id;
		this.result = result;
		this.spinId = spinId;
	}
	 
	 
	 
	
}
