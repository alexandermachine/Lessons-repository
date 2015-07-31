import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class Main {
	static String [][] m = new String [1][3] ;
	static Scanner scn;
	static Formatter x;
	public static void main(String[] args) {
//		writeAIDataBaseToFile(36,8,80,"DB700");
//		writeKRDataBaseToFile(100,"DB704");		
		writeRegDataBaseToFile(84,"DB702");
//		writeDIDataBaseToFile(9,32,6,"DB703");
//		writeDODataBaseToFile(8,32,6,"DB705");
//		openFile();
//		DIDataBasee();
//		DODataBasee();
//		KRDataBasee();
//		writeAIDataBaseToFileForPanel(36,8,80,"DB700");
		System.out.print("Выполнено!");

	}

	private static void openFile() {
		try{
		scn = new Scanner(new File("res//AI.txt"));
		}catch(Exception e){JOptionPane.showMessageDialog(null, "Файл не найден");}
	}
	private static void writeAIDataBaseToFile(int Nmod,int Nch,int dAddr,String DB) {
		String ch;
		try{
			x = new Formatter("res//AI.csv");
			x.format("Tag Name,Address,Data Type,Respect Data Type,Client Access,Scan Rate,Scaling,Raw Low,"
					+ "Raw High,Scaled Low,Scaled High,Scaled Data Type,Clamp Low,Clamp High,Eng Units,Description,Negate Value"+'\n');
			for(int i = 0;i<Nmod*Nch;i++){
				if (i<9) ch="0"+(i+1);
				else ch=Integer.toString(i+1);
				x.format(
					"\"AI."+ch+"_   EU\",\""+DB+".DBD"+(0+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
//					"\"AI."+ch+"_DatName\",\""+DB+",STRING"+(4+(i*dAddr))+"\",String,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Stat\",\""+DB+".DBW"+(16+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_BrPoint\",\""+DB+".DBD"+(18+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_ImitVal\",\""+DB+".DBD"+(22+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_MinEU\",\""+DB+".DBD"+(26+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_MaxEU\",\""+DB+".DBD"+(30+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Lolo\",\""+DB+".DBD"+(34+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Lo\",\""+DB+".DBD"+(48+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Hi\",\""+DB+".DBD"+(42+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Hihi\",\""+DB+".DBD"+(44+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Kf\",\""+DB+".DBD"+(50+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_mA\",\""+DB+".DBD"+(54+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_InSrc\",\""+DB+".DBW"+(58+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Nch\",\""+DB+".INT"+(60+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_EuNf\",\""+DB+".DBD"+(62+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Eu_1\",\""+DB+".DBD"+(66+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"AI."+ch+"_Eu_On_Imit\",\""+DB+".DBD"+(70+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+
					'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void writeKRDataBaseToFile(int dAddr,String DB) {
		String ch;
		try{
			x = new Formatter("res//KR.csv");
			x.format("Tag Name,Address,Data Type,Respect Data Type,Client Access,Scan Rate,Scaling,Raw Low,"
					+ "Raw High,Scaled Low,Scaled High,Scaled Data Type,Clamp Low,Clamp High,Eng Units,Description,Negate Value"+'\n');
			for(int i = 0;i<45;i++){
				if (i<9) ch="0"+(i+1);
				else ch=Integer.toString(i+1);
				x.format(
					"\"KR."+ch+"_StatCMD\",\""+DB+".DBW"+(12+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"KR."+ch+"_Pos\",\""+DB+".DBD"+(16+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"KR."+ch+"_PosSP\",\""+DB+".DBD"+(20+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void writeRegDataBaseToFile(int dAddr,String DB) {
		String ch;
		try{
			x = new Formatter("res//Reg.csv");
			x.format("Tag Name,Address,Data Type,Respect Data Type,Client Access,Scan Rate,Scaling,Raw Low,"
					+ "Raw High,Scaled Low,Scaled High,Scaled Data Type,Clamp Low,Clamp High,Eng Units,Description,Negate Value"+'\n');
			for(int i = 0;i<45;i++){
				if (i<9) ch="0"+(i+1);
				else ch=Integer.toString(i+1);
				x.format(
					"\"Reg."+ch+"_Uk\",\""+DB+".DBD"+(0+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Ek\",\""+DB+".DBD"+(8+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Stat\",\""+DB+".DBW"+(30+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Sp\",\""+DB+".DBD"+(32+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Pv\",\""+DB+".DBD"+(36+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Ku\",\""+DB+".DBD"+(40+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Ti\",\""+DB+".DBD"+(44+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_Zone\",\""+DB+".DBD"+(48+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_CompA\",\""+DB+".DBD"+(52+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"Reg."+ch+"_CompB\",\""+DB+".DBD"+(56+(i*dAddr))+"\",Float,1,R/W,100,,,,,,,,,,\"\","+'\n'
					);
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void writeDIDataBaseToFile(int Nmod,int Nch,int dAddr,String DB) {
		String ch;
		try{
			x = new Formatter("res//DI.csv");
			x.format("Tag Name,Address,Data Type,Respect Data Type,Client Access,Scan Rate,Scaling,Raw Low,"
					+ "Raw High,Scaled Low,Scaled High,Scaled Data Type,Clamp Low,Clamp High,Eng Units,Description,Negate Value"+'\n');
			for(int i = 0;i<Nmod*Nch;i++){
				if (i<9) ch="0"+(i+1);
				else ch=Integer.toString(i+1);
				x.format("\"DI."+ch+"_Val\",\""+DB+".DBX"+(0+(i*dAddr))+".0\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DI."+ch+"_Nch\",\""+DB+".INT"+(2+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DI."+ch+"_ImitOn\",\""+DB+".DBX"+(4+(i*dAddr))+".0\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DI."+ch+"_ImitOff\",\""+DB+".DBX"+(4+(i*dAddr))+".1\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DI."+ch+"_HotChange\",\""+DB+".DBX"+(4+(i*dAddr))+".2\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void writeDODataBaseToFile(int Nmod,int Nch,int dAddr,String DB) {
		String ch;
		try{
			x = new Formatter("res//DO.csv");
			x.format("Tag Name,Address,Data Type,Respect Data Type,Client Access,Scan Rate,Scaling,Raw Low,"
					+ "Raw High,Scaled Low,Scaled High,Scaled Data Type,Clamp Low,Clamp High,Eng Units,Description,Negate Value"+'\n');
			for(int i = 0;i<Nmod*Nch;i++){
				if (i<9) ch="0"+(i+1);
				else ch=Integer.toString(i+1);
				x.format("\"DO."+ch+"_Val\",\""+DB+".DBX"+(0+(i*dAddr))+".0\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DO."+ch+"_Nch\",\""+DB+".INT"+(2+(i*dAddr))+"\",Word,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DO."+ch+"_ImitOn\",\""+DB+".DBX"+(4+(i*dAddr))+".0\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n'+
					"\"DO."+ch+"_ImitOff\",\""+DB+".DBX"+(4+(i*dAddr))+".1\",Boolean,1,R/W,100,,,,,,,,,,\"\","+'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	
	private static void DIDataBasee() {
		try{
			x = new Formatter("res//DB703.doc");
			for(int i = 1;i<=320;i++){
				x.format("DIN["+i+"].Val := FALSE;"+'\n'+
				   "DIN["+i+"].Nch :="+ i+";"+'\n'+
				   "DIN["+i+"].ImitOn := FALSE;" +'\n'+
				   "DIN["+i+"].ImitOff := FALSE;" +'\n'+
				   "DIN["+i+"].HotChange := FALSE;"+'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void DODataBasee() {
		try{
			x = new Formatter("res//DB705.doc");
			for(int i = 1;i<=256;i++){
				x.format("DOUT["+i+"].Val := FALSE;"+'\n'+
				   "DOUT["+i+"].Nch :="+ i+";"+'\n'+
				   "DOUT["+i+"].ImitOn := FALSE;" +'\n'+
				   "DOUT["+i+"].ImitOff := FALSE;" +'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void KRDataBasee() {
		String[] KRName ={"'KRBP1'",
				"'KRPP1'",
				"'KRUP1'",
				"'KRBP3'",
				"'KRPP3'",
				"'KRUD3'",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '",
				"' '"};
		try{
			x = new Formatter("res//DB704.doc");
			for(int i = 1;i<=44;i++){
				x.format("KR["+i+"].KRName := "+KRName[i-1]+";" +'\n'+
				   "KR["+i+"].ToOp := FALSE ;" +'\n'+
				   "KR["+i+"].ToCl := FALSE;" +'\n'+
				   "KR["+i+"].Opening := FALSE;" +'\n'+
				   "KR["+i+"].Closing := FALSE;" +'\n'+
				   "KR["+i+"].IsOp := FALSE;" +'\n'+
				   "KR["+i+"].IsCl := FALSE;" +'\n'+
				   "KR["+i+"].More := FALSE;" +'\n'+
				   "KR["+i+"].Less := FALSE;" +'\n'+
				   "KR["+i+"].SetPos := FALSE;" +'\n'+
				   "KR["+i+"].SetPosOpening := FALSE;" +'\n'+
				   "KR["+i+"].SetPosClosing := FALSE;" +'\n'+
				   "KR["+i+"].Stop := FALSE;" +'\n'+
				   "KR["+i+"].Error := FALSE;" +'\n'+
				   "KR["+i+"].VtoOp := FALSE;" +'\n'+
				   "KR["+i+"].VtoCl := FALSE;" +'\n'+
				   "KR["+i+"].KRType := 0;" +'\n'+
				   "KR["+i+"].Pos := 0.000000e+000;" +'\n'+
				   "KR["+i+"].PosSp := 0.000000e+000;" +'\n'+
				   "KR["+i+"].SpIsOp := 0.000000e+000;" +'\n'+
				   "KR["+i+"].SpIsCl := 0.000000e+000;" +'\n'+
				   "KR["+i+"].Nch_IsOp := 0;" +'\n'+
				   "KR["+i+"].Nch_IsCl := 0;" +'\n'+
				   "KR["+i+"].Nch_PV := 0;" +'\n'+
				   "KR["+i+"].Nch_Pos := 0;" +'\n'+
				   "KR["+i+"].Nch_VtoOp := 0;" +'\n'+
				   "KR["+i+"].Nch_VtoCl := 0;" +'\n'+
				   "KR["+i+"].TMROP.TCur := 0.000000e+000;" +'\n'+
				   "KR["+i+"].TMROP.TOpen := 130.0;" +'\n'+
				   "KR["+i+"].TMROP.TMore := 0.5;" +'\n'+
				   "KR["+i+"].TMROP.TPrev := 0.000000e+000;" +'\n'+ 
				   "KR["+i+"].TMROP.Enable := FALSE;" +'\n'+
				   "KR["+i+"].TMROP.Act := FALSE;" +'\n'+
				   "KR["+i+"].TMRCL.TCur := 0.000000e+000;" +'\n'+
				   "KR["+i+"].TMRCL.TClose := 130.0;" +'\n'+
				   "KR["+i+"].TMRCL.TLess := 0.5;" +'\n'+
				   "KR["+i+"].TMRCL.TPrev := 0.000000e+000;" +'\n'+
				   "KR["+i+"].TMRCL.Enable := FALSE;" +'\n'+
				   "KR["+i+"].TMRCL.Act := FALSE;" +'\n'+
				   "KR["+i+"].TMRST.TCur := 0.000000e+000;" +'\n'+
				   "KR["+i+"].TMRST.TPrev := 0.000000e+000;" +'\n'+
				   "KR["+i+"].TMRST.Enable := FALSE;" +'\n'+
				   "KR["+i+"].TMRST.Act := FALSE;" +'\n');
			}
			x.close();
		}catch(Exception e){};		
	}
	private static void writeAIDataBaseToFileForPanel(int Nmod,int Nch,int dAddr,String DB) {
		String ch;
		try{
			x = new Formatter("res//Tags.csv");
			x.format("windowsNumber,,,Int,,1,2,1 s,,,,,0,10,0,100,0,,0,"+'\n');
			for(int i = 0;i<Nmod*Nch;i++){
				if (i<9) ch="0"+(i+1);

				else ch=Integer.toString(i+1);
				x.format("AI/AI_"+ch+"_EU,Connection_1,"+DB+" DBD "+(0+(i*dAddr))+",Real,,1,2,1 s,,,,,0,10,0,100,0,,0,"+'\n'+
				"AI/AI_"+ch+"_STATE,Connection_1,"+DB+" DBW "+(16+(i*dAddr))+"Word,,1,2,1 s,,,,,0,10,0,100,0,,0,"+'\n');
		}
			x.close();
		}catch(Exception e){};		
	}   
	
}
