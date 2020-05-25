package model;


import javafx.beans.property.SimpleStringProperty;

public class Exercise {

    private SimpleStringProperty m;
    private SimpleStringProperty t;
    private SimpleStringProperty w;
    private SimpleStringProperty th;
    private SimpleStringProperty f;
    private SimpleStringProperty  s;
    private SimpleStringProperty su;

  /*  public Exercise()
    {
        this.m=new SimpleStringProperty("");
        this.t=new SimpleStringProperty("");
        this.w=new SimpleStringProperty("");
        this.th=new SimpleStringProperty("");
        this.f=new SimpleStringProperty("");
        this.s=new SimpleStringProperty("");
        this.su=new SimpleStringProperty("");
    }
*/
    public Exercise(String m, String t, String w, String th, String f, String s, String su)
    {
        this.m=new SimpleStringProperty(m);
        this.t=new SimpleStringProperty(t);
        this.w=new SimpleStringProperty(w);
        this.th=new SimpleStringProperty(th);
        this.f=new SimpleStringProperty(f);
        this.s=new SimpleStringProperty(s);
        this.su=new SimpleStringProperty(su);

    }

    public String getM() {
        return m.get();
    }

    public void setM(String m) {
        this.m = new SimpleStringProperty(m);
    }

    public String getT() {
        return t.get();
    }

    public void setT(String t) {
        this.t =new SimpleStringProperty(t);
    }

    public String getW() {
        return w.get();
    }

    public void setW(String w) {
        this.w = new SimpleStringProperty(w);
    }

    public String getTh() {
        return th.get();
    }

    public void setTh(String th) {
        this.th = new SimpleStringProperty(th);
    }

    public String getF() {
        return f.get();
    }

    public void setF(String f) {
        this.f = new SimpleStringProperty(f);
    }

    public String getS() {
        return s.get();
    }

    public void setS(String s) {
        this.s = new SimpleStringProperty(s);
    }

    public String getSu() {
        return su.get();
    }

    public void setSu(String su) {
        this.su = new SimpleStringProperty(su);
    }

    public String toString()
    {
        return String.format("%s %s %s %s %s %s %s", m, t,w, th, f, s, su);
    }
}
