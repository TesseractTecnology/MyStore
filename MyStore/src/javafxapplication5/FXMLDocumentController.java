/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication5;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author welli
 */
public class FXMLDocumentController implements Initializable {
    
       
    @FXML
    public TextField nomeProduto;
    public TextField dataEnt;
    public TextField fornecedor;
    public TextField codBar;
    public TextField quantidade;
    public TextField dataFab;
    public TextField dataVal;
    public TextField valor;
    
    @FXML
    public TextArea desc;
    
    @FXML
    public Button btnAdicionar;
    public Button btnPesquisar;
    public Button btnLimpar;
    
    public String np, frn, cat, barcode;
    public int  qntd;
    public float preço;
        
    @FXML
    private void handleButtonAction(ActionEvent event) throws SQLException {
        
        ConexaoMySql con = new ConexaoMySql();
        
        
        
        np = nomeProduto.getText();
        frn = fornecedor.getText();
        cat = "Lacticinios";
        
        barcode = codBar.getText();
        
        
        Statement st = con.conexao.createStatement();
       /* String sql = ("INSERT INTO usuarios (USUARIOS,NOME,SENHA) VALUES" +  "(" + "'" + var1 + "'," + "'" + var2 + "'," + "'" + var3 + "')");
        st.execute(sql);
        execTerminada(); */
                
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void execTerminada() {
       /* Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Execução Dialog");
        alert.setHeaderText("Look, an Information Dialog");
        alert.setContentText("Nós inserimos" + var1 + var2 + var3);

        alert.showAndWait();*/
    
    
    }
    
}
