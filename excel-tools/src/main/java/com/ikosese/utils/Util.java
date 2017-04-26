package com.ikosese.utils;
/**
 * 
 * @author Koses
 *
 */
public class Util {
	
	/**
	 * is this file an excel(by suffix);
	 * @param fileName
	 * @return 
	 */
	public int judgeTypeOfFile(String fileName){
		if(fileName == null || fileName.trim().length() == 0){
			return Global.NOT_EXCEL;
		}
		if(fileName.endsWith("xls")){
			return Global.IS_XLS;
		}else if(fileName.endsWith("xlsx")){
			return Global.IS_XLSX;
		}else{
			return Global.NOT_EXCEL;
		}
	}
	

}
