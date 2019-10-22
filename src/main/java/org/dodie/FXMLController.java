package org.dodie;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class FXMLController {
    @FXML
    public static Button buttonMaximizar;
    @FXML
    private Button buttonSair;
    @FXML
    private Label labelFalta;
    @FXML
    private Label labelVantagem;
    @FXML
    private Label labelDoisPontos;
    @FXML
    private Label labelTresPontos;
    @FXML
    private Label labelQuatroPontos;
    @FXML
    private Label labelTotal;

    @FXML
    private Label labelFalta2;
    @FXML
    private Label labelVantagem2;
    @FXML
    private Label labelDoisPontos2;
    @FXML
    private Label labelTresPontos2;
    @FXML
    private Label labelQuatroPontos2;
    @FXML
    private Label labelTotal2;

    public void initialize() {
    }

    @FXML
    private void setButtonSair() {
        Platform.exit();
    }

    @FXML
    public void setButtonMaximizar() throws Exception {
        //TODO = implementar motão fullscreen
    }

    /* Handlers competidor um */
    @FXML
    private void handleLabelFalta(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            falta();
            total();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelFalta.getText()) > 0) {
            menosFalta();
            total();
        }
    }

    @FXML
    private void handleLabelVantagem(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            vantagem();
            total();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelVantagem.getText()) > 0) {
            menosVantagem();
            total();
        }
    }

    @FXML
    private void handleLabelDoisPontos(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            doisPontos();
            total();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelDoisPontos.getText()) > 0) {
            menosDoisPontos();
            total();
        }
    }

    @FXML
    private void handleLabelTresPontos(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            tresPontos();
            total();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelTresPontos.getText()) > 0) {
            menosTresPontos();
            total();
        }
    }

    @FXML
    private void handleLabelQuatroPontos(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            quatroPontos();
            total();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelQuatroPontos.getText()) > 0) {
            menosQuatroPontos();
            total();
        }
    }

    /* Handlers competidor dois */

    @FXML
    private void handleLabelFalta2(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            falta2();
            total2();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelFalta2.getText()) > 0) {
            menosFalta2();
            total2();
        }
    }

    @FXML
    private void handleLabelVantagem2(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            vantagem2();
            total2();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelVantagem2.getText()) > 0) {
            menosVantagem2();
            total2();
        }
    }

    @FXML
    private void handleLabelDoisPontos2(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            doisPontos2();
            total2();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelDoisPontos2.getText()) > 0) {
            menosDoisPontos2();
            total2();
        }
    }

    @FXML
    private void handleLabelTresPontos2(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            tresPontos2();
            total2();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelTresPontos2.getText()) > 0) {
            menosTresPontos2();
            total2();
        }
    }

    @FXML
    private void handleLabelQuatroPontos2(MouseEvent event) {
        MouseButton button = event.getButton();
        if (button == MouseButton.PRIMARY) {
            quatroPontos2();
            total2();
        } else if (button == MouseButton.SECONDARY && Integer.parseInt(labelQuatroPontos2.getText()) > 0) {
            menosQuatroPontos2();
            total2();
        }
    }

    /* Pontuação primeiro competidor */

    private void falta() {
        int valor = Integer.parseInt(labelFalta.getText());
        int total = valor + 1;
        labelFalta.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosFalta() {
        int valor = Integer.parseInt(labelFalta.getText());
        int total = valor - 1;
        labelFalta.setText((total <= 9 ? "0" : "") + total);
    }

    private void vantagem() {
        int valor = Integer.parseInt(labelVantagem.getText());
        int total = valor + 1;
        labelVantagem.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosVantagem() {
        int valor = Integer.parseInt(labelVantagem.getText());
        int total = valor - 1;
        labelVantagem.setText((total <= 9 ? "0" : "") + total);
    }

    private void doisPontos() {
        int valor = Integer.parseInt(labelDoisPontos.getText());
        int total = valor + 2;
        labelDoisPontos.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosDoisPontos() {
        int valor = Integer.parseInt(labelDoisPontos.getText());
        int total = valor - 2;
        labelDoisPontos.setText((total <= 9 ? "0" : "") + total);
    }

    private void tresPontos() {
        int valor = Integer.parseInt(labelTresPontos.getText());
        int total = valor + 3;
        labelTresPontos.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosTresPontos() {
        int valor = Integer.parseInt(labelTresPontos.getText());
        int total = valor - 3;
        labelTresPontos.setText((total <= 9 ? "0" : "") + total);
    }

    private void quatroPontos() {
        int valor = Integer.parseInt(labelQuatroPontos.getText());
        int total = valor + 4;
        labelQuatroPontos.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosQuatroPontos() {
        int valor = Integer.parseInt(labelQuatroPontos.getText());
        int total = valor - 4;
        labelQuatroPontos.setText((total <= 9 ? "0" : "") + total);
    }

    private void total() {
        int queda = Integer.parseInt(labelDoisPontos.getText());
        int passagem = Integer.parseInt(labelTresPontos.getText());
        int montada = Integer.parseInt(labelQuatroPontos.getText());
        int total = queda + passagem + montada;
        labelTotal.setText((total <= 9 ? "0" : "") + total);
    }

    /* Pontuação segundo competidor */

    private void falta2() {
        int valor = Integer.parseInt(labelFalta2.getText());
        int total = valor + 1;
        labelFalta2.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosFalta2() {
        int valor = Integer.parseInt(labelFalta2.getText());
        int total = valor - 1;
        labelFalta2.setText((total <= 9 ? "0" : "") + total);
    }

    private void vantagem2() {
        int valor = Integer.parseInt(labelVantagem2.getText());
        int total = valor + 1;
        labelVantagem2.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosVantagem2() {
        int valor = Integer.parseInt(labelVantagem2.getText());
        int total = valor - 1;
        labelVantagem2.setText((total <= 9 ? "0" : "") + total);
    }

    private void doisPontos2() {
        int valor = Integer.parseInt(labelDoisPontos2.getText());
        int total = valor + 2;
        labelDoisPontos2.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosDoisPontos2() {
        int valor = Integer.parseInt(labelDoisPontos2.getText());
        int total = valor - 2;
        labelDoisPontos2.setText((total <= 9 ? "0" : "") + total);
    }

    private void tresPontos2() {
        int valor = Integer.parseInt(labelTresPontos2.getText());
        int total = valor + 3;
        labelTresPontos2.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosTresPontos2() {
        int valor = Integer.parseInt(labelTresPontos2.getText());
        int total = valor - 3;
        labelTresPontos2.setText((total <= 9 ? "0" : "") + total);
    }

    private void quatroPontos2() {
        int valor = Integer.parseInt(labelQuatroPontos2.getText());
        int total = valor + 4;
        labelQuatroPontos2.setText((total <= 9 ? "0" : "") + total);
    }

    private void menosQuatroPontos2() {
        int valor = Integer.parseInt(labelQuatroPontos2.getText());
        int total = valor - 4;
        labelQuatroPontos2.setText((total <= 9 ? "0" : "") + total);
    }

    private void total2() {
        int queda = Integer.parseInt(labelDoisPontos2.getText());
        int passagem = Integer.parseInt(labelTresPontos2.getText());
        int montada = Integer.parseInt(labelQuatroPontos2.getText());
        int total = queda + passagem + montada;
        labelTotal2.setText((total <= 9 ? "0" : "") + total);
    }

}
