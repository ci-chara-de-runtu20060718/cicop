import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import javax.swing.border.Border;
import java.net.URL;

public class UserLogin extends Application {


    @Override
    public void start(Stage stage) throws Exception {
//        Button btn = new Button("登录");
//        //创建一个按钮
////        btn.setOnAction(new EventHandler<ActionEvent>() {
////            @Override
////            public void handle(ActionEvent actionEvent) {
////                System.out.println("按钮被点击");
////            }
////        });
////        //创建一个“Action--动作”，传递一个EH的接口对象，然后再创建
////        //一个具体的行动，即”点击“后打印我们指定的信息
//        btn.setOnAction(actionEvent ->{
//            System.out.println("按钮被焯了");
//        });//使用箭头函数来简化代码和上面代码块功能相同
//        BorderPane borderPane = new BorderPane();
//        //创建一个装按钮的容器
//        borderPane.setCenter(btn);
//        //把上面创建的那个按钮放进新做的按钮容钮
//        Scene scene = new Scene(borderPane,400,400);
//        //创建一个“场景”，400*400的大小，并把按钮放上去
////        stage.setFullScreen(true);
////        //设置全屏化
////        stage.setMaximized(true);
////        //设置最大窗口化，即保留工具栏
//        stage.setScene(scene);
//        //把场景放进“舞台”
//        stage.show();
//        //显示舞台
//
        //从一个fxml文件中加载视图
        FXMLLoader fxmlLoader = new FXMLLoader();
        //为fxml设置要加载的fxmlloader文件路径
        URL url = getClass().getResource("com/neusoft/nep/view/UserLoginView.fxml");
        //设置加载路径
        fxmlLoader.setLocation(url);
        //加载视图,NODE根节点
        Parent root = fxmlLoader.load();
        //创建一个Scene
        Scene scene = new Scene(root);
        //将scene设置给stage
        stage.setScene(scene);
        //显示舞台
        stage.show();



    }
}
