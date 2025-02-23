package com.vscode.jetbrainssync

import com.intellij.openapi.components.service
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class VSCodeJetBrainsSyncPlugin : ProjectActivity {
    override suspend fun execute(project: Project) {
        project.service<VSCodeJetBrainsSyncService>()
    }
} 