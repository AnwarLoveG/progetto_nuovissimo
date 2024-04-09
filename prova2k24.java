package primeProve;

import java.util.Hashtable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class prova2k24 extends Application{
	
	TextField tNum= new TextField();
	Label lRis = new Label();
	
	public void start(Stage finestra) {
		Label lNum= new Label("Inserisci num");
		Label lBcd=new Label("Numero in bcd");
		Button bCalcola=new Button("Calcola");

		GridPane griglia = new GridPane();
		griglia.add(lNum,0,0);
		griglia.add(tNum, 0, 1);
		griglia.add(bCalcola, 0, 2);
		griglia.add(lBcd, 0, 3);
		griglia.add(lRis, 0, 4);
		griglia.setHgap(10);
		griglia.setVgap(10);
				
		Scene scena =new Scene(griglia,300,250);
		finestra.show();
		finestra.setTitle("");
		finestra.setScene(scena);
		
		bCalcola.setOnAction(e->calcola());

		
	
	}
	public void calcola() {
		String v[]=tNum.getText().split("");
		String sBcd="";
		
		Hashtable <String,String> conversione= new Hashtable <String,String>();
		
		conversione.put("0","0000");
		conversione.put("1","0001");
		conversione.put("2","0010");
		conversione.put("3","0011");
		conversione.put("4","0100");
		conversione.put("5","0101");
		conversione.put("6","0110");
		conversione.put("7","0111");
		conversione.put("8","1000");
		conversione.put("9","1001");
		
		for(int i=0;i<v.length;i++) {
			sBcd+=conversione.get(v[i]);
		}
		lRis.setText(sBcd);
		
	
		
	}
	public static void main(String []args) {
		launch(args);
	}

}
