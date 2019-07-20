package code.ashhasib.customtextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;



public class CustomTextView extends AppCompatTextView {
    String customFont;

    public CustomTextView(Context context, AttributeSet attributeSet) {
        super(context,attributeSet);
        style(context,attributeSet);
    }

    public CustomTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        style(context, attrs);

    }





    public void style(Context context,AttributeSet attributeSet) {
        TypedArray array = context.obtainStyledAttributes(
                attributeSet,R.styleable.CustomTextView
        );

        int cf = array.getInteger(R.styleable.CustomTextView_fontName,0);
        int fontNumber=0;
        switch (cf) {
            case 1:{
                customFont = "roboto_regular.ttf";
                break;
            }
            case 2:{
                customFont = "dm_serif_regular.ttf";
                break;
            }
            case 3:{
                customFont = "montserrat_regular.ttf";
                break;
            }
            case 4:{
                customFont = "raleway_regular.ttf";
                break;
            }
            case 5:{
                customFont = "roboto_condensed_regular.ttf";
                break;
            }
            case 6:{
                customFont = "oswald_regular.ttf";
                break;
            }

            default:{
                customFont = "roboto_regular.ttf";
            }

        }

        Typeface typeface = Typeface.createFromAsset(
            context.getAssets(),"fonts/"+customFont
        );

        setTypeface(typeface);
        array.recycle();


    }
}
