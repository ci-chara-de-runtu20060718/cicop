package com.neusoft.nep.controller;

import com.neusoft.nep.entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;

public class UserLoginViewController {
    @FXML
    private Button btn_login;
    public  void  login() throws IOException {
//        System.out.println("登录成功！");
        //
         //
        try {
            File file = new File("user.txt");
            if (!file.exists()){
                System.out.println("文件不存在，登录失败");
                return;
            }
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //读取用户数据

            User u = (User) ois.readObject();
            if (u.getPassword().equals(ois.readObject())){
                System.out.println("密码错误！");
                System.exit(0);
            }
            System.out.println("电话号" + u.getPhonenumber());
            System.out.println("用户名" + u.getUserName());
            System.out.println("出生日期" + u.getBath());
            System.out.println("备注" + u.getRemark());
            System.out.println("密码" + u.getPassword());

        } catch (ClassNotFoundException e) {
            System.out.println("登录失败");
            throw new RuntimeException(e);
        }





    }
    //绑定视图文件中的控件

    @FXML
    private Button btn_register;
    @FXML
    public void register(ActionEvent event) throws IOException {


        //获取stage对象
        Stage stage = (Stage) btn_register.getScene().getWindow();
        //加载注册界面的fxml视图
        FXMLLoader fxmlLoader = new FXMLLoader();
        URL url = getClass().getResource("../view/UserRegisterView.fxml");
        fxmlLoader.setLocation(url);
        Parent root = fxmlLoader.load();
        Scene scene = btn_register.getScene();
        scene.setRoot(root);
        stage.setScene(scene);
        stage.show();

//        Stage stage = new Stage();
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/neusoft/nep/view/UserRegisterView.fxml"));
//        Parent nextRoot = loader.load();
//        Scene scene = new Scene(nextRoot);
//        stage.setScene(scene);
//        stage.show();
//        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        currentStage.close();

    }
    ;
}
