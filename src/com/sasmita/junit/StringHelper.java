package com.sasmita.junit;

public class StringHelper {
	
	/** 
	 * It Replaces The First 2 Position 'A' With ""
	 * 
	 * */
	
	public String truncateInFirst2Position(String str){
		if (str.length()<=2)
			return str.replaceAll("A", "");
	
		String first2PositionString=str.substring(0,2);
		String minusFirst2Characters=str.substring(2);
		
		String finalString=first2PositionString.replace("A", "");
		
		return finalString+minusFirst2Characters;
			
	}
	
	/**
	 * Compare The First and Last two Characters
	 * 
	 */
	
	public boolean areFirstAndLastTwoCharactersSame(String str){
		
		if(str.length()<=1)
			return false;
		if(str.length()==2)
			return true;
		
		String first2Characters=str.substring(0,2);
		String last2Characters=str.substring(str.length()-2);
		
		return first2Characters.equals(last2Characters);
		
	}
	

}
