package shaolizhi.fragmenttest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class DFragment extends Fragment {
    FragmentSwitcher fragmentSwitcher;
    Button buttonA;
    Button buttonB;
    Button buttonC;

    Button buttonNext;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        View rootView = inflater.inflate(R.layout.d_fragment, viewGroup, false);
        buttonA = (Button)rootView.findViewById(R.id.A);
        buttonB = (Button)rootView.findViewById(R.id.B);
        buttonC = (Button)rootView.findViewById(R.id.C);

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

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToC();
            }
        });

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentSwitcher.switchToA();
            }
        });
        return rootView;
    }
    @Override
    public void onAttach(Context activity){
        super.onAttach(activity);
        getFragmentSwitcher((FragmentSwitcher) activity);
    }
    private void getFragmentSwitcher(FragmentSwitcher fragmentSwitcher){
        this.fragmentSwitcher = fragmentSwitcher;
    }
}
