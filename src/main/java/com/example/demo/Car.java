package com.example.demo;

public class Car {
    private Integer id;
    private static Integer num = 0;

    public Car() {
        super();
        id =  num++;
    }

    public Car(String namn,String model,String color, int year  ) {
        super();
        id =  num++;
        this.namn = namn;
        this.model = model;
        this.color = color;
        this.year = year;
    }


    public Integer getId() {
        return id;
      }
    
      public void setId(Integer id) {
        this.id = id;
      }
    
  
    private String namn;
    private String model;
    private String color;
    private int year;

    public void setNamn(String s)
    {
        namn  = s;
    }
    public String getNamn()
    {
        return namn;
    }


    public void setModel(String v)
    {
        model = v;
    }

    public void setColor(String v)
    {
        color  = v;
    }
    public void setYear(int v)
    {
        year  = v;
    }
    public int getYear()
    {
        return year;
    }


    public String getModel()
    {
        return model;
    }
    public String getColor()
    {
        return color;
    }
}
