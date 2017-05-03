package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;
import java.util.Observable;

public class Controller {

    private ObservableList<Book> bookData = FXCollections.observableArrayList();

    @FXML
            private TableView<Book> tableView;
    @FXML
            private TableColumn author;
    @FXML
            private TableColumn id;
    @FXML
            private TableColumn book;
    @FXML
            private TableColumn description;




    @FXML
    public void initialize(){

        // the table begins

        // устанавливаем тип и значение которое должно хранится в колонке
        id.setCellValueFactory(new PropertyValueFactory<Book, Integer>("id"));
        author.setCellValueFactory(new PropertyValueFactory<Book, String>("author"));
        book.setCellValueFactory(new PropertyValueFactory<Book, String>("bookName"));
        description.setCellValueFactory(new PropertyValueFactory<Book, String>("description"));
        initData();

        // заполняем таблицу данными
        tableView.setItems(bookData);
    }

    public void initData(){
        bookData.add(new Book(1, "Alex Morty", "Lol v ", "Zaebis kniga, chetko"));
        bookData.add(new Book(1, "Alex Morty", "Lol v koncepcii kosmosa", "Zaebis kniga, chetko"));
        bookData.add(new Book(1, "Alex Morty", "Lol v koncepcii kosmosa", "Zaebis kniga, chetko"));
        bookData.add(new Book(1, "Alex Morty", "Lol v koncepcii kosmosa", "Zaebis kniga, chetko"));
        bookData.add(new Book(1, "Alex Morty", "Lol v koncepcii kosmosa", "Zaebis kniga, chetko"));

    }

    @FXML
    public void updateButton(){
//        description.setCellFactory();
    }
}
