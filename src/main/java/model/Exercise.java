package model;


import javafx.beans.property.SimpleStringProperty;

public class Exercise {

    private SimpleStringProperty m;
    private SimpleStringProperty t;
    private SimpleStringProperty w;
    private SimpleStringProperty th;
    private SimpleStringProperty f;
    private SimpleStringProperty s;
    private SimpleStringProperty su;

    public Exercise()
    {/*
        this.m=new SimpleStringProperty("");
        this.t=new SimpleStringProperty("");
        this.w=new SimpleStringProperty("");
        this.th=new SimpleStringProperty("");
        this.f=new SimpleStringProperty("");
        this.s=new SimpleStringProperty("");
        this.su=new SimpleStringProperty("");*/
    }

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

    public String getm() {
        return m.get();
    }

    public void setm(String m) {
        this.m = new SimpleStringProperty(m);
    }

    public String gett() {
        return t.get();
    }

    public void sett(String t) {
        this.t =new SimpleStringProperty(t);
    }

    public String getw() {
        return w.get();
    }

    public void setw(String w) {
        this.w = new SimpleStringProperty(w);
    }

    public String getth() {
        return th.get();
    }

    public void setth(String th) {
        this.th = new SimpleStringProperty(th);
    }

    public String getf() {
        return f.get();
    }

    public void setf(String f) {
        this.f = new SimpleStringProperty(f);
    }

    public String gets() {
        return s.get();
    }

    public void sets(String s) {
        this.s = new SimpleStringProperty(s);
    }

    public String getsu() {
        return su.get();
    }

    public void setsu(String su) {
        this.su = new SimpleStringProperty(su);
    }

    public String toString()
    {
        return String.format("%s %s %s %s %s %s %s", m, t,w, th, f, s, su);
    }
}
