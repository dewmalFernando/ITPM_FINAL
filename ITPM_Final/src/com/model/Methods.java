package com.model;

public class Methods {

	private int complexityOfMethods;
	private int weightOfreturnType;
	private int weightOfPrimitiveData;
	private int numberOfPrimitiveData;
	private int weightOfCompositeData;
	private int numberOfCompositeData;

	public Methods() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Methods(int complexityOfMethods, int weightOfreturnType, int weightOfPrimitiveData,
			int numberOfPrimitiveData, int weightOfCompositeData, int numberOfCompositeData) {
		super();
		this.complexityOfMethods = complexityOfMethods;
		this.weightOfreturnType = weightOfreturnType;
		this.weightOfPrimitiveData = weightOfPrimitiveData;
		this.numberOfPrimitiveData = numberOfPrimitiveData;
		this.weightOfCompositeData = weightOfCompositeData;
		this.numberOfCompositeData = numberOfCompositeData;
	}

	public int getComplexityOfMethods() {
		return complexityOfMethods;
	}

	public void setComplexityOfMethods(int complexityOfMethods) {
		this.complexityOfMethods = complexityOfMethods;
	}

	public int getWeightOfreturnType() {
		return weightOfreturnType;
	}

	public void setWeightOfreturnType(int weightOfreturnType) {
		this.weightOfreturnType = weightOfreturnType;
	}

	public int getWeightOfPrimitiveData() {
		return weightOfPrimitiveData;
	}

	public void setWeightOfPrimitiveData(int weightOfPrimitiveData) {
		this.weightOfPrimitiveData = weightOfPrimitiveData;
	}

	public int getNumberOfPrimitiveData() {
		return numberOfPrimitiveData;
	}

	public void setNumberOfPrimitiveData(int numberOfPrimitiveData) {
		this.numberOfPrimitiveData = numberOfPrimitiveData;
	}

	public int getWeightOfCompositeData() {
		return weightOfCompositeData;
	}

	public void setWeightOfCompositeData(int weightOfCompositeData) {
		this.weightOfCompositeData = weightOfCompositeData;
	}

	public int getNumberOfCompositeData() {
		return numberOfCompositeData;
	}

	public void setNumberOfCompositeData(int numberOfCompositeData) {
		this.numberOfCompositeData = numberOfCompositeData;
	}

}
