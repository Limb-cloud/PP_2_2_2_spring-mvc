package web.model;

public class Car {
  private Integer series;
  private String model;
  private String mark;

  public Car(Integer series, String model, String mark) {
    this.series = series;
    this.model = model;
    this.mark = mark;
  }

  public Integer getSeries() {
    return series;
  }

  public void setSeries(Integer series) {
    this.series = series;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getMark() {
    return mark;
  }

  public void setMark(String mark) {
    this.mark = mark;
  }
}
