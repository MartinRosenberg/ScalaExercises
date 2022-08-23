package com.martinbrosenberg.exercises.exercism.track

import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.BaseSpec
import com.martinbrosenberg.exercises.exercism.track.e01_helloworld.HelloWorld

/** @version 1.1.0 */
class E01_HelloWorld_Spec extends BaseSpec {

  "Say Hi!" in {
    HelloWorld.hello() should be ("Hello, World!")
  }

}
