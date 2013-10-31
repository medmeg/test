public class VmdtLayout extends ViewGroup {

    public VmdtLayout(Context context) {
        super(context, null);
    }
    public VmdtLayout(Context context, AttributeSet attrs) {
        super(context, attrs, 0);
    }
    public VmdtLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int count = getChildCount();
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
        // chaque vue contenu dans le ViewGroup mesure ses propores dimensions
        // A partir de ces mesures on calcul la distribution relatives des icônes
        }
    }
    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        for (int i = 0; i < count; i++) {
            final View child = getChildAt(i);
        // Positionne cahque vue fils du ViewGroup dans le layout
        }
    }
}
