package edmt.dev.edmtslider.Tricks;

import android.content.Context;
import androidx.viewpager.widget.PagerAdapter;
import android.util.AttributeSet;

public class InfiniteViewPager extends ViewPagerEx {

    public InfiniteViewPager(Context context) {
        super(context);
    }

    public InfiniteViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public void setAdapter(PagerAdapter adapter) {
        super.setAdapter(adapter);
    }

}
