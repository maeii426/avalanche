package booyah.test;

/**
 * Created by Christine Russell on 4/16/16.
 */

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Application;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import java.util.ArrayList;

import static java.lang.System.out;

public class NFLPresenter extends Application {

    //NFLView v;
    NFLModel m;

    ArrayList<String> picks = new ArrayList<String>();

    int week;

    public NFLPresenter(){
    //    v = new NFLView();
        m = new NFLModel();
        week = 0;
    }

    public void setM(String u, String s) {
        m.setUser(u);
        m.setSeason(s);
        out.println("pres setM");
    }

    public String getUser() {
        out.println("pres getUser");
        return m.getUser();
    }

    public String getSeason() {
        out.println("pres getSeason");
        return m.getSeason();
    }

    public void increaseWeek() {
        ++week;
    }

    public int getWeek() {
        return week;
    }

    public void resetWeek() {
        week = 0;
    }

    public void resetGames() {
        m.resetGames();
    }

    public void setGames() {
        m.setGames(week);
    }

    public void setPicks(ArrayList<String> p) {
        picks.clear();
        picks = p;
    }

    public ArrayList<String> getHome() {
        return m.getHome();
    }

    public ArrayList<String> getAway() {
        return m.getAway();
    }

    public ArrayList<String> getPicks() {
        return picks;
    }

    public ArrayList<String> getWinners() {
        return m.getWinners(week);
    }

    public double getWklyUserAccuracy() {
        return m.getWklyUserAccuracy(picks);
    }
}
