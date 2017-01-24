package shaolizhi.fragmenttest;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AFragment extends Fragment {

    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonNext;
    FragmentSwitcher fragmentSwitcher;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.a_fragment, viewGroup, false);

        buttonB = (Button)rootView.findViewById(R.id.B);
        buttonC = (Button)rootView.findViewById(R.id.C);
        buttonD = (Button)rootView.findViewById(R.id.D);
        buttonNext = (Button)rootView.findViewById(R.id.NEXT);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToB();
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToB();
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToC();
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
