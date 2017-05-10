package tests.velka.rxjavatest.views;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import tests.velka.rxjavatest.R;

/**
 * Created by Сергей Пинкевич on 10.05.2017.
 */

public class HotelCardAdapter extends RecyclerView.Adapter<HotelCardAdapter.ViewHolder> {

    public static class ViewHolder extends RecyclerView.ViewHolder {

        private CardView mCardView;

        public ViewHolder(CardView view) {
            super(view);
            mCardView = view;
        }
    }

    public HotelCardAdapter() {

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CardView cardView = (CardView) LayoutInflater.from(parent.getContext()).inflate
                (R.layout.hotel_card, parent, false);
        return new ViewHolder(cardView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
