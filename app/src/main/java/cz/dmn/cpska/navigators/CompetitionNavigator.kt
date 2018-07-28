package cz.dmn.cpska.navigators

import android.app.Activity
import cz.dmn.cpska.data.api.Competition
import cz.dmn.cpska.di.PerActivity
import cz.dmn.cpska.ui.competition.CompetitionActivity
import cz.dmn.cpska.ui.competition.CompetitionConstants
import javax.inject.Inject

@PerActivity
class CompetitionNavigator @Inject constructor(activity: Activity) : BaseNavigator(activity) {
    fun openCompetition(competition: Competition) {
        startActivity(CompetitionActivity::class.java, Pair(CompetitionConstants.EXTRA_COMPETITION, competition))
    }
}