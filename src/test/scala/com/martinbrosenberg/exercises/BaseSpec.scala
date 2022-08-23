package com.martinbrosenberg.exercises

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers
import org.scalatest.{OneInstancePerTest, TryValues}

class BaseSpec extends AnyFreeSpec
	with Matchers
	with OneInstancePerTest
	with TryValues
