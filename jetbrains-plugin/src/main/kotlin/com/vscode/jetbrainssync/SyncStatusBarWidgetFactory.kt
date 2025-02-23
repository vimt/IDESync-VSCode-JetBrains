package com.vscode.jetbrainssync

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.CustomStatusBarWidget
import com.intellij.openapi.wm.StatusBarWidgetFactory

class SyncStatusBarWidgetFactory : StatusBarWidgetFactory {
    override fun getId() = SyncStatusBarWidget.ID

    override fun getDisplayName() = "VSCode JetBrains Sync"

    override fun isAvailable(project: Project) = true

    override fun createWidget(project: Project): CustomStatusBarWidget {
        val syncService = project.service<VSCodeJetBrainsSyncService>()
        return SyncStatusBarWidget(project, syncService)
    }
}