package cz.dmn.cpska.ui.splash

import cz.dmn.cpska.mvp.MvpPresenter
import cz.dmn.cpska.mvp.MvpView

interface SplashMvp {

    interface View: MvpView {
        fun close()
    }

    interface Presenter: MvpPresenter<View>
}