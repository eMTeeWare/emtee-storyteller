package net.emteeware

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Label
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Hello: Application() {
    override fun start(stage: Stage) {
        val label = Label("eMTee Storyteller")
        val scene = Scene(StackPane(label), 640.0, 480.0)
        stage.scene = scene
        stage.title = "eMTee Storyteller"
        stage.show()
    }

    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            launch(Hello::class.java)
        }
    }

}

