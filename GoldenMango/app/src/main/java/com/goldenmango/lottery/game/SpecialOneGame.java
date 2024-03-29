package com.goldenmango.lottery.game;

import android.app.Activity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.goldenmango.lottery.R;
import com.goldenmango.lottery.data.Lottery;
import com.goldenmango.lottery.data.Method;
import com.goldenmango.lottery.pattern.PickNumber;
import com.google.gson.JsonArray;

/**
 * Created by ACE-PC on 2016/2/19.
 */
public class SpecialOneGame extends Game {
    private static final String TAG = SpecialOneGame.class.getSimpleName();

    public SpecialOneGame(Activity activity, Method method, Lottery lottery) {
        super(activity, method, lottery);
    }

    @Override
    public void onInflate() {
        try {
            java.lang.reflect.Method function = getClass().getMethod(method.getNameEn() + method.getId(), Game.class);
            function.invoke(null, this);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "onInflate: " + "//"
                    + method.getNameCn() + " " + method.getNameEn() + method.getId()
                    + " public static void " + method.getNameEn() + method.getId()
                    + "(Game game) {}");
            Toast.makeText(topLayout.getContext(), "不支持的类型", Toast.LENGTH_LONG).show();
        }
    }

    public String getWebViewCode() {
        JsonArray jsonArray = new JsonArray();
        for (PickNumber pickNumber : pickNumbers) {
            jsonArray.add(transform(pickNumber.getCheckedNumber(), pickNumber.getNumberCount(),true));
        }
        return jsonArray.toString();
    }

    public String getSubmitCodes() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0, size = pickNumbers.size(); i < size; i++) {
            builder.append(transformSpecial(pickNumbers.get(i).getCheckedNumber(), false, false));
            if (i != size - 1) {
                builder.append("|");
            }
        }
        return builder.toString();
    }

    public void onRandomCodes() {
        try {
            java.lang.reflect.Method function = getClass().getMethod(method.getNameEn() + method.getId() + "Random", Game.class);
            function.invoke(null, this);
        } catch (Exception e) {
            e.printStackTrace();
            Log.i(TAG, "onInflate: " + "//"
                    + method.getNameCn() + " " + method.getNameEn() + method.getId() + "Random"
                    + " public static void " + method.getNameEn() + method.getId() + "Random"
                    + "(Game game) {}");
            Toast.makeText(topLayout.getContext(), "不支持的类型", Toast.LENGTH_LONG).show();
        }
    }

    private static void addPickSpecialNumberGame(Game game, View topView, String title, int min, int max) {
        PickNumber pickNumberSpecial = new PickNumber(topView, title);
        pickNumberSpecial.setControlBarHide(false);
        pickNumberSpecial.getNumberGroupView().setNumber(min, max);
        game.addPickNumber(pickNumberSpecial);
    }

    public static View createDefaultPickLayout(ViewGroup container) {
        return LayoutInflater.from(container.getContext()).inflate(R.layout.pick_column, null, false);
    }

    private static void createPicklayout(Game game, String[] name, int min, int max) {
        View[] views = new View[name.length];
        for (int i = 0; i < name.length; i++) {
            View view = createDefaultPickLayout(game.getTopLayout());
            addPickSpecialNumberGame(game, view, name[i], min, max);
            views[i] = view;
        }

        ViewGroup topLayout = game.getTopLayout();
        for (View view : views) {
            topLayout.addView(view);
        }
    }

    //直选和值 hezhi71
    public static void hezhi71(Game game) {
        createPicklayout(game, new String[]{"直选和值"}, 0, 3 * 9);
    }

    //直选和值 hezhi151
    public static void hezhi151(Game game) {
        createPicklayout(game, new String[]{"直选和值"}, 0, 3 * 9);
    }

    //直选和值 hezhi73
    public static void hezhi73(Game game) {
        createPicklayout(game, new String[]{"直选和值"}, 0, 3 * 9);
    }

    //后二和值 houerhezhi74
    public static void houerhezhi74(Game game) {
        createPicklayout(game, new String[]{"后二和值"}, 0, 2 * 9);
    }

    //前二和值 qianerhezhi72
    public static void qianerhezhi72(Game game) {
        createPicklayout(game, new String[]{"前二和值"}, 0, 2 * 9);
    }

    //直选和值 zhixuanhezhi196
    public static void zhixuanhezhi196(Game game) {
        createPicklayout(game, new String[]{"任选前二和值"}, 0, 2 * 9);
    }
    
    //福彩3D
    //直选和值 hezhi139
    public static void hezhi139(Game game){
        createPicklayout(game, new String[]{"直选和值"}, 0, 3 * 9);
    }

    /****************************
     * 随机
     ****************************/
    public static void YardsRandom(Game game, int start, int amount, int yards) {
        for (PickNumber pickNumber : game.pickNumbers)
            pickNumber.onRandom(random(start, amount, yards));
        game.notifyListener();
    }

    //直选和值 hezhi71Random
    public static void hezhi71Random(Game game) {
        YardsRandom(game, 0, 3 * 9, 1);
    }

    //直选和值 hezhi151Random
    public static void hezhi151Random(Game game) {
        YardsRandom(game, 0, 3 * 9, 1);
    }

    //直选和值 hezhi73Random
    public static void hezhi73Random(Game game) {
        YardsRandom(game, 0, 3 * 9, 1);
    }

    //后二和值 houerhezhi74Random
    public static void houerhezhi74Random(Game game) {
        YardsRandom(game, 0, 2 * 9, 1);
    }

    //前二和值 qianerhezhi72Random
    public static void qianerhezhi72Random(Game game) {
        YardsRandom(game, 0, 2 * 9, 1);
    }
    
    //直选和值 hezhi139Random
    public static void hezhi139Random(Game game) {
        YardsRandom(game, 0, 3 * 9, 1);
    }
}
