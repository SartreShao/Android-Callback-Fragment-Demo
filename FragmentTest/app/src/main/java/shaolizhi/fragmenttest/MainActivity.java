package shaolizhi.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements FragmentSwitcher {

    FragmentManager fragmentManager;
    AFragment aFragment;
    BFragment bFragment;
    CFragment cFragment;
    DFragment dFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //在Activity被创建的时候初始化四个Fragment
        aFragment = new AFragment();
        bFragment = new BFragment();
        cFragment = new CFragment();
        dFragment = new DFragment();
        //在Activity被创建的时候初始化fragmentManager
        fragmentManager = getSupportFragmentManager();
        //初始化fragment-也就是先加载AFragment，同时把自己的实例传给每一个Fragment
        initializeFragment();
    }


    private void initializeFragment(){
        switchToA();
    }

    @Override
    public void switchToA() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,aFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void switchToB() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,bFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();    }

    @Override
    public void switchToC() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,cFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void switchToD() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,dFragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

}
