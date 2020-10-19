package usantatecla.mastermind.models;

import java.util.ArrayList;
import java.util.List;

abstract class Combination {

    protected List<Color> colors;

    protected Combination (){
        this.colors = new ArrayList<Color>();
    }

}
