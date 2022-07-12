package controller;

import db.DbConnection;
import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentManageFormController {
    public TableView tblStudent;
    public TableColumn colStudentID;
    public TableColumn colStudentName;
    public TableColumn colEmail;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colNIC;
    public TextField txtStudentID;
    public TextField txtNIC;
    public TextField txtAddress;
    public TextField txtContact;
    public TextField txtStudentName;
    public TextField txtEmail;

    public void studentUpdateOnAction(ActionEvent actionEvent) {
    }

    public void studentDeleteOnAction(ActionEvent actionEvent) {
    }

    public void studentSearchOnAction(ActionEvent actionEvent) {
    }

    public boolean studentAddOnAction(Student s ) throws SQLException, ClassNotFoundException {
        Connection con= DbConnection.getInstance().getConnection();
        String query="INSERT INTO Student VALUES(?,?,?,?,?,?)";
        PreparedStatement stm = con.prepareStatement(query);
        stm.setObject(1,s.getStudentID());
        stm.setObject(2,s.getStudentName());
        stm.setObject(3,s.getEmail());
        stm.setObject(4,s.getContact());
        stm.setObject(5,s.getAddress());
        stm.setObject(6,s.getNIC());
        return stm.executeUpdate()>0;
    }
    public Student getStudent(String id) throws SQLException, ClassNotFoundException {
        PreparedStatement stm = DbConnection.getInstance()
                .getConnection().prepareStatement("SELECT * FROM Student WHERE id=?");
        stm.setObject(1, id);

        ResultSet rst = stm.executeQuery();
        if (rst.next()) {
            return new Student(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getString(5),
                    rst.getString(6)
            );

        } else {
            return null;
        }
    }
    public List<String> getStudentIds() throws SQLException, ClassNotFoundException {
        ResultSet rst = DbConnection.getInstance().
                getConnection().prepareStatement("SELECT * FROM Student").executeQuery();
        List<String> ids = new ArrayList<>();
        while (rst.next()){
            ids.add(
                    rst.getString(1)
            );
        }
        return ids;
    }
}
