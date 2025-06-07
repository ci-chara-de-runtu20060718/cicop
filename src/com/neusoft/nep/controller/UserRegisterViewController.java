package com.neusoft.nep.controller;

import com.neusoft.nep.entity.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.List;

public class UserRegisterViewController {

    @FXML
    private Button btn_back;
    @FXML
    private TextField txt_phonenumber;
    @FXML
    private  TextField txt_userName;
    @FXML
    private TextField txt_bath;
    @FXML
    private TextField txt_remark;
    @FXML
    private TextField txt_password;
    @FXML
    private TextField txt_repassword;
//    @FXML
//    private TextField txt_remark;

    public  void saveUser(){
        String phonenumber = txt_phonenumber.getText();
        String userName = txt_userName.getText();
        String remark = txt_remark.getText();
        String bath = txt_bath.getText();
        String password = txt_password.getText();
        String repassword = txt_repassword.getText();
        User user1 = new User(phonenumber,userName,remark,bath,password,repassword);
        System.out.println("phonenumber:" + txt_phonenumber.getText());
        System.out.println("userName:" + txt_userName.getText());
        System.out.println("bath:" + txt_bath.getText());
        System.out.println("password:" + txt_password.getText());
        System.out.println("remark:" + txt_remark.getText());
        System.out.println("repassword:" + txt_repassword.getText());

        //
        try{
            File file = new File("user.txt");
            if(!file.exists()){//如果文件不存在，则创建一个新文件
                file.createNewFile();
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<User> userList = (List)ois.readObject();

            //构建一个文件输出流
            FileOutputStream fos = new FileOutputStream(file);
            //构建一个对象输出流
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //使用oos写入对象
            oos.writeObject(user1);
            oos.flush();
            System.out.println("用户信息存入成功");
        } catch (IOException e) {
            System.out.println("用户信息存入失败");
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public void back() throws IOException {
        System.out.println("返回成功！");
        Stage stage = (Stage) btn_back.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader();
        URL url = getClass().getResource("../view/UserLoginView.fxml");
        fxmlLoader.setLocation(url);
        Parent root = fxmlLoader.load();
        Scene scene = btn_back.getScene();
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();

    }


}
