package com.example.state.s;

public enum  StateEnum {
    
    yitijiao(1,"yitijiao"),
    yizhifu(2,"yizhifu"),
    yituikuan(3,"yituikuan");

   private Integer id;
   private String desc;

    StateEnum(Integer id, String desc) {
        this.id = id;
        this.desc = desc;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}