package com.olavo.finalproject.client;

import com.olavo.finalproject.Main;
import com.olavo.finalproject.common.entity.EntityController;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.io.IOException;

public class ClientDeleteController extends EntityController {

    @FXML
    private Button btnDelete;

    @FXML
    private TextField edtEmail;

    public void btnDeleteClick() {
        delete();
        try {
            Main.switchScene("ClientLobbyWin");
        } catch (IOException e) {
            System.out.println("ClientDeleteController.btnDeleteClick: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
    }

    private void delete() {
        ClientDTO clientDTO = new ClientDTO();

        clientDTO.setEmail(edtEmail.getText());

        new ClientDAO().delete(clientDTO);
    }

}
