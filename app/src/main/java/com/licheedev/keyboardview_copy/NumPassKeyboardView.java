package com.licheedev.keyboardview_copy;

import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.util.AttributeSet;
import com.licheedev.keyboardview.KeyboardView;

public class NumPassKeyboardView extends KeyboardView {

    private Keyboard mKeyboard;// 字母键盘

    public NumPassKeyboardView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NumPassKeyboardView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        mKeyboard = new Keyboard(getContext(), R.xml.keyboard_password);
        setOnKeyboardActionListener(mOnKeyboardActionListener);
        setKeyboard(mKeyboard);
        setPreviewEnabled(false);
        setEnabled(true);
        setPreviewEnabled(false);
    }

    @Override
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // Round up a little
        if (mKeyboard == null) {
            setMeasuredDimension(getPaddingLeft() + getPaddingRight(),
                getPaddingTop() + getPaddingBottom());
        } else {
            int width = mKeyboard.getMinWidth() + getPaddingLeft() + getPaddingRight();
            if (MeasureSpec.getSize(widthMeasureSpec) < width + 10) {
                width = MeasureSpec.getSize(widthMeasureSpec);
            }
            setMeasuredDimension(width,
                mKeyboard.getHeight() + getPaddingTop() + getPaddingBottom());
        }
    }

    private OnKeyboardActionListener mOnKeyboardActionListener = new OnKeyboardActionListener() {
        @Override
        public void onPress(int primaryCode) {

        }

        @Override
        public void onRelease(int primaryCode) {

        }

        @Override
        public void onKey(int primaryCode, int[] keyCodes) {

        }

        @Override
        public void onText(CharSequence text) {

        }

        @Override
        public void swipeLeft() {

        }

        @Override
        public void swipeRight() {

        }

        @Override
        public void swipeDown() {

        }

        @Override
        public void swipeUp() {

        }
    };
}
