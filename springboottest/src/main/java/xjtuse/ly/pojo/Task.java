package xjtuse.ly.pojo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Task {

    private Integer id;
    private String content;
    private Date createTime;
    public Task(){
        this.id =0;
        this.content = "";
        this.createTime = new Date();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        return dateFormat.format(createTime);
    }


}
