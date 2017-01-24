package shaolizhi.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by shaol on 2017/1/17.
 */

public class CFragment extends Fragment {
    FragmentSwitcher fragmentSwitcher;
    Button buttonA;
    Button buttonB;

    Button buttonD;
    Button buttonNext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.c_fragment, viewGroup, false);
        buttonA = (Button)rootView.findViewById(R.id.A);
        buttonB = (Button)rootView.findViewById(R.id.B);

        buttonD = (Button)rootView.findViewById(R.id.D);
        buttonNext = (Button)rootView.findViewById(R.id.NEXT);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToA();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToB();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToD();
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToD();
            }
        });
        return rootView;
    }
    void getFragmentSwitcher(FragmentSwitcher fragmentSwitcher){
        this.fragmentSwitcher = fragmentSwitcher;
    }
}
