package com.home.androidmvparchitecturalpatterndemo.view.behavior

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.ViewCompat
import com.google.android.material.appbar.AppBarLayout

class PlaygroundImageViewBehavior(context: Context, attrs: AttributeSet) :
    CoordinatorLayout.Behavior<View>(context, attrs) {

    override fun onLayoutChild(
        parent: CoordinatorLayout,
        child: View,
        layoutDirection: Int
    ): Boolean {
        (child.layoutParams as CoordinatorLayout.LayoutParams).topMargin =
            parent.measuredHeight - child.measuredHeight
        return super.onLayoutChild(parent, child, layoutDirection)
    }

    override fun layoutDependsOn(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        return dependency is AppBarLayout // 因為Behavior只對CoordinatorLayout的直接子View生效, 因此將依賴關係轉移到AppBarLayout
    }

    override fun onDependentViewChanged(
        parent: CoordinatorLayout,
        child: View,
        dependency: View
    ): Boolean {
        // 得到依賴View的滑動距離
        val top =
            ((dependency.layoutParams as CoordinatorLayout.LayoutParams)
                .behavior as AppBarLayout.Behavior).topAndBottomOffset
        // 因為BottomNavigation的滑動與ToolBar是反向的, 所以取-top值
        ViewCompat.setTranslationY(
            child,
            ((-top).toFloat() * 2)
        )
        return false
    }
}